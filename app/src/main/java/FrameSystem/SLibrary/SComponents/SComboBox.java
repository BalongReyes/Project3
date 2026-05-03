package FrameSystem.SLibrary.SComponents;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.BeanProperty;
import java.beans.JavaBean;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

@JavaBean(description = "A fully custom dropdown component extending SPanel instead of JComboBox")
public class SComboBox extends SPanel {

    private JLabel selectedLabel;
    private SLabel arrowLabel;
    
    private JPopupMenu popupMenu;
    private SPanel popupContainer;
    private JScrollPane scrollPane;
    
    private List<Object> items = new ArrayList<>();
    private Object selectedItem = null;
    
    private List<ActionListener> actionListeners = new ArrayList<>();

    private Color itemDefaultBackgroundColor = Color.WHITE;
    private Color itemHoverBackgroundColor = new Color(230, 240, 255);
    private int itemHeight = 35;
    private Color itemDefaultForegroundColor = Color.BLACK;
    private Color itemHoverForegroundColor = Color.BLACK;
    private Font itemFont = new JLabel().getFont();
    private int itemRoundCorner = 0;
    
    private long popupLastClosed = 0;

    private javax.swing.ImageIcon arrowIcon;
    private int arrowIconSize = 12;

// ==== Constructor ==========================================================================================

    public SComboBox() {
        super();
        setLayout(new BorderLayout());
        setCanHover(true);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        // Base styling matching standard SPanel defaults
        setRounded(true);
        setRadius(8);
        setPaintBackground(true);
        setDefaultBackgroundColor(Color.WHITE);
        setHoverBackgroundColor(new Color(245, 245, 245));
        setBorderLine(1);
        setDefaultBorderColor(new Color(200, 200, 200));
        setDefaultForegroundColor(Color.BLACK);
        setHoverForegroundColor(Color.BLACK);

        // Selected Text Label
        selectedLabel = new JLabel("Select...");
        selectedLabel.setOpaque(false);
        selectedLabel.setBorder(new EmptyBorder(5, 10, 5, 10)); // Inner Padding
        if (getFont() != null) selectedLabel.setFont(getFont());
        add(selectedLabel, BorderLayout.CENTER);

        // Dropdown Arrow Label
        java.net.URL url = getClass().getResource("/Icons/SLibrary/dropDownArrow.png");
        if (url != null) {
            arrowIcon = new javax.swing.ImageIcon(url);
        }
        
        arrowLabel = new SLabel();
        arrowLabel.setText("");
        arrowLabel.setOpaque(false);
        arrowLabel.setBorder(new EmptyBorder(5, 5, 5, 10)); // Inner Padding
        arrowLabel.setIconSize(arrowIconSize);
        if (arrowIcon != null) {
            arrowLabel.setScaledIcon(arrowIcon);
        }
        add(arrowLabel, BorderLayout.EAST);

        setupPopupMenu();

        // Toggle popup on click
        addInnerListeners(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                togglePopup();
            }
        });
    }

// ==== Popup Configuration ==================================================================================

    private void setupPopupMenu() {
        popupMenu = new JPopupMenu();
        popupMenu.setBorder(BorderFactory.createEmptyBorder());
        popupMenu.setOpaque(false);
        
        SPanel popupOuter = new SPanel();
        popupOuter.setLayout(new BorderLayout());
        popupOuter.setPaintBackground(true);
        popupOuter.setDefaultBackgroundColor(Color.WHITE);
        popupOuter.setRounded(true);
        popupOuter.setRadius(8);
        popupOuter.setBorderLine(1);
        popupOuter.setDefaultBorderColor(new Color(200, 200, 200));
        popupOuter.setBorder(new EmptyBorder(4, 4, 4, 4));

        // An SPanel to hold the list of items
        popupContainer = new SPanel();
        popupContainer.setLayout(new BoxLayout(popupContainer, BoxLayout.Y_AXIS));
        popupContainer.setPaintBackground(false);

        scrollPane = new JScrollPane(popupContainer);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);

        popupOuter.add(scrollPane, BorderLayout.CENTER);
        popupMenu.add(popupOuter);
        
        popupMenu.addPopupMenuListener(new PopupMenuListener() {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {}
            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                popupLastClosed = System.currentTimeMillis();
            }
            @Override
            public void popupMenuCanceled(PopupMenuEvent e) {}
        });
    }

    private void togglePopup() {
        if (popupMenu.isVisible()) {
            popupMenu.setVisible(false);
        } else {
            // Prevent re-opening immediately if it just auto-closed due to clicking this component
            if (System.currentTimeMillis() - popupLastClosed < 150) {
                return;
            }

            if (items.isEmpty()) return;
            
            // Adjust popup size dynamically to match the box width
            int popWidth = getWidth();
            // Max height 200px or fit content perfectly
            int popHeight = Math.min(items.size() * itemHeight + 8, 200); 
            popupMenu.setPopupSize(popWidth, popHeight);
            
            popupMenu.show(this, 0, getHeight() + 2);
        }
    }

// ==== Data Handling ========================================================================================

    public void addItem(Object item) {
        items.add(item);
        
        SComboBoxItem panelItem = new SComboBoxItem(item);
        
        // Clean up internal padding/styling for a list item
        panelItem.setRadius(itemRoundCorner); 
        panelItem.setRounded(itemRoundCorner > 0);
        panelItem.setBorderLine(0);
        panelItem.setDefaultBackgroundColor(itemDefaultBackgroundColor);
        panelItem.setHoverBackgroundColor(itemHoverBackgroundColor);
        panelItem.setDefaultForegroundColor(itemDefaultForegroundColor);
        panelItem.setHoverForegroundColor(itemHoverForegroundColor);
        if (itemFont != null) panelItem.setFont(itemFont);
        panelItem.setMaximumSize(new Dimension(Integer.MAX_VALUE, itemHeight));
        panelItem.setPreferredSize(new Dimension(getWidth(), itemHeight));
        
        panelItem.addInnerListeners(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                setSelectedItem(item);
                popupMenu.setVisible(false);
                fireActionEvent();
            }
        });
        
        popupContainer.add(panelItem);
        
        // Automatically select the first item added
        if (selectedItem == null) {
            setSelectedItem(item);
        }
    }

    public void addList(List<?> newItems) {
        if (newItems != null) {
            for (Object obj : newItems) {
                addItem(obj);
            }
        }
    }

    public void clearItems() {
        items.clear();
        popupContainer.removeAll();
        setSelectedItem(null);
        selectedLabel.setText("Select...");
    }

// ==== Item Setters & Getters ===============================================================================

    @BeanProperty(preferred = true, description = "The default background color for the dropdown items")
    public void setItemDefaultBackgroundColor(Color itemDefaultBackgroundColor) {
        this.itemDefaultBackgroundColor = itemDefaultBackgroundColor;
        if (popupContainer != null) {
            for (java.awt.Component c : popupContainer.getComponents()) {
                if (c instanceof SComboBoxItem item) {
                    item.setDefaultBackgroundColor(itemDefaultBackgroundColor);
                }
            }
        }
    }

    public Color getItemDefaultBackgroundColor() {
        return itemDefaultBackgroundColor;
    }

    @BeanProperty(preferred = true, description = "The hover background color for the dropdown items")
    public void setItemHoverBackgroundColor(Color itemHoverBackgroundColor) {
        this.itemHoverBackgroundColor = itemHoverBackgroundColor;
        if (popupContainer != null) {
            for (java.awt.Component c : popupContainer.getComponents()) {
                if (c instanceof SComboBoxItem item) {
                    item.setHoverBackgroundColor(itemHoverBackgroundColor);
                }
            }
        }
    }

    public Color getItemHoverBackgroundColor() {
        return itemHoverBackgroundColor;
    }

    @BeanProperty(preferred = true, description = "The height of each dropdown item")
    public void setItemHeight(int itemHeight) {
        this.itemHeight = itemHeight;
        if (popupContainer != null) {
            for (java.awt.Component c : popupContainer.getComponents()) {
                if (c instanceof SComboBoxItem item) {
                    item.setMaximumSize(new Dimension(Integer.MAX_VALUE, itemHeight));
                    item.setPreferredSize(new Dimension(getWidth(), itemHeight));
                }
            }
        }
    }

    public int getItemHeight() {
        return itemHeight;
    }

    @BeanProperty(preferred = true, description = "The default foreground color for the dropdown items")
    public void setItemDefaultForegroundColor(Color itemDefaultForegroundColor) {
        this.itemDefaultForegroundColor = itemDefaultForegroundColor;
        if (popupContainer != null) {
            for (java.awt.Component c : popupContainer.getComponents()) {
                if (c instanceof SComboBoxItem item) {
                    item.setDefaultForegroundColor(itemDefaultForegroundColor);
                }
            }
        }
    }

    public Color getItemDefaultForegroundColor() {
        return itemDefaultForegroundColor;
    }

    @BeanProperty(preferred = true, description = "The hover foreground color for the dropdown items")
    public void setItemHoverForegroundColor(Color itemHoverForegroundColor) {
        this.itemHoverForegroundColor = itemHoverForegroundColor;
        if (popupContainer != null) {
            for (java.awt.Component c : popupContainer.getComponents()) {
                if (c instanceof SComboBoxItem item) {
                    item.setHoverForegroundColor(itemHoverForegroundColor);
                }
            }
        }
    }

    public Color getItemHoverForegroundColor() {
        return itemHoverForegroundColor;
    }

    @BeanProperty(preferred = true, description = "The font applied to the dropdown items")
    public void setItemFont(Font itemFont) {
        this.itemFont = itemFont;
        if (popupContainer != null) {
            for (java.awt.Component c : popupContainer.getComponents()) {
                if (c instanceof SComboBoxItem item) {
                    item.setFont(itemFont);
                }
            }
        }
    }

    public Font getItemFont() {
        return itemFont;
    }

    @BeanProperty(preferred = true, description = "The corner radius for the dropdown items")
    public void setItemRoundCorner(int itemRoundCorner) {
        this.itemRoundCorner = itemRoundCorner;
        if (popupContainer != null) {
            for (java.awt.Component c : popupContainer.getComponents()) {
                if (c instanceof SComboBoxItem item) {
                    item.setRadius(itemRoundCorner);
                    item.setRounded(itemRoundCorner > 0);
                }
            }
        }
    }

    public int getItemRoundCorner() {
        return itemRoundCorner;
    }

// ==== Arrow Icon Setters & Getters =========================================================================

    @BeanProperty(preferred = true, visualUpdate = true, description = "The icon used for the dropdown arrow")
    public void setArrowIcon(javax.swing.ImageIcon arrowIcon) {
        this.arrowIcon = arrowIcon;
        if (arrowLabel != null) {
            arrowLabel.setScaledIcon(arrowIcon);
        }
    }

    public javax.swing.ImageIcon getArrowIcon() {
        return arrowIcon;
    }

    @BeanProperty(preferred = true, visualUpdate = true, description = "The size of the dropdown arrow icon")
    public void setArrowIconSize(int arrowIconSize) {
        this.arrowIconSize = arrowIconSize;
        if (arrowLabel != null) {
            arrowLabel.setIconSize(arrowIconSize);
        }
    }

    public int getArrowIconSize() {
        return arrowIconSize;
    }

// ==== Setters & Getters ====================================================================================

    @BeanProperty(preferred = true, description = "Gets the currently selected item object")
    public Object getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(Object item) {
        this.selectedItem = item;
        if (item != null) {
            selectedLabel.setText(item.toString());
        }
    }

    @Override
    public void setDefaultForegroundColor(Color fg) {
        super.setDefaultForegroundColor(fg);
        if (selectedLabel != null) selectedLabel.setForeground(fg);
        if (arrowLabel != null) arrowLabel.setForeground(fg); 
    }
    
    @Override
    public void setFont(Font font) {
        super.setFont(font);
        if (selectedLabel != null) selectedLabel.setFont(font);
        if (arrowLabel != null) arrowLabel.setFont(font);
    }

    @Override
    @BeanProperty(hidden = true)
    public void setForeground(Color fg){
    }

// ==== Event Listeners ======================================================================================

    public void addActionListener(ActionListener listener) {
        if (!actionListeners.contains(listener)) {
            actionListeners.add(listener);
        }
    }

    public void removeActionListener(ActionListener listener) {
        actionListeners.remove(listener);
    }

    private void fireActionEvent() {
        ActionEvent evt = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "selectionChanged");
        for (ActionListener listener : actionListeners) {
            listener.actionPerformed(evt);
        }
    }
}

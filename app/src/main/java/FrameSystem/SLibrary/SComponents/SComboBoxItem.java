package FrameSystem.SLibrary.SComponents;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.beans.BeanProperty;
import java.beans.JavaBean;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

@JavaBean(description = "A custom SPanel designed to be used as an item in the SComboBox list")
public class SComboBoxItem extends SPanel {

    private JLabel label;
    private Object value;

// ==== Constructor ==========================================================================================

    public SComboBoxItem() {
        super();
        setLayout(new BorderLayout());
        // Add some default padding so text isn't pressed against the edges
        setBorderPadding(new EmptyBorder(5, 10, 5, 10)); 
        
        // Setup default SPanel properties ideal for a list item
        setCanHover(true);
        setRounded(true);
        setRadius(8);
        setPaintBackground(true);
        
        // Setup the internal label
        label = new JLabel("Item");
        label.setOpaque(false);
        add(label, BorderLayout.CENTER);
    }

    public SComboBoxItem(Object value) {
        this();
        setValue(value);
    }

// ==== Setters and Getters ==================================================================================

    @BeanProperty(preferred = true, description = "The text displayed on the item")
    public void setText(String text) {
        label.setText(text);
    }

    public String getText() {
        return label.getText();
    }
    
    public void setValue(Object value) {
        this.value = value;
        if (value != null) {
            setText(value.toString());
        } else {
            setText("");
        }
    }

    public Object getValue() {
        return value;
    }
    
    public JLabel getLabel() {
        return label;
    }

// ==== Font and Foreground Delegation =======================================================================

    @Override
    public void setForeground(Color fg) {
        super.setForeground(fg);
        if (label != null) {
            label.setForeground(fg);
        }
    }

    @Override
    public void setFont(Font font) {
        super.setFont(font);
        if (label != null) {
            label.setFont(font);
        }
    }
    
    // Helper to bypass SPanel's custom setBorderPadding overriding standard borders
    private void setBorderPadding(EmptyBorder border) {
        super.setBorder(border);
    }
}

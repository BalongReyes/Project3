
package FrameSystem.SLibrary.SGenericComponents;

import EventSystem.Listeners.MouseClickedAdaptor;
import FrameSystem.SLibrary.SComponents.SPanel;
import java.awt.Dimension;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.beans.BeanProperty;
import java.beans.JavaBean;
import javax.swing.JTextField;

@JavaBean(description = "A component that displays a jpanel with corner radius")
public class STextFieldContainer extends SPanel{

    private JTextField textFieldChild = null;
    
    private boolean focused = false;
    
// ==== Constructor ==========================================================================================
    
    public STextFieldContainer(){
        setOpaque(false);
        setPreferredSize(new Dimension(50, 50));
    }
    
// ==== Setters and Getters ==================================================================================

    @BeanProperty(preferred = true, description = "Setup listener to the child")
    public void setTextFieldChild(JTextField textFieldChild){
        if(this.textFieldChild != null || textFieldChild == null) return;
        
        this.textFieldChild = textFieldChild;
        textFieldChild.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt){
                super.focusGained(evt);
                focused = true;
                repaint();
            }
            @Override
            public void focusLost(FocusEvent evt){
                super.focusLost(evt);
                focused = false;
                repaint();
            }
        });
        
        addMouseListener((MouseClickedAdaptor) evt -> {
            textFieldChild.requestFocus();
        });
    }

    public JTextField getTextFieldChild(){
        return textFieldChild;
    }
    
// -----------------------------------------------------------------------------------------------------------
    
    private int lineGap = 0;

    @BeanProperty(preferred = true, visualUpdate = true, description = "The line gap size")
    public void setLineGap(int lineGap){
        this.lineGap = lineGap;
    }

    public int getLineGap(){
        return lineGap;
    }
    
}

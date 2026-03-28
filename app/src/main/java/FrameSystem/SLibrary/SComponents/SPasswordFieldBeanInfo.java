package FrameSystem.SLibrary.SComponents;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JPasswordField;

public class SPasswordFieldBeanInfo extends SimpleBeanInfo {
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            List<PropertyDescriptor> descriptors = new ArrayList<>();
            BeanInfo superBeanInfo = Introspector.getBeanInfo(JPasswordField.class);
            PropertyDescriptor[] superDescriptors = superBeanInfo.getPropertyDescriptors();

            for (PropertyDescriptor pd : superDescriptors) {
                if (pd.getName().equals("border") || pd.getName().equals("toolTipText")) {
                    pd.setHidden(true);
                }
            }
            descriptors.addAll(Arrays.asList(superDescriptors));

            PropertyDescriptor hint = new PropertyDescriptor("hint", SPasswordField.class);
            PropertyDescriptor hintColor = new PropertyDescriptor("hintColor", SPasswordField.class);
            PropertyDescriptor offsetHint = new PropertyDescriptor("offsetHint", SPasswordField.class);

            hint.setValue("category", "Hint Settings");
            hintColor.setValue("category", "Hint Settings");
            offsetHint.setValue("category", "Hint Settings");

            descriptors.addAll(Arrays.asList(hint, hintColor, offsetHint));
            return descriptors.toArray(new PropertyDescriptor[0]);
        } catch (IntrospectionException e) {
            e.printStackTrace();
            return super.getPropertyDescriptors();
        }
    }
}
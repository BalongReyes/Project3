package FrameSystem.SLibrary.SComponents;

import java.beans.*;
import java.util.*;
import javax.swing.JLabel;

public class SLabelBeanInfo extends SimpleBeanInfo {

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            List<PropertyDescriptor> descriptors = new ArrayList<>();
            BeanInfo superBeanInfo = Introspector.getBeanInfo(JLabel.class);
            PropertyDescriptor[] superDescriptors = superBeanInfo.getPropertyDescriptors();

            for (PropertyDescriptor pd : superDescriptors) {
                switch (pd.getName()) {
                    case "border", "toolTipText" -> pd.setHidden(true);
                    case "font" -> pd.setValue("category", "Typography");
                }
            }
            descriptors.addAll(Arrays.asList(superDescriptors));

            PropertyDescriptor scaledIcon = new PropertyDescriptor("scaledIcon", SLabel.class);
            PropertyDescriptor iconSize = new PropertyDescriptor("iconSize", SLabel.class);

            scaledIcon.setValue("category", "Icon Settings");
            iconSize.setValue("category", "Icon Settings");

            descriptors.addAll(Arrays.asList(scaledIcon, iconSize));
            return descriptors.toArray(new PropertyDescriptor[0]);
        } catch (IntrospectionException e) {
            e.printStackTrace();
            return super.getPropertyDescriptors();
        }
    }
}
package FrameSystem.SLibrary.SComponents;

import FrameSystem.SLibrary.SComponents.SPanel;
import java.beans.*;
import java.util.*;
import javax.swing.JPanel;

public class SPanelBeanInfo extends SimpleBeanInfo {

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            List<PropertyDescriptor> descriptors = new ArrayList<>();
            BeanInfo superBeanInfo = Introspector.getBeanInfo(JPanel.class);
            PropertyDescriptor[] superDescriptors = superBeanInfo.getPropertyDescriptors();

            for (PropertyDescriptor pd : superDescriptors) {
                switch (pd.getName()) {
                    case "border", "toolTipText" -> pd.setHidden(true);
                    case "font" -> pd.setValue("category", "Typography");
                    case "background" -> {
                        // FIX: Forces NetBeans to display the background property
                        // without moving it to a custom category
                        pd.setHidden(false); 
                        pd.setExpert(false);
                    }
                }
            }
            descriptors.addAll(Arrays.asList(superDescriptors));

            PropertyDescriptor radius = new PropertyDescriptor("radius", SPanel.class);
            PropertyDescriptor rounded = new PropertyDescriptor("rounded", SPanel.class);
            radius.setValue("category", "Rounded Corners");
            rounded.setValue("category", "Rounded Corners");

            PropertyDescriptor borderLine = new PropertyDescriptor("borderLine", SPanel.class);
            PropertyDescriptor borderColor = new PropertyDescriptor("borderColor", SPanel.class);
            borderLine.setValue("category", "Custom Border");
            borderColor.setValue("category", "Colors");

            PropertyDescriptor shadowX = new PropertyDescriptor("shadowX", SPanel.class);
            PropertyDescriptor shadowY = new PropertyDescriptor("shadowY", SPanel.class);
            PropertyDescriptor shadowSize = new PropertyDescriptor("shadowSize", SPanel.class);
            PropertyDescriptor shadowOpacity = new PropertyDescriptor("shadowOpacity", SPanel.class);
            PropertyDescriptor shadowOffsetX = new PropertyDescriptor("shadowOffsetX", SPanel.class);
            PropertyDescriptor shadowOffsetY = new PropertyDescriptor("shadowOffsetY", SPanel.class);
            PropertyDescriptor shadowColor = new PropertyDescriptor("shadowColor", SPanel.class);

            shadowX.setValue("category", "Drop Shadow");
            shadowY.setValue("category", "Drop Shadow");
            shadowSize.setValue("category", "Drop Shadow");
            shadowOpacity.setValue("category", "Drop Shadow");
            shadowOffsetX.setValue("category", "Drop Shadow");
            shadowOffsetY.setValue("category", "Drop Shadow");
            shadowColor.setValue("category", "Colors");

            descriptors.addAll(Arrays.asList(
                    radius, rounded, borderLine, borderColor,
                    shadowX, shadowY, shadowSize, shadowOpacity, shadowColor, shadowOffsetX, shadowOffsetY
            ));

            return descriptors.toArray(new PropertyDescriptor[0]);
        } catch (IntrospectionException e) {
            e.printStackTrace();
            return super.getPropertyDescriptors();
        }
    }
}
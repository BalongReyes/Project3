package FrameSystem.SLibrary.SComponents; // Remember to keep this in the SComponents package!

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JPanel;

public class SPanelBeanInfo extends SimpleBeanInfo {

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            List<PropertyDescriptor> descriptors = new ArrayList<>();

            // 1. Fetch all default properties from JPanel
            BeanInfo superBeanInfo = Introspector.getBeanInfo(JPanel.class);
            PropertyDescriptor[] superDescriptors = superBeanInfo.getPropertyDescriptors();

            // Loop through superclass properties and hide specific ones overridden in SPanel
            for (PropertyDescriptor pd : superDescriptors) {
                if (pd.getName().equals("border") || pd.getName().equals("toolTipText")) {
                    pd.setHidden(true); // Matches your @BeanProperty(hidden = true)
                }
            }
            descriptors.addAll(Arrays.asList(superDescriptors));

            // 2. Rounded Corners Properties
            PropertyDescriptor radius = new PropertyDescriptor("radius", SPanel.class);
            PropertyDescriptor rounded = new PropertyDescriptor("rounded", SPanel.class);

            radius.setValue("category", "Rounded Corners");
            rounded.setValue("category", "Rounded Corners");

            // 3. Custom Border Properties
            PropertyDescriptor borderLine = new PropertyDescriptor("borderLine", SPanel.class);
            PropertyDescriptor borderColor = new PropertyDescriptor("borderColor", SPanel.class);

            borderLine.setValue("category", "Custom Border");
            borderColor.setValue("category", "Custom Border");

            // 4. Drop Shadow Properties
            PropertyDescriptor shadowX = new PropertyDescriptor("shadowX", SPanel.class);
            PropertyDescriptor shadowY = new PropertyDescriptor("shadowY", SPanel.class);
            PropertyDescriptor shadowSize = new PropertyDescriptor("shadowSize", SPanel.class);
            PropertyDescriptor shadowOpacity = new PropertyDescriptor("shadowOpacity", SPanel.class);
            PropertyDescriptor shadowColor = new PropertyDescriptor("shadowColor", SPanel.class);
            PropertyDescriptor shadowOffsetX = new PropertyDescriptor("shadowOffsetX", SPanel.class);
            PropertyDescriptor shadowOffsetY = new PropertyDescriptor("shadowOffsetY", SPanel.class);

            shadowX.setValue("category", "Drop Shadow");
            shadowY.setValue("category", "Drop Shadow");
            shadowSize.setValue("category", "Drop Shadow");
            shadowOpacity.setValue("category", "Drop Shadow");
            shadowColor.setValue("category", "Drop Shadow");
            shadowOffsetX.setValue("category", "Drop Shadow");
            shadowOffsetY.setValue("category", "Drop Shadow");

            // 5. Add all custom descriptors to the list
            descriptors.addAll(Arrays.asList(
                    radius, rounded,
                    borderLine, borderColor,
                    shadowX, shadowY, shadowSize, shadowOpacity, shadowColor, shadowOffsetX, shadowOffsetY
            ));

            return descriptors.toArray(PropertyDescriptor[]::new);

        } catch (IntrospectionException e) {
            return super.getPropertyDescriptors();
        }
    }
}
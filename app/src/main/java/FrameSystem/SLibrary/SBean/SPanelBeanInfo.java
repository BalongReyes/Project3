package FrameSystem.SLibrary.SBean;

import FrameSystem.SLibrary.SComponents.SPanel;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPanelBeanInfo extends SimpleBeanInfo {

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            List<PropertyDescriptor> descriptors = new ArrayList<>();

            // 1. Fetch all the default properties from JPanel (background, font, etc.)
            // so we don't lose them in the NetBeans properties window.
            BeanInfo superBeanInfo = Introspector.getBeanInfo(SPanel.class.getSuperclass());
            descriptors.addAll(Arrays.asList(superBeanInfo.getPropertyDescriptors()));

            // 2. Define your existing Rounded Corner properties
            PropertyDescriptor radius = new PropertyDescriptor("radius", SPanel.class);
            PropertyDescriptor rounded = new PropertyDescriptor("rounded", SPanel.class);

            // Assign them to the "Rounded Corners" Category
            radius.setValue("category", "Rounded Corners");
            rounded.setValue("category", "Rounded Corners");

            descriptors.addAll(Arrays.asList(radius, rounded));

            // 3. Define your Drop Shadow properties 
            // (Uncomment these once you add the variables, getters, and setters to SPanel.java)
            /*
            PropertyDescriptor shadowSize = new PropertyDescriptor("shadowSize", SPanel.class);
            PropertyDescriptor shadowOpacity = new PropertyDescriptor("shadowOpacity", SPanel.class);
            PropertyDescriptor shadowColor = new PropertyDescriptor("shadowColor", SPanel.class);

            // Assign them to the "Drop Shadow" Category
            shadowSize.setValue("category", "Drop Shadow");
            shadowOpacity.setValue("category", "Drop Shadow");
            shadowColor.setValue("category", "Drop Shadow");

            descriptors.addAll(Arrays.asList(shadowSize, shadowOpacity, shadowColor));
            */

            return descriptors.toArray(PropertyDescriptor[]::new);

        } catch (IntrospectionException e) {
            return super.getPropertyDescriptors();
        }
    }
}
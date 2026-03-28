package FrameSystem.SLibrary.SComponents;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SPanelActivatableBeanInfo extends SimpleBeanInfo {
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            List<PropertyDescriptor> descriptors = new ArrayList<>();
            BeanInfo superBeanInfo = Introspector.getBeanInfo(SPanel.class);
            descriptors.addAll(Arrays.asList(superBeanInfo.getPropertyDescriptors()));

            PropertyDescriptor active = new PropertyDescriptor("active", SPanelActivatable.class);
            PropertyDescriptor activeBackgroundColor = new PropertyDescriptor("activeBackgroundColor", SPanelActivatable.class);
            PropertyDescriptor inactiveBackgroundColor = new PropertyDescriptor("inactiveBackgroundColor", SPanelActivatable.class);

            active.setValue("category", "Active Settings");
            activeBackgroundColor.setValue("category", "Active Settings");
            inactiveBackgroundColor.setValue("category", "Active Settings");

            descriptors.addAll(Arrays.asList(active, activeBackgroundColor, inactiveBackgroundColor));
            return descriptors.toArray(new PropertyDescriptor[0]);
        } catch (IntrospectionException e) {
            e.printStackTrace();
            return super.getPropertyDescriptors();
        }
    }
}
package FrameSystem.SLibrary.SComponents;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SLabelHoverBeanInfo extends SimpleBeanInfo {

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            List<PropertyDescriptor> descriptors = new ArrayList<>();
            BeanInfo superBeanInfo = Introspector.getBeanInfo(SLabel.class);
            PropertyDescriptor[] superDescriptors = superBeanInfo.getPropertyDescriptors();

            for (PropertyDescriptor pd : superDescriptors) {
                String name = pd.getName();
                if (name.equals("background")) {
                    pd.setHidden(true);
                } else if (name.equals("foreground")) {
                    pd.setValue("category", "Colors");
                }
            }
            descriptors.addAll(Arrays.asList(superDescriptors));

            PropertyDescriptor defaultColor = new PropertyDescriptor("defaultColor", SLabelHover.class);
            PropertyDescriptor hoverColor = new PropertyDescriptor("hoverColor", SLabelHover.class);
            PropertyDescriptor radius = new PropertyDescriptor("radius", SLabelHover.class);

            defaultColor.setValue("category", "Colors");
            hoverColor.setValue("category", "Colors");
            radius.setValue("category", "Rounded Corners");

            descriptors.addAll(Arrays.asList(defaultColor, hoverColor, radius));
            return descriptors.toArray(new PropertyDescriptor[0]);
        } catch (IntrospectionException e) {
            e.printStackTrace();
            return super.getPropertyDescriptors();
        }
    }
}

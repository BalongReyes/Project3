package FrameSystem.SLibrary.SComponents;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JLabel;

public class SLabelBeanInfo extends SimpleBeanInfo {
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            List<PropertyDescriptor> descriptors = new ArrayList<>();
            BeanInfo superBeanInfo = Introspector.getBeanInfo(JLabel.class);
            PropertyDescriptor[] superDescriptors = superBeanInfo.getPropertyDescriptors();

            for (PropertyDescriptor pd : superDescriptors) {
                if (pd.getName().equals("border") || pd.getName().equals("toolTipText")) {
                    pd.setHidden(true);
                }
            }
            descriptors.addAll(Arrays.asList(superDescriptors));

            PropertyDescriptor scaledIcon = new PropertyDescriptor("scaledIcon", SLabel.class);
            PropertyDescriptor iconSize = new PropertyDescriptor("iconSize", SLabel.class);

            scaledIcon.setValue("category", "Icon Scaling");
            iconSize.setValue("category", "Icon Scaling");

            descriptors.addAll(Arrays.asList(scaledIcon, iconSize));
            return descriptors.toArray(PropertyDescriptor[]::new);
        } catch (IntrospectionException e) {
            return super.getPropertyDescriptors();
        }
    }
}
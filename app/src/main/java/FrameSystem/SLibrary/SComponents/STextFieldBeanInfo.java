package FrameSystem.SLibrary.SComponents;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JTextField;

public class STextFieldBeanInfo extends SimpleBeanInfo {
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            List<PropertyDescriptor> descriptors = new ArrayList<>();
            BeanInfo superBeanInfo = Introspector.getBeanInfo(JTextField.class);
            descriptors.addAll(Arrays.asList(superBeanInfo.getPropertyDescriptors()));

            PropertyDescriptor hint = new PropertyDescriptor("hint", STextField.class);
            PropertyDescriptor hintColor = new PropertyDescriptor("hintColor", STextField.class);
            PropertyDescriptor hintOffest = new PropertyDescriptor("hintOffest", STextField.class);

            hint.setValue("category", "Hint Settings");
            hintColor.setValue("category", "Hint Settings");
            hintOffest.setValue("category", "Hint Settings");

            descriptors.addAll(Arrays.asList(hint, hintColor, hintOffest));
            return descriptors.toArray(new PropertyDescriptor[0]);
        } catch (IntrospectionException e) {
            e.printStackTrace();
            return super.getPropertyDescriptors();
        }
    }
}
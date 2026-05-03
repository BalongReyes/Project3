package FrameSystem.SLibrary.SComponents;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class SComboBoxBeanInfo extends SimpleBeanInfo {

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            // Retrieve standard introspection (ignoring this BeanInfo to prevent infinite loops)
            BeanInfo info = Introspector.getBeanInfo(SComboBox.class, Introspector.IGNORE_IMMEDIATE_BEANINFO);
            PropertyDescriptor[] descriptors = info.getPropertyDescriptors();

            for (PropertyDescriptor pd : descriptors) {
                switch (pd.getName()) {
                    case "itemDefaultBackgroundColor":
                    case "itemHoverBackgroundColor":
                    case "itemDefaultForegroundColor":
                    case "itemHoverForegroundColor":
                    case "itemFont":
                    case "itemHeight":
                    case "itemRoundCorner":
                        pd.setValue("category", "SComboBox - Dropdown Items");
                        break;
                    case "arrowIcon":
                    case "arrowIconSize":
                        pd.setValue("category", "SComboBox - Arrow Icon");
                        break;
                    case "scrollbarBackgroundColor":
                    case "scrollbarColor":
                    case "scrollbarHoverColor":
                        pd.setValue("category", "SComboBox - Scrollbar");
                        break;
                }
            }
            return descriptors;
        } catch (IntrospectionException e) {
            return super.getPropertyDescriptors();
        }
    }
}

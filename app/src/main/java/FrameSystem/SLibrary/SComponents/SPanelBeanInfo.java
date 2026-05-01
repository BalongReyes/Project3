package FrameSystem.SLibrary.SComponents;

import FrameSystem.SLibrary.SComponents.SPanel;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class SPanelBeanInfo extends SimpleBeanInfo {

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try {
            // Retrieve standard introspection (ignoring this BeanInfo to prevent infinite loops)
            BeanInfo info = Introspector.getBeanInfo(SPanel.class, Introspector.IGNORE_IMMEDIATE_BEANINFO);
            PropertyDescriptor[] descriptors = info.getPropertyDescriptors();

            for (PropertyDescriptor pd : descriptors) {
                switch (pd.getName()) {
                    case "paintBackground":
                    case "defaultBackgroundColor":
                    case "defaultForegroundColor":
                        pd.setValue("category", "SPanel - Background & Defaults");
                        break;
                    case "canHover":
                    case "hovering":
                    case "hoverBackgroundColor":
                    case "hoverForegroundColor":
                        pd.setValue("category", "SPanel - Hover");
                        break;
                    case "active":
                    case "activeBackgroundColor":
                    case "activeForegroundColor":
                        pd.setValue("category", "SPanel - Active");
                        break;
                    case "activeHoverBackgroundColor":
                    case "activeHoverForegroundColor":
                        pd.setValue("category", "SPanel - Active Hover");
                        break;
                    case "danger":
                    case "dangerBackgroundColor":
                    case "dangerForegroundColor":
                        pd.setValue("category", "SPanel - Danger");
                        break;
                    case "radius":
                    case "rounded":
                    case "roundTopLeft":
                    case "roundTopRight":
                    case "roundBottomLeft":
                    case "roundBottomRight":
                        pd.setValue("category", "SPanel - Radius & Corners");
                        break;
                    case "borderLine":
                    case "defaultBorderColor":
                    case "borderSideTop":
                    case "borderSideBottom":
                    case "borderSideLeft":
                    case "borderSideRight":
                        pd.setValue("category", "SPanel - Border");
                        break;
                    case "shadowX":
                    case "shadowY":
                    case "shadowSize":
                    case "shadowOpacity":
                    case "shadowColor":
                    case "shadowOffsetX":
                    case "shadowOffsetY":
                        pd.setValue("category", "SPanel - Shadow");
                        break;
                }
            }
            return descriptors;
        } catch (IntrospectionException e) {
            return super.getPropertyDescriptors();
        }
    }
}
package com.vaadin.addon.touchkit.itest;

import org.junit.Ignore;

import com.vaadin.terminal.Sizeable;
import com.vaadin.ui.Component;

@Ignore
public class TestUtils {
    public static void makeSmallTabletSize(Component c) {
        c.setWidth(450, Sizeable.UNITS_PIXELS);
        c.setHeight(640, Sizeable.UNITS_PIXELS);
    }

}

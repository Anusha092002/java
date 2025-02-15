package com.wipro.java.design_pattern.abstactfactory.app;

import com.wipro.java.design_patterns.abstractfactory.buttons.Button;
import com.wipro.java.design_patterns.abstractfactory.checkboxes.Checkbox;
import com.wipro.java.design_patterns.abstractfactory.factories.GUIFactory;

public class Application {
	private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

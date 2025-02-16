package com.wipro.java.design_patterns.abstractfactory.factories;

import com.wipro.java.design_patterns.abstractfactory.buttons.Button;
import com.wipro.java.design_patterns.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
	Button createButton();
    Checkbox createCheckbox();
}

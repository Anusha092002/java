/**
 * 
 */
package com.wipro.java.design_patterns.abstractfactory.factories;

import com.wipro.java.design_patterns.abstractfactory.buttons.Button;
import com.wipro.java.design_patterns.abstractfactory.buttons.MacOSButton;
import com.wipro.java.design_patterns.abstractfactory.checkboxes.Checkbox;
import com.wipro.java.design_patterns.abstractfactory.checkboxes.MacOSCheckbox;

/**
 * 
 */
public class WindowsFactory implements GUIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		 return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new MacOSCheckbox();
	}

}

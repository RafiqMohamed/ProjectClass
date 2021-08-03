package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Login {
	
	public Login() {
//		PageFactory.initElements(factory, page);
	
	} 
	
	@FindBy(id="email")
	 private WebElement txtusername;
	
	
}


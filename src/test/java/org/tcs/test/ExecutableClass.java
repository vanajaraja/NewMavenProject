package org.tcs.test;

import org.openqa.selenium.WebElement;

public class ExecutableClass extends BaseClass{
	public static void main(String[] args) {
		driverIntialization();
		launchURL("https://www.facebook.com/");
		getCurrentURL();
		getPageTitle();
		
		PojoClass loc = new PojoClass();
		WebElement textEmail = loc.getTextEmail();
		WebElement txtPass = loc.getTxtPass();
		fill(textEmail, "java");
		fill(txtPass, "passowrd");
		WebElement btnLogin = loc.getBtnLogin();
		btnClick(btnLogin);
		
		
	}

}

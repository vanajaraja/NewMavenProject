package org.tcs.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass  extends BaseClass{
	
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement textEmail;
	@FindBy(id="pass")
	private WebElement txtPass;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement btnLogin;
	
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}
	public WebElement getTextEmail() {
		return textEmail;
	}
	public void setTextEmail(WebElement textEmail) {
		this.textEmail = textEmail;
	}
	public WebElement getTxtPass() {
		return txtPass;
	}
	public void setTxtPass(WebElement txtPass) {
		this.txtPass = txtPass;
	}
	
	

}

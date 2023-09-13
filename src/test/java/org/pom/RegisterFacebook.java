package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterFacebook extends BaseClass{
	public RegisterFacebook() {

	     PageFactory.initElements(driver, this);	
		
		}
		@FindBy(xpath="(//a[@role='button'])[2]")
		private WebElement cna;
		
		@FindBy(name="firstname")
		private WebElement firstname;
		
		@FindBy(name="lastname")
		private WebElement lastname;
		
		@FindBy(name="reg_email__")
		private WebElement mobilenumber;

		@FindBy(name="reg_passwd__")
		private WebElement newpassword;
		
		@FindBy(id="day")
		private WebElement day;
		
		@FindBy(id="month")
		private WebElement month;
		
		@FindBy(id="year")
		private WebElement year;
		
		@FindBy(xpath="(//input[@name='sex'])[1]")
		private WebElement female;
		
		@FindBy(name="websubmit")
		private WebElement signup;

		public WebElement getCna() {
			return cna;
		}

		public WebElement getFirstname() {
			return firstname;
		}

		public WebElement getLastname() {
			return lastname;
		}

		public WebElement getMobilenumber() {
			return mobilenumber;
		}

		public WebElement getNewpassword() {
			return newpassword;
		}

		public WebElement getDay() {
			return day;
		}

		public WebElement getMonth() {
			return month;
		}

		public WebElement getYear() {
			return year;
		}

		public WebElement getFemale() {
			return female;
		}

		public WebElement getSignup() {
			return signup;
		}


}

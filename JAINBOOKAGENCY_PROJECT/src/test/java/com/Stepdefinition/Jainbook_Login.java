package com.Stepdefinition;

import java.io.IOException;

import com.pages.Jainbook_Loginpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Jainbook_Login {
	Jainbook_Loginpage lpage=new Jainbook_Loginpage();
	@Given("^the user launch the chrome application$")
	public void the_user_launch_the_chrome_application() {
		lpage.launch("chrome");
	}

	@When("^the user open the jainbookagency Home page$")
	public void the_user_open_the_jainbookagency_Home_page() {
		 lpage.LoginPage();
	}

	@Then("^the user login using username and password$")
	public void the_user_login_using_username_and_password() throws IOException, InterruptedException {
		for(int i=1;i<=3;i++)

		{
			lpage.LoginDetails(i);
			lpage.close();
			
			if (i<=2)
			{
		    lpage.launch("chrome");
		    lpage.LoginPage();
			}
		}
	}

	
	@Then("^click on the logout button user close the browser$")
	public void click_on_the_logout_button_user_close_the_browser() throws InterruptedException, IOException {
		 lpage.close();
	}



}

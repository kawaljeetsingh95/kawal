package net.automation.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class Outlinepagefile extends PageObject
{
    @FindBy(xpath = "//input[@name='username']")
    WebElementFacade userfield;
    @FindBy(xpath = "//input[@name='password']")
    WebElementFacade passfield;
    @FindBy(xpath = "//button[@type='submit']")
    WebElementFacade login;
    @FindBy(xpath = "//p[@id='slfErrorAlert']")
    WebElementFacade faultmessage;

    public void usernamepassword(String arguser,String argpass)
    {
        userfield.sendKeys(arguser);
        passfield.sendKeys(argpass);
    }
    public void loginbutton()
    {
        if(login.isEnabled())
        {

            Assert.assertTrue(login.isEnabled());
            login.click();
        }else
        {
            Assert.assertFalse(login.isEnabled());
            System.out.println("Button is not enabled");
        }

    }

    public void comparefaultmessage(String args1)
    {

        if(!args1.equalsIgnoreCase("no error message")){
            Assert.assertEquals(args1,faultmessage.getText());
        }else {

            //Assert.assertNotEquals(args1,faultmessage.getText(),"No validation msg found");
            System.out.println("no validation message");

        }

    }
}

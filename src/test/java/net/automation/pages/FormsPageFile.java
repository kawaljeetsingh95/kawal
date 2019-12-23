package net.automation.pages;

import cucumber.api.DataTable;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class FormsPageFile extends PageObject
{
    @FindBy(xpath = "//input[@name='firstname']")
    WebElementFacade firstnamefield;
    @FindBy(xpath = "//input[@id='lastname']")
    WebElementFacade lastnamefield;
    @FindBy(xpath = "//input[@value='Male']")
    WebElementFacade Gender;
    @FindBy(xpath = "//input[@value='4']")
    WebElementFacade selectexperience;
    @FindBy(xpath = "//input[@id='datepicker']")
    WebElementFacade selectdate;
    @FindBy(xpath = "//input[@value='Automation Tester']")
    WebElementFacade profession;
    @FindBy(xpath = "//input[@class='input-file']")
    WebElementFacade chooseprofile;
    @FindBy(xpath = "//input[@value='Selenium Webdriver']")
    WebElementFacade tools;
    @FindBy(xpath = "//select[@id='continents']")
    WebElementFacade continents;
    @FindBy(xpath = "//select[@id='continentsmultiple']")
    WebElementFacade continentmultiple;
    @FindBy(xpath = "//select[@id='selenium_commands']")
    WebElementFacade seleniumcommands;

    public void selectformsdetails(DataTable dataTable) throws InterruptedException {
        List<Map<String,String>>data=dataTable.asMaps(String.class,String.class);
        String str=data.get(0).get("firstname");
        firstnamefield.sendKeys(str);
        String str1=data.get(1).get("lastname");
        lastnamefield.sendKeys(str1);

        String gender=data.get(0).get("sex");
        getDriver().findElement(By.xpath("//input[@name='sex' and @value='"+gender+"']")).click();

        String yearsofexp=data.get(0).get("years of experience");
       withAction().click( getDriver().findElement(By.xpath("//input[@name='exp' and @value='"+yearsofexp+"']"))).perform();

        String date1=data.get(0).get("dates");
        selectdate.sendKeys(date1);

        String profess=data.get(0).get("profession");
       withAction().click( getDriver().findElement(By.xpath("//input[@name='profession' and @value='"+profess+"']"))).perform();

        chooseprofile.sendKeys("C:\\Users\\kawaljeet.singh\\Desktop\\AMAN.jpg");

        waitABit(6000);

        String tools=data.get(0).get("Automation Tool");
       withAction().click( getDriver().findElement(By.xpath("//input[@name='tool' and @value='"+tools+"']"))).perform();

        waitABit(3000);

        String contents=data.get(0).get("continents1");
        Select s1=new Select(continents);
        s1.selectByVisibleText(contents);

        waitABit(3000);

        String contentssmultiple=data.get(0).get("multiple");
        Select s2=new Select(continentmultiple);
        s2.selectByVisibleText(contentssmultiple);
         waitABit(3000);
       // Thread.sleep(3000);

        String commands=data.get(0).get("selenium commands");
       // getDriver().findElement(By.xpath("//select[@id='selenium_commands']//option[text()='"+commands+"']")).click();
       Select s3=new Select(seleniumcommands);
       s3.selectByVisibleText(commands);

    }

//    public void selectgender()
//    {
//        Gender.waitUntilClickable();
//        Gender.click();
//    }
//
//    public void yearsofexperience()
//    {
//        waitABit(3000);
//        selectexperience.waitUntilVisible();
//        selectexperience.waitUntilClickable();
//        selectexperience.click();
//    }
//public void pickthedate(DataTable dataTable)
//{
//    List<Map<String,String>>data=dataTable.asMaps(String.class,String.class);
//    String str1=data.get(0).get("dates");
//    selectdate.sendKeys(str1);
//}
//
//public void selectprofessionandprofile()
//{
//    profession.click();
//    chooseprofile.sendKeys("C:\\Users\\kawaljeet.singh\\Desktop\\AMAN.jpg");
//}
//
//public void selecttoolcontinentandcommand() throws InterruptedException {
//
//    Thread.sleep(3000);
//    tools.waitUntilClickable();
//    tools.click();
//    Select s1=new Select(continents.selectByValue("EU"));
//    Select s2=new Select((continentmultiple.selectByValue("AUS")));
//    seleniumcommands.waitUntilClickable();
//    seleniumcommands.click();
//
//    Thread.sleep(3000);
//
//
//}


}

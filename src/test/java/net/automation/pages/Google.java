package net.automation.pages;

import com.typesafe.config.Config;
import net.thucydides.core.pages.PageObject;
import utilities.ConfigLoader;

public class Google extends PageObject {
    private static Config conf = ConfigLoader.load();
    String url=conf.getString("webdriver.base.url");

   public void goToHomePage() {
       getDriver().get(url);
       getDriver().manage().window().maximize();
    }
}

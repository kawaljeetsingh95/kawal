package net.automation.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.codehaus.groovy.transform.SourceURIASTTransformation;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.DeleteSession;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.List;

public class Entriespagefile extends PageObject {

    @FindBy(xpath = "//div[text()='Showing 31 to 32 of 32 entries']")
    WebElementFacade text;
    @FindBy(xpath = "//a[text()='Next']")
    WebElementFacade next;

    public void entry() {
//        int var = 0;
//
//            for (int i = 1; i <= 10; i++) {
//                if (getDriver().findElement(By.xpath("//a[text()='Next']")).isEnabled()) {
//                List<WebElement> list = getDriver().findElements(By.xpath("//tbody//tr[@role='row']"));
//                System.out.println(list.size());
//                var = var + list.size();
//                for (int j = 1; j <= list.size(); j++) {
//                    Iterator itr = list.iterator();
//                    if (itr.hasNext()) {
//                        waitABit(3000);
//                        getDriver().findElement(By.xpath("//a[text()='Next']")).click();
//                        break;
//                    }
//                }
//
//                    System.out.println("number of rows in the table===" + var);
//                    if (var > 31)
//                        break;
//                    continue;
//
//            }
//
//
//
//        }
//
//
//        String str=text.getText().replaceAll("Showing 31 to 32 of 32 entries","32");
//        int vk1= Integer.valueOf(str);
//        System.out.println("integer value==="+vk1);
//
//        //   Assert.assertEquals("comparison", vk1, var);
//        Assert.assertEquals(var, vk1);
//    }
//}








        int var = 0;

        for (int i = 1; i <= 10; i++) {
            if (next.isEnabled()) {
                List<WebElement> list = getDriver().findElements(By.xpath("//tbody//tr[@role='row']"));
                System.out.println(list.size());
                var = var + list.size();
                for (int j = 1; j <= list.size(); j++) {
                   Iterator itr = list.iterator();
                    if (itr.hasNext()) {
                        next.click();
                        break;
                    }


                }


                System.out.println("number of rows" + var);
                continue;

            } else {
                break;
            }
        }
        String str=text.getText().replaceAll("Showing 31 to 32 of 32 entries","32");
      int vk1= Integer.valueOf(str);
        System.out.println("integer value==="+vk1);

//        //   Assert.assertEquals("comparison", vk1, var);
        Assert.assertEquals(var, vk1);
    }
}













//








//
//        for (int i = 1; i <= 10; i++) {
//
//            if (getDriver().findElement(By.xpath("//a[text()='Next']")).isEnabled()) {
//
//                List<WebElement> list = getDriver().findElements(By.xpath("//tbody//tr[@role='row']"));
//                System.out.println("first page rows="+list.size());
//                getDriver().findElement(By.xpath("//a[text()='Next']")).click();
//                waitABit(3000);
//
//
//                List<WebElement> list1 = getDriver().findElements(By.xpath("//tbody//tr[@role='row']"));
//                System.out.println("second page rows="+list1.size());
//                getDriver().findElement(By.xpath("//a[text()='3']")).click();
//                waitABit(3000);
//
//                List<WebElement> list2 = getDriver().findElements(By.xpath("//tbody//tr[@role='row']"));
//                System.out.println("third page rows="+list2.size());
//                getDriver().findElement(By.xpath("//a[text()='Next']")).click();
//                waitABit(3000);
//
//                List<WebElement> list3 = getDriver().findElements(By.xpath("//tbody//tr[@role='row']"));
//                System.out.println("fourth page rows="+list3.size());
//                int var=list.size()+list1.size()+list2.size()+list3.size();
//                System.out.println("number of rows in table======="+var);
//                waitABit(4000);
//                Assert.assertEquals("verification is done", 32, var);
//                if(var>31)
//
//                    System.out.println("No more rows in the table");
//                    break;
//
//
//














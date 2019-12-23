package net.automation.pages;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import java.awt.*;
import java.awt.event.InputEvent;

public class Dragdroppagefile extends PageObject {
    @FindBy(xpath = "//span[text()='Draggable 1']")
    WebElementFacade draggable1;
    @FindBy(xpath="//div[@id='mydropzone']")
    WebElementFacade dropplace;
    public void elementdragdrop() throws AWTException {
        Actions act = new Actions(getDriver());
        Point dragLoc = draggable1.getLocation();
        System.out.println(dragLoc.getX()+"==="+dragLoc.getY());
        Robot robot = new Robot();
        robot.mouseMove(368 + 50, 413 + 150);//drag place
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        waitABit(1000);
        robot.mouseMove(590, 560);//drop place
        waitABit(2000);
        withAction().click(dropplace).perform();
      //  robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
       // withAction().moveToElement(dropplace).click(dropplace).perform();
//        try {
//            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        }catch (Exception e){
//            waitABit(3000);
//            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        }
        waitABit(5000);
    }

    }

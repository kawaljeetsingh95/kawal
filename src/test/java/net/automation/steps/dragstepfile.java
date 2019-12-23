package net.automation.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import net.automation.pages.Dragdroppagefile;
import net.automation.pages.Google;

import java.awt.*;

public class dragstepfile {
    Google google;
    Dragdroppagefile dragdroppagefile;
    @Given("^I am on the drag and drop page$")
    public void iAmOnTheDragAndDropPage()
    {
        google.goToHomePage();
    }

    @And("^I drag and drop Element on particular position$")
    public void iDragAndDropElementOnParticularPosition() throws Exception {
        dragdroppagefile.elementdragdrop();

    }
}

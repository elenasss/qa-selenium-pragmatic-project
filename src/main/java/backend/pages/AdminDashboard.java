package backend.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Browser;
import utils.Command;
import utils.Find;

public class AdminDashboard {

    /**
     * Asserts if the full name on top of the header menu is the one you expect
     * which is provided with the first parameter
     *
     * @param expectedUserFullName the full name you expect to be present in the top menu of the browser
     * @param messageOnFailure the message that will appear in the bug report in case of failure
     */
    public static void verifyUserFullName(String expectedUserFullName, String messageOnFailure) {
        String actualUserFullName = Command.getText(Find.byCss(".navbar-right .dropdown-toggle"));
        Assert.assertEquals(actualUserFullName, expectedUserFullName, messageOnFailure);
    }
}

package org.ap.qa.selenium;

import org.testng.annotations.Test;

public class ChromeActionsTest {

    @Test(priority = 1)
    public void testOpenChromeBrowser() {
        ChromeActions.openChromeBrowser();
    }

    @Test(dependsOnMethods = "testOpenChromeBrowser", priority = 2)
    public void testMaximizeBrowserWindow() {
        ChromeActions.maximizeBrowserWindow();
    }

    @Test(dependsOnMethods = "testMaximizeBrowserWindow", priority = 3)
    public void testNavigateToURL() {
        ChromeActions.navigateToURL("https://www.google.com");
    }

    @Test(dependsOnMethods = "testOpenChromeBrowser" , priority = 4)
    public void testCloseChromeBrowser() {
        ChromeActions.closeChromeBrowser();
        // Remove this comment >> created for running the pipeline only.
    }
}

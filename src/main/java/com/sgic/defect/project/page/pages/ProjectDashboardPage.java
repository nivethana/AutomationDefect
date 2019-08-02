package com.sgic.defect.project.page.pages;

import com.sgic.defect.project.page.utils.PageBase;
import org.openqa.selenium.By;

import java.util.logging.Logger;

public class ProjectDashboardPage extends PageBase {

    private static final Logger LOGGER=Logger.getLogger("ProjectDashboardPage.class");

    public static By hdrDefect=By.id("");
    public static String commonMenuStringlink="//*[text()=\"NAME\"]";

    public static boolean isDisplyedPage(){
        return getDriver().findElement(hdrDefect).isDisplayed();
    }
    public static void clickCommonLink (String name){
         getDriver().findElement(By.xpath(commonMenuStringlink.replace("NAME",name))).click();
         LOGGER.info("NAME"+name+"Clicked");

    }
}

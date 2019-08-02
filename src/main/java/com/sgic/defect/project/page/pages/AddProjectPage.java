package com.sgic.defect.project.page.pages;

import com.sgic.defect.project.page.utils.PageBase;
import org.openqa.selenium.By;

import java.util.logging.Logger;

public class AddProjectPage extends PageBase {
    private static final Logger LOGGER=Logger.getLogger("AddProjectPage.class");
    public static By hdrDefect=By.xpath("//*[text()=\"Project\"]");
    public static By btnAdd=By.xpath("//*[text()=\"Add Project\"]");


    public static boolean isDisplyedPage(){
        return getDriver().findElement(hdrDefect).isDisplayed();
    }
    public static void clickCommonLink (String name){
        getDriver().findElement(btnAdd).click();
        LOGGER.info("NAME"+name+"Clicked");

    }
}

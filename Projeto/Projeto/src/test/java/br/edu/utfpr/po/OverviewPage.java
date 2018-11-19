package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage {

    public OverviewPage (WebDriver driver) {
        super(driver);
        driver.get("http://192.168.0.100/web/dashboard/overview");
    }
}

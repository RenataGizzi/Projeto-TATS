package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("http://192.168.0.103/public");
    }
}

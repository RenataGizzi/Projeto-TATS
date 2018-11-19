package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {

    @FindBy(id = "profile-full_name")
    WebElement nomeCompleto;

    @FindBy(id = "profile-language")
    WebElement idioma;

    @FindBy(id = "profile-currencycode")
    WebElement currency;

    @FindBy(id = "profile-decimalseparator")
    WebElement decimalSeparator;

    @FindBy(id = "profile-startpage")
    WebElement paginaInicial;

    @FindBy(xpath = "//*[@id=\"profile-form\"]/div[6]/div/button")
    WebElement atualizarButton;

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public ProfilePage setNomeCompleto(String nomeCompleto) {
        nomeCompleto.clear();
        nomeCompleto.sendKeys(nomeCompleto);
        return this;
    }

    public String getNomeCompleto() {
        return nomeCompleto.getAttribute("value");
    }

    public void idioma() {
        idioma.click();
    }

    public void currency() {
        currency.click();
    }

    public void decimalSeparator() {
        decimalSeparator.click();
    }

    public void paginaInicial() {
        paginaInicial.click();
    }

    public void atualizar() {
        atualizarButton.click();
    }

}

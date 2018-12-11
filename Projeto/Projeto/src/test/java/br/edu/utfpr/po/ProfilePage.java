package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {

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

    @FindBy(xpath = "/html/body/div/div/div/div/p")
    WebElement msgSucesso;

    @FindBy(xpath = "//*[@id=\"profile-currencycode\"]")
    WebElement brazilReal;
    
    @FindBy(xpath = "//*[@id=\"profile-decimalseparator\"]")
    WebElement virgula;
    

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public ProfilePage setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto.clear();
        this.nomeCompleto.sendKeys(nomeCompleto);
        return this;
    }

    public String getNomeCompleto() {
        return nomeCompleto.getAttribute("value");
    }

    public ProfilePage idioma() {
        idioma.click();
        return this;
    }

    public ProfilePage currency() {
        currency.click();
        return this;
    }

    public ProfilePage decimalSeparator() {
        decimalSeparator.click();
        return this;
    }

    public void paginaInicial() {
        paginaInicial.click();
    }

    public ProfilePage atualizar() {
        atualizarButton.click();
        return this;
    }

    public ProfilePage brazilReal() {
        brazilReal.click();
        return this;
    }
    public ProfilePage virgula() {
        virgula.click();
        return this;
    }
    public String getMsgSucesso() {
        return msgSucesso.getAttribute("value");
    }

}

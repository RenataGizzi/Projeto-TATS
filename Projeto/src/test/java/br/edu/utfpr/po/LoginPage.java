package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "loginform-username")
    WebElement usuario;

    @FindBy(id = "loginform-password")
    WebElement senha;

    @FindBy(xpath = "//*[@id=\"login-form\"]/button")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[1]/div")
    WebElement msgErroUsuario;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[2]/div")
    WebElement msgErroSenha;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setUsuario(String usuario) {
        this.usuario.clear();
        this.usuario.sendKeys(usuario);
        return this;
    }

    public LoginPage setSenha(String senha) {
        this.senha.clear();
        this.senha.sendKeys(senha);
        return this;
    }

    public MenuPage logarToMenu() {
        loginButton.click();
        return new MenuPage(driver);
    }
    
    public ReleasesPage logarToRelease() {
        loginButton.click();
        return new ReleasesPage(driver);
    }

    public String getUsuario() {
        return usuario.getAttribute("value");
    }

    public String getSenha() {
        return senha.getAttribute("value");
    }

    public String getMessageErroUsuario() {
        return msgErroUsuario.getText().trim();
    }

    public String getMessageErroSenha() {
        return msgErroSenha.getText();
    }

}

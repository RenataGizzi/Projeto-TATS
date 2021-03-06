package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

    @FindBy(id = "user-currentpassword")
    WebElement senhaAtual;

    @FindBy(id = "id=\"user-newpassword\"")
    WebElement novaSenha;

    @FindBy(xpath = "//*[@id=\"account-form\"]/div[6]/div/button")
    WebElement atualizarButton;

    @FindBy(id = "user-email")
    WebElement email;

    @FindBy(id = "user-username")
    WebElement usuario;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/p")
    WebElement msgSucesso;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public MyAccountPage setSenhaAtual(String senhaAtual) {
        this.senhaAtual.clear();
        this.senhaAtual.sendKeys(senhaAtual);
        return this;
    }

    public MyAccountPage setUsuario(String usuario) {
        this.usuario.clear();
        this.usuario.sendKeys(usuario);
        return this;
    }

    public MyAccountPage setNovaSenha(String novaSenha) {
        this.novaSenha.clear();
        this.novaSenha.sendKeys(novaSenha);
        return this;
    }

    public MyAccountPage setEmail(String email) {
        this.email.clear();
        this.email.sendKeys(email);
        return this;
    }

    public void atualizar() {
        atualizarButton.click();
    }

    public String getEmail() {
        return email.getAttribute("value");
    }

    public String getUsuario() {
        return usuario.getAttribute("value");
    }

    public String getSenhaAtual() {
        return senhaAtual.getAttribute("value");
    }

    public String getNovaSenha() {
        return novaSenha.getAttribute("value");
    }

    public String getMsgSucesso() {
        return msgSucesso.getAttribute("value");
    }
}

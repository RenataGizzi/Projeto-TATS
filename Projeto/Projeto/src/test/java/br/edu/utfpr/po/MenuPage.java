package br.edu.utfpr.po;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"w7\"]/li[1]/a")
    WebElement visaoGeral;

    @FindBy(id = "//*[@id=\"w7\"]/li[3]/a")
    WebElement metas;

    @FindBy(xpath = "//*[@id=\"w7\"]/li[4]/a")
    WebElement opcoes;
    
    @FindBy(xpath = "//*[@id=\"w2\"]/li/a")
    WebElement categorias;

    @FindBy(xpath = "//*[@id=\"w7\"]/li[5]/a")
    WebElement menuUsuario;
    
    @FindBy(xpath = "//*[@id=\"w3\"]/li[1]/a")
    WebElement minhaConta;
    
    @FindBy(xpath = "//*[@id=\"w3\"]/li[2]/a")
    WebElement meuPerfil;
    
    @FindBy(xpath = "//*[@id=\"w3\"]/li[4]/a/i")
    WebElement sair;

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public MenuPage visaoGeralClicar() {
        visaoGeral.click();
        return this;
    }

    public void metasClicar() {
        metas.click();
    }
    
    public MyAccountPage minhaContaClicar() {
        minhaConta.click();
        return new MyAccountPage(driver);
    }
    
    public ProfilePage meuPerfilClicar() {
        meuPerfil.click();
        return new ProfilePage(driver);
    }
    
    public HomePage sairClicar() {
        sair.click();
        return new HomePage(driver);
    }

    public MenuPage opcoesClicar() {
        opcoes.click();
        return this;
    }
    
    public CategoryPage categoriaClicar() {
        categorias.click();
        return new CategoryPage(driver);
    }

    public MenuPage menuUsuarioClicar() {
        menuUsuario.click();
        return this;
    }

}

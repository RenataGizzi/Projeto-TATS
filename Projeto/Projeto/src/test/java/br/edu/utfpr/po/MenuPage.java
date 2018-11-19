package br.edu.utfpr.po;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage {

    @FindBy(xpath = "//*[@id=\"w7\"]/li[1]/a")
    WebElement visaoGeral;

    @FindBy(id = "//*[@id=\"w7\"]/li[3]/a")
    WebElement metas;

    @FindBy(xpath = "//*[@id=\"w7\"]/li[4]/a")
    WebElement opcoes;
    
    @FindyBy(xpath = "//*[@id=\"w3\"]/li/a");
    WeElement categorias;

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

    public void visaoGeralClicar() {
        visaoGeral.click();
    }

    public void metasClicar() {
        metas.click();
    }
    
    public void minhaContaClicar() {
        minhaConta.click();
    }
    
    public void meuPerfilClicar() {
        meuPerfil.click();
    }
    
    public void sairClicar() {
        sair.click();
    }

    public void opcoesClicar() {
        opcoes.click();
    }
    
    public void categoriaClicar() {
        categoria.click();
    }

    public void menuUsuarioClicar() {
        menuUsuario.click();
    }

}

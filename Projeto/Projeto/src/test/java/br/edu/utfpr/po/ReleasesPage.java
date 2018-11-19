package br.edu.utfpr.po;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReleasesPage {
    
    @FindBy(xpath = "//*[@id=\"headingOne\"]/strong/a/span")
    WebElement filtros;
    
    @FindBy(xpath = "//*[@id=\"w4\"]")
    WebElement exportarDados;
    
    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/h2/a")
    WebElement novo;
    

    public Releases(WebDriver driver) {
        super(driver);
    }
    
    public void filtrosClicar() {
        filtros.click();
    }
    
    public void exportarDadosClicar() {
        exportarDados.click();
    }    
    
    public void novoClicar() {
        novo.click();
    }
}

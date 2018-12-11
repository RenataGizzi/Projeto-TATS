package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReleasesPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"headingOne\"]/strong/a/span")
    WebElement filtros;

    @FindBy(xpath = "//*[@id=\"w4\"]")
    WebElement exportarDados;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/h2/a")
    WebElement novo;

    @FindBy(xpath = "//*[@id=\"cashbooksearch-type_id\"]")
    WebElement receita;

    @FindBy(xpath = "//*[@id=\"cashbooksearch-type_id\"]")
    WebElement tipo;

    @FindBy(xpath = "//*[@id=\"cashbooksearch-value\"]")
    WebElement valor;
    
    @FindBy(xpath = "//*[@id=\"w0\"]/div[8]/button[1]")
    WebElement filtrarButton;

    public ReleasesPage(WebDriver driver) {
        super(driver);
    }

    public ReleasesPage filtrosClicar() {
        filtros.click();
        return this;
    }

    public ReleasesPage exportarDadosClicar() {
        exportarDados.click();
        return this;
    }

    public ReleasesPage tipoClicar() {
        tipo.click();
        return this;
    }

    public ReleasesPage receitaClicar() {
        receita.click();
        return this;
    }

    public ReleasesPage filtrar() {
        filtrarButton.click();
        return this;
    }

    public ReleasesPage setValor(String valor) {
        this.valor.clear();
        this.valor.sendKeys(valor);
        return this;
    }

    public String getValor() {
        return valor.getAttribute("value");
    }

    public NewReleasePage novoClicar() {
        novo.click();
        return new NewReleasePage(driver);
    }
}

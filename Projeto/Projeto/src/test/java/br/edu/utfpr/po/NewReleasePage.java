package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewReleasePage {

    @FindBy(xpath = "//*[@id=\"cashbook-type_id\"]/label[1]/input")
    WebElement radioReceita;

    @FindBy(xpath = "//*[@id=\"cashbook-type_id\"]/label[2]/input")
    WebElement radioDespesas;

    @FindBy(id = "id=\"cashbook-value-disp\"")
    WebElement valor;

    @FindBy(xpath = "//*[@id=\"cashbook-category_id\"]")
    WebElement categoria;

    @FindBy(xpath = "//*[@id=\"cashbook-description\"]")
    WebElement descricao;

    @FindBy(xpath "//*[@id=\"cashbookform\"]/div[2]/div/button")
    WebElement gravarButton;
    
    @FindBy(xpath "/html/body/div/div/div/div[2]/div/div[1]/p")
    WebElement msgSucesso;

    public NewReleasePage(WebDriver driver) {
        super(driver);
    }

    public NewReleasePage setValor(String valor) {
        valor.clear();
        valor.sendKeys(valor);
        return this;
    }

    public NewReleasePage setDescricao(String descricao) {
        descricao.clear();
        descricao.sendKeys(descricao);
        return this;
    }

    public void gravar() {
        gravarButton.click();
    }

    public void radioReceita() {
        radioReceita.click();
    }

    public void radioDespesas() {
        radioDespesas.click();
    }
    
    public void categoria() {
        categoria.click();
    }
    

    public String getValor() {
        return valor.getAttribute("value");
    }

    public String getDescricao() {
        return descricao.getAttribute("value");
    }
    public String getmsgSucesso() {
        return msgSucesso.getAttribute("value");
    }
}

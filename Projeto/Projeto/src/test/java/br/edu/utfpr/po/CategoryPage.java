package br.edu.utfpr.po;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage {

    @FindBy(xpath = "/html/body/div/div/div/h2/a")
    WebElement novo;
    
    @FindBy(xpath = "//*[@id=\"category-desc_category\"]")
    WebElement descricao;
    
    @FindBy(xpath = "//*[@id=\"category-hexcolor_category\"]")
    WebElement cor;
    
    @FindBy(xpath = "//*[@id=\"category-parent_id\"]")
    WebElement categoriaPai;
    
    @FindBy(xpath = "//*[@id=\"category-is_active\"]/label[1]/input")
    WebElement ativoSim;
    
    @FindBy(xpath = "//*[@id=\"category-is_active\"]/label[2]/input")
    WebElement ativoNao;
    
    @FindBy(xpath = "//*[@id=\"categoryform\"]/div[5]/div/button/i")
    WebElement gravar;
    
    @FindBy(xpath = "/html/body/div/div/div/div[1]/p")
    WebElement gravar;
    
    @FindBy(xpath = "/html/body/div/div/div/div[1]/p")
    WebElement msgSucesso;

    public Category(WebDriver driver) {
        super(driver);
    }
    
    public LoginPage setDescricao(String descricao) {
        descricao.clear();
        descricao.sendKeys(descricao);
        return this;
    }

    public LoginPage setCor(String cor) {
        cor.clear();
        cor.sendKeys(cor);
        return this;
    }

    public void categoriaPai() {
        categoriaPai.click();
    }
    
    public void ativoSim() {
        ativoSim.click();
    }
    
    public void ativoNao() {
        ativoNao.click();
    }
    
    public void gravarClick() {
        gravar.click();
    }
    
    public String getDescicao() {
        return descricao.getAttribute("value");
    }

    public String getCor() {
        return cor.getAttribute("value");
    }
    
        public String getMsgSucesso() {
        return msgSucesso.getAttribute("value");
    }

}


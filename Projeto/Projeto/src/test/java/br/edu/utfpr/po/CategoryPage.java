package br.edu.utfpr.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage {

    @FindBy(xpath = "/html/body/div/div/div/h2/a")
    WebElement novo;

    @FindBy(xpath = "//*[@id=\"category-desc_category\"]")
    WebElement descricao;

    @FindBy(xpath = "//*[@id=\"category-hexcolor_category-cont\"]/div/div[1]/div")
    WebElement cor;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div[1]/span[1]/span")
    WebElement corPreta;

    @FindBy(id = "category-parent_id")
    WebElement categoriaPai;

    @FindBy(xpath = "//*[@id=\"category-parent_id\"]/option[1]")
    WebElement nenhum;

    @FindBy(xpath = "//*[@id=\"category-parent_id\"]")
    WebElement salario;

    @FindBy(xpath = "//*[@id=\"category-is_active\"]/label[1]/input")
    WebElement ativoSim;

    @FindBy(xpath = "//*[@id=\"category-is_active\"]/label[2]/input")
    WebElement ativoNao;

    @FindBy(xpath = "//*[@id=\"categoryform\"]/div[5]/div/button/i")
    WebElement gravar;

    @FindBy(xpath = "//*[@id=\"category-parent_id\"]")
    WebElement selecionar;

    @FindBy(xpath = "/html/body/div/div/div/div[1]/p")
    WebElement msgSucesso;

    @FindBy(xpath = "//*[@id=\"17\"]/td[2]/span/em")
    WebElement salariodacategoria;

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public CategoryPage setDescricao(String descricao) {
        this.descricao.clear();
        this.descricao.sendKeys(descricao);
        return this;
    }

    public CategoryPage corClicar() {
        this.cor.click();
        return this;
    }

    public CategoryPage corPretaClicar() {
        this.corPreta.click();
        return this;
    }

    public CategoryPage clicarNenhum() {
        this.nenhum.click();
        return this;
    }

    public CategoryPage clicarSalario() {
        this.salario.click();
        return this;
    }

    public CategoryPage categoriaPai() {
        categoriaPai.click();
        return this;
    }

    public CategoryPage novoClicar() {
        novo.click();
        return this;
    }

    public CategoryPage selecionar() {
        selecionar.click();
        return this;
    }

    public CategoryPage ativoSim() {
        ativoSim.click();
        return this;
    }

    public CategoryPage ativoNao() {
        ativoNao.click();
        return this;
    }

    public CategoryPage gravarClicar() {
        gravar.click();
        return this;
    }
    
        public CategoryPage salariodacategoriaClicar() {
        salariodacategoria.click();
        return this;
    }

    public String getDescicao() {
        return descricao.getAttribute("value");
    }

    public String getMsgSucesso() {
        return msgSucesso.getAttribute("value");
    }

}

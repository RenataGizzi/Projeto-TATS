package br.edu.utfpr;

import br.edu.utfpr.po.CategoryPage;
import br.edu.utfpr.po.HomePage;
import br.edu.utfpr.po.LoginPage;
import br.edu.utfpr.po.MenuPage;
import br.edu.utfpr.po.MyAccountPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CT05 {

    private WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void before() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("window-size=1200x600");
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void after() {
        driver.close();
    }

    @Test
    public void excluirCatPaiTest() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsuario("joe");
        loginPage.setSenha("12345");
        MenuPage menuPage = loginPage.logarToMenu();
        
        menuPage.opcoesClicar();
        CategoryPage categoryPage = menuPage.categoriaClicar();
        categoryPage.salariodacategoriaClicar();
        //incompleto
    }
}

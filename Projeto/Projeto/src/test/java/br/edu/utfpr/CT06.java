package br.edu.utfpr;

import br.edu.utfpr.po.LoginPage;
import br.edu.utfpr.po.HomePage;
import br.edu.utfpr.po.BasePage;
import br.edu.utfpr.po.CategoryPage;
import br.edu.utfpr.po.MenuPage;
import br.edu.utfpr.po.MyAccountPage;
import br.edu.utfpr.po.NewReleasePage;
import br.edu.utfpr.po.OverviewPage;
import br.edu.utfpr.po.ProfilePage;
import br.edu.utfpr.po.ReleasesPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CT06 {

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
    public void loginTest() {
        MenuPage menuPage = new MenuPage(driver);
        MyAccountPage myAccount = new MyAccountPage(driver);
        menuPage.minhaContaClicar();
        myAccount.setSenhaAtual("123456").setNovaSenha("1234567").atualizar();
        assertEquals("Conta atualizada", newReleasePage.getMsgSucesso());
    }
}
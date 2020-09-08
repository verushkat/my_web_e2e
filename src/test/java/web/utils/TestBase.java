package web.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by verushkat on 9/5/2020
 */
public class TestBase {

    protected WebDriver driver;
    private String baseURL = "https://www.goibibo.com/";


    @BeforeSuite
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @BeforeClass(alwaysRun = true)
    public void beforeClassInTestBase(){

        goHome();
        driver.manage().window().maximize();

    }

    public void goHome(){

               driver.get(baseURL);

    }

    @AfterClass
    public void  afterMethodInGUITestBase(){


        driver.close();
    }









}

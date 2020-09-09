package web.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TestBase {

    protected WebDriver driver;
    private String baseURL = "http://the-internet.herokuapp.com/tables";
    protected SoftAssert softAssert;


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

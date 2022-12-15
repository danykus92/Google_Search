package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGRun {
    private String url = "https://demoqa.com/";
    WebDriver driver;

    @BeforeTest
    public void setBaseUrl(){

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(url);
    }

    @Test
    public void titleTest(){
        String expectedTitle = "ToolsQA";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @Test
    public void urlTest(){

        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, "test");

    }


    @AfterTest
    public void closeSession(){
        driver.quit();
    }
}

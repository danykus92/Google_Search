package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPage {

    public By txtBuscar = By.name("q");
    public By btnBuscar = By.name("btnK");
    public By btnSuerte = By.name("btnI");


    public void buscar( String buscarGoogle){
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "\\src\\main\\resources\\drivers\\chromedriver.exe");

        // Inicializando Navegador
        WebDriver driver = new ChromeDriver();

        // Abrir Navegador
        driver.get("https://www.google.com/");
        WebElement searchInput = driver.findElement(txtBuscar);
        searchInput.sendKeys(buscarGoogle);
        searchInput.sendKeys(Keys.RETURN);


        // Maximnazando Navegador
        driver.manage().window().maximize();

        // Cerrar Navegador
        driver.close();

    }
}

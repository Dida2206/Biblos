package pages;


import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage { 

    protected static WebDriver driver;
    private static WebDriverWait wait; 
    private static Actions action;

    
    static {
       System.setProperty("webdriver.chrome.driver","C:\\selenium\\ChromeDriver\\chromedriver.exe"); 
       ChromeOptions chromeOptions = new ChromeOptions();
       driver = new  ChromeDriver (chromeOptions);
       driver.manage().window().maximize();
       Set<String> allWindowHandles = driver.getWindowHandles();
       System.out.println("Windows open after click:"+ allWindowHandles.size());
       wait = new WebDriverWait (driver,15);
    }

    public BasePage (WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait (driver,15);      
    }
 
    public void navegarPagina(){
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        assertTrue(driver.findElement(By.id("contenido")).isDisplayed());
    }

    public void navegarAyuda(){
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        assertTrue(driver.findElement(By.id("img-buscador")).isDisplayed());
    }

    public void navegarInfoUtil(){
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        assertTrue(driver.findElement(By.id("contenido")).isDisplayed());
    }

    public void navegarEspacios(){
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        assertTrue(driver.findElement(By.id("contenido")).isDisplayed());
    }

    public void cambiarTab(){
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
    }

    public static void ingresarA (String url){
        driver.get(url);
    }
    
    public WebElement Find (String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator){
        Find(locator).click(); 
    }

    public static void closeBrowser(){
        driver.quit();
    }

    public void write(String locator, String criteria){
        Find(locator).clear();
        Find(locator).sendKeys(criteria);
    }

    public void switchToiFrame(int iFrameIndex){
        driver.switchTo().frame(iFrameIndex);
    }

    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public void closeTab(){
        driver.close();
    }

    public String textFromElement(String locator){
        return Find(locator).getText();
    }

    public void doubleClick(String locator){
        action.doubleClick(Find(locator));
    }
    public String obtenerValor(String locator){
        String dato = locator;
        return Find(dato).getText();
    }

    public boolean elementIsDisplayed(String locator){
        return Find(locator).isDisplayed();
    }


}

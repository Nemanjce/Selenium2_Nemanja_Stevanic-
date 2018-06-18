
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        Thread.sleep(4000, 1500);

        driver.manage().window().maximize();
        driver.get("http://www.booking.com/");
        
        WebElement destinationField = wait.until(ExpectedConditions.elementToBeClickable(By.className("c-autocomplete__input")));
        destinationField.sendKeys("Belgrade");
        WebElement saveOnDropMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Belgrade")));
        saveOnDropMenu.click();
        
        WebElement checkinDate = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Check-in Date")));
        checkinDate.click();
        
        WebElement checkinCalendareEntry = driver.findElement(By.linkText("18"));
        checkinCalendareEntry.click();
        
        driver.quit();
        

                
                }

}

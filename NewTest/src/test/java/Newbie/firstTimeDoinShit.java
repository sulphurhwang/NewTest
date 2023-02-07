package Newbie;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstTimeDoinShit {

@Test
    public void firstTimeDoinShit() throws InterruptedException {
    WebDriverManager wdm = WebDriverManager.chromedriver();
    WebDriver driver = new ChromeDriver();
    driver.get("https://instagram.com");
    Thread.sleep(2000);
    driver.findElement(By.name("username")).sendKeys("fuongtastic_");
    driver.findElement(By.name("password")).sendKeys("@21201Ph");
    driver.findElement(By.xpath("//div[contains(@class,'_ab94 _ab99 _ab9f _ab9m _ab9p _abcm')]")).click();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Calculator {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void Underweight(){
        /*
        1. Открыть драйвер
        2. Зайти на сайт https://healthunify.com/bmicalculator/
        3. В поле Weight ввести вес, например 47
        4. В поле or cms ввести рост, например 168
        5. Нажать кнопку Calculate
        6. Проверить, что виден результат "Your category is Underweight"
         */

        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("47");
        driver.findElement(By.name("ht")).sendKeys("168");
        driver.findElement(By.name("cc")).click();
        boolean isDisplayed = driver.findElement(By.name("desk")).isDisplayed();
        assertTrue(isDisplayed);



    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}

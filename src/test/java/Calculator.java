import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


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
        String actual = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals(actual, "Your category is Underweight", "Category does not match");


    }

    @Test
    public void Starvation(){
        /*
        1. Открыть драйвер
        2. Зайти на сайт https://healthunify.com/bmicalculator/
        3. В поле Weight ввести вес, например 34
        4. В поле or cms ввести рост, например 168
        5. Нажать кнопку Calculate
        6. Проверить, что виден результат "Your category is Starvation"
         */

        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("34");
        driver.findElement(By.name("ht")).sendKeys("168");
        driver.findElement(By.name("cc")).click();

        String actual = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals(actual, "Your category is Starvation", "Category does not match");
    }

    @Test
    public void Normal(){
        /*
        1. Открыть драйвер
        2. Зайти на сайт https://healthunify.com/bmicalculator/
        3. В поле Weight ввести вес, например 56
        4. В поле or cms ввести рост, например 168
        5. Нажать кнопку Calculate
        6. Проверить, что виден результат "Your category is Normal"
         */

        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("56");
        driver.findElement(By.name("ht")).sendKeys("168");
        driver.findElement(By.name("cc")).click();

        String actual = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals(actual, "Your category is Normal", "Category does not match");
    }

    @Test
    public void Overweight(){
        /*
        1. Открыть драйвер
        2. Зайти на сайт https://healthunify.com/bmicalculator/
        3. В поле Weight ввести вес, например 76
        4. В поле or cms ввести рост, например 168
        5. Нажать кнопку Calculate
        6. Проверить, что виден результат "Your category is Overweight"
         */

        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("76");
        driver.findElement(By.name("ht")).sendKeys("168");
        driver.findElement(By.name("cc")).click();

        String actual = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals(actual, "Your category is Overweight", "Category does not match");
    }


    @Test
    public void Obese(){
        /*
        1. Открыть драйвер
        2. Зайти на сайт https://healthunify.com/bmicalculator/
        3. В поле Weight ввести вес, например 90
        4. В поле or cms ввести рост, например 168
        5. Нажать кнопку Calculate
        6. Проверить, что виден результат "Your category is Obese"
         */

        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("90");
        driver.findElement(By.name("ht")).sendKeys("168");
        driver.findElement(By.name("cc")).click();

        String actual = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals(actual, "Your category is Obese", "Category does not match");
    }



    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}

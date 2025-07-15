package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class SampleTest {

    @Test
    public void sampleTest(){

        System.out.println("Hi");

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://gmail.com");
        String title = driver.getTitle();
        System.out.println(title);

        driver.quit();

        System.out.println("Hello");
    }
}

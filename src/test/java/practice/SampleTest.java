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

        System.out.println("Hello");
    }
}

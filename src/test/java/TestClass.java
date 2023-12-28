import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestClass {

    public static void main(String[] args) {
        //System.setProperty("webdriver.edge.driver","C:\\bin\\msedgedriver.exe");
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.co.in");
        System.out.println(driver.getTitle());
        driver.quit();

    }


}

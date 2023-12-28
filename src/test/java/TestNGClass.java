import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.testng.annotations.*;

public class TestNGClass {

    @Test (priority = 1)
    void Testcal() {

        System.out.println("First Method");
    }

    @BeforeClass
    public void EnterURL(){
        System.out.println("Before Class");
    }
    @BeforeSuite
    public void ChooseBrowser(){
        System.out.println("Before Suite");
    }
    @BeforeTest
    public void SetPropertiesofBrowser(){
        System.out.println("SBefore Test");
    }
    @BeforeMethod
    public void EnterMethod(){
        System.out.println("Before Method");
    }
    @BeforeGroups
    public void EnterMethodBefore(){
        System.out.println("Before Group");
    }

    @AfterClass
    public void EnterURLAfter(){
        System.out.println("after Class");
    }
    @AfterSuite
    public void ChooseBrowserAfter(){
        System.out.println("after Suite");
    }
    @AfterTest
    public void SetPropertiesofBrowserAfter(){
        System.out.println("After Test");
    }
    @AfterMethod
    public void EnterMethodAfter(){
        System.out.println("After Method");
    }

    @AfterGroups
    public void EnterGroupMethodAfter(){
        System.out.println("After Group");
    }

    @Test (priority = 2)
    public void secondMethod(){
        System.out.println("2nd Method");
    }
    @Test (priority = 3)
    public void ThirdMethod(){
        System.out.println("Third Method");
    }
    @Test(priority = 4)
    public void FourthMethod(){
        System.out.println("Fourth Method");
    }
}

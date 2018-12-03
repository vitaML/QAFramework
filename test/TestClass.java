import com.epam.base.BrowserFactory;
import com.epam.base.Log;
import com.epam.base.ReadProperties;
import com.epam.enums.Property;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.testng.annotations.Test;

public class TestClass {
    private static final Logger LOG = new Log(TestClass.class).getLogger();
    private final WebDriver driver = new BrowserFactory().getDriver();
    @Test
    public void testMethod() {

        LOG.info("Start");
        LOG.info(ReadProperties.getProperty(Property.BASEURL));
        driver.get(ReadProperties.getProperty(Property.BASEURL));
        driver.quit();
        LOG.info("Finish");
    }
}

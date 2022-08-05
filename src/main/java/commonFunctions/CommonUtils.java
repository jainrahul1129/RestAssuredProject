package commonFunctions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class CommonUtils {
    private String url;
    WebDriver driver;
    static InputStream is;
    private static final Properties prop;

    static {
        try {
            prop = new Properties();
            is = ClassLoader.class.getResourceAsStream("/Get.properties");
            prop.load(is);
        } catch (IOException e) {
            throw new RuntimeException("Unable to load Properties file ");
        }
    }

    public static String getValue(String key) {
        return prop.getProperty(key);
    }

    public void launchBrowser(String url1) {
        this.url = getValue(url1);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("URL is : "+url);
        driver.get(url);
    }
}
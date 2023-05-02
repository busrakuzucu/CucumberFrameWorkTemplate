package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD_old {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        //extend report türkce bilg çalışmaması sebebiyle sistemin ayarlarını ingilizce çalıştırıyor
        //tarih nokta virgül gibi
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");


        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        if (driver == null) {
//          ChromeOptions options = new ChromeOptions();
//          options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (driver != null) {//dolu ise, boş değilse
            driver.quit();
            driver=null;
        }

    }
}

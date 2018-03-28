import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Basics extends BaseClass {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        By preferenceMenu = By.xpath("//android.widget.TextView[@text='Preference']");
        By preferenceDependencies = By.xpath("//android.widget.TextView[@text='3. Preference dependencies']");
        By wifiCheckbox = By.id("android:id/checkbox");
        By wifiSettings = By.xpath("(//android.widget.RelativeLayout)[2]");
        By wifiSettingsEditString = By.className("android.widget.EditText");
        By okButton = By.id("android:id/button1");

        driver.findElement(preferenceMenu).click();
        driver.findElement(preferenceDependencies).click();
        driver.findElement(wifiCheckbox).click();
        driver.findElement(wifiSettings).click();
        driver.findElement(wifiSettingsEditString).sendKeys("123qwe");
        driver.findElement(okButton).click();

    }

}

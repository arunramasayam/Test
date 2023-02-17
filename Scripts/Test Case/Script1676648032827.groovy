import java.util.concurrent.TimeUnit

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



WebUI.openBrowser('');
WebDriver driver =DriverFactory.getWebDriver();
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://atlasqa.cartus.com/");
driver.findElement(By.id("UserID")).sendKeys("atlas441");
driver.findElement(By.id("Passwd")).sendKeys("Q1Qa445566")
KeywordUtil.logInfo("Site:${driver.getTitle()}")

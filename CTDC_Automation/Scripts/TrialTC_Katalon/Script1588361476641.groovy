import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import org.openqa.selenium.firefox.FirefoxBinary as FirefoxBinary
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions as FirefoxOptions
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths

//**********************Description************************************
/*
 * This test case opens the canine commons page, then clicks on the Cases button and then
 *  clicks next button in the results to view all the pages & captures its data in an XSSF arraylist and then 
 *  writes the entire results into an excel"
 * test
 */
//Path filepath = Paths.get(System.getProperty("user.dir"), "chromedriver.exe"); // give the Input Excel Name in manual mode in TC
//System.setProperty('webdriver.chrome.driver', filepath.toString())
//WebDriver driver = new ChromeDriver()
//using Se webdriver 
/*
driver.get("https://caninecommons-qa.cancer.gov/#/")
Thread.sleep(3000)
driver.findElement(By.xpath("//a[contains(@href,'cases')]")).click() */
//using katalon's driver
WebUI.openBrowser('https://caninecommons-qa.cancer.gov/#/')

Thread.sleep(3000)

WebUI.click(findTestObject('Object Repository/Canine/Canine_Cases') //clicks the Cases button
    )

Thread.sleep(3000)

//WebUI.openBrowser(GlobalVariable.G_Urlname)
//Thread.sleep(5000)

CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.RunKatalon'('Password_canineKatalon.xlsx')
CustomKeywords.'ctdc.utilities.ReadExcel.Neo4j'()



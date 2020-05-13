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


CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.driveropen'()

'Opens the browser of choice: Chrome, Firefox or Edge\r\n\r\n'
WebUI.openBrowser('')

'Driver opened by Katalon is used in Selenium from this step.'
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.browserDriver'('')

'This step takes the Query from input excel and fetches data from Neo4j database. \r\nSaves the results from neo4j and application in the same name mentioned in the input excel. \r\n'
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.RunKatalon'('TC02_Canine_Filter_Study-NCATS.xlsx')

'Clicks on the Cases button in the Navbar of ICDC\'s homepage.\r\n'
WebUI.click(findTestObject('Object Repository/Canine/Canine_Cases_Btn'))

'Clicks on the Filter \'Study\' from left pane'
WebUI.click(findTestObject('Object Repository/Canine/Filter/Study/Canine_Filter_Study'))

'Selects the specific check box from \'Study\' filter.'
WebUI.click(findTestObject('Object Repository/Canine/Filter/Study/Canine_Filter_Study-NCATS_Chkbx'))

'Reads the results displayed for the selected filter (from all the pages) and saves in the excel mentioned in Input file\r\n'
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.ReadCasesTableKatalon'('Object Repository/Canine/Canine_CasesTable', 
    'Object Repository/Canine/Canine_TableHeader', 'Object Repository/Canine/Canine_NextBtn')

'Reads Neo4j DB using the query from Input file and saves the data in the excel mentioned in Input file\r\n'
CustomKeywords.'ctdc.utilities.ReadExcel.Neo4j'()

'Reads Neo4j excel and Webdata excel as lists and compares the data.\r\n'
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.compareLists'()


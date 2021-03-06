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

WebUI.closeBrowser()

'Opens the browser of choice: Chrome, Firefox or Edge'
WebUI.openBrowser('')

'Driver opened by Katalon is used in Selenium from this step.'
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.browserDriver'('')

'This step takes the Query from input excel and fetches data from Neo4j database. \r\nSaves the results from neo4j and application in the same name mentioned in the input excel. '
CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.RunKatalon'('TC01_Canine_Filter_Study-COTB.xlsx')

'Clicks on the Cases button in the Navbar of ICDC\'s homepage.'
WebUI.waitForElementPresent(findTestObject('Canine/NavBar/Canine_Cases_Btn'), 5)
WebUI.click(findTestObject('Canine/NavBar/Canine_Cases_Btn'))

'Clicks on the Filter \'Study\' from left pane'
WebUI.waitForElementPresent(findTestObject('Object Repository/Canine/Filter/Study/Canine_Filter_Study'), 5)
WebUI.click(findTestObject('Object Repository/Canine/Filter/Study/Canine_Filter_Study'))

'Selects the specific check box from \'Study\' filter.'
WebUI.click(findTestObject('Object Repository/Canine/Filter/Study/Canine_Filter_Study-COTB_Chkbx'))

CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.ReadCasesTableKatalon'('Object Repository/Canine/Canine_CasesTable', 
    'Object Repository/Canine/Canine_TableHeader', 'Object Repository/Canine/Canine_NextBtn', GlobalVariable.G_WebTabnameCasesCases)

CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.readStatBar'('Object Repository/Canine/StatBar/Canine_StatBar-Files', 'Object Repository/Canine/StatBar/Canine_StatBar-Samples', 
    'Object Repository/Canine/StatBar/Canine_StatBar-Cases', 'Object Repository/Canine/StatBar/Canine_StatBar-Studies')

CustomKeywords.'ctdc.utilities.ReadExcel.Neo4j'()

CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.compareLists'(GlobalVariable.G_WebTabnameCasesCases, GlobalVariable.G_CypherTabnameCasesCases)

CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.validateStatBar'()




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

WebUI.openBrowser('')

CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.browserDriver'('')

CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.RunKatalon'('Password_canine.xlsx')

WebUI.click(findTestObject('Canine/Canine_Cases_Btn'))

WebUI.waitForElementPresent(findTestObject('Canine/Canine_CasesTable'), 5)

WebUI.click(findTestObject('Canine/Filter/StudyType/Canine_Filter_StudyType'))

WebUI.click(findTestObject('Canine/Filter/StudyType/Canine_Filter_StudyType-Transcrip_Chkbx'))

CustomKeywords.'ctdc.utilities.runtestcaseforKatalon.Select_case_checkbox'('NCATS-COP01CCB010072', 'one')

WebUI.waitForElementPresent(findTestObject('Canine/Canine_SaveToMycases'), 0)

WebUI.click(findTestObject('Canine/Canine_SaveToMycases'))

WebUI.click(findTestObject('Canine/Canine_MyCases'))

WebUI.click(findTestObject('Canine/Canine_GoToFiles'))

WebUI.click(findTestObject('Canine/Canine_SelectAll'))

WebUI.click(findTestObject('Canine/Canine_DownloadManifest'))

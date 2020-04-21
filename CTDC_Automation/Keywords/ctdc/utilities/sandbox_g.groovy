package ctdc.utilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import internal.GlobalVariable


import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import com.kms.katalon.core.webui.driver.DriverFactory

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths

import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ctdc.utilities.ReadExcel  // importing this class to use the read excel function

public class sandbox_g {

	/*@Keyword
	 public void getElementID(){
	 Path driverPath = Paths.get(System.getProperty("user.dir"), "chromedriver.exe");
	 System.out.println("This is the full filepath of browser driver after converting to string :"+driverPath.toString());
	 System.setProperty('webdriver.chrome.driver', driverPath.toString())
	 WebDriver driver = new ChromeDriver()
	 driver.get("https://trialcommons-qa.cancer.gov/#/cases")
	 driver.manage().window().maximize();
	 WebElement Table = driver.findElement(By.id("table_cases"))
	 //String CTDCid ="CTDC-43062"
	 //*[@id="MUIDataTableSelectCell-4"]   // go one level up from ctdc id and get this value  (or) use the same Id and use type = checkbox
	 //spy and add for select all
	 //*[@id="MUIDataTableBodyRow-4"]/td[3]/div/a    get attribute by id & trim the td tr etc and click on the checkbox
	 if (Table.findElement(By.linkText("CTDC-43062"))!=null){
	 WebElement casebyId = Table.findElement(By.linkText("CTDC-43062"));
	 WebElement parentCasebyID = Table.findElement(casebyId)  //parent::tr
	 String caseId = Table.findElement(By.linkText("CTDC-43062")).getAttribute("tagName");
	 System.out.println("Found element with given case id")
	 System.out.println("Id of the given case id is:- "+ caseId);
	 }else{
	 System.out.println("Element with given case id not found in this page")
	 }
	 }  */


}
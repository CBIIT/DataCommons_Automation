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
import java.util.concurrent.TimeUnit;

import internal.GlobalVariable

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;


import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.util.*
import java.lang.String as String
import groovy.transform.Field as Field


import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.util.*
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileDescriptor
import java.io.File
import java.lang.String
import java.lang.Object
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.lang.String as String
import groovy.transform.Field as Field
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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static org.junit.Assert.*;

import internal.GlobalVariable




import internal.GlobalVariable
import ctdc.utilities.ReadExcel

public class RunTestcase {

	public static WebDriver driver = new ChromeDriver()

	@Keyword
	public  void Run( String InputExcelname) {

		Path filepath = Paths.get(System.getProperty("user.dir"), "TestData", InputExcelname);
		System.out.println("This is the full filepath after converting to string :"+filepath.toString());
		// Create an ArrayList to store the data read from excel sheet.
		List<List<XSSFCell>> sheetData = new ArrayList<>();
		FileInputStream fis = new FileInputStream(filepath.toString());
		XSSFWorkbook workbook = new XSSFWorkbook(fis); // Create an excel workbook from the file system.

		// Get the  sheets on the workbook.
		int numberOfSheets = workbook.getNumberOfSheets();
		//for (int s = 0 ; s< numberOfSheets; s++){
		int countrow = 0
		int countcol= 0

		//Workbook workbook1 = (Workbook) workbook;
		//System.out.println( numberOfSheets)
		XSSFSheet sheet = workbook.getSheetAt(1);  // Very important that we read the sheet 1 as its test case sheet
		countrow = sheet.lastRowNum- sheet.firstRowNum;
		//System.out.println ( "roww count is  : " + countrow);
		countcol = sheet.getRow(0).getLastCellNum();
		//System.out.println("Col count : " + countcol);
		Iterator rows = sheet.rowIterator();
		while (rows.hasNext()) {
			XSSFRow row = (XSSFRow) rows.next();
			Iterator cells = row.cellIterator();

			List<XSSFCell> data = new ArrayList<>();
			while (cells.hasNext()) {
				XSSFCell cell = (XSSFCell) cells.next();
				data.add(cell);
			}
			sheetData.add(data);
		}

		excelparsing(sheetData,driver);


	}


	private static void excelparsing(List<List<XSSFCell>> sheetData, WebDriver driver) {
		// Iterates the data and print it out to the console.
		int countrow = 0
		countrow = sheetData.size();
		System.out.println ( " sheetdata size countrow " + countrow )
		System.out.println ( "sheet  data size :" + sheetData.get(0).size())

		for (int ii = 1; ii < countrow; ii++){
			List<XSSFCell> datarow = sheetData.get(ii);

			for (int jj = 0; jj < datarow.size(); jj++){
				//	System.out.println ("value of  ii :"  + ii + "  Value of jj  : " + jj )

				XSSFCell cell = datarow.get(jj);

				System.out.println ("Before Switch value  : " + sheetData.get(0).get(jj).getStringCellValue().trim()  )
				System.out.println ( "Value in column :" + sheetData.get(ii).get(jj).getStringCellValue())
				switch(sheetData.get(0).get(jj).getStringCellValue().trim() )
				{
					case("Browser"):
					//				System.out.println ("Inside Browser Switch Case")


					case("propertyName"):
						GlobalVariable.G_propertyName = sheetData.get(ii).get(jj).getStringCellValue()
					//					System.out.println ( " THE Property name  BEING saved :  "  +  GlobalVariable.G_propertyName )

					//Do Test here
						break;
					case("propertyvalue"):
						GlobalVariable.G_propertyvalue = sheetData.get(ii).get(jj).getStringCellValue()
						System.out.println ( " THE propertyvalue BEING saved :  "  +  GlobalVariable.G_propertyvalue )

					//Do Test here
						break;
					case("locateby"):
						GlobalVariable.G_locateby = sheetData.get(ii).get(jj).getStringCellValue()
					//Do Test here
						break;
					case("locatorvalue"):
						GlobalVariable.G_locatorvalue = sheetData.get(ii).get(jj).getStringCellValue()
					//Do Test here
						break;
					case("action"):
						GlobalVariable.G_Action = sheetData.get(ii).get(jj).getStringCellValue()
					//Do Test here
						break;
					case("Query"):

						GlobalVariable.G_Query = sheetData.get(ii).get(jj).getStringCellValue()
					//						System.out.println ( " THE QUERY BEING saved :  "  +  GlobalVariable.G_Query )




					//Do Test here
						break;
					case("Page"):
						GlobalVariable.G_Page = sheetData.get(ii).get(jj).getStringCellValue().trim()
						if( GlobalVariable.G_Page=="na"){

						}

						else {


							driver.get(GlobalVariable.G_Page)
						}

						break;
					case("Function"):


						System.out.println ( "  the value tobe uses in the function call  : " + sheetData.get(ii).get(jj).getStringCellValue().trim() )
						switch(sheetData.get(ii).get(jj).getStringCellValue().trim() )
						{
							case("InitialLoad"):

								ReadExcel.initialLoad()
								ReadExcel.PrintG()
								break;
							case ("Dbconnect"):
								System.out.println  (" In dataload")
								ReadExcel.Neo4j()
								break;

							case ("action_click"):
								driver.manage().window().maximize()


							//Thread.sleep(3000)
								driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
								driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

							//WebUI.waitForPageLoad(5)
								WebDriverWait wait = new WebDriverWait(driver, 30);
								WebElement ElementFromExcel
								ElementFromExcel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(GlobalVariable.G_locatorvalue)))

							//Thread.sleep(3000)
							//driver.findElement(By.xpath( GlobalVariable.G_locatorvalue)).click()
								ElementFromExcel.click()


								Thread.sleep(3000)


								System.out.println( " clicked on :" + GlobalVariable.G_locatorvalue )

							//driver.manage().window().maximize()
							//WebDriverWait wait = new WebDriverWait(driver, 30);

							//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
							//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

								break;


							case("Select_case_checkbox"):



								String one_all = sheetData.get(ii).get(2).getStringCellValue().trim()
								String Casenum= sheetData.get(ii).get(3).getStringCellValue().trim()

								Select_case_checkbox(driver,Casenum,one_all )

							case("webdata"):
								List<String> WData = new ArrayList<String>();

							//GlobalVariable.G_CaseData=
								WData=ReadCasesTable(driver)
							//GlobalVariable.G_Run = sheetData.get(ii).get(jj).getStringCellValue()
								break;
							case("StoreGlobal"):

								GlobalVariable.(sheetData.get(ii).get(3).getStringCellValue())=sheetData.get(ii).get(6).getStringCellValue()
							//System.out.println GlobalVariable.(sheetData.get(ii).get(3).getStringCellValue())
							//System.out.println GlobalVariable.G_cannine_caseTbl
							//System.out.println GlobalVariable.G_cannine_caseTblBdy
								break;
							case("verify"):

								verify_text(driver,"American Staffordshire Terrier" , GlobalVariable.G_locatorvalue  )
								break ;

							default:
								System.out.println ("nothing in function column :")
								break;
						}
						break;


					case("Run"):
						GlobalVariable.G_Run = sheetData.get(ii).get(jj).getStringCellValue()
						break;
					case("Otherimportuser"):
						break;

					default :
						System.out.println ( " here at the last ")
						break;
				}


			}
		}
	}





	//----------------web data --------------

	public static Select_case_checkbox( WebDriver driver,String caseID,String count){

		System.out.println(" In the function dumbo " + count + "caseid : "  + caseID )

		switch(count){
			case("one"):
				System.out.println("in case 1")

				String one_path ="//a[contains( text(),"+ caseID +")]//parent::div//parent::td//preceding-sibling::td"
				System.out.println(" In the function dumbo1 "  + one_path )


			//System.out.println
				driver.findElement(By.xpath(one_path)).click()  //driver.findElement(By.xpath('//a[contains( text(),caseID)]//parent::div//parent::td//preceding-sibling::td'))
				break;
			case ("all"):
				System.out.println(" In the function dumbo ALL")
				driver.findElement(By.xpath("//div[text()=\"Case ID\"]//parent::span//parent::th//preceding-sibling::th")).click()
				break;
			////div[text()="Case ID"]//parent::span//parent::th//preceding-sibling::th
		}
	}


	@Keyword
	public static  ReadCasesTable(WebDriver driver) throws IOException {
		List<String> webData = new ArrayList<String>();
		driver.manage().window().maximize();        // WebDriver driver = DriverFactory.getWebDriver()
		Thread.sleep(3000)

		String tbl_str= GlobalVariable.G_cannine_caseTbl 			//"//div[ contains(text(),'Case')]//parent::span//parent::th//parent::tr//parent::thead//parent::table"
		String hdr_str= GlobalVariable.G_cannine_caseHdr			//"//div[contains(text(),'Case')]//parent::span//parent::th//parent::tr//parent::thead"
		String nxt_str=	GlobalVariable.G_cannine_NxtBtn			    //"//span[contains(text(),'Row')]//parent::div//button[@tabindex='0']"
		String tbl_bdy=	GlobalVariable.G_cannine_caseTblBdy								//"//div[contains(text(),'Case')]//parent::span//parent::th//parent::tr//parent::thead//following-sibling::tbody"

		WebElement Table =driver.findElement(By.xpath(tbl_str))
		List<WebElement> rows_table = Table.findElements(By.xpath("//*[contains(@id, \"MUIDataTableBodyRow-\")]"))
		int rows_count = rows_table.size()
		System.out.println("This is the size of the rows in the table in first page:"+(rows_count))
		WebElement nextButton = driver.findElement(By.xpath(nxt_str));

		WebElement tableHdr = driver.findElement(By.xpath(hdr_str))
		List<WebElement> colHeader = tableHdr.findElements(By.tagName("th"));
		int columns_count = (colHeader.size())-1
		System.out.println("No.of cols is : "+columns_count)

		String hdrdata = ""
		for(int c=1;c<=columns_count;c++){
			hdrdata = hdrdata + ((colHeader.get(c).getText()) + "||");
		}
		webData.add(hdrdata);
		System.out.println("Size of web data list with header :" +webData.size())
		for(int index = 0; index < webData.size(); index++) {
			System.out.println("Web Data: with header data is :" + webData.get(index))
		}

		while(true)
		{
			rows_table = Table.findElements(By.xpath("//*[contains(@id, \"MUIDataTableBodyRow-\")]"))

			rows_count = rows_table.size()
			System.out.println("This is the size of the rows in the table in the current page:"+(rows_count))

			for(int i = 1; i <= rows_count; i++) {
				String data = ""
				for (int j = 1; j < columns_count+10; j = j + 2) {

					data = data + (driver.findElement(By.xpath(tbl_bdy +"/tr" + "[" + i + "]/*[" + j + "]"))
							.getText() + "||")
				}


				webData.add(data)
				//ReadExcel.getElementID ( Table , 'COTC007B0101' ,driver )
			}
			System.out.println("Size of Web Data list with header in current page is : " + webData.size())
			for(int index = 0; index < webData.size(); index++) {
				System.out.println("Web Data: from current page is" + webData.get(index))
			}


			if (!nextButton.isEnabled()) break;
			nextButton.click()
		}
		//nextButton.click()
		GlobalVariable.G_CaseData= webData;
	}

	
	
	public static verify_text( WebDriver driver ,String to_comp , String locator_id){



		String actualString =driver.findElement(By.xpath(locator_id)).getText();

		String expectedString = to_comp;

		;



		if (assertTrue(actualString.contains(expectedString)) ) {
			System.out.println " passed the assertion ";
		}
		else {
			System.out.println( "failed asserted stringcompare ")

		}





	}



	//	@Keyword

	public static browserDriver(String browserName) {
		switch(browserName)
		{
			case("Chrome"):
				System.out.println ("Setting browser driver as Chromedriver")
				Path driverPath = Paths.get(System.getProperty("user.dir"), "chromedriver.exe");
				System.out.println("This is the full filepath of chrome driver after converting to string :"+driverPath.toString());
				System.setProperty('webdriver.chrome.driver', driverPath.toString())
				WebDriver driver = new ChromeDriver()  //resolve this issue
				break;

			case("Firefox"):
				System.out.println ("Setting browser driver as Gecko driver (Firefox)")
				Path driverPath = Paths.get(System.getProperty("user.dir"), "geckodriver.exe");
				System.out.println("This is the full filepath of geckodriver (for firefox) after converting to string :"+driverPath.toString());
				System.setProperty('webdriver.gecko.driver', driverPath.toString())
				WebDriver driver = new FirefoxDriver()  //resolve this issue
				break;

			default:
				System.out.println ("Nothing in Browser column")
				break;
		}




	}
}
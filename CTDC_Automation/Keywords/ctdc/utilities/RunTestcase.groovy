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
import java.util.Date;
import java.util.Formatter;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;


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
import java.text.DateFormat;
import java.text.SimpleDateFormat;

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
//import static org.junit.Assert.*;
import internal.GlobalVariable
import ctdc.utilities.ReadExcel   //to use various functions from the class: ExcelToArray



public class RunTestcase implements Comparator<List<XSSFCell>>
{

	public int compare( List<String> l1, List<String> l2 ){
		return l1.get(0).getStringValue() .compareTo( l2.get(0).getStringValue() )
	}

	// implements Comparator<List<XSSFCell>>{
	//	public int compare( List<XSSFCell> l1, List<XSSFCell> l2 ){
	//	return l1.get(0).getStringCellValue() .compareTo( l2.get(0).getStringCellValue() )
	//}

	public static WebDriver driver = new ChromeDriver()

	@Keyword
	public  void Run( String InputExcelname) {

		Path filepath = Paths.get(System.getProperty("user.dir"), "TestData", InputExcelname); // give the Input Excel Name in manual mode in TC
		System.out.println("This is the full filepath after converting to string :"+filepath.toString());


		GlobalVariable.G_InputExcelFileName=filepath.toString()
		List<List<XSSFCell>> sheetData = new ArrayList<>();
		FileInputStream fis = new FileInputStream(filepath.toString());
		XSSFWorkbook workbook = new XSSFWorkbook(fis); // Create an excel workbook from the file system.
		int numberOfSheets = workbook.getNumberOfSheets();  	// Get the  sheets on the workbook
		//for (int s = 0 ; s< numberOfSheets; s++){
		int countrow = 0
		int countcol= 0

		//Workbook workbook1 = (Workbook) workbook;
		//System.out.println( numberOfSheets)
		XSSFSheet sheet = workbook.getSheetAt(1);  // Very important that we read the sheet 1 as its test case sheet
		countrow = sheet.lastRowNum- sheet.firstRowNum;
		System.out.println ( "Row count is  : " + countrow);
		countcol = sheet.getRow(0).getLastCellNum();
		System.out.println("Col count is : " + countcol);

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


	private static void excelparsing(List<List<XSSFCell>> sheetData, WebDriver driver) {//this is initializing second sheet - test case
		int countrow = 0   // Iterates the data and print it out to the console.
		countrow = sheetData.size();
		System.out.println ( " sheetdata size countrow " + countrow )   //delete
		System.out.println ( "sheet  data size :" + sheetData.get(0).size())  //delete

		for (int ii = 1; ii < countrow; ii++){
			List<XSSFCell> datarow = sheetData.get(ii);

			for (int jj = 0; jj < datarow.size(); jj++){

				XSSFCell cell = datarow.get(jj);

				System.out.println ("Before Switch value  : " + sheetData.get(0).get(jj).getStringCellValue().trim()  )
				System.out.println ( "Value in column :" + sheetData.get(ii).get(jj).getStringCellValue())
				switch(sheetData.get(0).get(jj).getStringCellValue().trim() )
				{
					case("Browser"):
					//				System.out.println ("Inside Browser Switch Case")
					//browser switch case is a separate function. refer and correct this chunk

					case("propertyName"):
						GlobalVariable.G_propertyName = sheetData.get(ii).get(jj).getStringCellValue()
						break;
					case("propertyvalue"):
						GlobalVariable.G_propertyvalue = sheetData.get(ii).get(jj).getStringCellValue()
						System.out.println ( " THE propertyvalue BEING saved :  "  +  GlobalVariable.G_propertyvalue )
						break;
					case("locateby"):
						GlobalVariable.G_locateby = sheetData.get(ii).get(jj).getStringCellValue()
						break;
					case("locatorvalue"):
						GlobalVariable.G_locatorvalue = sheetData.get(ii).get(jj).getStringCellValue()
						break;
					case("action"):
						GlobalVariable.G_Action = sheetData.get(ii).get(jj).getStringCellValue()
						break;
					case("Query"):
						GlobalVariable.G_Query = sheetData.get(ii).get(jj).getStringCellValue()
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
						System.out.println ( "  the value to be uses in the function call  : " + sheetData.get(ii).get(jj).getStringCellValue().trim() )
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
								break;
							case("webdata"):
								List<String> WData = new ArrayList<String>();
							//GlobalVariable.G_CaseData=
								WData=ReadCasesTable(driver)
							//GlobalVariable.G_Run = sheetData.get(ii).get(jj).getStringCellValue()
								break;

							case("compare"):
								String neo4jfilename =  GlobalVariable.G_ResultPath.toString();
								List<List<String>> neo4jData = new ArrayList<>()
							//System.out.println("This is the full neo4jfilepath after converting to string :"+neo4jfilename);
								neo4jData = ReadExcel.ExcelToArray(neo4jfilename)

								CompareCode_L(GlobalVariable.G_CaseData,GlobalVariable.G_DBdata)
							//compareLists();  gayathri_uncomment this later
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
					case("Run"):   // create a code to use this Run Flag value to decide processing that rows data
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

		//gayathri added these lines

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
			hdrdata = hdrdata + ((colHeader.get(c).getText()));
			//hdrdata = hdrdata + ((colHeader.get(c).getText()) + "||");
		}
		webData.add(hdrdata);
		//		System.out.println("Size of web data list with header :" +webData.size())    gayathri uncomment 3 lines later
		//		for(int index = 0; index < webData.size(); index++) {
		//			System.out.println("Web Data: with header data is :" + webData.get(index))
		//		}
		driver.findElement(By.xpath('//*[@id="root"]/div[3]/div/div[2]/div[1]/div[2]/label/button')).click() // G added this line to close the view
		while(true)
		{
			rows_table = Table.findElements(By.xpath("//*[contains(@id, \"MUIDataTableBodyRow-\")]"))

			rows_count = rows_table.size()
			System.out.println("This is the size of the rows in the table in the current page:"+(rows_count))

			for(int i = 1; i <= rows_count; i++) {
				String data = ""
				for (int j = 1; j < columns_count+10; j = j + 2) {

					data = data + (driver.findElement(By.xpath(tbl_bdy +"/tr" + "[" + i + "]/*[" + j + "]"))
							.getText() )
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


	// fix this function to verify
	public static verify_text( WebDriver driver ,String to_comp , String locator_id){
		String actualString =driver.findElement(By.xpath(locator_id)).getText();
		String expectedString = to_comp;
		if (assertTrue(actualString.contains(expectedString)) ) {
			System.out.println " passed the assertion ";
		}
		else {
			System.out.println( "failed asserted stringcompare ")

		}
	}

	//Gayatri's - compare code

	//	public  static class CompareLib implements Comparator<List<XSSFCell>>{
	//		public int compare( List<XSSFCell> l1, List<XSSFCell> l2 ){
	//			return l1.get(0).getStringCellValue() .compareTo( l2.get(0).getStringCellValue() )
	//		}
	//setup
	//teardown
	//dbconnection


	//check if null**********************************************************

	// verify element present



	//compare lists***********************************************************
	public static void compareTwoLists( List<List<String>> l1, List<List<String>> l2 ){
		System.out.println ("Comparing two Lists");

		for( int l2row = 0; l2row < l2.size(); l2row++ ){
			List<String> l2rowList = l2.get(l2row)
			//System.out.println(" L2Row contents: " + l2rowList )

			for( int l1row = 0; l1row < l1.size(); l1row++ ){
				List<String> l1rowList = l1.get(l1row)
				//System.out.println(" L1Row contents: " + l1rowList )
				if( l2rowList.get(0) == l1rowList.get(0) ) //takes CTDCID as the primary key for comparison
				{
					System.out.println(" L1Row contents Matched with: " + l1rowList + " and: " + l2rowList )
					for(int col = 0; col < l2rowList.size(); col++ ){ //compares all the columns in the excels - for each row
						if( l1rowList.get(col) == l2rowList.get(col)){
							System.out.println("Content matches for col: " + col )
						}
						else{
							System.out.println("Content does not match for col: " + col )
							System.out.println( "L1Row Value: " + l1rowList.get(col) )
							System.out.println( "L2Row Value: " + l2rowList.get(col) )
						}
					}

				}else{
					// add what the code should display if contents mismatch outside the main loop for CTDC ID
				}
			}

		}
	}

	@Keyword
	public static void compareLists() {
		List<List<String>> UIData = new ArrayList<>()
		List<List<String>> neo4jData = new ArrayList<>()
		//			//read ui results table data and store in 2d array
		//			Path UIfilepath = Paths.get(System.getProperty("user.dir"), "TestData", "readUIResultsData.xlsx");
		//			String UIfilename = UIfilepath.toString()
		//			System.out.println("This is the full uifilepath after converting to string :"+UIfilename);
		//UIData = ReadExcel.Test(UIfilename)  //change the function name Test in parent class and here

		UIData = GlobalVariable.G_CaseData

		//System.out.println ("Before sorting: This is the contents of UIdata : "+ UIData);
		System.out.println ("This is the row size of the UIdata : "+ UIData.size());

		//Collections.sort( UIData , new RunTestcase() )  //class SortByFirstColumn() -- WILL REVISIT



		//System.out.println ("After Sorting: This is the contents of UIdata : "+ UIData);


		//read neo4j data here & store in 2d array
		//			Path neo4jfilepath = Paths.get( GlobalVariable.G_ResultPath;
		//			String neo4jfilename = neo4jfilepath.toString()


		String neo4jfilename =  GlobalVariable.G_ResultPath.toString() ;
		//String neo4jfilename = neo4jfilepath.toString()
		System.out.println("This is the full neo4jfilepath after converting to string :"+neo4jfilename);

		//readInputExcel rdExl = new readInputExcel() //only if the parent method is not declared static, creating object for readInputExcel class to access its 'Test' method to read xl
		//neo4jData = ReadExcel.Test(neo4jfilename)
		neo4jData = ReadExcel.ExcelToArray(neo4jfilename)
		/*gayathri commented - remove comment later*/neo4jData = GlobalVariable.G_DBdata
		//*Gayathri added - delete this one*/GlobalVariable.G_DBdata = neo4jData
		//System.out.println ("Before Sorting: This is the contents of ne04jdata : "+neo4jData);
		System.out.println ("This is the row size of the ne04jdata : "+neo4jData.size());   //gayathri changed to GlobalVariable.G_DBdata.size()  from neo4jData.size()
		//Collections.sort( neo4jData , new RunTestcase() )
		//System.out.println ("After Sorting: This is the contents of Neo4JData : "+ neo4jData );
		compareTwoLists( UIData, GlobalVariable.G_DBdata )

	}

	//************************************************************************
	@Keyword
	public static void CompareCode_L(List<List<String>> readWebData,List<List<String>> readExcel) {
		//			ReadWebData readWebData = new ReadWebData();
		//			ReadExcel readExcel = new ReadExcel();
		//			List<String> webData = readWebData.readWebData();
		//			List<String> excelData = readExcel.readExcel();
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String filename = "All_cases_results_"+timeStamp+".txt";
		File file;
		file = new File(filename);
		System.out.println("Web Data size: " + readWebData.size());  //it worked
		System.out.println("Excel Data size: " + readExcel.size());
		for (int i = 0; i<readWebData.size(); i++) {
			//if ((readWebData.get(i).trim()) == (readExcel.get(i).trim()) ) {  //with trim
			if ( (readWebData.get(i)) == (readExcel.get(i)) ) {
				//System.out.println("PASSED: " + webData.get(i));
				writeResults (file, "PASSED: " + readWebData.get(i)+ "\n");
			}
			else{
				//System.out.println("FAILED: " + "WEB: " + webData.get(i) + " EXCEL: " + excelData.get(i)+ "\n");
				writeResults(file, "FAILED: " + "WEB: " + readWebData.get(i) + " EXCEL: " + readExcel.get(i)+ "\n");
			}
		}
	}


	public static void writeResults(File f, String st){

		//DateFormat df = new SimpleDateFormat("yyyy-MM-dd_hh:mm:ss");
		//df.setTimeZone(TimeZone.getTimeZone("EST"));
		//String filename = df.format(new Date());
		OutputStream os = null;
		try {
			// below true flag tells OutputStream to append
			os = new FileOutputStream(f, true);
			os.write(st.getBytes(), 0, st.length());
			System.out.println("ADDED TO FILE");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}






	//***********************************************











	//} //class ends here

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
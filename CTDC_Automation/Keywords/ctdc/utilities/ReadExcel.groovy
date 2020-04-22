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

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ctdc.utilities.ConnectDB

public class ReadExcel {
	//
	//public static WebDriver driver = new ChromeDriver()

	///COMMITING APRIL21 EVENING -laxmi
	@Keyword
	public static List<List<XSSFCell>> Test(String filename) { //added String filename
		//Path filepath = Paths.get(System.getProperty("user.dir"), "TestData", "Input_TestData_G.xlsx");
		//		Path filepath = Paths.get(System.getProperty("user.dir"), "TestData", "readUIResultsData.xlsx");
		//		System.out.println("This is the full filepath after converting to string :"+filepath.toString());

		List<List<XSSFCell>> sheetData = new ArrayList<>();  // Create a 2dimensional ArrayList to store the data read from excel sheet
		FileInputStream fis = new FileInputStream(filename);  //removed filepath.toString()
		XSSFWorkbook workbook = new XSSFWorkbook(fis); // Create an excel workbook from the file system.
		XSSFSheet sheet = workbook.getSheetAt(0);  // Get the first sheet on the workbook from read results data from UI / Neo4j data
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
		System.out.println(sheetData)
		System.out.println("This is the size of the data from ui results: "+sheetData.size())
		//showExcelData1(sheetData);
		return sheetData
	}

	private static void showExcelData1(List<List<XSSFCell>> sheetData) {
		// Iterates the data and print it out to the console.
		for (List<XSSFCell> data : sheetData) {
			String str = "";
			if(data.get(0).stringCellValue.equals("CTDC-43123")){
				for (XSSFCell cell : data) {

					str =str+ cell.getStringCellValue() + "||"
				}
				System.out.println(str);

			}
		}
	}

	@Keyword
	public static void Neo4j() {
		System.out.println ( " Connection data for Neo4J is  :  " +  GlobalVariable.G_Query +   GlobalVariable.G_UserId +   GlobalVariable.G_Password +  GlobalVariable.G_ResultPath + GlobalVariable.G_server )
		String query =GlobalVariable.G_Query
		String userName= GlobalVariable.G_UserId
		String pwd= GlobalVariable.G_Password
		String output= GlobalVariable.G_ResultPath
		String neo4jServer = GlobalVariable.G_server

		//String query ="MATCH (t:clinical_trial)<--(a:arm)<--(:assignment_report)-[*]->(c:case) WITH DISTINCT c AS c, t ,a  OPTIONAL MATCH (c)<-[*]-(f:file)  Return c.case_id  As case_id,t.clinical_trial_designation as clinical_trial_code,a.arm_id As arm_id, a.arm_drug As arm_drug, a.pubmed_id As pubmed_id, c.disease As disease, c.gender As gender, c.race As race, c.ethnicity As ethnicity, t.clinical_trial_id As clinical_trial_id, a.arm_id+'_'+ a.arm_drug As trial_arm, COLLECT(DISTINCT(f.file_type)) AS file_types, COLLECT(DISTINCT(f.file_format)) AS file_formats, COLLECT(DISTINCT(f)) AS files"
		//String query ="MATCH (t:clinical_trial)<--(a:arm)<--(:assignment_report)-[*]->(c:case) WITH DISTINCT c AS c, t ,a Return distinct c.case_id As `Case ID`,t.clinical_trial_designation as `Trial Code`,a.arm_id As Arm, a.arm_drug As `Arm Treatment`, c.disease As Diagnosis, c.gender As Gender, c.race As Race, c.ethnicity As Ethnicity"
		//String userName ="neo4j"
		//String pwd= "icdcDBneo4j0"
		//String output= "C:\\Users\\radhakrishnang2\\Desktop\\DataCommons_Automation\\CTDC_Automation\\TestData\\DatafromNeo4j.xlsx"
		//String neo4jServer = "bolt://ncidb-q325-c.nci.nih.gov"
		ConnectDB Test1 = new ConnectDB()
		Test1.run(neo4jServer,userName,pwd, query,output)
	}

	@Keyword
	public  void RunTestcase(String name) {
		Path filepath = Paths.get(System.getProperty("user.dir"), "TestData", "Input_TestData_laxmi.xlsx");
		FileInputStream fis = new FileInputStream(filepath.toString());
		XSSFWorkbook workbook = new XSSFWorkbook(fis); // Create an excel workbook from the file system.
		ArrayList<String> xlContents = new ArrayList<String>();
		int numberOfSheets = workbook.getNumberOfSheets();
		Workbook workbook1 = (Workbook) workbook;

		for (int i = 0; i < numberOfSheets; i++) {
			XSSFSheet aSheet = workbook.getSheetAt(i);
			System.out.println(aSheet.getSheetName());  // prints all the sheet names
			int numOfRows = aSheet.getLastRowNum() - aSheet.getFirstRowNum();
			System.out.println("Number of rows in Sheet: " + aSheet.getSheetName() + " = " + numOfRows );
			Iterator<Row> rows = aSheet.iterator();
			Row currRow = rows.next();
			while( rows.hasNext() ){
				Iterator<Cell> ce = currRow.cellIterator();
				while( ce.hasNext() ){
					Cell value = ce.next();

					//--------------------------
					System.out.println( "Before  case value " : value )
					//data.get(0).stringCellValue.equals("CTDC-43123")
					switch( value )
					{

						case("Browser"):
							System.out.println( "inside case")
						//Do Test here
						//System.out.println (  "Browser in excel is : " +ce.get(1).stringCellValue )
							break;
						case("server"):
							break;
						//Do Test here
						case("user_Id"):
						//Do Test here
						case("Password"):
						//Do Test here
						case("location_path"):
						//Do Test here
						case("Page"):
						//Do Test here
						case("ObjectType"):
						//Do Test here
						case("propertyName"):
						//Do Test here
						case("propertyvalue"):
						//Do Test here
						case("action"):
						//Do Test here
						case("Query"):
						//Do Test here
						case("Function"):
						//Do Test here
						case("Run"):
						//Do Test here

						case("Otherimportantuser"):
						//Do Test here
							break;
					}



					//----------------------


					System.out.println("Cell value is: " + value);
					xlContents.add(value);
				}
				currRow = rows.next();
			}

		}
		System.out.println("This is the value of the arraylist named xlContents: " + xlContents);
		System.out.println("This is the element at index 0:"+ xlContents.get(0));
	}

	@Keyword
	public static  void initialLoad() {    // this reads sheet 0, predecessor for connecting to DB

		//Path driverPath = Paths.get(System.getProperty("user.dir"), "chromedriver.exe");
		//System.out.println("This is the full filepath of browser driver after converting to string :"+driverPath.toString());
		//System.setProperty('webdriver.chrome.driver', driverPath.toString())
		//System.setProperty("webdriver.chrome.driver", GlobalVariable.G_BrowserDriverPath);  //path of browser driver is in global variable under profiles
		//GlobalVariable.G_Driver = new ChromeDriver()
		//WebDriver driver = new ChromeDriver()


		//Path filepath = Paths.get(System.getProperty("user.dir"), "TestData", "Input_TestData_G.xlsx");
		//GlobalVariable.G_InputExcelFileName=filepath.toString()
		//String filename = (GlobalVariable.G_InputExcelFileName)
		//System.out.println("This is the full filepath after converting to string (from Global) :"+GlobalVariable.G_InputExcelFileName);


		List<List<XSSFCell>> sheetData = new ArrayList<>();  // Create an ArrayList to store the data read from excel sheet
		FileInputStream fis = new FileInputStream(GlobalVariable.G_InputExcelFileName);  //give GlobalVariable.G_InputExcelFileName
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int numberOfSheets = workbook.getNumberOfSheets(); 	// Get the  sheets on the workbook.
		System.out.println("Total number of sheets in the excel: "+numberOfSheets)
		System.out.println("This is the name of the sheet to be read for DB connection: "+ workbook.getSheetName(0) )
		int countrow, countcol;   //for (int s = 0 ; s< numberOfSheets; s++){
		XSSFSheet sheet = workbook.getSheetAt(0);  // Reading sheet 0 to store Neo4j DB details and path for storing data in excel from DB.

		countrow = sheet.lastRowNum - sheet.firstRowNum;
		System.out.println ( "row count is  : " + countrow); //delete
		countcol = sheet.getRow(0).getLastCellNum();
		System.out.println("Col count : " + countcol); //delete
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
			//workbook.close();
		}
		System.out.println(   " Before Initialing Global Variables " + workbook.getSheetName(0) )
		Initialising(sheetData);  // calling function to initialise global variables before performing DB connection
	}


	private static void Initialising(List<List<XSSFCell>> sheetData) {  //this is DB initializing
		// Iterates the data and print it out to the console.
		int countrow = 0
		countrow = sheetData.size();
		System.out.println ( "row count from initializing fnc " + countrow ) //delete
		System.out.println ( "sheet  data size :" + sheetData.get(0).size())  //delete

		for (int i = 1; i < countrow; i++){
			List<XSSFCell> datarow = sheetData.get(i);
			System.out.println (" Columns Size from initializing fnc  " : + datarow.size())
			String str = "";  //delete ?
			for (int j = 0; j < datarow.size(); j++){
				System.out.println ("value of  i :"  + i + "  Value of j  : " + j )
				XSSFCell cell = datarow.get(j);

				//System.out.println ( "Header Before switch  :" + sheetData.get(0).get(j).getStringCellValue())
				//System.out.println( "Data in variable : "  + sheetData.get(i).get(j).getStringCellValue())
				//--------------------
				switch(sheetData.get(0).get(j).getStringCellValue().trim() ) //First ROW
				{
					case("Browser"): //browser switch case is a separate function. refer and correct this chunk
						GlobalVariable.G_Browser = sheetData.get(i).get(j).getStringCellValue()
						System.out.println ("This is the value of Browser from Global : " +GlobalVariable.G_Browser)
						break;
					case("server"):
						GlobalVariable.G_server = sheetData.get(i).get(j).getStringCellValue()
						System.out.println("This is the value of server from Global :"+GlobalVariable.G_server)
						break;
					case("user_Id"):
						GlobalVariable.G_UserId = sheetData.get(i).get(j).getStringCellValue()
						System.out.println("This is the value of DB Username from Global :"+GlobalVariable.G_UserId)
						break;
					case("Password"):
						GlobalVariable.G_Password = sheetData.get(i).get(j).getStringCellValue()
						System.out.println("This is the value of DB password from Global :"+GlobalVariable.G_Password)
						break;
					case("location_path"):
						GlobalVariable.G_ResultPath = sheetData.get(i).get(j).getStringCellValue()
						System.out.println("This is the value of excel path to store DB data from Global :"+GlobalVariable.G_ResultPath)
						break;
					case("Environment"):
						GlobalVariable.G_Environment = sheetData.get(i).get(j).getStringCellValue()
						System.out.println("This is the value of Environment from Global :"+GlobalVariable.G_Environment)
						break;
					case("url"):
						GlobalVariable.G_Urlname = sheetData.get(i).get(j).getStringCellValue()
						System.out.println("This is the value of Url from Global :"+GlobalVariable.G_Urlname)
						break;
					case("query"):
						GlobalVariable.G_Query = sheetData.get(i).get(j).getStringCellValue()
						System.out.println("This is the value of Url from Global :"+GlobalVariable.G_Query)
						break;
					default :
						System.out.println("Error in initializing")
						break;
				}
				str =str+ cell.getStringCellValue() + "||"
			}
		}
	}


	@Keyword
	public static void PrintG() {
		//System.out.println ("Action :" + GlobalVariable.G_Action)
		System.out.println ("*******************PRINTING ENVIRONMENTAL VARIALBES*********************************")

		System.out.println ("Environment :" + GlobalVariable.G_Environment)
		System.out.println ( "Browser : " + GlobalVariable.G_Browser)
		System.out.println ("Server :" + GlobalVariable.G_server)
		System.out.println ("UserID :" + GlobalVariable.G_UserId)
		System.out.println (" location_path  :" + GlobalVariable.G_ResultPath)
		System.out.println (" Page :  " + GlobalVariable.G_Page)
		System.out.println (" Password : " + GlobalVariable.G_Password)
		//System.out.println (" Property Name :" + GlobalVariable.G_propertyName)
		//System.out.println ("Property Value :" + GlobalVariable.G_propertyvalue)
		//System.out.println ("URLNAME  : " + GlobalVariable.G_Urlname)
		//System.out.println (" Query  : " +  GlobalVariable.G_Query)
		//System.out.println	GlobalVariable.G_Action
		//System.out.println	GlobalVariable.
		System.out.println ("******************END PRINGING**********************************")
	}

	@Keyword
	public static getElementID(WebElement Tab1 , String caseid , WebDriver driver ){
		WebElement Tab
		Tab = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[4]/div[2]/div/div[2]/table"))

		// = "//*[@id=\"root\"]/div[3]/div/div[4]/div[2]/div/div[2]/table"

		System.out.println (" Getting ID  of " + caseid)
		//Path driverPath = Paths.get(System.getProperty("user.dir"), "chromedriver.exe");
		//System.out.println("This is the full filepath of browser driver after converting to string :"+driverPath.toString());
		//''System.setProperty('webdriver.chrome.driver', driverPath.toString())
		//WebDriver driver = new ChromeDriver()

		//driver.get("https://caninecommons.cancer.gov/#/cases")
		//driver.manage().window().maximize();
		//WebElement Table = driver.findElement(By.id("table_cases"))
		//WebElement Table = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[4]/div[2]/div/div[2]/table"))
		//String CTDCid ="CTDC-43062"
		//*[@id="MUIDataTableSelectCell-4"]   // go one level up from ctdc id and get this value  (or) use the same Id and use type = checkbox
		//spy and add for select all
		//*[@id="MUIDataTableBodyRow-4"]/td[3]/div/a    get attribute by id & trim the td tr etc and click on the checkbox

		if (Tab.findElement(By.linkText(caseid))!=null){
			System.out.println (" passed level 1")

			String job = caseid;
			//WebElement table = driver.findElement(By.xpath(".//tr[contains(@MUIDataTableBodyRow,'"+job+"')]"));
			String  rows_table= Tab.findElement(By.xpath("//*[contains(@id, \"MUIDataTableBodyRow-\" '" + caseid +"'" ))
			//String dataRowIndex = table.getAttribute("data-testid");
			System.out.println(rows_table);


			//WebElement c = Tab.findElement(By.linkText(caseid));
			//System.out.println (" passed level 2" + c.getAttribute("rowIndex"))
			//WebElement parentCasebyID = Tab.findElement(c)  //parent::tr
			//System.out.println (" passed level 3")
			//String rownum = Tab.findElement(By.linkText(caseid)).getAttribute("rowIndex");

			//System.out.println("Found element with given case id"  + parentCasebyID )
			//System.out.println("Id of the given case id is:- "+ rownum);
		}else{
			System.out.println("Element with given case id not found in this page")
		}
	}


	@Keyword
	public static  ExcelToArray( String filename) {
		// public static void main(String[] args) {
		// An excel file name. You can create a file name with a full
		// path information.
		// String filename = Fame.toString();
		// Create an ArrayList to store the data read from excel sheet.
		List<List<XSSFCell>> sheetData = new ArrayList<>();
		FileInputStream fis = new FileInputStream(filename)
		// Create an excel workbook from the file system.
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// Get the first sheet on the workbook.
		XSSFSheet sheet = workbook.getSheetAt(0);
		// When we have a sheet object in hand we can iterator on
		// each sheet's rows and on each row's cells. We store the
		// data read on an ArrayList so that we can printed the
		// content of the excel to the console.
		Iterator rows = sheet.rowIterator();
		System.out.println("This is the row count from ExcelToArrayfunction : "+rows)
		while (rows.hasNext()) {
			XSSFRow row = (XSSFRow) rows.next();
			Iterator cells = row.cellIterator();
			List<XSSFCell> data = new ArrayList<>();
			while (cells.hasNext()) {
				XSSFCell cell = (XSSFCell) cells.next();
				data.add(cell.toString());
			}
			sheetData.add(data);
			System.out.println data //prints row level
			System.out.println("This is a break after row level----*********")
		}
		System.out.println("I am starting to print the whole sheet data ---****************************")
		System.out.println sheetData   //prints the whole sheetdata arraylist
		System.out.println("End printing whole sheet data ---****************************")
		GlobalVariable.G_DBdata=sheetData
	}




}












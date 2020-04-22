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
import ctdc.utilities.RunTestcase //

public class sandbox_g implements Comparator<List<XSSFCell>>{
			public int compare( List<XSSFCell> l1, List<XSSFCell> l2 ){
			return l1.get(0).getStringCellValue() .compareTo( l2.get(0).getStringCellValue() )
		}

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

	/*	public class CompareData {
	 public static void main(String[] args) {
	 ReadWebData readWebData = new ReadWebData();
	 ReadExcel readExcel = new ReadExcel();
	 List<String> webData = readWebData.readWebData();
	 List<String> excelData = readExcel.readExcel();
	 String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	 String filename = "All_cases_results_"+timeStamp+".txt";
	 File file;
	 file = new File(filename);
	 System.out.println("Web Data size: " + webData.size());
	 System.out.println("Excel Data size: " + excelData.size());
	 for (int i = 0; i < webData.size(); i++) {
	 if (webData.get(i).trim().equals(excelData.get(i).trim())) {
	 //System.out.println("PASSED: " + webData.get(i));
	 writeResults (file, "PASSED: " + webData.get(i)+ "\n");
	 } else {
	 //System.out.println("FAILED: " + "WEB: " + webData.get(i) + " EXCEL: " + excelData.get(i)+ "\n");
	 writeResults(file, "FAILED: " + "WEB: " + webData.get(i) + " EXCEL: " + excelData.get(i)+ "\n");
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
	 }
	 */
//**********************************************************
	
//compare lists***********************************************************
	public static void compareTwoLists( List<List<XSSFCell>> l1, List<List<XSSFCell>> l2 ){
		System.out.println ("Comparing two Lists");
		for( int l2row = 0; l2row < l2.size(); l2row++ ){
			List<XSSFCell> l2rowList = l2.get(l2row)
			//System.out.println(" L2Row contents: " + l2rowList )

			for( int l1row = 0; l1row < l1.size(); l1row++ ){
				List<XSSFCell> l1rowList = l1.get(l1row)
				//System.out.println(" L1Row contents: " + l1rowList )
				if( l2rowList.get(0).getStringCellValue() == l1rowList.get(0).getStringCellValue() ) //takes CTDCID as the primary key for comparison
				{
					System.out.println(" L1Row contents Matched with: " + l1rowList + " and: " + l2rowList )
					for(int col = 0; col < l2rowList.size(); col++ ){ //compares all the columns in the excels - for each row
						if( l1rowList.get(col).getStringCellValue() == l2rowList.get(col).getStringCellValue() ){
							System.out.println("Content matches for col: " + col )
						}
						else{
							System.out.println("Content does not match for col: " + col )
							System.out.println( "L1Row Value: " + l1rowList.get(col).getStringCellValue() )
							System.out.println( "L2Row Value: " + l2rowList.get(col).getStringCellValue() )
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
		List<List<XSSFCell>> UIData = new ArrayList<>()
		List<List<XSSFCell>> neo4jData = new ArrayList<>()
			//read ui results table data and store in 2d array
		Path UIfilepath = Paths.get(System.getProperty("user.dir"), "TestData", "CanineDataWebData_1.xlsx");
		String UIfilename = UIfilepath.toString()
		System.out.println("This is the full uifilepath after converting to string :"+UIfilename);
		UIData = ReadExcel.Test(UIfilename)  //change the function name Test in parent class and here
		System.out.println ("This is the row size of the UIdata : "+ UIData.size());
		Collections.sort( UIData , new sandbox_g() )  //class SortByFirstColumn() -- WILL REVISIT
		
		//System.out.println ("Before sorting: This is the contents of UIdata : "+ UIData);
		//System.out.println ("After Sorting: This is the contents of UIdata : "+ UIData);
		
		Path neo4jfilepath =  Paths.get(System.getProperty("user.dir"), "TestData", "CanineDatafromNeo4j_1.xlsx");
		String neo4jFilename = neo4jfilepath.toString()
		System.out.println("This is the full neo4jfilename and path after converting to string :"+neo4jFilename);
		neo4jData = ReadExcel.Test(neo4jFilename)
		System.out.println ("This is the row size of the ne04jdata : "+neo4jData.size());   //gayathri changed to GlobalVariable.G_DBdata.size()  from neo4jData.size()
		Collections.sort( neo4jData , new sandbox_g() )
		//readInputExcel rdExl = new readInputExcel() //only if the parent method is not declared static, creating object for readInputExcel class to access its 'Test' method to read xl
		//System.out.println ("Before Sorting: This is the contents of ne04jdata : "+neo4jData);
		//System.out.println ("After Sorting: This is the contents of Neo4JData : "+ neo4jData );
		
		compareTwoLists(UIData,neo4jData)
	}


//***********************************************
}
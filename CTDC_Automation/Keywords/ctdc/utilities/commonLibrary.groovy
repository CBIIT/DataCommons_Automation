//package ctdc.utilities
//import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
//
//import com.kms.katalon.core.annotation.Keyword
//import com.kms.katalon.core.checkpoint.Checkpoint
//import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
//import com.kms.katalon.core.model.FailureHandling
//import com.kms.katalon.core.testcase.TestCase
//import com.kms.katalon.core.testdata.TestData
//import com.kms.katalon.core.testobject.TestObject
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.Formatter;
//import java.util.List;
//import java.util.TimeZone;
//import java.util.concurrent.TimeUnit;
//import java.io.*;
//import java.util.*
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import internal.GlobalVariable
//import java.lang.String as String
//
//import org.openqa.selenium.WebElement as WebElement
//import org.openqa.selenium.By as By
//import org.openqa.selenium.WebDriver as WebDriver
//import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
//import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
//import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
//import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
//
//import groovy.transform.Field as Field
//import internal.GlobalVariable
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Iterator;
//
//import java.util.List;
//import java.nio.Buffer;
//import java.nio.ByteBuffer;
//import java.nio.file.FileSystem;
//import java.nio.file.LinkOption;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//import org.apache.poi.ss.usermodel.Cell
//import org.apache.poi.ss.usermodel.Row
//import org.apache.poi.ss.usermodel.Workbook
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//
//import ctdc.utilities.ConnectDB  //importing class
//import ctdc.utilities.ReadExcel  // importing this class to use the read excel function for list comparison
//
////class SortByFirstColumn implements Comparator<List<XSSFCell>>{
////	public int compare( List<XSSFCell> l1, List<XSSFCell> l2 ){
////		return l1.get(0).getStringCellValue() .compareTo( l2.get(0).getStringCellValue() )
////	}
////}
//
//public class commonLibrary implements Comparator<List<XSSFCell>>{
//	public int compare( List<XSSFCell> l1, List<XSSFCell> l2 ){
//		return l1.get(0).getStringCellValue() .compareTo( l2.get(0).getStringCellValue() )
//	}
//	//setup
//	//teardown
//	//dbconnection
//
//
//	//check if null**********************************************************
//
//	// verify element present
//
//
//
//	//compare lists***********************************************************
//	public void compareTwoLists( List<List<XSSFCell>> l1, List<List<XSSFCell>> l2 ){
//		System.out.println ("Comparing two Lists");
//
//		for( int l2row = 0; l2row < l2.size(); l2row++ ){
//			List<XSSFCell> l2rowList = l2.get(l2row)
//			//System.out.println(" L2Row contents: " + l2rowList )
//
//			for( int l1row = 0; l1row < l1.size(); l1row++ ){
//				List<XSSFCell> l1rowList = l1.get(l1row)
//				//System.out.println(" L1Row contents: " + l1rowList )
//				if( l2rowList.get(0).getStringCellValue() == l1rowList.get(0).getStringCellValue() ) //takes CTDCID as the primary key for comparison
//				{
//					System.out.println(" L1Row contents Matched with: " + l1rowList + " and: " + l2rowList )
//					for(int col = 0; col < l2rowList.size(); col++ ){ //compares all the columns in the excels - for each row
//						if( l1rowList.get(col).getStringCellValue() == l2rowList.get(col).getStringCellValue() ){
//							System.out.println("Content matches for col: " + col )
//						}
//						else{
//							System.out.println("Content does not match for col: " + col )
//							System.out.println( "L1Row Value: " + l1rowList.get(col).getStringCellValue() )
//							System.out.println( "L2Row Value: " + l2rowList.get(col).getStringCellValue() )
//						}
//					}
//
//				}else{
//					// add what the code should display if contents mismatch outside the main loop for CTDC ID
//				}
//			}
//
//		}
//	}
//
//	@Keyword
//	public void compareLists() {
//		List<List<XSSFCell>> UIData = new ArrayList<>()
//		List<List<XSSFCell>> neo4jData = new ArrayList<>()
//		//read ui results table data and store in 2d array
//		Path UIfilepath = Paths.get(System.getProperty("user.dir"), "TestData", "readUIResultsData.xlsx");
//		String UIfilename = UIfilepath.toString()
//		System.out.println("This is the full uifilepath after converting to string :"+UIfilename);
//		UIData = ReadExcel.Test(UIfilename)  //change the function name Test in parent class and here
//		System.out.println ("Before sorting: This is the contents of UIdata : "+ UIData);
//		System.out.println ("This is the row size of the UIdata : "+ UIData.size());
//		Collections.sort( UIData , new commonLibrary() )  //class SortByFirstColumn()
//		System.out.println ("After Sorting: This is the contents of UIdata : "+ UIData);
//
//
//		//read neo4j data here & store in 2d array
//		Path neo4jfilepath = Paths.get(System.getProperty("user.dir"), "TestData", "DatafromNeo4j.xlsx");
//		String neo4jfilename = neo4jfilepath.toString()
//		System.out.println("This is the full neo4jfilepath after converting to string :"+neo4jfilename);
//		//readInputExcel rdExl = new readInputExcel() //only if the parent method is not declared static, creating object for readInputExcel class to access its 'Test' method to read xl
//		neo4jData = ReadExcel.Test(neo4jfilename)
//		System.out.println ("Before Sorting: This is the contents of ne04jdata : "+neo4jData);
//		System.out.println ("This is the row size of the ne04jdata : "+neo4jData.size());
//		Collections.sort( neo4jData , new commonLibrary() )
//		System.out.println ("After Sorting: This is the contents of Neo4JData : "+ neo4jData );
//
//		compareTwoLists( UIData, neo4jData )
//
//	}
//
//
//
//} //class ends here
//

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

public class sandbox_g {
	///public class CompareData {
	/*
	 * @Keyword
	 public void main(String[] args) {  //public class CompareData {  //removed static
	 readUIResultsTable readWebData = new readUIResultsTable();
	 ReadExcel readExcel = new ReadExcel();
	 List<String> webData = readWebData.G_readUIResultsTable();
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
	 }  */

	def getSortedList ( pListToSort ){
		try {
			def sortedList	 =  ( pListToSort.sort { x, y -> x <=> y } )
			return sortedList
		} catch ( MalformedURLException e ) {
			assert true
			log.error " -------- OBSERVED EXCEPTION ------------------------- : in method getSortedList ( pListToSort )"
			assert e in MalformedURLException
		}
	}


	def differenceInLists ( pList1, pList2 ) {
		try {
			def commons = pList1.intersect(pList2)
			def difference = pList1.plus(pList2)
			def sizeDiff
			difference.removeAll(commons)

			if ( pList1.size > pList2.size ) {
				sizeDiff = pList1.size - pList2.size
			} else {
				sizeDiff = pList2.size - pList1.size
			}

			System.out.println("     -- DIFFERENCE BETWEEN LIST SIZES -- : " + sizeDiff)
			System.out.println("     -- DIFFERENCE BETWEEN LIST VALUES -- : " + getSortedList ( difference ))
			assert pList1.size == pList2.size, "     -- ERROR ------------------------- : Comparison of sizes of listsFAILED."
		} catch ( MalformedURLException e ) {
			assert true
			log.error "     -- EXCEPTION ------------------------- : in method differenceInLists ( pList1, pList2 )"
			assert e in MalformedURLException
		}
	}

	@Keyword
	public void compareLists() {  //public static void main () {
		ArrayList<String> firstList=new ArrayList<String>(Arrays.asList("Orange", "Apple", "Kiwi","Banana"));
		ArrayList<String> secondList=new ArrayList<String>(Arrays.asList("Banana", "Apple", "Kiwi", "Orange"));
		System.out.println("First arraylist before sorting is: "+firstList);
		//		sandbox_g cl = new sandbox_g();
		//		cl.getSortedList(firstList)
		ArrayList<String> sortedFirstList = getSortedList(firstList)
		System.out.println("First arraylist after sorting is: "+sortedFirstList);
		System.out.println("Second arraylist before sorting is: "+secondList);
		ArrayList<String> sortedSecondList = getSortedList(secondList)
		System.out.println("Second arraylist after sorting is: "+sortedSecondList);
		differenceInLists(sortedFirstList,sortedSecondList)
	}


	@Keyword
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
	}


}
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
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.util.*
import java.lang.String as String
import groovy.transform.Field as Field
import java.util.concurrent.TimeUnit;


import internal.GlobalVariable

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import internal.GlobalVariable

public class sandbox  {

	@Keyword


	public static ArrayList<String> CaseData() {
		List<String> webData = new ArrayList<String>();
		System.setProperty("webdriver.chrome.driver", GlobalVariable.G_BrowserDriverPath);  //path of browser driver is in global variable under profiles
		WebDriver driver = new ChromeDriver()
		driver.get("https://trialcommons-qa.cancer.gov/#/cases")
		driver.manage().window().maximize();		// WebDriver driver = DriverFactory.getWebDriver()
		//'To locate table'
		//int i = 0
		//*[@id="table_cases"]/div

		WebElement Table = driver.findElement(By.xpath('//*[@id=\"table_cases\"]/div'));

		List<WebElement> rows_table = Table.findElements(By.xpath("//*[contains(@id, \"MUIDataTableBodyRow-\")]"))
		int rows_count = rows_table.size()
		System.out.println("This is the size of the rows in the table in first page:"+(rows_count))
		//'hardcode'
		WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"table_cases\"]/div/table/tfoot/tr/td/div/div[3]/button[2]"));

		WebElement tableHdr = driver.findElement(By.xpath("//*[@id=\"table_cases\"]/div/div[2]/table/thead"))

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
		while(nextButton.isEnabled()){
			// String pageNm = driver.findElement(By.xpath("//*[@id=\"table_cases\"]/div[2]/div[2]/div/table/tfoot/tr/td/div/span[2]")).getText();
			// System.out.println ("This is the page number : " +pageNm)
			int i = 0
			int j = 0
			for (i = 1; i <= rows_count; i++) {
				String data = ""
				for (j = 1; j < columns_count+10; j = j + 2) {
					data = data + (driver.findElement(By.xpath("//*[@id=\"table_cases\"]/div/div[2]/table/tbody/tr" + "[" + i + "]/*[" + j + "]"))
							.getText() + "||")

					//*[@id="table_cases"]/div[2]/div[2]/div/div[2]/table/tbody
					//*[@id="MUIDataTableBodyRow-58"]
					//*[@id="MUIDataTableBodyRow-16"]/td[1]
				}
				webData.add(data)
			}


			System.out.println("Size of Web Data list in current page is : " + webData.size())
			for(int index = 0; index < webData.size(); index++) {
				System.out.println("Web Data: from current page is" + webData.get(index))
			}
			nextButton.click()
			Thread.sleep(3000)
			System.out.println("navigated to next page")


			//			if ((nextButton.isEnabled()){
			//				nextButton.click();
			//			    Thread.sleep(3000)
			//			    System.out.println("navigated to next page")
			//				boolean buttonState= true
			//			   }else{
			//			   buttonState =false
			//			   }
		}
		//
		//}while((nextButton.isEnabled());

		System.out.println(webData);
		GlobalVariable.G_CaseData=webData
		return webData;


		// Now get all the TR elements from the table
		//List<WebElement> allRows = Table.findElements(By.tagName("tr"));
		// And iterate over them, getting the cells
		//for (WebElement row : allRows) {
		//List<WebElement> cells = row.findElements(By.tagName("td"));
		//for (WebElement cell : cells) {
		//System.out.println("content >>   " + cell.getText());
		//	}
		//	}
	}

	@Keyword
	public static getall()
	{

		System.setProperty("webdriver.chrome.driver", GlobalVariable.G_BrowserDriverPath);  //path of browser driver is in global variable under profiles
		WebDriver driver = new ChromeDriver()
		driver.get("https://caninecommons.cancer.gov/#/cases")
		//driver.get("https://www.google.com/")

		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 30);	// WebDriver driver = DriverFactory.getWebDriver()
		'To locate table'
		//int i = 0
		List<WebElement> Elelment = driver.findElements(By.xpath("//*"));

		// Now get all the TR elements from the table
		//List<WebElement> allRows = Elelment.findElements(By.tagName("tr"));
		// And iterate over them, getting the cells

		System.out.println  ("the size of : " +  Elelment.size())


		for (WebElement e : Elelment) {

			System.out.println(e.getTagName() + ": " + e.getText()) ;

		}



	}



	@Keyword
	public  class ReadWebData {
		public List<String> readWebData() {
			List<String> webData = new ArrayList<String>();
			System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://caninecommons.cancer.gov/#/cases");
			driver.manage().window().maximize(); // maximize window
			driver.manage().deleteAllCookies(); // delete all the cookies
			// dynamic wait
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String tbl;
			tbl = "./html/body/div/div[3]/div[4]/div/div/div[3]/table/tbody/tr";
			int row = driver.findElements(By.xpath(tbl)).size();
			int col = driver.findElements(By.xpath("./html/body/div/div[3]/div[4]/div/div/div[3]/table/tbody/tr[1]/*"))
					.size();
			int i = 0;
			int j = 0;
			for (i = 1; i <= row; i++) {
				String data = "";
				for (j = 1; j < col + 2; j = j + 2) {
					data = data + (driver.findElement(By.xpath(
							"./html/body/div/div[3]/div[4]/div/div/div[3]/table/tbody/tr" + "[" + i + "]/*[" + j + "]"))
							.getText() + "||");
				}
				webData.add(data);
			}
			for (int index = 0; index < webData.size(); index++) {
				System.out.println("Web Data: " + webData.get(index));
			}
			return webData;
		}
	}
	@Keyword
	public static getElementID(WebElement Tab , String caseid){
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
			WebElement c = Tab.findElement(By.linkText(caseid));
			WebElement parentCasebyID = Tab.findElement(c)  //parent::tr
			String rownum = Tab.findElement(By.linkText(caseid)).getAttribute("rowIndex");

			System.out.println("Found element with given case id"  + parentCasebyID )
			System.out.println("Id of the given case id is:- "+ rownum);
		}else{
			System.out.println("Element with given case id not found in this page")
		}
	}




}

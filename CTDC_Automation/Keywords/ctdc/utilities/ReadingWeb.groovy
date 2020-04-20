package ctdc.utilities
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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
import internal.GlobalVariable
public class ReadingWeb {

	@Keyword
	public  G_readUIResultsTable() throws IOException {
		List<String> webData = new ArrayList<String>();
		Path driverPath = Paths.get(System.getProperty("user.dir"), "chromedriver.exe");
		System.out.println("This is the full filepath of browser driver after converting to string :"+driverPath.toString());
		System.setProperty('webdriver.chrome.driver', driverPath.toString())
		WebDriver driver = new ChromeDriver()
		driver.get("https://caninecommons.cancer.gov/#/cases")
		driver.manage().window().maximize();        // WebDriver driver = DriverFactory.getWebDriver()
		Thread.sleep(3000)
		WebElement Table = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[4]/div[2]/div/div[2]/table"))
		List<WebElement> rows_table = Table.findElements(By.xpath("//*[contains(@id, \"MUIDataTableBodyRow-\")]"))
		int rows_count = rows_table.size()
		System.out.println("This is the size of the rows in the table in first page:"+(rows_count))
		WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[4]/div[2]/div/table/tfoot/tr/td[2]/div/div[3]/button[2]"));

		WebElement tableHdr = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div/div[4]/div[2]/div/div[2]/table/thead"))
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
		int[] limit = getRowCountIterator(driver)
		//  while(nextButton.isEnabled()){
		while(limit[0]<=limit[1]){
			for (int i = 1; i <= rows_count; i++) {
				String data = ""
				for (int j = 1; j < columns_count+10; j = j + 2) {
					data = data + (driver.findElement(By.xpath(" //*[@id=\"root\"]/div[3]/div/div[4]/div[2]/div/div[2]/table/tbody/tr" + "[" + i + "]/*[" + j + "]"))
							.getText() + "||")
					//getElementID()
				}
				webData.add(data)
			}
			System.out.println("Size of Web Data list with header in current page is : " + webData.size())
			for(int index = 0; index < webData.size(); index++) {
				System.out.println("Web Data: from current page is" + webData.get(index))
			}
			if(limit[0]==limit[1]){
				break;   // add a loop to come out of this while loop
			}
			nextButton.click()  //11-20, 21-30, 31-40, 41-50, 51-60, 61-70
			Thread.sleep(3000)
			System.out.println("navigated to next page")
			limit = getRowCountIterator(driver)  //11-20, 21-30, 31-40, 41-50, 51-60, 61-70
			Thread.sleep(2000)
			System.out.println ("contents of the array named limit, after iteration: "+limit)
			System.out.println(webData);

		}

		GlobalVariable.G_CaseData= webData;
	}
	public int[] getRowCountIterator(WebDriver driver){ //capture all the 15 pages with 10 records per page
		WebElement pageNm = driver.findElement(By.xpath(" //*[@id=\"root\"]/div[3]/div/div[4]/div[2]/div/table/tfoot/tr/td[2]/div/span[2]"))
		String pageNumber = pageNm.getText();
		String[] indivStr = pageNumber.split("-");
		System.out.println ("The individual array of strings is :"+indivStr)   //gives 1, "10 OF 144"
		System.out.println("Second element in the array is :"+indivStr[1]) // "10 OF 144"
		String[] rowLimits = indivStr[1].split();    // gives 10, OF, 144
		System.out.println ("The individual second array of strings is :"+rowLimits)
		int leftLimit = Integer.parseInt(rowLimits[0]);   //Integer result = Integer.valueOf(number);  In summary, parseInt(String) returns a primitive int, whereas valueOf(String) returns a new Integer() object.
		int rightLimit = Integer.parseInt(rowLimits[2])
		System.out.println("Value of leftLimit and rightLimit are :"+leftLimit + " and "+ rightLimit)  //iter is the individual page's record count, totalRec is the sum of record count in all pages

		int[] rowCount = new int[2];  // Create another array of size one less
		rowCount[0] = leftLimit    //10
		rowCount[1] = rightLimit   //144
		return rowCount ;
	}
}

import org.openqa.selenium.By

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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


System.setProperty(
	"webdriver.chrome.driver",
	"C:\\Users\\gmail\\Katalon_Studio_Windows_64-8.6.0\\configuration\\resources\\drivers\\chromedriver_win32\\chromedriver.exe");


     baseUrl="https://moovijob.com";

	WebDriver driver = new ChromeDriver();
	
	//open page
	driver.get(baseUrl);
	//accept cookies
	driver.findElement(By.cssSelector("a[class^='btn agreed-btn js-cookie-consent-agree']")).click();
	
	//change language on English
	driver.findElement(By.id("language-switcher")).click();
	driver.findElement(By.linkText("English")).click();

	//found postion Automation tester
	driver.findElement(By.cssSelector("input[class='form-control']")).sendKeys("Automation tester",Keys.ENTER);
	Thread.sleep(3000);
	
	
	//looking for postiton of ARHS
	driver.findElement(By.id("job_offer"));
	driver.findElement(By.xpath(".//a[contains(@href,'arhs')]")).click();
	
	driver.quit();





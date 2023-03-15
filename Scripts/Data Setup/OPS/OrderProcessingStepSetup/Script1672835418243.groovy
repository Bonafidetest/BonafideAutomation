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
import org.openqa.selenium.Keys
import org.openqa.selenium.remote.server.handler.FindElement
import org.openqa.selenium.remote.server.handler.FindElement as Keys

import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.util.concurrent.TimeUnit as TimeUnit
import java.util.Calendar
import java.text.ParseException
/********************Click on Order Step Setup*****************/

// switching to main menu
WebUI.switchToDefaultContent()

// verifying if data setup option is present in main menu
WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/dataSetup'))

// clicking on data setup in main menu
WebUI.click(findTestObject('Object Repository/dashboard/dataSetup'))

// verifying if Order step setup option is present in data setup menu
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/OPS/OrderStepSetup'))

// click on order step setup option present in data setup menu
WebUI.click(findTestObject('Object Repository/Data Setup/OPS/OrderStepSetup'))

// waiting for order step setup page to load
WebUI.delay(5)

// switching to different iFrame
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

// verifying if order processing step type setup button is present
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/OPS/OrderProcessingStepTypeSetup'))

// clicking on order processing step type setup button is present
WebUI.click(findTestObject('Object Repository/Data Setup/OPS/OrderProcessingStepTypeSetup'))

// waiting for order processing step type setup page to load
WebUI.delay(5)

// verifying if add button is present
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/OPS/Add'))

// clicking on add button is present
WebUI.click(findTestObject('Object Repository/Data Setup/OPS/Add'))

// Getting system date & time & concatinating with OPSName
SimpleDateFormat formatter = new SimpleDateFormat('MMddyyyy')
Calendar cal = Calendar.getInstance();
cal.add(Calendar.DATE, 5);
utermdate = formatter.format(cal.getTime())
Date date = new Date()
String currentdate = formatter.format(date)
String OPSName = currentdate + "Test"

// entering OPS name
WebUI.setText(findTestObject('Object Repository/Data Setup/OPS/New'), OPSName)

// verifying if save button is present
//WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/OPS/Save'))

// clicking on save button is present
//WebUI.click(findTestObject('Object Repository/Data Setup/OPS/Save'))

// waiting for order processing step type setup page to load
//WebUI.delay(5)

//String xpath="(//td[text()='"+OPSName+"']/following-sibling::td)"

//WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]), 20)
//WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))


//findTestObject(testObjectRelativeId, variables)



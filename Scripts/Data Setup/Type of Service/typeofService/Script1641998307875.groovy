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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.util.concurrent.TimeUnit as TimeUnit
import java.util.Calendar
import java.text.ParseException

/* Click on Type of Services */
WebUI.switchToDefaultContent()
WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.click(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/Type of Service/typeofService'))
WebUI.click(findTestObject('Object Repository/Data Setup/Type of Service/typeofService'))
WebUI.delay(5)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

/*************************Add Type of Services***********************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/Type of Service/addCode'))
WebUI.setText(findTestObject('Object Repository/Data Setup/Type of Service/addCode'), code)
WebUI.setText(findTestObject('Object Repository/Data Setup/Type of Service/addCodeDescription'), description)
WebUI.click(findTestObject('Object Repository/Data Setup/Type of Service/submit'))
WebUI.waitForAlert(10)
WebUI.acceptAlert()

/*********************Search and Update Type of Services****************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/Type of Service/searchCode'))
WebUI.setText(findTestObject('Object Repository/Data Setup/Type of Service/searchCode'), code)
WebUI.setText(findTestObject('Object Repository/Data Setup/Type of Service/searchDescription'), description)
WebUI.click(findTestObject('Object Repository/Data Setup/Type of Service/searchButton'))
String xpath="(//div[text()='"+code+"']/../following::div[text()='"+description+"'])"
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]), 20)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))
WebUI.delay(2)
WebUI.switchToWindowTitle("Update Type of Service")
WebUI.delay(2)
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/Type of Service/updateDescription'), 10)
SimpleDateFormat formatter = new SimpleDateFormat('MMddyyyy')
Date date = new Date()
String currentdate = formatter.format(date)
String udesc = description + currentdate
WebUI.setText(findTestObject('Object Repository/Data Setup/Type of Service/updateDescription'), udesc)
WebUI.delay(2)
WebUI.scrollToElement(findTestObject('Object Repository/Data Setup/Type of Service/confirmButton'), 10)
WebUI.click(findTestObject('Object Repository/Data Setup/Type of Service/confirmButton'))
WebUI.waitForAlert(5)
WebUI.acceptAlert()
WebUI.switchToWindowIndex(0)
WebUI.switchToDefaultContent()
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/Type of Service/refreshButton'), 10)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Data Setup/Type of Service/refreshButton'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/Type of Service/searchCode'), 20)
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Data Setup/Type of Service/searchCode'), code)
WebUI.setText(findTestObject('Object Repository/Data Setup/Type of Service/searchDescription'), udesc)
WebUI.click(findTestObject('Object Repository/Data Setup/Type of Service/searchButton'))
String xpath2="(//div[text()='"+code+"']/../following::div[text()='"+udesc+"'])"
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath2]), 20)

/*********************Delete Type of Services****************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/Type of Service/deleteLink'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Data Setup/Type of Service/deleteLink'))
WebUI.waitForAlert(5)
WebUI.acceptAlert()
WebUI.waitForAlert(5)
WebUI.acceptAlert()
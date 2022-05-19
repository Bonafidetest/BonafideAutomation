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

/* Click on Credit Term */
WebUI.switchToDefaultContent()
WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.click(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/CreditTerms/creditTerms'))
WebUI.click(findTestObject('Object Repository/Data Setup/CreditTerms/creditTerms'))
WebUI.delay(5)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

/*************************Add Credit Term***********************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/CreditTerms/addCreditTerm'))
WebUI.setText(findTestObject('Object Repository/Data Setup/CreditTerms/addCreditTerm'), terms)
WebUI.setText(findTestObject('Object Repository/Data Setup/CreditTerms/addCreditTermDescription'), description)
WebUI.setText(findTestObject('Object Repository/Data Setup/CreditTerms/addCreditTermDays'), days)
WebUI.click(findTestObject('Object Repository/Data Setup/CreditTerms/submitButton'))
WebUI.waitForAlert(10)
WebUI.acceptAlert()

/*********************Search and Update Credit Terms****************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/CreditTerms/searchCreditTerm'))
WebUI.setText(findTestObject('Object Repository/Data Setup/CreditTerms/searchCreditTerm'), terms)
WebUI.setText(findTestObject('Object Repository/Data Setup/CreditTerms/searchCreditTermDescription'), description)
WebUI.setText(findTestObject('Object Repository/Data Setup/CreditTerms/searchCreditTermDays'), days)
WebUI.click(findTestObject('Object Repository/Data Setup/CreditTerms/searchButton'))
String xpath="(//div[text()='"+terms+"']/following::div[text()='"+description+"']/following::div[text()='"+days+"'])"
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]), 20)
WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))
WebUI.delay(2)
WebUI.switchToWindowTitle("Update Credit Term")
SimpleDateFormat formatter = new SimpleDateFormat('MMddyyyyHHmmss')
Date date = new Date()
String currentdate = formatter.format(date)
System.out.println(currentdate)
WebUI.delay(2)
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/CreditTerms/updateDescription'), 10)
String udesc = description + currentdate
WebUI.setText(findTestObject('Object Repository/Data Setup/CreditTerms/updateDescription'), udesc)
WebUI.setText(findTestObject('Object Repository/Data Setup/CreditTerms/updateDays'), "365")
WebUI.click(findTestObject('Object Repository/Data Setup/CreditTerms/confirmButton'))
WebUI.waitForAlert(5)
WebUI.acceptAlert()
WebUI.switchToWindowIndex(0)
WebUI.switchToDefaultContent()
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/CreditTerms/searchCreditTerm'))
WebUI.setText(findTestObject('Object Repository/Data Setup/CreditTerms/searchCreditTerm'), terms)
WebUI.setText(findTestObject('Object Repository/Data Setup/CreditTerms/searchCreditTermDescription'), udesc)
WebUI.setText(findTestObject('Object Repository/Data Setup/CreditTerms/searchCreditTermDays'), "365")
WebUI.click(findTestObject('Object Repository/Data Setup/CreditTerms/searchButton'))
String xpath2="(//div[text()='"+terms+"']/following::div[text()='"+udesc+"']/following::div[text()='"+365+"'])"
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath2]), 20)

/*********************Delete Credit Terms****************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/CreditTerms/deleteLink'))
WebUI.click(findTestObject('Object Repository/Data Setup/CreditTerms/deleteLink'))
WebUI.waitForAlert(5)
WebUI.acceptAlert()

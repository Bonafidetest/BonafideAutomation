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

import groovy.ui.SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/*Customer Maintenance*/
WebUI.switchToDefaultContent()
WebUI.verifyElementClickable(findTestObject('Object Repository/dashboard/customerMaintenance'))
WebUI.click(findTestObject('Object Repository/dashboard/customerMaintenance'))

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Search/addNewPatient'))
/*Customer Search*/
if(lastName!='')
{
	WebUI.setText(findTestObject('Object Repository/Customer/Search/lastName'), lastName)
}
if(firstName!='')
{
	WebUI.setText(findTestObject('Object Repository/Customer/Search/firstName'), firstName)
}
if(shipToId!='')
{
	WebUI.setText(findTestObject('Object Repository/Customer/Search/shipToId'), shipToId)
}
if(customerId!='')
{
	WebUI.setText(findTestObject('Object Repository/Customer/Search/customerID'), customerId)
}
if(customerNPI!='')
{
	WebUI.setText(findTestObject('Object Repository/Customer/Search/customerNPI'), customerNPI)
}
if(memberNumber!='')
	WebUI.setText(findTestObject('Object Repository/Customer/Search/memberNumber'), memberNumber)
if(SSN!='')
	WebUI.setText(findTestObject('Object Repository/Customer/Search/SSN'), SSN)	
if(last4DigitSSN!='')
	WebUI.setText(findTestObject('Object Repository/Customer/Search/last4DigitSSN'), last4DigitSSN)
if(phoneNumber!='')
	WebUI.setText(findTestObject('Object Repository/Customer/Search/phoneNo'), phoneNumber)
if(email!='')
	WebUI.setText(findTestObject('Object Repository/Customer/Search/email'), email)
if(claimFollowUpDateFrom!=''|| claimFollowUpDateTo!='')
{
	WebUI.setText(findTestObject('Object Repository/Customer/Search/claimFollowUpDate'), claimFollowUpDateFrom)
	WebUI.setText(findTestObject('Object Repository/Customer/Search/claimFollowUpDateTo'), claimFollowUpDateTo)
}
if(dob!='')
	WebUI.setText(findTestObject('Object Repository/Customer/Search/doB'), dob)
//	WebUI.delay(5)
//	WebUI.verifyElementVisible(findTestObject('Object Repository/Customer/Search/alternateId'))
//if(alternateNumber!='')
//	WebUI.setText(findTestObject('Customer/Search/alternateId'), alternateNumber)
if(office!='')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Search/office'), office, false)
if(type.equals('PATIENT') || type.equals('FACILITY'))
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Search/type'), type, false)
if(customerType!='')
	WebUI.selectOptionByValue(findTestObject('Object Repository/Customer/Search/customerType'), customertype, false)
if(inactiveCustomer.equals('Y'))
	WebUI.check(findTestObject('Object Repository/Customer/Search/inactiveCustomer'))
WebUI.click(findTestObject('Object Repository/Customer/Search/searchButton'))

boolean status = WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Search/searchResult'), 10, FailureHandling.OPTIONAL)
System.out.print(status)

if(WebUI.verifyElementPresent(findTestObject('Object Repository/Customer/Search/searchResult'), 10, FailureHandling.OPTIONAL))
	System.out.print("Record Found")
else
	System.out.print("Record Not Found")
	
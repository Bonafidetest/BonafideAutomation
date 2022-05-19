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

/*Click on Pick Up*/
WebUI.switchToDefaultContent(FailureHandling.OPTIONAL)
if(WebUI.verifyElementNotVisible(findTestObject('Object Repository/Pickup/a_PickupSchedule'), FailureHandling.OPTIONAL))
{
WebUI.switchToDefaultContent(FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/activities'))

WebUI.click(findTestObject('Object Repository/dashboard/activities'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/a_PickupSchedule'))

WebUI.click(findTestObject('Object Repository/Pickup/a_PickupSchedule'))

WebUI.delay(5)
}

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10, FailureHandling.OPTIONAL)

				/*********************Verification*************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/h3_PickupSearch'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/legend_Search'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/td_PickupNumber'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/td_Office'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/td_PersonCalling'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/td_EmployeeNumberName'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/td_OrderNumber'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/td_Patient'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/td_ScheduleDateAfter'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/td_ScheduleDateBefore'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/input_pickupNo'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/select_Office'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/input_PersonCalling'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/input_EmployeeNumberName'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/input_OrderNo'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/input_Patient'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/input_ScheduleDayAfter'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/input_ScheduleDayBefore'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/button_Search'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/legend_Action'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/button_New'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/button_FixPickupError'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/button_Exit'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/td_StaticText'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/div_PickupNumber'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/div_Office'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/div_ScheduleDate'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/div_PersonCalling'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/div_EmployeeNumber'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/div_Patient'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/div_Note'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/div_StopBillDate'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/td_Delete'))

/**********************************Search******************************/
if(PickupNo != '')
	WebUI.setText(findTestObject('Object Repository/Pickup/Search/input_pickupNo'), GlobalVariable.pickupNo)
if(Office !='')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Pickup/Search/select_Office'), Office, false)
if(personCalling !='')
	WebUI.setText(findTestObject('Object Repository/Pickup/Search/input_PersonCalling'), personCalling)
if(employeeNumberName !='')
	WebUI.setText(findTestObject('Object Repository/Pickup/Search/input_EmployeeNumberName'), employeeNumberName)
if(OrderNo !='')
	WebUI.setText(findTestObject('Object Repository/Pickup/Search/input_OrderNo'), OrderNo)
if(patient !='')
	WebUI.setText(findTestObject('Object Repository/Pickup/Search/input_Patient'), patient)
if(scheduleDayAfter !='')
	WebUI.setText(findTestObject('Object Repository/Pickup/Search/input_ScheduleDayAfter'), scheduleDayAfter)	
if(scheduleDayBefore !='')
	WebUI.setText(findTestObject('Object Repository/Pickup/Search/input_ScheduleDayBefore'), scheduleDayBefore)

WebUI.click(findTestObject('Object Repository/Pickup/Search/button_Search'))

String result ='(//tr/td/a/u[text()="Delete"])'

if(WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : result]), 60, FailureHandling.OPTIONAL))
	System.out.print("Result item found")
else
	System.out.print("Result item not found")




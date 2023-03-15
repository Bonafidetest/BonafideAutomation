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

import java.time.LocalDate
import java.time.format.DateTimeFormatter

/*************************** Click on Report *******************/
WebUI.switchToDefaultContent()
WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/reports'))
WebUI.click(findTestObject('Object Repository/dashboard/reports'))
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 20)

/************************Report Dashboard Verification******************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/h1_Bonafide_Reports'))
WebUI.scrollToElement(findTestObject('Object Repository/Reports/Common/a_CustomerOrderReport'), 10)
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/a_CustomerOrderReport'))
WebUI.click(findTestObject('Object Repository/Reports/Common/a_CustomerOrderReport'))

/************************Customer Order Report Verification and Generation**********/
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/h1_CUSTOMER ORDER REPORT'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/td_Office'))
if(office !='')
{
	String xpath="(//option[@value='"+office+"'])"
	WebUI.click(findTestObject('Object Repository/Reports/Customer Order Report/select_Office'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))
	
}
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/td_CustLname'))
if(lname != '')
	WebUI.setText(findTestObject('Object Repository/Reports/Customer Order Report/input_CustLname'), lname)

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/td_CustFanme'))
if(fname !='')
	WebUI.setText(findTestObject('Object Repository/Reports/Customer Order Report/input_CustFname'), fname)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/td_CustomerID'))
if(custId !='')
	WebUI.setText(findTestObject('Object Repository/Reports/Customer Order Report/input_CustomerID'), custId)
	
WebUI.scrollToElement(findTestObject('Object Repository/Reports/Customer Order Report/td_OrderNumber'), 20)
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/td_OrderNumber'))
if(orderNumber !='')
	WebUI.setText(findTestObject('Object Repository/Reports/Customer Order Report/input_OrderNo'), orderNumber)

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/td_DateType'))
if(dateType !='')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Reports/Customer Order Report/select_DateType'), dateType, false)

	/*******Obtaining current date******************/
	LocalDate currentDate = LocalDate.now()
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy")
	String curDate = currentDate.format(formatter)
		
	/*********Getting the next date using plusDays() method********/
	LocalDate nextDate = currentDate.plusDays(10)
	String futureDate = nextDate.format(formatter)
	
	/**********Getting the previous date using minusDays() method*******/
	LocalDate previousDate = currentDate.minusDays(300)
	String pastDate = previousDate.format(formatter)
	
WebUI.check(findTestObject('Object Repository/Reports/Customer Order Report/input_FromChkBox'))
if(WebUI.verifyElementChecked(findTestObject('Object Repository/Reports/Customer Order Report/input_FromChkBox'), 10, FailureHandling.OPTIONAL))
{
	if(fromDate != '')
		WebUI.setText(findTestObject('Object Repository/Reports/Customer Order Report/inputFromDate'), fromDate)
	else
		WebUI.setText(findTestObject('Object Repository/Reports/Customer Order Report/inputFromDate'), pastDate)
}

WebUI.check(findTestObject('Object Repository/Reports/Customer Order Report/input_ToCheckBox'))
if(WebUI.verifyElementChecked(findTestObject('Object Repository/Reports/Customer Order Report/input_ToCheckBox'), 10, FailureHandling.OPTIONAL))
{
	if(fromDate != '')
		WebUI.setText(findTestObject('Object Repository/Reports/Customer Order Report/inputToDate'), toDate)
	else
		WebUI.setText(findTestObject('Object Repository/Reports/Customer Order Report/inputToDate'), curDate)
}

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/td_OrderStatus'))
if(orderStatus !='')
	WebUI.selectOptionByIndex(findTestObject('Object Repository/Reports/Customer Order Report/select_OrderStatus'), orderStatus)
	
WebUI.scrollToElement(findTestObject('Object Repository/Reports/Customer Order Report/select_IncludePreAuthOrder'), 10)
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/td_INCLUDE PREAUTH ORDER'))
if(includePreAuthOrder !='')
	WebUI.selectOptionByIndex(findTestObject('Object Repository/Reports/Customer Order Report/select_IncludePreAuthOrder'), includePreAuthOrder)

	/*****************Button Verification & Operation***************/
WebUI.scrollToElement(findTestObject('Object Repository/Reports/Customer Order Report/button_ScheduleReport'), 10)
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/button_ViewScheduleReport'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/button_Print'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/button_Exit'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/button_Clear'))
WebUI.click(findTestObject('Object Repository/Reports/Customer Order Report/button_Print'))


			
		if(WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/td_Running'), FailureHandling.OPTIONAL))
		{
			WebUI.delay(15)
			WebUI.click(findTestObject('Object Repository/Reports/Common/button_Refresh1'))
		}
		
/********************Report Task**************/
WebUI.delay(10)
if(WebUI.waitForAlert(20, FailureHandling.OPTIONAL))
{
	String alertText = WebUI.getAlertText()
	System.out.println(alertText)
}
WebUI.verifyElementPresent(findTestObject('Object Repository/Reports/Common/h1_ReportTasks'), 120)
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/button_Refresh1'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/button_Exit1'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/th_TaskId'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/th_Report'))
//WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/th_ScheduleName'))
//WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/th_DateTime'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/th_Status'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/th_Criteria'))

//for(int i=0;i<5;i++)
//{
		
	//if(WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/td_Running'), FailureHandling.OPTIONAL))
	//{
		//WebUI.delay(15)
		//WebUI.click(findTestObject('Object Repository/Reports/Common/button_Refresh1'))
	//}
	//else if(WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/td_Completed'), FailureHandling.OPTIONAL))
	//{
		//break
	//}
	//else if(WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/td_Exception'), FailureHandling.OPTIONAL))
	//{
		//	System.out.println("Exception Occours")
			//WebUI.verifyEqual(true, false)
	//}
	
//}

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/td_Completed'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/a_HTML'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/a_Excel'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/aZipFile'))

/*************HTML Report Verify************/
WebUI.click(findTestObject('Object Repository/Reports/Common/a_HTML'))
WebUI.delay(10)
WebUI.switchToWindowIndex(1)
String alertText = WebUI.getAlertText(FailureHandling.OPTIONAL)

if(alertText.contains('internal error'))
{
	WebUI.acceptAlert()
	System.out.println(alertText)
	//if(WebUI.verifyMatch(alertText, 'No record matched your search criteria !', false, FailureHandling.OPTIONAL))
	System.out.println("internal error encountered.....")
	WebUI.verifyEqual(true, false)
}	
else
{
	WebUI.switchToDefaultContent()
	if(WebUI.verifyElementNotVisible(findTestObject('Object Repository/Reports/Customer Order Report/td_CustomerOrderReport'), FailureHandling.OPTIONAL))
		System.out.println("Report Exist...")
}
	
WebUI.closeWindowIndex(1)
WebUI.switchToWindowIndex(0)




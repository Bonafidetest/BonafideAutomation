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
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/a_InvoiceRegisterReport'))
WebUI.click(findTestObject('Object Repository/Reports/Common/a_InvoiceRegisterReport'))

/************************Inventory Register Report Verification and Generation**********/
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Invoice Register Report/h1_InvoiceRegisterReport'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Invoice Register Report/td_Office'))
if(office !='')
	{
		String xpath="(//select[@name='sOffice']/option[@value='"+office+"'])"
		WebUI.doubleClick(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))
	}

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Invoice Register Report/td_BillToLastName'))
if(billToLastName !='')
	WebUI.setText(findTestObject('Object Repository/Reports/Invoice Register Report/input_BillToLastName'), billToLastName)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Invoice Register Report/td_BillToFirstName'))
if(billToFirstName !='')
	WebUI.setText(findTestObject('Object Repository/Reports/Invoice Register Report/input_BillToFirstName'), billToFirstName)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Invoice Register Report/td_BillToID'))
if(billToID !='')
	WebUI.setText(findTestObject('Object Repository/Reports/Invoice Register Report/input_BillToID'), billToID)

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Invoice Register Report/td_BillToType'))
if(billToType !='')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Reports/Invoice Register Report/select_BillToType'), billToType, false)

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Invoice Register Report/td_CustomerID'))
if(customerId !='')
	WebUI.setText(findTestObject('Object Repository/Reports/Invoice Register Report/input_CustomerID'), customerId)

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Invoice Register Report/td_OrderNumber'))
if(orderNumber !='')
	WebUI.setText(findTestObject('Object Repository/Reports/Invoice Register Report/input_OrderNumber'), orderNumber)
	
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
	
if(beginingInvoiceDate !='')
		WebUI.setText(findTestObject('Object Repository/Reports/Invoice Register Report/input_BeginingInvoiceDate'), beginingInvoiceDate)
else
		WebUI.setText(findTestObject('Object Repository/Reports/Invoice Register Report/input_BeginingInvoiceDate'), pastDate)
		
if(endingInvoiceDate !='')
		WebUI.setText(findTestObject('Object Repository/Reports/Invoice Register Report/input_EndingInvoiceDate'), endingInvoiceDate)
else
		WebUI.setText(findTestObject('Object Repository/Reports/Invoice Register Report/input_EndingInvoiceDate'), curDate)

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Invoice Register Report/td_InvoiceBalance'))
if(invoiceBalance !='')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Reports/Invoice Register Report/select_InvoiceBalance'), invoiceBalance, false)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Invoice Register Report/td_InvoiceClaims'))
if(invoiceClaims !='')
{
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Reports/Invoice Register Report/select_InvoiceClaims'), invoiceClaims, false)
	WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Invoice Register Report/td_Insurance'))
	if(insurance != '')
		WebUI.selectOptionByIndex(findTestObject('Object Repository/Reports/Invoice Register Report/select_Insurance'), insurance)
}

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Invoice Register Report/td_ClaimStatus'))
if(claimStatus !='')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Reports/Invoice Register Report/select_ClaimStatus'), claimStatus, false)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Invoice Register Report/td_Make'))
if(make != '')
	WebUI.setText(findTestObject('Object Repository/Reports/Invoice Register Report/input_Make'), make)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Invoice Register Report/td_PartNumber'))
if(partNumber !='')
	WebUI.setText(findTestObject('Object Repository/Reports/Invoice Register Report/input_PartNumber'), partNumber)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Invoice Register Report/td_ItemDescription'))
if(itemDescription !='')
	WebUI.setText(findTestObject('Object Repository/Reports/Invoice Register Report/input_ItemDescription'), itemDescription)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Invoice Register Report/td_SKU'))
if(SKU !='')
	WebUI.setText(findTestObject('Object Repository/Reports/Invoice Register Report/input_SKU'), SKU)

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Invoice Register Report/td_LotNo'))
if(lotNo !='')
	WebUI.setText(findTestObject('Object Repository/Reports/Invoice Register Report/inputLotNo'), lotNo)

	/*****************Button Verification & Operation***************/
	WebUI.scrollToElement(findTestObject('Object Repository/Reports/Customer Order Report/button_ScheduleReport'), 10)
	WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/button_ViewScheduleReport'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/button_Print'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/button_Exit'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/button_Clear'))
	WebUI.click(findTestObject('Object Repository/Reports/Customer Order Report/button_Print'))

	/********************Report Task**************/
	WebUI.delay(10)
	if(WebUI.waitForAlert(20, FailureHandling.OPTIONAL))
	{
		String alertText = WebUI.getAlertText()
		System.out.println(alertText)
		if(alertText.contains('internal error'))
		{
			WebUI.acceptAlert()
			WebUI.verifyEqual(true, false)
		}
	}
	WebUI.switchToWindowIndex(1)
	WebUI.maximizeWindow()
	
	
	/*************HTML Report Verify************/
	
	String alertText = WebUI.getAlertText(FailureHandling.OPTIONAL)
	if(alertText.contains('internal error'))
	{
		WebUI.acceptAlert()
		System.out.println(alertText)
		System.out.println("internal error encountered.....")
		WebUI.verifyEqual(true, false)
	}
	else
	{
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Reports/Invoice Register Report/td_InvoiceRegisterReport'), 60,FailureHandling.OPTIONAL))
			System.out.println("Report Exist...")
		else
		{
			System.out.println("Something Went Wrong........")
			WebUI.verifyEqual(true, false)
		}
	}
		
	WebUI.closeWindowIndex(1)
	WebUI.switchToWindowIndex(0)
	
	





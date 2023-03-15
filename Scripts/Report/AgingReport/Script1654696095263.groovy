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

/*************************** Click on Report *******************/
WebUI.switchToDefaultContent()
WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/reports'))
WebUI.click(findTestObject('Object Repository/dashboard/reports'))
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 20)

/************************Report Dashboard Verification******************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/h1_Bonafide_Reports'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/a_AgingReport'))
WebUI.click(findTestObject('Object Repository/Reports/Common/a_AgingReport'))

/************************Aging Report Verification and Generation**********/
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/h1_AgingReport'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/button_SavePreferenceTop'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/button_PrintReportTop'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/button_ResetFieldsTop'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/button_CancelTop'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/td_OfficeAndCustomer'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/td_Office'))
if(office!='')
{
	String xpath="(//select[@name='selOffice']/option[@value='"+office+"'])"
	WebUI.doubleClick(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))
	//WebUI.selectOptionByIndex(findTestObject('Object Repository/Reports/Claim Detail Report/select_Office'), office)
}
	
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/td_CustLname'))
if(lName !='')
	WebUI.setText(findTestObject('Object Repository/Reports/AgingReport/input_CustLname'), lName)

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/td_CustFname'))
if(fName !='')
	WebUI.setText(findTestObject('Object Repository/Reports/AgingReport/input_CustFname'), fName)

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/td_CustomerID'))
if(custId !='')
	WebUI.setText(findTestObject('Object Repository/Reports/AgingReport/input_CustomerID'), custId)
	
	
/****************Order Invoice and Claim*****************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/td_OrderInvoiceClaim'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/td_BeginingInvoiceDate'))
if(beginningDate !='')
	WebUI.setText(findTestObject('Object Repository/Reports/AgingReport/input_BeginingInvoiceDate'), beginningDate)

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/td_EndingInvoiceDate'))
if(endingDate !='')
	WebUI.setText(findTestObject('Object Repository/Reports/AgingReport/input_EndingInvoiceDate'), endingDate)

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/td_InvoiceNumber'))
if(invoiceNo !='')
	WebUI.setText(findTestObject('Object Repository/Reports/AgingReport/inputInvoiceNo'), invoiceNo)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/td_OrderNumber'))
if(orderNo !='')
	WebUI.setText(findTestObject('Object Repository/Reports/AgingReport/input_OrderNo'), orderNo)

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/td_InvoicesWithClaims'))
if(invoicewithClaims !='')
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Reports/AgingReport/select_InvoicesWithClaims'), invoicewithClaims, false)
	
/****************Insurance and Payment Group*****************/
WebUI.scrollToElement(findTestObject('Object Repository/Reports/AgingReport/td_InsuranceAndPaymentGroup'), 10)
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/td_InsuranceAndPaymentGroup'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/a_Insurance'))
if(invoicewithClaims.equals('With Claims Only'))
{
	if(insurance !='')
	{
		WebUI.delay(3)
		String Ixpath="(//select[@name='sInsurance']/option[contains(text(),'"+insurance+"')])"
		System.out.println(Ixpath)
		WebUI.doubleClick(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : Ixpath]))
		WebUI.delay(3)
		WebUI.doubleClick(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : Ixpath]))
		//WebUI.selectOptionByIndex(findTestObject('Object Repository/Reports/AgingReport/select_Insurance'), insurance)
	}
		
}

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/td_ClaimStatus'))
if(claimStatus !='')
{
	WebUI.delay(3)
	String csxpath="(//select[@name='sClaimStatus']/option[contains(text(),'"+claimStatus+"')])"
	System.out.println(csxpath)
	WebUI.doubleClick(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : csxpath]))
	WebUI.delay(3)
	WebUI.doubleClick(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : csxpath]))
	//WebUI.selectOptionByIndex(findTestObject('Object Repository/Reports/AgingReport/select_ClaimStatus'), claimStatus)
}
	

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/td_CurrentCondition'))
if(currentConditions !='')
{
	WebUI.delay(3)
	String ccxpath="(//select[@name='sCurrentCondition']/option[contains(text(),'"+currentConditions+"')])"
	System.out.println(ccxpath)
	WebUI.doubleClick(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : ccxpath]))
	WebUI.delay(3)
	WebUI.doubleClick(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : ccxpath]))
	//WebUI.selectOptionByIndex(findTestObject('Object Repository/Reports/AgingReport/select_CurrentCondition'), currentConditions)
	
}
	
	/****************Aging Preferences*****************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/td_AgingPreferences'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/td_AgingOption'))
if(agingOption !='')
	WebUI.selectOptionByIndex(findTestObject('Object Repository/Reports/AgingReport/select_AgingOption'), agingOption)
	
	/****************Miscellaneous:*****************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/td_Miscellaneous'))

/*****************Button Verification & Operation***************/
WebUI.scrollToElement(findTestObject('Object Repository/Reports/Customer Order Report/button_ScheduleReport'), 10)
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Customer Order Report/button_ViewScheduleReport'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/button_PrintReport_buttom'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/button_SavePreference_buttom'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/button_ResetFields_buttom'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/AgingReport/button_Cancel_buttom'))
WebUI.click(findTestObject('Object Repository/Reports/AgingReport/button_PrintReport_buttom'))

/********************Report Task**************/
WebUI.delay(10)
if(WebUI.waitForAlert(20, FailureHandling.OPTIONAL))
{
	String alertText = WebUI.getAlertText()
	System.out.println(alertText)
}
WebUI.switchToWindowIndex(1)


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
	if(WebUI.verifyElementPresent(findTestObject('Object Repository/Reports/AgingReport/td_AgingReportByInvoice'), 240,FailureHandling.OPTIONAL))
		System.out.println("Report Exist...")
	else
	{
		System.out.println("Something Went Wrong........")
		WebUI.verifyEqual(true, false)
	}
}
	
WebUI.closeWindowIndex(1)
WebUI.switchToWindowIndex(0)













		
		
	
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
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Common/a_ClaimDetailReport'))
WebUI.click(findTestObject('Object Repository/Reports/Common/a_ClaimDetailReport'))

/************************Claim Detail Report Verification and Generation**********/
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Claim Detail Report/h1_ClaimDetailReport'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Claim Detail Report/td_Office'))
//if(office!='')
	//WebUI.selectOptionByIndex(findTestObject('Object Repository/Reports/Claim Detail Report/select_Office'), office)
	
	
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Claim Detail Report/td_CustomerID'))
if(custId!='')
	WebUI.setText(findTestObject('Object Repository/Reports/Claim Detail Report/input_CustomerID'), custId)

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Claim Detail Report/input_CustomerName'))
if(cusname!='')
	WebUI.setText(findTestObject('Object Repository/Reports/Claim Detail Report/input_CustomerName'), cusname)

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Claim Detail Report/td_Insurance'))
if(insurance !='')
{
	String Ixpath="(//select[@name='txtInsurance']/option[contains(text(),'"+insurance+"')])"
	System.out.println(Ixpath)
	WebUI.doubleClick(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : Ixpath]))
	WebUI.delay(3)
	WebUI.doubleClick(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : Ixpath]))
	//WebUI.selectOptionByIndex(findTestObject('Object Repository/Reports/Claim Detail Report/select_Insurance'), insurance)
}
	
	
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Claim Detail Report/td_ClaimStatus'))
if(claimStatus !='')
{
	WebUI.delay(3)
	String csxpath="(//select[@name='selStatus']/option[contains(text(),'"+claimStatus+"')])"
	System.out.println(csxpath)
	WebUI.doubleClick(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : csxpath]))
	WebUI.delay(3)
	WebUI.doubleClick(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : csxpath]))
	//WebUI.selectOptionByIndex(findTestObject('Object Repository/Reports/Claim Detail Report/select_ClaimStatus'), claimStatus)
}

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Claim Detail Report/td_PaymentStatus'))
if(paymentStatus !='')
{
	WebUI.delay(3)
	String psxpath="(//select[@name='selPymtStatus']/option[contains(text(),'"+paymentStatus+"')])"
	System.out.println(psxpath)
	WebUI.doubleClick(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : psxpath]))
	WebUI.delay(3)
	WebUI.doubleClick(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : psxpath]))
	//WebUI.selectOptionByIndex(findTestObject('Object Repository/Reports/Claim Detail Report/select_PaymentStatus'), paymentStatus)
}

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Claim Detail Report/td_CurrentCondition'))
if(currentCondition !='')
{
	WebUI.delay(3)
	String ccxpath="(//select[@name='sCurCond']/option[contains(text(),'"+currentCondition+"')])"
	System.out.println(ccxpath)
	WebUI.doubleClick(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : ccxpath]))
	WebUI.delay(3)
	WebUI.doubleClick(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : ccxpath]))
	//WebUI.selectOptionByIndex(findTestObject('Object Repository/Reports/Claim Detail Report/select_CurrentCondition'), currentCondition)
}
	
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

WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Claim Detail Report/td_FromClaimDate'))
if(fromClaimDate!='')
	WebUI.setText(findTestObject('Object Repository/Reports/Claim Detail Report/input_FromClaimDate'), fromClaimDate)
	
WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Claim Detail Report/td_ToClaimDate'))
if(toClaimDate!='')
	WebUI.setText(findTestObject('Object Repository/Reports/Claim Detail Report/input_ToClaimDate'), toClaimDate)
	
	/*****************Button Verification & Operation***************/
	WebUI.scrollToElement(findTestObject('Object Repository/Reports/Claim Detail Report/button_ScheduleReport'), 10)
	WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Claim Detail Report/button_View'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Claim Detail Report/button_Print'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Claim Detail Report/button_Exit'))
	WebUI.verifyElementVisible(findTestObject('Object Repository/Reports/Claim Detail Report/button_Clear'))
	WebUI.click(findTestObject('Object Repository/Reports/Claim Detail Report/button_Print'))
	
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
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/Reports/Claim Detail Report/td_ClaimDetailReport'), 60,FailureHandling.OPTIONAL))
			System.out.println("Report Exist...")
		else
		{
			System.out.println("Something Went Wrong........")
			WebUI.verifyEqual(true, false)
		}
	}
		
	WebUI.closeWindowIndex(1)
	WebUI.switchToWindowIndex(0)
	
	
	
	
	
	
	
	
	
	



import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.RenderingHints.Key

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

import org.junit.After
import org.openqa.selenium.Keys as Keys

/*Click on Payment*/
WebUI.switchToDefaultContent()

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/activities'))

WebUI.click(findTestObject('Object Repository/dashboard/activities'))

WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/paymentTransaction'))

WebUI.click(findTestObject('Object Repository/PaymentTransaction/paymentTransaction'))

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

                /*********************invoice Payment*************/
/****************************Verification***********************************/
WebUI.verifyElementVisible(findTestObject('PaymentTransaction/PaymentReport/a_PaymentReport'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/h3_PaymentTransaction'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/td_PaymentNumber'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/paymentNo'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/button_Search1'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/legand_Search'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/legand_QuickSearch'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/td_PaymentOffice'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/td_PaymentType'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/td_PaymentPayor'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/td_PaymentStatus'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/td_PaymentMethod'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/paymentType'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/select_PaymentMethod'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/paymentOffice'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/select_PaymentPayor'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/select_PaymentStatus'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/input_PaymentPayorSearch'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/button_Refresh'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/button_Search2'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/legand_NewTransaction'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/td_SelectTransactionType'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/transactionType'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/button_Batch'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/button_NextStep'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/legand_ErnMangement'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/button_ViewPostExistingERNS'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/button_ImportErnsManually'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/legand_Click on each payment to View or Edit'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/div_PaymentNumber'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/div_PaymentMethod'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/div_PaymentType'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/div_Payor'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/div_Date'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/div_Amount'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/td_OverPaid'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/td_Balance'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentReport/td_Action'))
/**************************************************************/
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/transactionType'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/PaymentTransaction/transactionType'), transactionType, false)

WebUI.click(findTestObject('Object Repository/PaymentTransaction/nextStep'))
/****************************Payment Transaction Entry*********************************/
WebUI.verifyElementPresent(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/button_AmountAllocation'), 120)
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/h3_PaymentTransactionEntry'))
/*************************************Action*********************************/
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/legend_Action'))

WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/button_BatchPosting'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/button_DocScan'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/button_ExitwithoutSave'))
/*************************************Refund*********************************/
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/legend_REFUND'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_RefundNumber'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_Date'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_Amount'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_Print'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_Update'))
/*************************************Customer LookUp*********************************/
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/legend_CustomerLookUp'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_LookUPBy'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_CustomerLastName'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_orderInvoiceNumber'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_CustomerId'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_office'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/button_LookUp'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/selectLookUpBy'))

/*************************************Payment*********************************/
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/legend_Payment'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_PaymentDateTime'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_FundedDate'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_PaymentType'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_PaymentOffice'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_MoneyGoesTo'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_Payor'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/input_PaymentDate'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/select_PaymentTimeHour'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/input_FundedDate'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/selectPaymentTimeMinute'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/select_PaymentType'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/select_MoneyGoesTo'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/select_PaymentOffice'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/payor'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_Name'))
WebUI.verifyElementVisible(findTestObject('PaymentTransaction/PaymentTransactionEntry/insuranceName'))
/*************************************Payment Note*********************************/
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/legend_PaymentNote'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/paymentNote'))
/*************************************Payment Method*********************************/
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/legend_PaymentMethod'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_Method'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_checkNumber'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_checkDate'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_electronicFunds'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_PaymentStatus'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_ApprovalNumber'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/paymentMethod'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/input_CheckNo'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/input_CheckDate'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/input_ElectronicsFund'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/select_PaymentStatus'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/input_approvalNumber'))
/*************************************Credit Card*********************************/
WebUI.selectOptionByLabel(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/paymentMethod'), 'CREDIT CARD', false)
WebUI.delay(2)
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_CardNumber'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_Expiration'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_CreditCard_PaymentStatus'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_CreditCard_ApprovalNumber'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_AuthorizationNumber'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/input_CardNumber'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/select_CardExpMnth'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/select_CardExpYear'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/select_CreditCard_PaymentStatus'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/input_authorizationNo'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/input_CreditCard_approvalNumber'))
/*************************************GIFT CERTIFICATE*********************************/
WebUI.selectOptionByLabel(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/paymentMethod'), 'GIFT CERTIFICATE', false)
WebUI.delay(2)
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/td_GiftCertificateNumber'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/input_GiftCertificateNumber'))
/*************************************CASH*********************************/
WebUI.selectOptionByLabel(findTestObject('PaymentTransaction/PaymentTransactionEntry/paymentMethod'), 'CASH', false)
WebUI.delay(2)
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/input_CSAmount'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/button_ExitwithoutSave'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/button_NextwithoutPreload'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/button_NextwithPreload'))

WebUI.verifyElementVisible(findTestObject('PaymentTransaction/PaymentTransactionEntry/orderInvoiceNumber'))

if(orderNo !='')
	WebUI.setText(findTestObject('PaymentTransaction/PaymentTransactionEntry/orderInvoiceNumber'), orderNo)
	
if(invoiceNo !='')
{
	WebUI.selectOptionByLabel(findTestObject('Object Repository/PaymentTransaction/PaymentTransactionEntry/selectLookUpBy'), 'Invoice Number', false)	
	WebUI.setText(findTestObject('PaymentTransaction/PaymentTransactionEntry/orderInvoiceNumber'), invoiceNo)
}
	
WebUI.click(findTestObject('PaymentTransaction/PaymentTransactionEntry/lookup'))

WebUI.selectOptionByLabel(findTestObject('PaymentTransaction/PaymentTransactionEntry/payor'), payor, false)

if(payor.equals("INSURANCE COMPANY"))
{
	WebUI.setText(findTestObject('PaymentTransaction/PaymentTransactionEntry/insuranceName'), insuranceCompany)
	
	WebUI.delay(5)
	
	//WebUI.setText(findTestObject('PaymentTransaction/PaymentTransactionEntry/insuranceName'), Keys.chord(Keys.ENTER))
	
	xpath="(//li[contains(text(),'"+insuranceCompany+"')])"
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]), 20)
	
	WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))
	
}
if(payor.equals("CUSTOMER"))
	{
		WebUI.setText(findTestObject('Object Repository/PaymentTransaction/billToId'), customerId)
		
		WebUI.delay(2)
		
		WebUI.setText(findTestObject('Object Repository/PaymentTransaction/billToId'), Keys.chord(Keys.ENTER))
		
		xpath2 = "(//li/b[contains(text(),'"+customerId+"')])"
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath2]), 20, FailureHandling.OPTIONAL)
		
		WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath2]), FailureHandling.OPTIONAL)
	}
	
WebUI.setText(findTestObject('PaymentTransaction/PaymentTransactionEntry/paymentNote'), paymentNote)

WebUI.selectOptionByLabel(findTestObject('PaymentTransaction/PaymentTransactionEntry/paymentMethod'), paymentMethod, false)

WebUI.setText(findTestObject('Object Repository/PaymentTransaction/amount'), amount)

WebUI.click(findTestObject('Object Repository/PaymentTransaction/nextWithPreload'))

/**************************************************Amount Allocation************************/
WebUI.verifyElementPresent(findTestObject('PaymentTransaction/AmountAllocation/orderNo'), 30)

if(invoiceNo !='' && orderNo =='')
{
	WebUI.setText(findTestObject('PaymentTransaction/AmountAllocation/invoiceNo'), invoiceNo)
	WebUI.sendKeys(findTestObject('PaymentTransaction/AmountAllocation/invoiceNo'), Keys.chord(Keys.ENTER))
}
else if(orderNo !='' && invoiceNo =='')
{
	WebUI.setText(findTestObject('PaymentTransaction/AmountAllocation/orderNo'), orderNo)
	WebUI.sendKeys(findTestObject('PaymentTransaction/AmountAllocation/invoiceNo'), Keys.chord(Keys.ENTER))
}
else if(orderNo !='' && invoiceNo !='')
{
	WebUI.setText(findTestObject('PaymentTransaction/AmountAllocation/orderNo'), orderNo)
	WebUI.setText(findTestObject('PaymentTransaction/AmountAllocation/invoiceNo'), invoiceNo)
	WebUI.sendKeys(findTestObject('PaymentTransaction/AmountAllocation/invoiceNo'), Keys.chord(Keys.ENTER))
}
else
	printf("Order & Invoice No is missing")

WebUI.waitForAlert(15)

WebUI.acceptAlert(FailureHandling.OPTIONAL)
/****************************Verification***********************************/
WebUI.verifyElementPresent(findTestObject('PaymentTransaction/AmountAllocation/autoAlloc'),25)
WebUI.scrollToElement(findTestObject('PaymentTransaction/AmountAllocation/autoAlloc'), 10)
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/AmountAllocation/addToList'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/AmountAllocation/a_InvoiceReg'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/AmountAllocation/a_PymtByPymt'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/AmountAllocation/a_PaymentByInvoice'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/AmountAllocation/a_ERNInfo'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/AmountAllocation/a_ClaimDetails'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/AmountAllocation/a_FullAllocate'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/AmountAllocation/a_Clear_Allocated'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/AmountAllocation/a_BalanceDetail'))
WebUI.verifyElementVisible(findTestObject('Object Repository/PaymentTransaction/AmountAllocation/a_EditCLaimDetails'))


WebUI.click(findTestObject('PaymentTransaction/AmountAllocation/autoAlloc'))

WebUI.click(findTestObject('PaymentTransaction/AmountAllocation/addToList'))

if(WebUI.verifyElementVisible(findTestObject('PaymentTransaction/AmountAllocation/postPayment'), FailureHandling.OPTIONAL))

	WebUI.click(findTestObject('PaymentTransaction/AmountAllocation/postPayment'))
else
{
	WebUI.verifyElementVisible(findTestObject('PaymentTransaction/AmountAllocation/button_editAllocatedList'))
	
	WebUI.click(findTestObject('PaymentTransaction/AmountAllocation/button_editAllocatedList'))
	
	WebUI.verifyElementVisible(findTestObject('PaymentTransaction/AmountAllocation/balanceAmount'))
	
	String adjamount = WebUI.getText(findTestObject('PaymentTransaction/AmountAllocation/balanceAmount'))
	
	WebUI.verifyElementVisible(findTestObject('PaymentTransaction/AmountAllocation/overPaid'))
	
	WebUI.click(findTestObject('PaymentTransaction/AmountAllocation/overPaid'))
	
	WebUI.sendKeys(findTestObject('PaymentTransaction/AmountAllocation/overPaid'), Keys.chord(Keys.DELETE))
	
	WebUI.clearText(findTestObject('PaymentTransaction/AmountAllocation/overPaid'))
	
	WebUI.setText(findTestObject('PaymentTransaction/AmountAllocation/overPaid'), adjamount)
	
	/*WebUI.clearText(findTestObject('PaymentTransaction/AmountAllocation/overPaid'))
	
	WebUI.sendKeys(findTestObject('PaymentTransaction/AmountAllocation/overPaid'), Keys.chord(Keys.DELETE))
	
	WebUI.setText(findTestObject('PaymentTransaction/AmountAllocation/overPaid'), adjamount)
	
	WebUI.sendKeys(findTestObject('PaymentTransaction/AmountAllocation/overPaid'), Keys.chord(Keys.BACK_SPACE))
	
	WebUI.sendKeys(findTestObject('PaymentTransaction/AmountAllocation/overPaid'), Keys.chord(Keys.BACK_SPACE))
	
	WebUI.sendKeys(findTestObject('PaymentTransaction/AmountAllocation/overPaid'), Keys.chord(Keys.BACK_SPACE))
	
	WebUI.sendKeys(findTestObject('PaymentTransaction/AmountAllocation/overPaid'), Keys.chord(Keys.BACK_SPACE))
	
	WebUI.clearText(findTestObject('PaymentTransaction/AmountAllocation/overPaid'))
	
	WebUI.setText(findTestObject('PaymentTransaction/AmountAllocation/overPaid'), adjamount)*/
	
	WebUI.click(findTestObject('PaymentTransaction/AmountAllocation/button_applyChanges'))
	
	WebUI.waitForAlert(15)
	
	String alertText = WebUI.getAlertText()
	
	WebUI.verifyEqual(alertText, 'Allocted Amount Updated Successfully.')
	
	WebUI.acceptAlert()
	
	WebUI.click(findTestObject('PaymentTransaction/AmountAllocation/postPayment'))
	
	
}

def alertText = WebUI.getAlertText()

WebUI.verifyEqual(alertText, 'Are you sure you want to Post this Payment to Database?')

WebUI.acceptAlert()

WebUI.waitForAlert(90)

alertText = WebUI.getAlertText()

printf(alertText)

String[] substring1 =alertText.split(":")

String paymentNo = substring1[1].replaceAll("\\s", "")

System.out.println(substring1[1])

System.out.println(paymentNo)

printf(paymentNo)

WebUI.acceptAlert()

alertText = WebUI.getAlertText()

WebUI.verifyEqual(alertText, 'Payment Allocation has been Posted Successfully.', FailureHandling.OPTIONAL)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

alertText = WebUI.getAlertText()

WebUI.verifyEqual(alertText, 'Do you want to print Billing Statements now?', FailureHandling.OPTIONAL)

WebUI.dismissAlert(FailureHandling.OPTIONAL)

WebUI.delay(15)

WebUI.switchToDefaultContent(FailureHandling.OPTIONAL)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/PaymentTransaction/paymentSearchButton'), 20)

WebUI.setText(findTestObject('PaymentTransaction/PaymentReport/paymentNo'), paymentNo)

WebUI.click(findTestObject('Object Repository/PaymentTransaction/paymentSearchButton'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PaymentTransaction/paymentReceipt'), 20)

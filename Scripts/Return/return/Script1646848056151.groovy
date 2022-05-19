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

/*Click on Return*/
WebUI.switchToDefaultContent()

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/activities'))

WebUI.click(findTestObject('Object Repository/dashboard/activities'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Return/a_return'))

WebUI.click(findTestObject('Object Repository/Return/a_return'))

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

				/*********************Verification*************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/h3_return'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/legend_return'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/td_orderNumber'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/td_customerId'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/td_customerLastName'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/td_Lot_Serial Number'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/td_SKU'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/input_order_No'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/input_Customer_Id'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/input_Customer_Last_Name'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/input_Lot_Serial'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/input_SKU'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/button_Refresh'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/button_Search'))

/***********************Search****************************/
if(orderNo !='')
	WebUI.setText(findTestObject('Object Repository/Return/input_order_No'), orderNo)
if(customerId !='')
	WebUI.setText(findTestObject('Object Repository/Return/input_Customer_Id'), customerId)
if(lastName !='')
	WebUI.setText(findTestObject('Object Repository/Return/input_Customer_Last_Name'), lastName)
if(lotSerialNo !='')
	WebUI.setText(findTestObject('Object Repository/Return/input_Lot_Serial'), lotSerialNo)
if(SKU !='')
	WebUI.setText(findTestObject('Object Repository/Return/input_SKU'), SKU)
WebUI.click(findTestObject('Object Repository/Return/button_Search'))

/****************************************Verification*************************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/legend_Returning_Items'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/td_return_Office'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/td_Return_Date'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/td_STOP_BILLING_DATE'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/td_PATIENT_DECASED_DATE'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/td_return_reason'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/td_Header'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/button_ExitWithoutSave'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Return/button_SaveAndConfirm'))

/***************************************Return*****************************/
WebUI.click(findTestObject('Object Repository/Return/button_SaveAndConfirm'))
WebUI.waitForAlert(10)
String alertText = WebUI.getAlertText()
if(WebUI.verifyEqual(alertText, ' There are no items to be returned. Please enter a return quantity.', FailureHandling.OPTIONAL))
	WebUI.acceptAlert()
	
WebUI.delay(5)

if(decaseDate !='')
	WebUI.setText(findTestObject('Object Repository/Return/input_PatientDecasedDate'), decaseDate)
if(returnReason !='')
	WebUI.setText(findTestObject('Object Repository/Return/input_ReturnReason'), returnReason)
if(returnQty !='' && returnQty>0)
{
	WebUI.clearText(findTestObject('Object Repository/Return/input_ReturnQty'))
	WebUI.setText(findTestObject('Object Repository/Return/input_ReturnQty'), returnQty)
}
else
	System.out.print("Return Qty is zero or blank")
WebUI.click(findTestObject('Object Repository/Return/button_SaveAndConfirm'))

WebUI.delay(15)

WebUI.closeWindowTitle('Microsoft Word - MedEQ Invoice.doc', FailureHandling.OPTIONAL)

/**********************************Verify Return Confirmation**************************/

if(WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/orderInquiry'), FailureHandling.OPTIONAL))
	WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/orderInquiry'))
else
	{
		WebUI.click(findTestObject('Object Repository/dashboard/activities'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Order/Order Inquiry/orderInquiry'), 10)
		WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/orderInquiry'))
	}

WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/orderNo'))
WebUI.setText(findTestObject('Object Repository/Order/Order Inquiry/orderNo'), orderNo)
WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/searchbutton'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/orderAction'))
WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/orderAction'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/a_ViewReturn'))
WebUI.click(findTestObject('Object Repository/Order/Order Inquiry/a_ViewReturn'))

WebUI.delay(5)
WebUI.switchToWindowTitle('View Return')
WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/ViewReturn/h3_ViewReturn'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Order/Order Inquiry/ViewReturn/a_print'))
WebUI.closeWindowTitle('View Return')






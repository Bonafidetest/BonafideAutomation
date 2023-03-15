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


WebUI.verifyElementVisible(findTestObject('Object Repository/Order/New Order/newOrder'), FailureHandling.OPTIONAL)
WebUI.delay(5)

WebUI.switchToDefaultContent()

String companyName = WebUI.getText(findTestObject('Object Repository/officeSelection/companyName'))
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

/**************** Billing Office Selections for VIEMEDTRAIN & CHCSTRAIN************/
if(companyName.equals("CHCSTRAIN") || companyName.equals("VIEMEDTRAIN"))
	WebUI.selectOptionByIndex(findTestObject('Object Repository/Order/New Order/CustomerInformation/order_billingOffice'), billing_Office)
	
WebUI.setText(findTestObject('Object Repository/Order/New Order/CustomerInformation/orderedBy'), orderedBy)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Order/New Order/CustomerInformation/order_salesRep'), salesRep, FailureHandling.OPTIONAL)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Order/New Order/CustomerInformation/FileClaim'), fileClaim, false)

/**************** Order Clasification Selections for CHCSTRAIN************/
if(companyName.equals("CHCSTRAIN"))
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Order/New Order/CustomerInformation/select_OrderClasification'), orderClassification, false)

WebUI.delay(5)
WebUI.verifyElementClickable(findTestObject('Object Repository/Order/New Order/CustomerInformation/order_sourceofBusiness'))
WebUI.click(findTestObject('Object Repository/Order/New Order/CustomerInformation/order_sourceofBusiness'))
String source_Business = WebUI.getText(findTestObject('Object Repository/Order/New Order/CustomerInformation/order_sourceofBusiness'))
if(source_Business.equals(""))
{
	WebUI.verifyElementClickable(findTestObject('Object Repository/Order/New Order/CustomerInformation/order_sourceofBusinesslink'))
	WebUI.delay(2)
	WebUI.click(findTestObject('Object Repository/Order/New Order/CustomerInformation/order_sourceofBusinesslink'))
	WebUI.click(findTestObject('Object Repository/Order/New Order/CustomerInformation/order_sourceofBusinesslink'), FailureHandling.OPTIONAL)
	WebUI.delay(5)
	WebUI.verifyElementClickable(findTestObject('Object Repository/Order/New Order/CustomerInformation/business'))
	WebUI.click(findTestObject('Object Repository/Order/New Order/CustomerInformation/business'))
}
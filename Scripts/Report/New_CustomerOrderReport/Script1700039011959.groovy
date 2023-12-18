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

WebUI.click(findTestObject('Object Repository/Report/CustomerOrderReport/Page_/a_Reports'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Report/CustomerOrderReport/Page_/a_Customer Order Report'), 
    0)

WebUI.click(findTestObject('Object Repository/Report/CustomerOrderReport/Page_/a_Customer Order Report'))

WebUI.verifyElementText(findTestObject('Object Repository/Report/CustomerOrderReport/Page_/h1_CUSTOMER ORDER REPORT'), 'CUSTOMER ORDER REPORT')

WebUI.setText(findTestObject('Object Repository/Report/CustomerOrderReport/Page_/input_txtCustID'), '10071')

WebUI.scrollToElement(findTestObject('Report/CustomerOrderReport/Page_/button_Print'), 0)

WebUI.click(findTestObject('Object Repository/Report/CustomerOrderReport/Page_/button_Print'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Report/CustomerOrderReport/Page_/button_Refresh'))

WebUI.switchToWindowTitle('')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Report/CustomerOrderReport/Page_/a_HTML'))

WebUI.navigateToUrl('https://medsqa-alb.bonafide.com/meds/servlet/com.meds.report.servlet.ReportController?act=VIEW_RESULTS&viewer=HTML&taskId=5926')

WebUI.delay(10)

WebUI.switchToWindowIndex(1)

WebUI.verifyElementText(findTestObject('Object Repository/Report/CustomerOrderReport/Page_Bonafide DME Software (Customer Order _5e0331/td_CUSTOMER ORDER REPORT'), 
    'CUSTOMER ORDER REPORT')


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

WebUI.click(findTestObject('Object Repository/Report/CustomerReport/Page_/a_Reports'))

WebUI.click(findTestObject('Object Repository/Report/CustomerReport/Page_/a_Customer Report(NEW)'))

WebUI.setText(findTestObject('Object Repository/Report/CustomerReport/Page_/input_customerID'), '10095')

WebUI.scrollToElement(findTestObject('Report/CustomerReport/Page_/button_Print'), 0)

WebUI.click(findTestObject('Object Repository/Report/CustomerReport/Page_/button_Print'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Report/CustomerReport/Page_/button_Refresh'))

WebUI.delay(5)

WebUI.click(findTestObject('Report/CustomerReport/Page_/a_HTML'))

WebUI.switchToWindowTitle('')

WebUI.navigateToUrl('https://medsqa-alb.bonafide.com/meds/servlet/com.meds.report.servlet.ReportController?act=VIEW_RESULTS&viewer=HTML&taskId=5932')

WebUI.switchToWindowIndex(1)

WebUI.verifyElementText(findTestObject('Object Repository/Report/CustomerReport/Page_Customer Report/td_CUSTOMER REPORT'), 
    'CUSTOMER REPORT')


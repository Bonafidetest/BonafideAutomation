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

//WebUI.callTestCase(findTestCase('Login/loginToApplication'), [('company') : 'HSSTRAIN', ('employeeNo') : '9994', ('pwd') : '1234'], 
  //  FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Report/Page_/a_Reports'))

WebUI.click(findTestObject('Report/New_ClaimDetailReport/Page_/a_Claim Detail Report'))

WebUI.setText(findTestObject('Report/Page_/input_CUSTOMER ID_txtCustomerId'), '11730')

WebUI.scrollToElement(findTestObject('Report/Page_/button_Print'), 0)

WebUI.click(findTestObject('Report/Page_/button_Print'))

WebUI.delay(5)

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('Report/New_ClaimDetailReport/Page_/td_CLAIM DETAIL REPORT'), 0)


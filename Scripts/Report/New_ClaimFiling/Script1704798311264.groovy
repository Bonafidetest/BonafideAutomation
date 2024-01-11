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

WebUI.callTestCase(findTestCase('Login/loginToApplication'), [('company') : 'HSSTRAIN', ('employeeNo') : '9994', ('pwd') : '1234'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('New_ClaimFiling/Page_/a_Claim Filing'))

WebUI.delay(20)

WebUI.click(findTestObject('New_ClaimFiling/Page_/button_Searching Criteria'))

WebUI.verifyElementPresent(findTestObject('New_ClaimFiling/Page_/td_Claim No'), 0)

WebUI.setText(findTestObject('New_ClaimFiling/Page_/input_Claim No_claimno'), '164331')

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('New_ClaimFiling/Page_/option_ALL(claim_status)'), 0)

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('New_ClaimFiling/Page_/option_ALL(claim_status)'), 0)

WebUI.delay(5)

WebUI.click(findTestObject('New_ClaimFiling/Page_/option_ALL(curr_cond)'))

WebUI.delay(5)

WebUI.click(findTestObject('New_ClaimFiling/Page_/option_ALL(payment_status)'))

WebUI.delay(5)

WebUI.click(findTestObject('New_ClaimFiling/Page_/button_Search'))

WebUI.verifyElementPresent(findTestObject('New_ClaimFiling/Page_/div_1 found'), 0)

WebUI.click(findTestObject('New_ClaimFiling/Page_/input_RR-DD_chkNo0'))

WebUI.verifyElementText(findTestObject(null), '164331')

WebUI.click(findTestObject('New_ClaimFiling/Page_/a_164331'))


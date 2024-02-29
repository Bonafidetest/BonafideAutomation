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
    //FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Report/New_AgingReport(new)/Page_/a_Reports'))

WebUI.click(findTestObject('Report/New_AgingReport(new)/Page_/a_Aging Report(New)'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Report/New_AgingReport(new)/Page_/td_Office'), 0)

WebUI.click(findTestObject('Report/New_AgingReport(new)/Page_/option_ALNY - HEALTH SYSTEM SERVICES - ALBANY'))

WebUI.verifyElementPresent(findTestObject('Report/New_AgingReport(new)/Page_/td_Customer ID'), 0)

WebUI.setText(findTestObject('Report/New_AgingReport(new)/Page_/input_Customer ID_txtCustID'), CustID)

WebUI.scrollToElement(findTestObject('Report/New_AgingReport(new)/Page_/button_Print Report'), 0)

WebUI.click(findTestObject('Report/New_AgingReport(new)/Page_/button_Print Report'))

/********************Report Task**************/
WebUI.delay(10)

if (WebUI.waitForAlert(20, FailureHandling.OPTIONAL)) {
    String alertText = WebUI.getAlertText()

    System.out.println(alertText)
}



/*************HTML Report Verify************/
String alertText = WebUI.getAlertText(FailureHandling.OPTIONAL)

if (alertText.contains('internal error')) {
    WebUI.acceptAlert()

    System.out.println(alertText)

    System.out.println('internal error encountered.....')

    WebUI.verifyEqual(true, false)
} else {
    if (WebUI.verifyElementPresent(findTestObject('Object Repository/Report/New_AgingReport(new)/Page_/td_Aging Report'), 240, 
        FailureHandling.OPTIONAL)) {
        System.out.println('Report Exist...')
    } else {
        System.out.println('Something Went Wrong........')

        WebUI.verifyEqual(true, false)
    }
}




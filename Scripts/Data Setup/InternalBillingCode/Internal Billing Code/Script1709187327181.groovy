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

WebUI.callTestCase(findTestCase('Login/loginToApplication'), [('company') : 'HSSTRAIN', ('employeeNo') : '9994', ('pwd') : '1234'])

WebUI.click(findTestObject('Object Repository/InternalBillingCode/Page_/a_Data Setup'))

WebUI.click(findTestObject('Object Repository/InternalBillingCode/Page_/a_Internal Billing Code'))

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/OLUOM1/Page_/img'))
WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/InternalBillingCode/Page_/button_Add'))

WebUI.delay(2)

WebUI.switchToWindowUrl('https://medsqa.bonafide.com/meds/dme/production/data-setup/internal-billing-code/internal_billing_code-action.jsp?isAdd=true')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/InternalBillingCode/Page_/input_Code_code'), 'IBC429')

WebUI.setText(findTestObject('Object Repository/InternalBillingCode/Page_/input_Description_description'), 'BONAFIDE QA TEST INTERNAL BILLING CODE')

WebUI.click(findTestObject('Object Repository/InternalBillingCode/Page_/save1'))

WebUI.delay(2)

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.switchToWindowTitle('')

WebUI.setText(findTestObject('Object Repository/InternalBillingCode/Page_/input_Code_srch_code'), 'IBC429')

WebUI.setText(findTestObject('Object Repository/InternalBillingCode/Page_/input_Description_srch_description'), 'BONAFIDE')

WebUI.click(findTestObject('Object Repository/InternalBillingCode/Page_/button_Search'))

WebUI.delay(2)

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/InternalBillingCode/Page_/a_modify'))

WebUI.delay(2)

//WebUI.switchToWindowUrl('https://medsqa.bonafide.com/meds/dme/production/data-setup/internal-billing-code/internal_billing_code-action.jsp?isAdd=false&code=IBC429&sysid=6&description=BONAFIDE%20QA%20TEST%20INTERNAL%20BILLING%20CODE')
WebUI.switchToWindowIndex(1)
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/InternalBillingCode/Page_/input_Code_code'), 'IBC4298')

WebUI.click(findTestObject('Object Repository/InternalBillingCode/Page_/button_Save'))

WebUI.delay(1)
WebUI.acceptAlert(FailureHandling.OPTIONAL)
WebUI.delay(2)
WebUI.switchToWindowTitle('')

WebUI.setText(findTestObject('Object Repository/InternalBillingCode/Page_/input_Code_srch_code'), 'IBC4298')

WebUI.setText(findTestObject('Object Repository/InternalBillingCode/Page_/input_Description_srch_description'), 'BONAFIDE')

WebUI.click(findTestObject('Object Repository/InternalBillingCode/Page_/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/InternalBillingCode/Page_/a_delete'))

WebUI.acceptAlert(FailureHandling.OPTIONAL)

WebUI.delay(3)


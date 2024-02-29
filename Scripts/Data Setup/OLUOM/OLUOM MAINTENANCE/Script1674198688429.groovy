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

WebUI.click(findTestObject('Object Repository/OLUOM1/Page_/a_Data Setup'))

WebUI.click(findTestObject('Object Repository/OLUOM1/Page_/a_Oluom Data Setup'))

WebUI.click(findTestObject('Object Repository/OLUOM1/Page_/img'))

WebUI.click(findTestObject('Object Repository/OLUOM1/Page_/a_Click              here'))

WebUI.delay(2)

WebUI.switchToWindowTitle('MedEQ Oluom Maintenance')

WebUI.setText(findTestObject('Object Repository/OLUOM1/Page_MedEQ Oluom Maintenance/input_BmsEdiId_bmsEdiId'), '39284AFG')

WebUI.setText(findTestObject('Object Repository/OLUOM1/Page_MedEQ Oluom Maintenance/input_Catalogno_catalogno'), '793487DE')

WebUI.setText(findTestObject('Object Repository/OLUOM1/Page_MedEQ Oluom Maintenance/input_VUOM_vuom'), 'CX')

WebUI.selectOptionByValue(findTestObject('Object Repository/OLUOM1/Page_MedEQ Oluom Maintenance/select_EA                    BX            _7b3fc1'), 'EA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OLUOM1/Page_MedEQ Oluom Maintenance/select_EA                    BX            _7b3fc1'), 'BX', true)

WebUI.click(findTestObject('Object Repository/OLUOM1/Page_MedEQ Oluom Maintenance/button_Submit'))

WebUI.delay(2)

WebUI.switchToWindowTitle('')

WebUI.setText(findTestObject('Object Repository/OLUOM1/Page_/input_BmsEdiId_bmsEdiId'), '39284AFG')

WebUI.setText(findTestObject('Object Repository/OLUOM1/Page_/input_Catalogno_catalogno'), '793487DE')

WebUI.click(findTestObject('Object Repository/OLUOM1/Page_/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OLUOM1/Page_/div_39284AFG'))

WebUI.delay(2)

WebUI.switchToWindowTitle('MedEQ Oluom Maintenance')

WebUI.setText(findTestObject('Object Repository/OLUOM1/Page_MedEQ Oluom Maintenance/input_Catalogno_catalogno'), '793487DET')

WebUI.click(findTestObject('Object Repository/OLUOM1/Page_MedEQ Oluom Maintenance/button_Submit'))

WebUI.delay(2)

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Object Repository/OLUOM1/Page_/a_delete'))

WebUI.delay(1)

WebUI.acceptAlert()

WebUI.delay(5)


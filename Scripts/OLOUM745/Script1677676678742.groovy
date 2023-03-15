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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://medsqa-alb.bonafide.com/meds/logon.jsp')

WebUI.setText(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_MedEQ Manager/input_Company_COMPANYNO'), 'HSSTRAIN')

WebUI.setText(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_MedEQ Manager/input_Employee No_EMPLOYEENO'), 
    '9994')

WebUI.setEncryptedText(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_MedEQ Manager/input_Password_PASSWORD'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_MedEQ Manager/input_Do not remember my company and employ_cd6edf'))

WebUI.click(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_MedEQ Manager/input'))

WebUI.click(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_MedEQ Manager/div_HEALTH SYSTEM SERVICES - ALBANY'))

WebUI.click(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_HSSTRAIN - Bonafide/a_Explore Bonafide 2.1'))

WebUI.click(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_/a_Data Setup'))

WebUI.click(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_/a_Oluom Data Setup'))

WebUI.click(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_/a_Click              here'))

WebUI.switchToWindowTitle('MedEQ Oluom Maintenance')

WebUI.setText(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_MedEQ Oluom Maintenance/input_BmsEdiId_bmsEdiId'), 
    'TEST534')

WebUI.setText(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_MedEQ Oluom Maintenance/input_Catalogno_catalogno'), 
    'SRGV')

WebUI.setText(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_MedEQ Oluom Maintenance/input_VUOM_vuom'), 'BX')

WebUI.click(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_MedEQ Oluom Maintenance/button_Submit'))

WebUI.switchToWindowTitle('')

WebUI.setText(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_/input_BmsEdiId_bmsEdiId'), 'TEST5345')

WebUI.click(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_/button_Search'))

WebUI.click(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_/div_TEST534'))

WebUI.switchToWindowTitle('MedEQ Oluom Maintenance')

WebUI.setText(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_MedEQ Oluom Maintenance/input_Catalogno_catalogno'), 
    'SRGVSD')

WebUI.click(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_MedEQ Oluom Maintenance/i_Submit_far fa-check mr-xxs'))

WebUI.switchToWindowTitle('')

WebUI.setText(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_/input_BmsEdiId_bmsEdiId'), 'TEST534')

WebUI.click(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_/button_Search'))

WebUI.click(findTestObject('Object Repository/Data Setup/OLUOM/Page_/Page_/a_delete'))

WebUI.acceptAlert()

WebUI.closeBrowser()


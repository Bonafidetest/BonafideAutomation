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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://medsqa-alb.bonafide.com/meds/logon.jsp')

WebUI.setText(findTestObject('Object Repository/Data Setup/Page_MedEQ Manager/input_Company_COMPANYNO'), 'CHCSTRAIN')

WebUI.click(findTestObject('Object Repository/Data Setup/Page_MedEQ Manager/td_'))

WebUI.setText(findTestObject('Object Repository/Data Setup/Page_MedEQ Manager/input_Employee No_EMPLOYEENO'), '9994')

WebUI.setEncryptedText(findTestObject('Object Repository/Data Setup/Page_MedEQ Manager/input_Password_PASSWORD'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Data Setup/Page_MedEQ Manager/input_Do not remember my company and employ_cd6edf'))

WebUI.click(findTestObject('Object Repository/Data Setup/Page_CHCSTRAIN - Bonafide/a_Explore Bonafide 2.1'))

WebUI.click(findTestObject('Object Repository/Data Setup/Page_/a_Data Setup'))

WebUI.click(findTestObject('Object Repository/Data Setup/Page_/a_Order Step Setup'))

WebUI.click(findTestObject('Object Repository/Data Setup/Page_/button_Order Processing Step Type Setup'))

WebUI.click(findTestObject('Object Repository/Data Setup/Page_/button_Add'))

WebUI.setText(findTestObject('Object Repository/Data Setup/Page_/input_New_NEW_DESCRIPTION'), 'BON')

WebUI.click(findTestObject('Object Repository/Data Setup/Page_/button_Save'))

WebUI.click(findTestObject('Object Repository/Data Setup/Page_/a_BON_fas fa-hand-pointer'))

WebUI.click(findTestObject('Object Repository/Data Setup/Page_/i_Add_fal fa-plus mr-xxs'))

WebUI.setText(findTestObject('Object Repository/Data Setup/Page_/input_Days Between_NEW_STEPNO'), '0')

WebUI.setText(findTestObject('Object Repository/Data Setup/Page_/input_New_NEW_DESCRIPTION'), 'YR')

WebUI.click(findTestObject('Object Repository/Data Setup/Page_/input_YesNo_NEW_CREATE_TASK_0'))

WebUI.click(findTestObject('Object Repository/Data Setup/Page_/button_Save'))


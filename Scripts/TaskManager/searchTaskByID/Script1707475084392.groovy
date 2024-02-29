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

WebUI.click(findTestObject('Object Repository/TaskManager/Page_/i_fal fa-chevron-down'))

WebUI.click(findTestObject('Object Repository/TaskManager/Page_/a_Task Manager (New)'))

WebUI.switchToWindowTitle('Task Manager :: View Tasks')

WebUI.click(findTestObject('Object Repository/TaskManager/Page_Task Manager  View Tasks/a_advanced search'))

WebUI.delay(5)

WebUI.selectOptionByIndex(findTestObject('TaskManager/Page_Task Manager  View Tasks/Page_Task Manager  View Tasks/select_Only YouAll Employees'), 
    1)

WebUI.selectOptionByIndex(findTestObject('Object Repository/TaskManager/Page_Task Manager  View Tasks/select_AllOpenClosed'), 
    0)

WebUI.selectOptionByIndex(findTestObject('Object Repository/TaskManager/Page_Task Manager  View Tasks/select_AllIn ProgressAll DoneNot WorkingNot Me'), 
    0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/TaskManager/Page_Task Manager  View Tasks/input_taskId'), '6')

WebUI.click(findTestObject('Object Repository/TaskManager/Page_Task Manager  View Tasks/span_Search'))

WebUI.verifyElementText(findTestObject('TaskManager/Page_Task Manager  View Tasks/Page_Task Manager  View Tasks/td_6'), 
    '6')


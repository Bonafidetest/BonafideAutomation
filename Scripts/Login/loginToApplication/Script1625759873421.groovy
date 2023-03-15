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

/************************************Opening Browser with URL*******************************/
WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()
/*************************Login with credentials**********************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Login/company'))
WebUI.setText(findTestObject('Object Repository/Login/company'), company)
WebUI.setText(findTestObject('Object Repository/Login/employeeno'), employeeNo)
WebUI.setText(findTestObject('Object Repository/Login/password'), pwd)
WebUI.click(findTestObject('Object Repository/Login/signin'))

/********************Already Logged In checking********************/
WebUI.verifyElementPresent(findTestObject('Object Repository/switchUser/i_am_sure_button'), 20, FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/switchUser/i_am_sure_button'), FailureHandling.OPTIONAL)

/******************Office Selection***********************/
WebUI.verifyElementPresent(findTestObject('Object Repository/officeSelection/login_office'), 20)
WebUI.click(findTestObject('Object Repository/officeSelection/login_office'))

/*********************Close Task Manager Window**************/
WebUI.delay(5)
WebUI.closeWindowIndex(1, FailureHandling.OPTIONAL)
WebUI.switchToDefaultContent()
WebUI.switchToFrame(findTestObject('Object Repository/iframe/header'), 10)
WebUI.verifyElementPresent(findTestObject('Object Repository/dashboard/home'), 15)

/*********Switch to 2.1 Environment***************/
WebUI.switchToDefaultContent()
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/dashboard/bonafide_2'))
WebUI.click(findTestObject('Object Repository/dashboard/bonafide_2'))
WebUI.delay(5)
//WebUI.acceptAlert()
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10, FailureHandling.OPTIONAL)
WebUI.verifyElementPresent(findTestObject('Object Repository/dashboard/dashboard'), 20)
WebUI.closeWindowIndex(1, FailureHandling.OPTIONAL)
WebUI.switchToDefaultContent()


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

// switching to main menu
WebUI.switchToDefaultContent()

// verifying if data setup option is present in main menu
WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/dataSetup'))

// clicking on data setup in main menu
WebUI.click(findTestObject('Object Repository/dashboard/dataSetup'))

// verifying if Order step setup option is present in data setup menu
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/OPS/OrderStepSetup'))

// click on order step setup option present in data setup menu
WebUI.click(findTestObject('Object Repository/Data Setup/OPS/OrderStepSetup'))

// waiting for order step setup page to load
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Data Setup/OPS/menuDisappear'))

// switching to different iFrame
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.click(findTestObject('Object Repository/Data Setup/OPS/HandPointer'))

WebUI.delay(5)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.click(findTestObject('Object Repository/Data Setup/OPS/Add1'))
int step = 0
int confirmSteps = 1
String description
for(int i=0;i<5;i++)
{
	description += i
	WebUI.click(findTestObject('Object Repository/Data Setup/OPS/Add1'))
	WebUI.setText(findTestObject('Object Repository/Data Setup/OPS/step'), i)
	WebUI.setText(findTestObject('Object Repository/Data Setup/OPS/ConfirmSteps'), confirmSteps)
	WebUI.setText(findTestObject('Object Repository/Data Setup/OPS/Description'), description)
	WebUI.click(findTestObject('Object Repository/Data Setup/OPS/createTaskRadio'))
	confirmSteps++
}

WebUI.click(findTestObject('Object Repository/Data Setup/OPS/Save1'))

WebUI.delay(5)

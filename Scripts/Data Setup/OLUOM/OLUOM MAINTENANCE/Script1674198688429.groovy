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

/********************Click on Order Step Setup*****************/
// switching to main menu
WebUI.switchToDefaultContent()

// verifying if data setup option is present in main menu
WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/dataSetup'))

// clicking on data setup in main menu
WebUI.click(findTestObject('Object Repository/dashboard/dataSetup'))

// verifying if Order step setup option is present in data setup menu
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/OLUOM/oluom data setup'))

// click on order step setup option present in data setup menu
WebUI.click(findTestObject('Object Repository/Data Setup/OLUOM/oluom data setup'))

// waiting for order step setup page to load
WebUI.delay(5)
//WebUI.click(findTestObject('Object Repository/Data Setup/OLUOM/Three dot'))
// switching to different iFrame
//WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
WebUI.switchToFrame(findTestObject('Object Repository/Data Setup/OLUOM/content2.2'), 10)
WebUI.delay(5)
//WebUI.click(findTestObject('Object Repository/OLUOM/header'))
//WebUI.delay(1)
// verifying if click here button is present
//WebUI.verifyElementVisible('Object Repository/OLUOM/Click here')

// click on click here button
WebUI.click(findTestObject('Object Repository/Data Setup/OLUOM/Click here'))
//WebUI.click(findTestObject('Object Repository/OLUOM/search'))
// verify BmsEdild field present
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/OLUOM/BmsEdild'))

// enter data in BmsEdild field 
WebUI.setText(findTestObject('Object Repository/Data Setup/OLUOM/BmsEdild'), "Test_Bonafide")

// verify Catalogno field present
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/OLUOM/Catalogno'))

// enter data in Catalogno field
WebUI.setText(findTestObject('Object Repository/Data Setup/OLUOM/Catalogno'), "E657KJH")

// verify VUOM field present
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/OLUOM/VUOM'))

// enter data in VUOM field
WebUI.setText(findTestObject('Object Repository/Data Setup/OLUOM/VUOM'), "BX")

// verify CUOM field present
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/OLUOM/CUOM'))

// enter data in CUOM field
WebUI.setText(findTestObject('Object Repository/Data Setup/OLUOM/CUOM'), "BX")

// verify submit button is present or not
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/OLUOM/Submit'))

// click on submit button
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/OLUOM/Submit'))

// verifying if click here button is present
//WebUI.verifyElementVisible('Object Repository/OLUOM/Click here')

// click on click here button
//WebUI.click(findTestObject('Object Repository/OLUOM/Click here'))
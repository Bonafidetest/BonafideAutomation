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

WebUI.verifyElementVisible(findTestObject('Object Repository/Customer/Creation/Save/save'))
WebUI.click(findTestObject('Object Repository/Customer/Creation/Save/save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Customer/Creation/Save/saveAnyway'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Customer/Creation/Save/saveAnyway'), FailureHandling.OPTIONAL)

WebUI.verifyElementVisible(findTestObject('Object Repository/Customer/Creation/Save/changeOffice'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Customer/Creation/Save/changeOffice'), FailureHandling.OPTIONAL)

WebUI.switchToDefaultContent()
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 5)

WebUI.verifyElementVisible(findTestObject('Object Repository/Customer/Details/customerId'))
customerId = WebUI.getText(findTestObject('Object Repository/Customer/Details/customerId'))
println(customerId)

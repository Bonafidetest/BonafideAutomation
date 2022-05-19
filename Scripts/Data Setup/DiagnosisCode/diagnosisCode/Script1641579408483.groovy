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

/* Click on Diagnosis Code */
WebUI.switchToDefaultContent()
WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.click(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/DiagnosisCode/diagnosisCode'))
WebUI.click(findTestObject('Object Repository/Data Setup/DiagnosisCode/diagnosisCode'))
WebUI.delay(5)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

/*************************Search Diagnosis Code****************/
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/DiagnosisCode/code'), 10)
WebUI.setText(findTestObject('Object Repository/Data Setup/DiagnosisCode/code'), code)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Data Setup/DiagnosisCode/searchButton'))
String xpath ="(//div[text()='"+code+"'])"
WebUI.delay(5)
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]), 20)
WebUI.click(findTestObject('Object Repository/Data Setup/DiagnosisCode/refreshButton'))
WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/Data Setup/DiagnosisCode/description'), description)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Data Setup/DiagnosisCode/searchButton'))
xpath ="(//div[text()='"+description+"'])"
WebUI.delay(5)
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]), 20)








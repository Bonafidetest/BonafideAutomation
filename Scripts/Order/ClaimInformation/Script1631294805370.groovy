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

WebUI.click(findTestObject('Object Repository/Order/New Order/Claim Information/claimInformation'))
WebUI.delay(5)
WebUI.scrollToElement(findTestObject('Object Repository/Order/New Order/Claim Information/ICD10_1'), 5)

WebUI.setText(findTestObject('Object Repository/Order/New Order/Claim Information/ICD10_1'), ICD10_1)

WebUI.switchToDefaultContent()

String companyName = WebUI.getText(findTestObject('Object Repository/officeSelection/companyName'))
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

String NPI = WebUI.getText(findTestObject('Object Repository/Order/New Order/Claim Information/orderingPhysicanNPI'))
if(NPI.equals(""))
{
	WebUI.click(findTestObject('Object Repository/Order/New Order/Claim Information/assignOrderingPhysican'))
	if(WebUI.verifyElementNotPresent(findTestObject('Object Repository/PhysicanSearch/1stPatNPI'), 10, FailureHandling.OPTIONAL))	
	{
		WebUI.verifyElementVisible(findTestObject('Object Repository/PhysicanSearch/firstName'))
		WebUI.setText(findTestObject('Object Repository/PhysicanSearch/firstName'), physicianFirstName)
		WebUI.click(findTestObject('Object Repository/PhysicanSearch/searchButton'))
	}
	WebUI.verifyElementPresent(findTestObject('Object Repository/PhysicanSearch/1stPatNPI'), 10)
	WebUI.click(findTestObject('Object Repository/PhysicanSearch/1stPatNPI'))
	WebUI.delay(2)
	WebUI.verifyElementVisible(findTestObject('Object Repository/Order/New Order/Claim Information/orderingPhysicanNPI'))
	NPI = WebUI.getText(findTestObject('Object Repository/Order/New Order/Claim Information/orderingPhysicanNPI'))
	WebUI.verifyNotEqual(NPI, '')
}
WebUI.delay(5)
WebUI.scrollToElement(findTestObject('Object Repository/Order/New Order/Claim Information/placeofService'), 5)
if(companyName.equals("HSSTRAIN"))
{
	WebUI.setText(findTestObject('Object Repository/Order/New Order/Claim Information/placeofService'), placeofService)
	WebUI.sendKeys(findTestObject('Object Repository/Order/New Order/Claim Information/placeofService'), Keys.chord(Keys.ENTER))
	WebUI.switchToWindowTitle("Place Of Service")
	WebUI.verifyElementVisible(findTestObject('Object Repository/Order/New Order/Claim Information/placeofServices_items'))
	WebUI.click(findTestObject('Object Repository/Order/New Order/Claim Information/placeofServices_items'))
	WebUI.switchToWindowIndex(0)
	WebUI.switchToWindowUrl("https://medsqa.bonafide.com/meds/index.jsp")
	WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
	WebUI.delay(5)
}

WebUI.scrollToElement(findTestObject('Object Repository/Order/New Order/Claim Information/claimInformation'), 5, FailureHandling.OPTIONAL)
WebUI.verifyElementClickable(findTestObject('Object Repository/Order/New Order/nextButton'))
WebUI.click(findTestObject('Object Repository/Order/New Order/nextButton'), FailureHandling.OPTIONAL)
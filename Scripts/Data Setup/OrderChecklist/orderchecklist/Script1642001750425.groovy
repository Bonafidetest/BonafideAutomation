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

/* Click on Order Checklist */
WebUI.switchToDefaultContent()
WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.click(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/orderChecklist/orderChecklist'))
WebUI.click(findTestObject('Object Repository/Data Setup/orderChecklist/orderChecklist'))
WebUI.delay(5)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

/*************************Add Order Checklist***********************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/orderChecklist/newList'))
WebUI.setText(findTestObject('Object Repository/Data Setup/orderChecklist/newList'), checklistItem)
WebUI.sendKeys(findTestObject('Object Repository/Data Setup/orderChecklist/newList'), Keys.chord(Keys.ENTER))
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/orderChecklist/timing'), 10)
//WebUI.selectOptionByIndex(findTestObject('Object Repository/Data Setup/orderChecklist/recurring'), "1")
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/orderChecklist/timing'), timming, false)
if(timming == "Billing")
//if(timming == "1")
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/orderChecklist/recurring'), recurring, false)
if(timming == "Prepare Delivery" || timming=="Confirm Delivery")
//if(timming == "2" || timming=="3")
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/orderChecklist/recurring'), "No", false)
WebUI.click(findTestObject('Object Repository/Data Setup/orderChecklist/saveButton'))
WebUI.delay(3)
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/orderChecklist/successMessage'), 10)
//WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/orderChecklist/successMessage'))

/**************************Delete Order Checklist********************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/orderChecklist/delete_icon'))
WebUI.click(findTestObject('Object Repository/Data Setup/orderChecklist/delete_icon'))
WebUI.waitForAlert(10)
WebUI.acceptAlert()


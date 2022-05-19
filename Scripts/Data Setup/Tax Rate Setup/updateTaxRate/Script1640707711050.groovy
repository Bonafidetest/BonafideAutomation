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

/* Click on Tax Rate Setup */
WebUI.switchToDefaultContent()
WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.click(findTestObject('Object Repository/dashboard/dataSetup'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TaxRateSetup/taxRateSetup'))
WebUI.click(findTestObject('Object Repository/Data Setup/TaxRateSetup/taxRateSetup'))
WebUI.delay(10)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

/*************Update By State/County/City***************/
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/TaxRateSetup/taxRateUpdate'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TaxRateSetup/taxRateUpdate'), "BY STATE / COUNTY / CITY", false)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/updfrm'), 10)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Data Setup/TaxRateSetup/updateState'), Integer.parseInt(state))
WebUI.delay(5)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Data Setup/TaxRateSetup/updateCounty'), Integer.parseInt(county))
WebUI.delay(5)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Data Setup/TaxRateSetup/updateCity'), Integer.parseInt(city))
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/stateRate'), stateRate)
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/countyRate'), countyRate)
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/cityRate'), cityRate)
float totalrate = Float.parseFloat(stateRate) + Float.parseFloat(countyRate) + Float.parseFloat(cityRate)
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/totalRateUpdate'), Float.toString(totalrate))
WebUI.click(findTestObject('Object Repository/Data Setup/TaxRateSetup/saveButton'))
WebUI.waitForAlert(10)
WebUI.acceptAlert()

/*************Search By State/County/City***************/
WebUI.switchToDefaultContent()
WebUI.delay(2)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/TaxRateSetup/taxRateInquiry'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TaxRateSetup/taxRateInquiry'), "BY STATE / COUNTY / CITY", false)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/inqifrm'), 10)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Data Setup/TaxRateSetup/searchState'), Integer.parseInt(state))
WebUI.delay(5)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Data Setup/TaxRateSetup/searchCounty'), Integer.parseInt(county))
WebUI.delay(5)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Data Setup/TaxRateSetup/searchCity'), Integer.parseInt(city))
String sRate = "(//form[@name='formTaxInq']//td[text()='State Rate:']/following-sibling::td[contains(text(),'"+stateRate+"')])"
String cRate = "(//form[@name='formTaxInq']//td[text()='County Rate:']/following-sibling::td[contains(text(),'"+countyRate+"')])"
String ctRate = "(//form[@name='formTaxInq']//td[text()='City Rate:']/following-sibling::td[contains(text(),'"+cityRate+"')])"
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : sRate]), 10)
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : cRate]), 10)
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : ctRate]), 10)

/********************Update By Zip Code*******************/
WebUI.switchToDefaultContent()
WebUI.delay(2)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/TaxRateSetup/taxRateUpdate'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TaxRateSetup/taxRateUpdate'), "BY ZIP CODE", false)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/updfrm'), 10)
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/TaxRateSetup/zipCodeFrom'), 20)
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/zipCodeFrom'), zipcodefrm)
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/zipCodeTo'), zipcodeTo)
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/zipRate'), zipRate)
WebUI.click(findTestObject('Object Repository/Data Setup/TaxRateSetup/saveButton'))
WebUI.waitForAlert(10)
WebUI.acceptAlert()

/*********************************Search By Zip Code************************/
WebUI.switchToDefaultContent()
WebUI.delay(2)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TaxRateSetup/taxRateInquiry'), "BY ZIP CODE", false)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/inqifrm'), 10)
int zcf = Integer.parseInt(zipcodefrm)
int zct = Integer.parseInt(zipcodeTo)
while(zcf<=zct)
{
	WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/searchZip'), Integer.toString(zcf))
	WebUI.click(findTestObject('Object Repository/Data Setup/TaxRateSetup/searchButton'))
	String zRate = "(//td[text()='Tax Rate']/following-sibling::td[contains(text(),'"+zipRate+"')])"
	WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : zRate]), 10)
	zcf++
	WebUI.delay(2)
}

/*************Update By State/County/City***************/
WebUI.switchToDefaultContent()
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/TaxRateSetup/rentalTaxRateSetUp'), 10)
WebUI.click(findTestObject('Object Repository/Data Setup/TaxRateSetup/rentalTaxRateSetUp'))
WebUI.delay(5)
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/TaxRateSetup/taxRateUpdate'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TaxRateSetup/taxRateUpdate'), "BY STATE / COUNTY / CITY", false)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/updfrm'), 10)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Data Setup/TaxRateSetup/updateState'), Integer.parseInt(state))
WebUI.delay(5)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Data Setup/TaxRateSetup/updateCounty'), Integer.parseInt(county))
WebUI.delay(5)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Data Setup/TaxRateSetup/updateCity'), Integer.parseInt(city))
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/stateRate'), stateRate)
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/countyRate'), countyRate)
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/cityRate'), cityRate)
totalrate = Float.parseFloat(stateRate) + Float.parseFloat(countyRate) + Float.parseFloat(cityRate)
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/totalRateUpdate'), Float.toString(totalrate))
WebUI.click(findTestObject('Object Repository/Data Setup/TaxRateSetup/saveButton'))
WebUI.waitForAlert(10)
WebUI.acceptAlert()

/*************Search By State/County/City***************/
WebUI.switchToDefaultContent()
WebUI.delay(2)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/TaxRateSetup/taxRateInquiry'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TaxRateSetup/taxRateInquiry'), "BY STATE / COUNTY / CITY", false)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/inqifrm'), 10)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Data Setup/TaxRateSetup/searchState'), Integer.parseInt(state))
WebUI.delay(5)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Data Setup/TaxRateSetup/searchCounty'), Integer.parseInt(county))
WebUI.delay(5)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Data Setup/TaxRateSetup/searchCity'), Integer.parseInt(city))
sRate = "(//form[@name='formTaxInq']//td[text()='State Rate:']/following-sibling::td[contains(text(),'"+stateRate+"')])"
cRate = "(//form[@name='formTaxInq']//td[text()='County Rate:']/following-sibling::td[contains(text(),'"+countyRate+"')])"
ctRate = "(//form[@name='formTaxInq']//td[text()='City Rate:']/following-sibling::td[contains(text(),'"+cityRate+"')])"
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : sRate]), 10)
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : cRate]), 10)
WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : ctRate]), 10)

/********************Update By Zip Code*******************/
WebUI.switchToDefaultContent()
WebUI.delay(2)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/TaxRateSetup/taxRateUpdate'), 30)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TaxRateSetup/taxRateUpdate'), "BY ZIP CODE", false)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/updfrm'), 10)
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/TaxRateSetup/zipCodeFrom'), 20)
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/zipCodeFrom'), zipcodefrm)
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/zipCodeTo'), zipcodeTo)
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/zipRate'), zipRate)
WebUI.click(findTestObject('Object Repository/Data Setup/TaxRateSetup/saveButton'))
WebUI.waitForAlert(10)
WebUI.acceptAlert()

/*********************************Search By Zip Code************************/
WebUI.switchToDefaultContent()
WebUI.delay(2)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Data Setup/TaxRateSetup/taxRateInquiry'), "BY ZIP CODE", false)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/inqifrm'), 10)
zcf = Integer.parseInt(zipcodefrm)
zct = Integer.parseInt(zipcodeTo)
while(zcf<=zct)
{
	WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/searchZip'), Integer.toString(zcf))
	WebUI.click(findTestObject('Object Repository/Data Setup/TaxRateSetup/searchButton'))
	zRate = "(//td[text()='Tax Rate']/following-sibling::td[contains(text(),'"+zipRate+"')])"
	WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : zRate]), 10)
	zcf++
	WebUI.delay(2)
}


/*********************************Special Tax Rate By District********************/
if(WebUI.verifyElementNotPresent(findTestObject('Object Repository/Data Setup/TaxRateSetup/specialTaxRateByDistrict'), 10, FailureHandling.OPTIONAL))
	{
		WebUI.switchToDefaultContent()
		WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
		WebUI.click(findTestObject('Object Repository/Data Setup/TaxRateSetup/taxRateSetupLink'))
	}
WebUI.click(findTestObject('Object Repository/Data Setup/TaxRateSetup/specialTaxRateByDistrict'))
WebUI.switchToWindowTitle("MedEQ Tax Rate Maintenance")
WebUI.verifyElementPresent(findTestObject('Object Repository/Data Setup/TaxRateSetup/districtName'), 10)
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/districtName'), district)
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/stateTax'), stateRate)
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/districtTax'), districtRate)
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/effectiveFrom'), effectiveFrom)
WebUI.setText(findTestObject('Object Repository/Data Setup/TaxRateSetup/effectiveTo'), effectiveTo)
WebUI.click(findTestObject('Object Repository/Data Setup/TaxRateSetup/saveButton'))
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TaxRateSetup/confirmButton'))
WebUI.click(findTestObject('Object Repository/Data Setup/TaxRateSetup/confirmButton'))
WebUI.waitForAlert(10)
WebUI.acceptAlert()
WebUI.switchToWindowIndex(0)
WebUI.delay(5)
//WebUI.switchToDefaultContent()
//WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
//WebUI.switchToFrame(findTestObject('Object Repository/iframe/inqifrm'), 10)
	
WebUI.switchToDefaultContent(FailureHandling.OPTIONAL)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10, FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Data Setup/TaxRateSetup/specialTaxRateByDistrict'))
WebUI.switchToWindowTitle("MedEQ Tax Rate Maintenance")
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TaxRateSetup/delete'))
WebUI.click(findTestObject('Object Repository/Data Setup/TaxRateSetup/delete'))
WebUI.waitForAlert(10)
WebUI.acceptAlert()
WebUI.verifyElementVisible(findTestObject('Object Repository/Data Setup/TaxRateSetup/confirmButton'))
WebUI.click(findTestObject('Object Repository/Data Setup/TaxRateSetup/confirmButton'))
WebUI.waitForAlert(10)
WebUI.acceptAlert()
WebUI.switchToWindowIndex(0)

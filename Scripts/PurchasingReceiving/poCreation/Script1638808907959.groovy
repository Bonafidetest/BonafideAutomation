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

import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By

/*Click on Purchase Order*/
WebUI.switchToDefaultContent()

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/PurchasingReceiving'))

WebUI.click(findTestObject('Object Repository/dashboard/PurchasingReceiving'))

WebUI.verifyElementVisible(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/purchaseOrder'))

WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/purchaseOrder'))

WebUI.delay(5)

String companyName = WebUI.getText(findTestObject('Object Repository/officeSelection/companyName'))

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

/*Purcharse Creation*/
WebUI.verifyElementVisible(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Search/createNewPO'))

WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Search/createNewPO'))

WebUI.verifyElementVisible(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/pleaseSelectOneOffice'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/pleaseSelectOneOffice'), office)

WebUI.selectOptionByIndex(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/pleaseSelectOneVendor'), vendor)

WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/nextButton'))

if(shipto.equals("Office"))
{
	WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/shipToSelectOffice'))
	WebUI.delay(10)
	WebUI.switchToWindowTitle("MedEQ Purchase Order")
	WebUI.selectOptionByIndex(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/shipToOffice'), shipToOffice)
	WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/applyButton'), FailureHandling.OPTIONAL)
	WebUI.switchToWindowIndex(0)
	WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
}
		
if(shipto.equals("Customer"))
{
	WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/shipToSelectCustomer'))
	WebUI.delay(10)
	WebUI.switchToWindowTitle("Customer Search")
	WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/customerLastName'), 20)
	WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/customerLastName'), shipToCustomer)
	WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/searchButton'))
	String xpath ="(//form[@name='frm']//div[contains(text(),'"+shipToCustomer+"')])"
	WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]), 20)
	WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))
	WebUI.acceptAlert(FailureHandling.OPTIONAL)
	WebUI.switchToWindowIndex(0)
	WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)	
}	
WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/shipViaSelect'))
WebUI.delay(10)
WebUI.switchToWindowTitle("MedEQ Purchase Order")
WebUI.selectOptionByIndex(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/shipVia'), shipVia)
WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/applyButton'), FailureHandling.OPTIONAL)
WebUI.switchToWindowIndex(0)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/termsSelect'))
WebUI.delay(10)
WebUI.switchToWindowTitle("MedEQ Purchase Order")
WebUI.selectOptionByIndex(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/terms'), terms)
WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/applyButton'), FailureHandling.OPTIONAL)
WebUI.switchToWindowIndex(0)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 5)

WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/fob'), FOB)
WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/profreight'), freight)
WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/confirmation'), confirmation)
WebUI.selectOptionByLabel(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/tax'), tax, false)

if(tax.equals("Y"))
{
	WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/taxRate'), taxRate)
}
WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/remarks'), remarks)
WebUI.selectOptionByLabel(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/specialInstruction'), specialInstruction, false)
WebUI.scrollToElement(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/nextButton'), 10)


if(companyName != "MEDSOUTHTRAIN")
{	
	GlobalVariable.poNo = WebUI.getText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/poNumber'))
	System.out.println(GlobalVariable.poNo)
	printf(GlobalVariable.poNo)
	String[] substring1 =GlobalVariable.poNo.split("#")
	if(substring1.size())
	{
		System.out.println(substring1[1])
		printf(substring1[1])
		String[] substring2 =substring1[1].split("\\)")
		System.out.println(substring2[0])
		printf(substring2[0])
		GlobalVariable.poNo = substring2[0]
		System.out.println(GlobalVariable.poNo)
	}
	else
		System.out.println("ArrayIndexOutOfBoundsException")
	
}
WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/nextButton'))
/****************************************Add Items**********************************************************/
                    /**************Request Files**************************/
WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/requestFile'), 20)
WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/requestFile'))
WebUI.delay(10)
WebUI.switchToWindowTitle("MedEQ Purchase Order")

if(WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/searchRequest'), 10))
{
	WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/searchingCriteria'))
	//WebUI.verifyElementNotPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/searchRequest'), 10)
}
WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/searchRequest'), FailureHandling.OPTIONAL)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/itemList'), 10)
WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/requestItem'), 20, FailureHandling.OPTIONAL)
WebUI.check(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/requestItem'), FailureHandling.OPTIONAL)
WebUI.switchToDefaultContent()
WebUI.scrollToElement(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/submitButton'), 10)
WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/submitButton'))
WebUI.switchToWindowIndex(0)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

                 /***********************Package************************/
WebUI.delay(2)
WebUI.verifyElementPresent(findTestObject('PurchasingReceiving/Purchase Order/Creation/packageLink'), 20)
WebUI.delay(2)
WebUI.click(findTestObject('PurchasingReceiving/Purchase Order/Creation/packageLink'))
WebUI.delay(10)
WebUI.switchToWindowTitle("MedEQ Purchase Order")
WebUI.selectOptionByIndex(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/package'), packages)
WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/confirmButton'))
WebUI.switchToWindowIndex(0)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebDriver driver = DriverFactory.getWebDriver()
String chngQty1 = "(//div/font[text()='0 EA'])";
WebUI.delay(5)
int size = driver.findElements(By.xpath(chngQty1)).size()
for(int k=size;k>0;k--)
{
	String chngQty = "(//div/font[text()='0 EA'])["+k+"]";
	
	if(WebUI.verifyElementVisible(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : chngQty]), FailureHandling.OPTIONAL))
	{
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : chngQty]))
		WebUI.switchToWindowTitle("MedEQ Purchase Order")
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/updateQty'), uqty)
		WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/save'))
		WebUI.switchToWindowIndex(0)
		WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
	}
	else
		break
		
}

/*************************Search Existing*********************/
if(make != '')
{
	WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/make'), 20)
	WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/make'), make)
	WebUI.sendKeys(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/make'), Keys.chord(Keys.ENTER))
	WebUI.delay(7)
}
if(description != '')
{
	WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/description'), 20)
	WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/description'), description)
	WebUI.sendKeys(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/description'), Keys.chord(Keys.ENTER))
	WebUI.delay(7)
}
if(catalogNo != '')
{
	WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/catalogNo'), 20)
	WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/catalogNo'), catalogNo)
	WebUI.sendKeys(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/catalogNo'), Keys.chord(Keys.ENTER))
	WebUI.delay(7)
}
if(partNo != '')
{
	WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/partNo'), 20)
	WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/partNo'), partNo)
	WebUI.sendKeys(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/partNo'), Keys.chord(Keys.ENTER))
	WebUI.delay(7)
}
if(SKU != '')
{
	WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/SKU'), 20)
	WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/SKU'), SKU)
	WebUI.sendKeys(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/SKU'), Keys.chord(Keys.ENTER))
	WebUI.delay(7)
}
if(HCPCS != '')
{
	WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/HCPCS'), 20)
	WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/HCPCS'), HCPCS)
	WebUI.sendKeys(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/HCPCS'), Keys.chord(Keys.ENTER))
	WebUI.delay(7)
}
if(partNo != '' || HCPCS != '' || SKU != '' || catalogNo != '' || description != '' || make != '')
{
	WebUI.switchToFrame(findTestObject('Object Repository/iframe/itemList'), 10)
	for(int i=0;;i++)
	{
		String items ="(//div[@id='cells"+i+"'])"
		String qty ="(//input[@name='poqty"+i+"'])"
		String cost = "(//input[@name='pounitprice"+i+"'])"
		System.out.println(items)
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : items]), 10, FailureHandling.OPTIONAL))
		{
				WebUI.check(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : items]), FailureHandling.OPTIONAL)
				WebUI.setText(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : qty]), uqty)
				WebUI.clearText(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : cost]))
				WebUI.setText(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : cost]), ucost)
		}
		else
			break
	}
	
	WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/sendSelected'), FailureHandling.OPTIONAL)
	WebUI.delay(5)
}

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

if(companyName == "MEDSOUTHTRAIN")
{
	WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/saveAndExit'), 10)
	WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/saveAndExit'))
	WebUI.waitForAlert(10)
	String successmsg = WebUI.getAlertText();
	WebUI.verifyEqual(successmsg, "Your purchase order has been saved successfully.")
	WebUI.acceptAlert()
	GlobalVariable.poNo = WebUI.getText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/poNoDetailsPage'))
	System.out.println(GlobalVariable.poNo)
	printf(GlobalVariable.poNo)
	String[] substring1 =GlobalVariable.poNo.split(":")
	if(substring1.size())
	{
		System.out.println(substring1[1])
		printf(substring1[1])
		String[] substring2 =substring1[1].split("\\)")
		System.out.println(substring2[0])
		printf(substring2[0])
		GlobalVariable.poNo = substring2[0]
		System.out.println(GlobalVariable.poNo)
	}
	else
		System.out.println("ArrayIndexOutOfBoundsException")
}
else
{
	WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/printAndMail'), 10)
	WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/printAndMail'))
	
	WebUI.waitForAlert(10)
	
	String alertText = WebUI.getAlertText()
	
	System.out.println(alertText)
	
	WebUI.acceptAlert()
}

WebUI.closeWindowTitle("MedEQ Purchase Order", FailureHandling.OPTIONAL)

WebUI.switchToWindowIndex(0)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/editLater'), 10, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/editLater'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/quickSearch'), 10)

WebUI.setText(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/quickSearch'), GlobalVariable.poNo)

WebUI.click(findTestObject('Object Repository/PurchasingReceiving/Purchase Order/Creation/quickSearchButton'))

WebUI.delay(5)

String purchaseOrder = "(//td[text()='PURCHASE ORDER']//..//td/b[contains(text(),'"+GlobalVariable.poNo+"')])";

if(WebUI.verifyElementPresent(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : purchaseOrder]), 60, FailureHandling.OPTIONAL))
	System.out.println("Purchase Order has Created Successfully")
else
	println("Purchase Order has not Created Successfully")


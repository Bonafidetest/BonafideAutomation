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
import internal.GlobalVariable
import net.bytebuddy.asm.Advice.Exit

import org.openqa.selenium.Keys as Keys
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.util.concurrent.TimeUnit as TimeUnit

/* Click on Billing */
WebUI.switchToDefaultContent()

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/activities'))

WebUI.click(findTestObject('Object Repository/dashboard/activities'))

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/billing'))

WebUI.click(findTestObject('Object Repository/dashboard/billing'))

WebUI.delay(40)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

WebUI.verifyElementPresent(findTestObject('Object Repository/Billing/orderNo'), 120)

if (orderNumber == '') {
    print('Billing Number Missing') //	orderno = orderno.split('#')
    //	System.out.println(orderno)
    //	orderno = orderno.trim()
    //	System.out.println(orderno)
    //	WebUI.verifyEqual(orderNumber, orderno, FailureHandling.OPTIONAL)
    //String xpath = "(//a/b[contains(text(),'"+orderNumber+"')])"
    //WebUI.delay(5)
    //	WebUI.click(findTestObject('Object Repository/Billing/selectAllCheckBox'), FailureHandling.OPTIONAL)
    //String xpath = "(//a/b[contains(text(),'"+orderNumber+"')])"
    //String xpath = "(//a/b[contains(text(),'"+orderNumber+"')])"
} else {
	WebUI.delay(3)
    WebUI.setText(findTestObject('Object Repository/Billing/orderNo'), orderNumber)

    WebUI.verifyElementVisible(findTestObject('Object Repository/Billing/searchButton'))

    WebUI.click(findTestObject('Object Repository/Billing/searchButton'))

    if (WebUI.verifyElementPresent(findTestObject('Object Repository/Billing/noBillableItemFund'), 60, FailureHandling.OPTIONAL))
	 {
        System.out.print('Order number not found')
		
    } else {
        boolean status = WebUI.verifyElementChecked(findTestObject('Object Repository/Billing/printInvoiceNow'), 5, FailureHandling.OPTIONAL)

        System.out.println(status)

        if (status == false) {
            WebUI.check(findTestObject('Object Repository/Billing/printInvoiceNow'))
        }
        
        String xpath = '(//a/b)[1]'

        String orderno = WebUI.getText(findTestObject('Object Repository/DynamicXpath/ReusableObject', [('DynamicReusableObject') : xpath]))

        System.out.println(orderno)

        SimpleDateFormat formatter = new SimpleDateFormat('MMddyyyy')

        Date date = new Date()

        String currentdate = formatter.format(date)

        System.out.println(currentdate)

        WebUI.setText(findTestObject('Object Repository/Billing/invoiceDate'), currentdate)

        WebUI.delay(5)

        WebUI.click(findTestObject('Object Repository/Billing/selectAllCheckBox'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Billing/processButton'))

        WebUI.delay(10)

        WebUI.click(findTestObject('Object Repository/Billing/processButton'))

        WebUI.delay(5)
		
        WebUI.acceptAlert()
		
		WebUI.acceptAlert(FailureHandling.OPTIONAL)

        WebUI.delay(15)

        WebUI.verifyElementVisible(findTestObject('Object Repository/Billing/invoice_button'))

        WebUI.verifyElementVisible(findTestObject('Object Repository/Billing/invoice_link'))

        WebUI.click(findTestObject('Object Repository/Billing/invoice_link'))
		
		WebUI.delay(5)
		
		WebUI.switchToWindowIndex(1)
		
		WebUI.delay(5)
		
		
    }
    
}


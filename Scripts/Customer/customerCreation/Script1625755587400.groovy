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

import org.codehaus.groovy.classgen.genDgmMath
import org.openqa.selenium.Keys
import org.seleniumhq.jetty9.server.HomeBaseWarning
import org.seleniumhq.jetty9.server.HomeBaseWarning as Keys

/*************************** Click on Left Hand Side Customer Maitenance *******************/
WebUI.switchToDefaultContent()
WebUI.verifyElementClickable(findTestObject('Object Repository/dashboard/customerMaintenance'))
WebUI.click(findTestObject('Object Repository/dashboard/customerMaintenance'))

/*************************** Click on Add New Patient Tab *******************/
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Search/addNewPatient'))
WebUI.click(findTestObject('Object Repository/Customer/Search/addNewPatient'))

/**************Customer Information*********************/
WebUI.verifyElementClickable(findTestObject('Object Repository/Customer/Creation/CustomerInformation/save'))


/******************************Personal Info***********************************/
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/ssn'), SSN)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/altID'), AltID)
//WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/lastName'), LastName)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/firstName'), FirstName)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/midName'), MidName)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/CustomerInformation/suffix'), Suffix, false)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Customer/Creation/CustomerInformation/cusType'), CustType, FailureHandling.OPTIONAL)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/CustomerInformation/gender'), Gender, false)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/dob'), DOB)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/CustomerInformation/status'), Status, false)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/CustomerInformation/priLang'), PriLang, false)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/email'), Email)

/**************************Contact Info********************************************************/
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/cellPhone'), CellPhone)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/homeTel'), HomeTel)
WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/CustomerInformation/cellPhoneType'), CellPhoneType, false)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/homeTel'), HomeTel)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/workTel'), WorkTel)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/workExt'), WorkExt)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/fax'), Fax)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/address'), Address)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/address2'), Address2)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/nearestXST'), NearestXSt)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/zipCode'), ZipCode)
WebUI.click(findTestObject('Object Repository/Customer/Creation/CustomerInformation/zip4'))
WebUI.delay(4)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/zip4'), Zip4)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/room'), RoomNo)

/*****************Health Info********************************/
/*WebUI.scrollToElement(findTestObject('Object Repository/Customer/Creation/CustomerInformation/heightlink'), 5)
WebUI.click(findTestObject('Object Repository/Customer/Creation/CustomerInformation/heightlink'))
WebUI.delay(2)
WebUI.switchToWindowIndex(1, FailureHandling.OPTIONAL)
WebUI.verifyElementVisible(findTestObject('Object Repository/Customer/Creation/CustomerInformation/heightcm'), FailureHandling.OPTIONAL)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/heightcm'), Height, FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Customer/Creation/CustomerInformation/heightconvert'), FailureHandling.OPTIONAL)
WebUI.switchToDefaultContent()
WebUI.delay(2)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10, FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Customer/Creation/CustomerInformation/weightlink'), FailureHandling.OPTIONAL)

WebUI.delay(2)
WebUI.switchToWindowIndex(1, FailureHandling.OPTIONAL)
WebUI.verifyElementVisible(findTestObject('Object Repository/Customer/Creation/CustomerInformation/weightkg'), FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Customer/Creation/CustomerInformation/weightkg'), FailureHandling.OPTIONAL)
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/weightkg'), Weight, FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Customer/Creation/CustomerInformation/weightconvert'), FailureHandling.OPTIONAL)
WebUI.switchToDefaultContent()
WebUI.delay(2)
WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10, FailureHandling.OPTIONAL)*/

WebUI.selectOptionByLabel(findTestObject('Object Repository/Customer/Creation/CustomerInformation/riskLvl'), RiskLVL, false, FailureHandling.OPTIONAL)
WebUI.selectOptionByIndex(findTestObject('Object Repository/Customer/Creation/CustomerInformation/formGroup'), FormGroup)

if(HIPAAFORM.equals("YES"))
	WebUI.check(findTestObject('Object Repository/Customer/Creation/CustomerInformation/hipaaFormonFile'), FailureHandling.OPTIONAL)
if(NoMailing.equals("YES"))
	WebUI.check(findTestObject('Object Repository/Customer/Creation/CustomerInformation/noMailing'), FailureHandling.OPTIONAL)
if(NoEmail.equals("YES"))
	WebUI.check(findTestObject('Object Repository/Customer/Creation/CustomerInformation/noEmail'), FailureHandling.OPTIONAL)
if(Inactive.equals("YES"))
	WebUI.check(findTestObject('Object Repository/Customer/Creation/CustomerInformation/inactive'), FailureHandling.OPTIONAL)
	
	/******************************************Advanced********************************************/
WebUI.setText(findTestObject('Object Repository/Customer/Creation/CustomerInformation/directions'), Directions)

	
	
	
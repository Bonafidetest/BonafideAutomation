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

/*******************Click on Pick Up**************************/
WebUI.switchToDefaultContent()

WebUI.verifyElementVisible(findTestObject('Object Repository/dashboard/activities'))

WebUI.click(findTestObject('Object Repository/dashboard/activities'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/a_PickupSchedule'))

WebUI.click(findTestObject('Object Repository/Pickup/a_PickupSchedule'))

WebUI.delay(5)

WebUI.switchToFrame(findTestObject('Object Repository/iframe/content2.1'), 10)

/*********************Schedule a PickUp**********************************/
WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/button_New'))

WebUI.click(findTestObject('Object Repository/Pickup/Search/button_New'))

/**************************Customer Search***************************/
if(lastName!='')
	WebUI.setText(findTestObject('Object Repository/Customer/Search/lastName'), lastName)
if(firstName!='')
	WebUI.setText(findTestObject('Object Repository/Customer/Search/firstName'), firstName)
if(customerId!='')
	WebUI.setText(findTestObject('Object Repository/Customer/Search/customerID'), customerId)
if(SSN!='')
	WebUI.setText(findTestObject('Object Repository/Customer/Search/SSN'), SSN)
if(phoneNumber!='')
	WebUI.setText(findTestObject('Object Repository/Customer/Search/phoneNo'), phoneNumber)

WebUI.click(findTestObject('Object Repository/Customer/Search/searchButton'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pickup/Schedule/table_Search_Result'), 60)

WebUI.click(findTestObject('Object Repository/Pickup/Schedule/table_Search_Result'))

/******************************Verification*******************************/

WebUI.verifyElementPresent(findTestObject('Object Repository/Pickup/Schedule/h3_Pickup'), 60)

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_PersonCalling'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_Patient'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_PickUNumber'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_ScheduleDate'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_ScheduleTime'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/a_Schedule'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_StopBillDate'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_DeceaseDate'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_Note'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_Office'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_Manifest'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_Address1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_Address2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_City'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_State'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_Zip'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_Patient'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_PersonCalling'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_ScheduleDate'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/select_ScheduleFromTime'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/select_ScheduleToTime'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_StopBillDate'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_DeceaseDate'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_Note'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/select_Office'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/select_Manifest'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_Address1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_Address2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_City'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_State'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_Zip'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/legend_SEARCH'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_SKU'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_SerialNumber'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_OrderNumber'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/td_Description'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_Sku'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_SerialNUmber'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_OrderNumber'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_Patient2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_Description'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_Search'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/u_Select'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/u_DeSelect'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/div_Sku'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/div_PatientRoomNo'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/div_Address'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/div_Type'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/div_Description'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/div_SerialNumber'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/div_OrderNumber'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/div_PickupQty'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/div_Reason'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/div_LastBillDate'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/div_Office'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/div_u_selectall'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/div_u_Deselectall'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_Delete'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/div_td_Sku'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/div_td_Description'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/div_td_Patient'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/div_td_Reason'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_CustomerNotes'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_ExitWithoutSave'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Schedule/input_Save'))

/*************************************Pick Up*****************************************/
if(WebUI.verifyElementNotVisible(findTestObject('Object Repository/Pickup/Schedule/input_pickupChkBox'), FailureHandling.OPTIONAL))
	System.out.println("Pick Up item not found")
else
	{
		
		WebUI.check(findTestObject('Object Repository/Pickup/Schedule/input_pickupChkBox'));
		WebUI.click(findTestObject('Object Repository/Pickup/Schedule/input_Save'));
		//WebUI.verifyElementVisible(findTestObject('Object Repository/Pickup/Search/u_PrintPickUpTicket'))
		WebUI.delay(25);
		String text = WebUI.getText(findTestObject('Object Repository/Pickup/Search/p_PickUpNumber'));

		// split string from space
		String[] result = text.split(" ");
	
		GlobalVariable.pickupNo= result[2].replaceAll("\\s", "");
		System.out.println(GlobalVariable.pickupNo);
		
	}


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

import java.time.LocalDate
//import java.text.SimpleDateFormat as SimpleDateFormat
//import java.util.Date as Date
//import java.util.concurrent.TimeUnit as TimeUnit
//import java.time.DateTimeFormatter
//import java.time.format
//import java.util.*
import java.time.format.DateTimeFormatter

// Obtaining current date
LocalDate currentDate = LocalDate.now()
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy")
String curDate = currentDate.format(formatter)
System.out.println("Current Date1 : " + curDate)

// Getting the next date using plusDays() method
LocalDate nextDate = currentDate.plusDays(10)

// Getting the previous date using minusDays() method
LocalDate previousDate = currentDate.minusDays(10)

// printing the input, tomorrow and yesterday's dates
System.out.println("Current Date : " + currentDate)
System.out.println("Next Date : " + nextDate.format(formatter))
System.out.println("Previous Date : " + previousDate.format(formatter))
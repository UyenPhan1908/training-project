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

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/profile.php#login')

WebUI.setText(findTestObject('Label/Demo_TC2/lbl_userName'), 'John Doe')

WebUI.setText(findTestObject('Label/Demo_TC2/lbl_passWord'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Button/Demo_TC2/btn_login'))

WebUI.click(findTestObject('DropDownList/Demo_TC2/lbl_visitDate'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('DropDownList/Demo_TC2/ddl_calendar'))

WebUI.setText(findTestObject('Text/Demo_TC2/txt_comment'), 'Make Appointment')

WebUI.verifyElementVisible(findTestObject('Button/Demo_TC2/btn_bookAppointment'))

WebUI.click(findTestObject('Button/Demo_TC2/btn_bookAppointment'))


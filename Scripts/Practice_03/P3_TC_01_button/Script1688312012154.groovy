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

'Open browser'
WebUI.openBrowser(GlobalVariable.R_URL)

'Click Dang tab'
WebUI.click(findTestObject('Object Repository/Button/P3_TC/btn_login'))

'Verify dang nhap button'
WebUI.verifyElementNotClickable(findTestObject('Object Repository/Button/P3_TC/btn_dangky'))

'Input phone number'
WebUI.setText(findTestObject('Object Repository/Text/P3_TC/txt_phonenumber'), "0987654321")

'Input mat khau'
WebUI.setText(findTestObject('Object Repository/Text/P3_TC/txt_password'), "password")

'Verify Dang Nhap button'
WebUI.verifyElementClickable(findTestObject('Object Repository/Button/P3_TC/btn_dangnhap'))

'Click Dang Nhap button'
WebUI.click(findTestObject('Object Repository/Button/P3_TC/btn_dangnhap'))

'Verify invalid message'
WebUI.verifyElementText(findTestObject('Object Repository/Label/P3_TC/lbl_messageInvalid'), "Số điện thoại/Email hoặc Mật khẩu sai!")

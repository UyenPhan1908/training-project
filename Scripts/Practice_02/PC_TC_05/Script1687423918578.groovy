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
WebUI.openBrowser(GlobalVariable.G_URL)

'Click forgot password'
WebUI.click(findTestObject('Object Repository/Link/P2_TC/lnk_forgot_password'))

'Verify Cancel button'
WebUI.verifyElementClickable(findTestObject('Object Repository/Button/P2_TC/btn_cancel'))

'Verify Reset password button'
WebUI.verifyElementClickable(findTestObject('Object Repository/Button/P2_TC/btn_reset_password'))

'Click cancel button'
WebUI.click(findTestObject('Object Repository/Button/P2_TC/btn_cancel'))

'Verify URL'
String url = WebUI.getUrl()
WebUI.verifyEqual(url, 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

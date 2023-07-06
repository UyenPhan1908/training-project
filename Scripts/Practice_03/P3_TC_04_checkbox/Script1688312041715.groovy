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

'Create list'
List listCreated = ['Anemia', 'Arthritis', 'Cancer', 'Diabetes', 'Fainting Spells', 'Ulcer Disease', 'Use a C-PAP machine', 'Emphysema']

'Open browser'
WebUI.openBrowser(GlobalVariable.X_URL)

'Scroll ve giua page'
WebUI.scrollToElement(findTestObject('Object Repository/Label/P3_TC/lbl_checkbox'), 10)

'Click vao checkbox co san trong list'
for(int i = 0; i < listCreated.size(); i++) {
	WebUI.check(findTestObject('Object Repository/Checkbox/P3_TC/chk_checkbox_created_index', [('index') : listCreated[i]]))	
}








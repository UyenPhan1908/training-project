import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

'Open browser'
WebUI.openBrowser(GlobalVariable.G_URL)

'Input username'
WebUI.setText(findTestObject('Object Repository/Text/P2_TC/txt_username'), 'Admin')

'Click Login button'
WebUI.click(findTestObject('Object Repository/Button/P2_TC/btn_login'))

'Verify required text password'
WebUI.verifyElementText(findTestObject('Object Repository/Label/P2_TC/lbl_password_required'), 'Required')

'Delete username'
WebUI.sendKeys(findTestObject('Object Repository/Text/P2_TC/txt_username'), Keys.chord(Keys.COMMAND, 'a'))
WebUI.sendKeys(findTestObject('Object Repository/Text/P2_TC/txt_username'), Keys.chord(Keys.DELETE))

'Input password'
WebUI.setText(findTestObject('Object Repository/Text/P2_TC/txt_password'), 'admin123')

'Click Login button'
WebUI.click(findTestObject('Object Repository/Button/P2_TC/btn_login'))

'Verify required text username'
WebUI.verifyElementText(findTestObject('Object Repository/Label/P2_TC/lbl_userName_required'), 'Required')
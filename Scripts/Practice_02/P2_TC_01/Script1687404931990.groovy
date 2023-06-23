import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

'Open browser'
WebUI.openBrowser(GlobalVariable.G_URL)

'maximize windows'
WebUI.maximizeWindow()

'Click Login button'
WebUI.click(findTestObject('Object Repository/Button/P2_TC/btn_login'))

'Verify required text username'
WebUI.verifyElementText(findTestObject('Object Repository/Label/P2_TC/lbl_userName_required'), 'Required')


'Verify required text password'
WebUI.verifyElementText(findTestObject('Object Repository/Label/P2_TC/lbl_password_required'), 'Required')
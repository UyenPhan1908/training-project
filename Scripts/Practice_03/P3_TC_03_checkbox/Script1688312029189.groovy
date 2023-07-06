import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

'Open browser'
WebUI.openBrowser(GlobalVariable.X_URL)

'Scroll ve giua page'
WebUI.scrollToElement(findTestObject('Object Repository/Label/P3_TC/lbl_checkbox'), 10)

'Cach 1'
//'Check all'
//List<WebElement> lstElementCheckbox = WebUI.findWebElements(findTestObject('Object Repository/Checkbox/P3_TC/ckb_checkbox'), 2)
//for(int i = 0; i < lstElementCheckbox.size(); i++) {
//	Boolean flag = lstElementCheckbox[i].isSelected()
//	if(!flag) {
//		lstElementCheckbox[i].click()
//	}
//}
//
//WebUI.delay(2)
//
//'Uncheck all'
//for(int i = 0; i < lstElementCheckbox.size(); i++) {
//	Boolean flag = lstElementCheckbox[i].isSelected()
//	if(flag) {
//		lstElementCheckbox[i].click()
//	}
//}

'Cach 2'

'Check all'
List<WebElement> lstElementCheckbox = WebUI.findWebElements(findTestObject('Object Repository/Checkbox/P3_TC/ckb_checkbox'), 2)
for(int i = 1; i <= lstElementCheckbox.size(); i++) {
	WebUI.check(findTestObject('Object Repository/Checkbox/P3_TC/chk_checkbox_index', [('index') : i]))	
}

WebUI.delay(2)

'Uncheck all'
for(int i = 1; i <= lstElementCheckbox.size(); i++) {
	WebUI.uncheck(findTestObject('Object Repository/Checkbox/P3_TC/chk_checkbox_index', [('index') : i]))
}

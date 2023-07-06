import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

'Open browser'
WebUI.openBrowser(GlobalVariable.X_URL)

'Scroll ve giua page'
WebUI.scrollToElement(findTestObject('Object Repository/Label/P3_TC/lbl_checkbox'), 10)

List<WebElement> lstElementCheckbox = WebUI.findWebElements(findTestObject('Object Repository/Checkbox/P3_TC/ckb_checkbox'), 2)

'Get all label dựa vào danh sách trên'
List<String> lstLabel = []
for(int i = 0; i < lstElementCheckbox.size(); i++){
	String itemText = lstElementCheckbox[i].getAttribute('value')
	lstLabel.add(itemText)
}

'Get random danh sach label'
List<String> randomListLabel = getRandomListString(lstLabel, 10)

for(int i = 0; i < randomListLabel.size(); i++) {
	WebUI.check(findTestObject('Object Repository/Checkbox/P3_TC/chk_checkbox_created_index', [('index') : randomListLabel[i]]))
}

public static List<String> getRandomListString(List<String> lstData, int numOfItems){
	Random rand = new Random()
	List<String> getListRandom = []
	List<String> lstTemp = []
	lstTemp.addAll(lstData)
	 
	(1..numOfItems).each{
		int index = rand.nextInt(lstTemp.size())
		getListRandom.add(lstTemp[index])
		lstTemp.remove(lstTemp[index])
	}
	 
	return getListRandom
}
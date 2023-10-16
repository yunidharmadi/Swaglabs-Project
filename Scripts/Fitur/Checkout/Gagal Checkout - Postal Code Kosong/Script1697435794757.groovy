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
import com.kms.katalon.keyword.excel.ExcelKeywords

sheet = ExcelKeywords.getExcelSheetByName(GlobalVariable.testData, "Checkout")

String firstName = ExcelKeywords.getCellValueByAddress(sheet, "A2")
String lastName = ExcelKeywords.getCellValueByAddress(sheet, "B2")

WebUI.click(findTestObject('Object Repository/Add to Cart/Button Checkout'))

WebUI.setText(findTestObject('Object Repository/Checkout/First Name'), firstName)

WebUI.setText(findTestObject('Object Repository/Checkout/Last Name'), lastName)

WebUI.setText(findTestObject('Object Repository/Checkout/Zip Code'), '')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Checkout/Button Continue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkout/h3_Error Postal Code is required'), 0)

WebUI.takeScreenshot()
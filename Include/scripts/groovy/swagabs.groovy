import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class swagLabs {

	@Given("I Open App")
	def openApp() {
		WebUI.callTestCase(findTestCase('Test Cases/Fitur/Common/Open App'),[:],FailureHandling.STOP_ON_FAILURE)
	}

	@When("I Gagal Login - username kosong")
	def loginGagal() {
		WebUI.callTestCase(findTestCase('Test Cases/Fitur/Login/Gagal Login - Username Kosong'),[:],FailureHandling.STOP_ON_FAILURE)
	}

	@When("I login success")
	def loginSuccess() {
		WebUI.callTestCase(findTestCase('Test Cases/Fitur/Login/Login Success'),[:],FailureHandling.STOP_ON_FAILURE)
	}

	@And("I choose product")
	def product() {
		WebUI.callTestCase(findTestCase('Test Cases/Fitur/Add Cart/Pilih Produk'),[:],FailureHandling.STOP_ON_FAILURE)
	}

	@And("I add to cart")
	def addToCart() {
		WebUI.callTestCase(findTestCase('Test Cases/Fitur/Add Cart/Add to Cart'),[:],FailureHandling.STOP_ON_FAILURE)
	}

	@And("I Checkout success")
	def checkout() {
		WebUI.callTestCase(findTestCase('Test Cases/Fitur/Checkout/Checkout Success'),[:],FailureHandling.STOP_ON_FAILURE)
	}

	@And("I Checkout gagal")
	def checkoutGagal() {
		WebUI.callTestCase(findTestCase('Test Cases/Fitur/Checkout/Gagal Checkout - First Name Kosong'),[:],FailureHandling.STOP_ON_FAILURE)
	}

	@Then("I logout success")
	def logout() {
		WebUI.callTestCase(findTestCase('Test Cases/Fitur/Common/Logout'),[:],FailureHandling.STOP_ON_FAILURE)
	}
}
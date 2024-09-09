import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.util.internal.PathUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver

import org.openqa.selenium.Keys as Keys

Mobile.waitForElementPresent(findTestObject('RSMerPutObj/onboardingSkip'), 10)

Mobile.tap(findTestObject('RSMerPutObj/onboardingSkip'), 0)

Mobile.waitForElementPresent(findTestObject('RSMerPutObj/emailButton'), 10)

Mobile.tap(findTestObject('RSMerPutObj/emailButton'), 10)

Mobile.waitForElementPresent(findTestObject('RSMerPutObj/emailField'), 10)

Mobile.setText(findTestObject('RSMerPutObj/emailField'), 'testingbaru@gmail.com', 0)

Mobile.pressBack()

Mobile.setText(findTestObject('RSMerPutObj/passwordField'), "12345678", 0)

Mobile.pressBack()

Mobile.tap(findTestObject('RSMerPutObj/loginButton'), 0)

Mobile.delay(2)

TestObject element = findTestObject('RSMerPutObj/welcomeLoggedIn')

String actualClass = Mobile.getAttribute(element, 'class', 10)
println("Nilai class adalah: ${actualClass}")

String actualContentDesc = Mobile.getAttribute(element, 'content-desc', 10)
println("Nilai content-desc adalah: ${actualContentDesc}")


// Only the following attributes are supported: [checkable, checked, {class,className}, 
// clickable, {content-desc,contentDescription}, enabled, focusable, focused, 
// {long-clickable,longClickable}, package, password, {resource-id,resourceId}, scrollable, selection-start, 
// selection-end, selected, {text,name}, hint, extras, bounds, displayed, contentSize]


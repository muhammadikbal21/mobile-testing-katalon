import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.util.internal.PathUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Menggunakan appPackage dan appActivity untuk memulai aplikasi
Mobile.startExistingApplication('com.telkomsel.telkomselcm')

Mobile.delay(10)

// Ambil teks dari objek
String actualWelcomeText = Mobile.getText(findTestObject('MyTselObj/loginScreen'), 10)
println("Teks yang diambil dari objek: " + actualWelcomeText)

// Lakukan assertion
String expectedWelcomeText = "Nikmati kemudahan beraktivitas dalam satu genggaman"
assert actualWelcomeText == expectedWelcomeText : "Welcome Text is incorrect. Expected: '${expectedWelcomeText}', but found: '${actualWelcomeText}'"

Mobile.delay(5)

// Menutup aplikasi
Mobile.closeApplication()
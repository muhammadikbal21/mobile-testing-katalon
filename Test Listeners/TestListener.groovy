import com.katalon.KatalonHelper
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.util.internal.PathUtil
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile


import internal.GlobalVariable

class TestListener {

	@BeforeTestCase
	def beforeTestCase() {
		// Mulai aplikasi sebelum setiap test case
		// clear data apps sebelum di buka apps nya
		String packageName = GlobalVariable.RSMerPut_AppPackage
		String adbPath = "/Users/muhammadikbal/Documents/android/platform-tools/adb"	
		String adbCommand = adbPath + " shell pm clear " + packageName
		def merputPath = PathUtil.relativeToAbsolutePath(GlobalVariable.RSMerPut_AppPath, RunConfiguration.getProjectDir())
		
		try {
			// Eksekusi perintah adb
			def process = adbCommand.execute()
			process.waitFor()
		
			// Dapatkan hasil dari perintah adb
			String output = process.text
			KeywordUtil.logInfo("Output: " + output)
		
			// Verifikasi apakah data telah dibersihkan
			if (output.contains("Success")) {
				KeywordUtil.logInfo("Data aplikasi berhasil dibersihkan.")
			} else {
				KeywordUtil.markFailed("Gagal membersihkan data aplikasi.")
			}
		} catch (Exception e) {
			// Tangani error yang terjadi selama eksekusi
			KeywordUtil.markFailedAndStop("Error saat mencoba membersihkan data aplikasi: " + e.message)
		}
		
		Mobile.startApplication(merputPath, false)
	}
	
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		KatalonHelper.updateInfo()		
	}
	
	@AfterTestCase
	def afterTestCase() {
		// Tutup aplikasi setelah setiap test case
		Mobile.closeApplication()
	}
	
	@AfterTestSuite
	def afterTestSuite() {
		
	}
	
}
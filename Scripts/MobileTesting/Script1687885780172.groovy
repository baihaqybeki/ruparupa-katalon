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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver

Mobile.startExistingApplication(GlobalVariable.APPS, FailureHandling.STOP_ON_FAILURE)

'For the first time open the application'
Mobile.verifyElementExist(findTestObject('MobileTesting/Splashscreen/android.widget.ImageView'), 15, FailureHandling.OPTIONAL)

'For the first time open the application'
Mobile.tap(findTestObject('MobileTesting/Splashscreen/android.widget.TextView - Lewati (Splashscreen)'), 15, FailureHandling.OPTIONAL)

'For the first time open the application'
Mobile.verifyElementExist(findTestObject('MobileTesting/Official Pertner/android.widget.TextView - Official Partner'), 15, 
    FailureHandling.OPTIONAL)

'For the first time open the application'
Mobile.tap(findTestObject('MobileTesting/Official Pertner/android.widget.TextView - Lewati (Official Partner)'), 15, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('MobileTesting/Home/android.widget.TextView - Tutup (Homepage)'), 15, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('MobileTesting/Home/android.widget.TextView - Rumah Tangga Text (Homepage)'), 15, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MobileTesting/Home/android.widget.TextView - Rumah Tangga Text (Homepage)'), 15, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MobileTesting/PLP - Rumah Tangga/android.widget.TextView - Lihat Semua Rumah Tangga'), 15, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Filter', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MobileTesting/PLP - Rumah Tangga/android.widget.TextView - Filter (Rumah Tangga)'), 0)

Mobile.scrollToText('Buy 1 Get 1', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MobileTesting/PLP - Rumah Tangga/android.widget.TextView - Buy 1 Get 1 (Filter)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MobileTesting/PLP - Rumah Tangga/android.widget.TextView - Terapkan (Filter)'), 0)

Mobile.tap(findTestObject('MobileTesting/PLP - Rumah Tangga/android.widget.TextView - Terapkan (Filter)'), 0)

Mobile.tap(findTestObject('MobileTesting/PLP - Rumah Tangga/android.widget.TextView - Paling Sesuai (Rumah Tangga)'), 0)

Mobile.tap(findTestObject('MobileTesting/PLP - Rumah Tangga/android.widget.TextView - Product Populer Radio Button (Urutkan)'), 
    0)

Mobile.tap(findTestObject('MobileTesting/PLP - Rumah Tangga/android.widget.TextView - Terapkan (Filter)'), 0)

Mobile.verifyElementExist(findTestObject('MobileTesting/PLP - Rumah Tangga/android.widget.TextView - Product (Rumah Tangga)'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MobileTesting/PLP - Rumah Tangga/android.widget.TextView - Product (Rumah Tangga)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('MobileTesting/PDP/android.widget.TextView - Product Title (PDP)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('MobileTesting/PDP/android.widget.TextView - Keranjang (PDP)'), 0)

Mobile.verifyElementExist(findTestObject('MobileTesting/PDP/android.widget.TextView - Keranjang Confirm (PDP)'), 0)

Mobile.tap(findTestObject('MobileTesting/PDP/android.widget.TextView - Keranjang Confirm (PDP)'), 0)

Mobile.verifyElementExist(findTestObject('MobileTesting/PDP/android.widget.TextView - Lihat Keranjang Saya (PDP)'), 0)

Mobile.tap(findTestObject('MobileTesting/PDP/android.widget.TextView - Lihat Keranjang Saya (PDP)'), 0)

Mobile.verifyElementExist(findTestObject('MobileTesting/Cart/android.widget.TextView - Keranjang Belanja Title (Cart)'), 
    0)

Mobile.verifyElementExist(findTestObject('MobileTesting/Cart/android.widget.TextView - Product Title (Cart)'), 0, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('MobileTesting/Cart/android.widget.TextView - Price (Cart)'), 0, FailureHandling.OPTIONAL)

Mobile.verifyElementExist(findTestObject('MobileTesting/Cart/android.widget.TextView - Buy 1 Get 1 (Cart)'), 0)

Mobile.tap(findTestObject('MobileTesting/Cart/android.widget.TextView - Lanjut ke Pembayaran (Cart)'), 0)

Mobile.verifyElementExist(findTestObject('MobileTesting/Login/android.widget.TextView - Login (Login)'), 0)

Mobile.verifyElementExist(findTestObject('MobileTesting/Login/android.widget.TextView - Daftar (Login)'), 0)

Mobile.setText(findTestObject('MobileTesting/Login/android.widget.EditText - Email atau No handphone (Login)'), GlobalVariable.RandomEmail, 
    0)

Mobile.setEncryptedText(findTestObject('MobileTesting/Login/android.widget.EditText - Kata sandi (Login)'), GlobalVariable.RandomPassword, 
    0)

Mobile.tap(findTestObject('MobileTesting/Login/android.widget.TextView - Masuk (Login)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('MobileTesting/Login/android.widget.TextView - Informasi tidak valid (Login)'), 
    0)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()

driver.terminateApp('com.mobileappruparupa')


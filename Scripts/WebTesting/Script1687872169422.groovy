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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('WebTesting/Page_Homepage/logo_homepage'), 45)

WebUI.waitForElementClickable(findTestObject('WebTesting/Page_Homepage/button_x'), 45, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('WebTesting/Page_Homepage/button_x'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('WebTesting/Page_Homepage/div_Rumah Tangga'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('WebTesting/Page_List Product/div_Rumah Tangga'), 45)

height = WebUI.getPageHeight()

boolean isButtonExist = WebUI.verifyElementPresent(findTestObject('WebTesting/Page_List Product/button_Buy 1 Get 1'), 2, 
    FailureHandling.OPTIONAL)

while (isButtonExist == false) {
    WebUI.scrollToPosition(0, height)

    isButtonExist = WebUI.verifyElementPresent(findTestObject('WebTesting/Page_List Product/button_Buy 1 Get 1'), 2, FailureHandling.OPTIONAL)
}

WebUI.click(findTestObject('WebTesting/Page_List Product/button_Buy 1 Get 1'))

WebUI.scrollToPosition(0, 0)

boolean isFilterExist = WebUI.verifyElementPresent(findTestObject('WebTesting/Page_List Product/button_Paling Sesuai'), 
    2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('WebTesting/Page_List Product/button_Paling Sesuai'))

WebUI.click(findTestObject('WebTesting/Page_List Product/li_Produk Terbaru'))

WebUI.verifyElementPresent(findTestObject('WebTesting/Page_List Product/div_product'), 0)

WebUI.click(findTestObject('WebTesting/Page_List Product/div_product'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('WebTesting/Page_Detail Product/div_Product Title'), 45)

WebUI.click(findTestObject('WebTesting/Page_Detail Product/button_Keranjang'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('WebTesting/Page_Detail Product/p_Berhasil Ditambahkan ke Keranjang'), 45)

WebUI.click(findTestObject('WebTesting/Page_Detail Product/button_Lihat Keranjang Saya'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('WebTesting/Page_Cart/a_Arthome Tanaman Artifisial Succulent Mix In Shaw Pot B'), 
    45)

WebUI.verifyElementPresent(findTestObject('WebTesting/Page_Cart/div_Buy 1 Get 1'), 45)

WebUI.verifyElementPresent(findTestObject('WebTesting/Page_Cart/td_Total belanja'), 45)

WebUI.verifyElementPresent(findTestObject('WebTesting/Page_Cart/td_Total pesanan'), 45)

WebUI.click(findTestObject('WebTesting/Page_Cart/button_Lanjutkan ke Pembayaran'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('WebTesting/Page_login/div_MasukDaftar'), 45)

WebUI.verifyElementPresent(findTestObject('WebTesting/Page_login/div_Masuk'), 45)

WebUI.verifyElementPresent(findTestObject('WebTesting/Page_login/div_Daftar'), 45)

WebUI.setText(findTestObject('WebTesting/Page_login/input_Daftar_email'), GlobalVariable.RandomEmail)

WebUI.setEncryptedText(findTestObject('WebTesting/Page_login/input_Daftar_password'), GlobalVariable.RandomPassword)

WebUI.click(findTestObject('WebTesting/Page_login/button_Masuk'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('WebTesting/Page_login/div_Informasi tidak valid'), 45)

WebUI.delay(2)

WebUI.closeBrowser()


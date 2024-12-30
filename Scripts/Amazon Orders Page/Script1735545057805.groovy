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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0')

WebUI.setText(findTestObject('Object Repository/Orders_Page/Page_Amazon Sign In/input_Email or mobile phone number_email'), 
    'ashutoshvats487@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Orders_Page/Page_Amazon Sign In/input_Forgot password_password'), 
    '+CMXDG9wRUnB3qFuPk8QCw==')

WebUI.click(findTestObject('Object Repository/Orders_Page/Page_Amazon Sign In/input_Enter your password_signInSubmit'))

WebUI.rightClick(findTestObject('Object Repository/Orders_Page/Page_Your Amazon.in/span_Account  Lists_nav-icon nav-arrow'))

WebUI.click(findTestObject('Object Repository/Orders_Page/Page_Your Amazon.in/div_Who is shopping Select a profile.Manage_028876'))

WebUI.mouseOver(findTestObject('Object Repository/Orders_Page/Page_Your Amazon.in/span_Account  Lists'))

WebUI.click(findTestObject('Object Repository/Orders_Page/Page_Your Amazon.in/span_Your Orders'))

WebUI.verifyTextPresent('Your Orders', false)

WebUI.mouseOver(findTestObject('Object Repository/Orders_Page/Page_Your Orders/span_Account  Lists'))

WebUI.click(findTestObject('Object Repository/Orders_Page/Page_Your Orders/span_Sign Out'))

WebUI.closeBrowser()


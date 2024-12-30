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

WebUI.setText(findTestObject('Object Repository/Categories/Page_Amazon Sign In/input_Email or mobile phone number_email'), 
    'ashutoshvats487@gmail.com')

WebUI.click(findTestObject('Object Repository/Categories/Page_Amazon Sign In/input_Wrong or Invalid email address or mob_77ed40'))

WebUI.setEncryptedText(findTestObject('Object Repository/Categories/Page_Amazon Sign In/input_Forgot password_password'), 
    '+CMXDG9wRUnB3qFuPk8QCw==')

WebUI.click(findTestObject('Object Repository/Categories/Page_Amazon Sign In/input_Enter your password_signInSubmit'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Your Amazon.in/a_All'))

WebUI.click(findTestObject('Object Repository/Categories/Page_Your Amazon.in/i_See all_nav-sprite hmenu-arrow-more'))

WebUI.verifyElementText(findTestObject('Object Repository/Categories/Page_Your Amazon.in/div_Mobiles, Computers'), 'Mobiles, Computers')

WebUI.verifyElementText(findTestObject('Object Repository/Categories/Page_Your Amazon.in/div_TV, Appliances, Electronics'), 
    'TV, Appliances, Electronics')

WebUI.verifyElementText(findTestObject('Object Repository/Categories/Page_Your Amazon.in/div_Mens Fashion'), 'Men\'s Fashion')

WebUI.verifyElementText(findTestObject('Object Repository/Categories/Page_Your Amazon.in/div_Womens Fashion'), 'Women\'s Fashion')

WebUI.verifyElementText(findTestObject('Object Repository/Categories/Page_Your Amazon.in/div_Home, Kitchen, Pets'), 'Home, Kitchen, Pets')

WebUI.verifyElementText(findTestObject('Object Repository/Categories/Page_Your Amazon.in/div_Beauty, Health, Grocery'), 
    'Beauty, Health, Grocery')

WebUI.verifyElementText(findTestObject('Object Repository/Categories/Page_Your Amazon.in/div_Sports, Fitness, Bags, Luggage'), 
    'Sports, Fitness, Bags, Luggage')

WebUI.verifyElementText(findTestObject('Object Repository/Categories/Page_Your Amazon.in/div_Toys, Baby Products, Kids Fashion'), 
    'Toys, Baby Products, Kids\' Fashion')

WebUI.verifyElementText(findTestObject('Object Repository/Categories/Page_Your Amazon.in/div_Car, Motorbike, Industrial'), 
    'Car, Motorbike, Industrial')

WebUI.verifyElementText(findTestObject('Object Repository/Categories/Page_Your Amazon.in/div_Books'), 'Books')

WebUI.verifyElementText(findTestObject('Object Repository/Categories/Page_Your Amazon.in/div_Movies, Music  Video Games'), 
    'Movies, Music & Video Games')

WebUI.closeBrowser()


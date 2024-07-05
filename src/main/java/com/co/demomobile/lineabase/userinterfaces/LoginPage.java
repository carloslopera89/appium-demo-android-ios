package com.co.demomobile.lineabase.userinterfaces;


import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public final static Target USERNAME = Target.the("the username field")
            .locatedForAndroid(AppiumBy.accessibilityId("test-Usuario"))
            .locatedForIOS(AppiumBy.accessibilityId("test-Username"));

    public final static Target PASSWORD = Target.the("the password field")
            .locatedForAndroid(AppiumBy.accessibilityId("test-Contraseña"))
            .locatedForIOS(AppiumBy.accessibilityId("test-Password"));

    public final static Target BUTTON_LOGIN = Target.the("the login button")
            .located(AppiumBy.accessibilityId("test-LOGIN"));

    public final static Target LBL_PRODUCTS = Target.the("Title Products")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.TextView[@text='PRODUCTOS']"))
            .locatedForIOS(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"PRODUCTS\"`]"));
}

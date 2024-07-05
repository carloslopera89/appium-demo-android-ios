package com.co.demomobile.lineabase.tasks;

import com.co.demomobile.lineabase.models.User;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import static com.co.demomobile.lineabase.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Authenticate implements Task {
    private User user;

    public Authenticate(User user) {
        this.user = user;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = getProxiedDriver();

        AndroidDriver driverAndroid = (AndroidDriver) driver;

        String usuario = user.getUsername();
        actor.attemptsTo(
                WaitUntil.the(USERNAME,isEnabled()).forNoMoreThan(5).seconds(),
                Click.on(USERNAME),
                Enter.theValue(usuario).into(USERNAME),
                Enter.theValue(user.getPassword()).into(PASSWORD),
                Click.on(BUTTON_LOGIN)
        );
        /*driverAndroid.pressKey(new KeyEvent()
                .withKey(AndroidKey.DIGIT_0));

        driverAndroid.pressKey(KeyEvent());
        driverAndroid.longPressKey(KeyEvent);

        driverAndroid.pressKey(new KeyEvent()
                .withKey(AndroidKey.DIGIT_0));

        driverAndroid.pressKey(new KeyEvent(AndroidKey.NUMPAD_1))

         */

    }

    public static Authenticate the(User user){
        return instrumented(Authenticate.class, user);
    }
}

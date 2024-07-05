package com.co.demomobile.lineabase.stepdefinitions;

import com.co.demomobile.lineabase.exceptions.LoginIsNotCompleteException;
import com.co.demomobile.lineabase.questions.LoginSwaglabs;
import com.co.demomobile.lineabase.tasks.Authenticate;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.co.demomobile.lineabase.exceptions.LoginIsNotCompleteException.LOGIN_FAIL_MESSAGE_EXCEPTION;
import static com.co.demomobile.lineabase.models.builder.UserBuilder.user;
import static com.co.demomobile.lineabase.userinterfaces.LoginPage.LBL_PRODUCTS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AuthenticationStepDefinitions {

    @Dado("inicio la aplicación demo")
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("ingreso con usuario {string} y contraseña {string}")
    public void iLoginInTheApplication(String username, String password) {
        theActorCalled("demoMobile").attemptsTo(Authenticate.the(user(username).withPassword(password)));
    }

    @Entonces("debería ver el home de la aplicación demo")
    public void youShouldSeeTheHome() {
        theActorInTheSpotlight().should(seeThat(
                LoginSwaglabs.isSuccesfully())
                .orComplainWith(LoginIsNotCompleteException.class, LOGIN_FAIL_MESSAGE_EXCEPTION)
        );
    }

    @Entonces("debería validar con Ensure y ver el home de la aplicación demo")
    public void youShouldSeeTheHomeWithValidationEnsure() {
        withCurrentActor(Ensure.that(LBL_PRODUCTS).isDisplayed());
    }
}

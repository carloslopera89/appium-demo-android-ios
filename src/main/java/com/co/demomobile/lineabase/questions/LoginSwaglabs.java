package com.co.demomobile.lineabase.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.demomobile.lineabase.userinterfaces.LoginPage.LBL_PRODUCTS;

public class LoginSwaglabs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_PRODUCTS.resolveFor(actor).isVisible();
    }

    public static LoginSwaglabs isSuccesfully(){
        return new LoginSwaglabs();
    }
}
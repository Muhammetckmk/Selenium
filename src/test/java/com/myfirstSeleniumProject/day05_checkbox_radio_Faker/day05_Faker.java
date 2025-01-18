package com.myfirstSeleniumProject.day05_checkbox_radio;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class day05_Faker {

    @Test
    public void javaFaker(){

        Faker faker= new Faker();
        System.out.println(faker.gameOfThrones().dragon());
        System.out.println(faker.book().title());
        System.out.println(faker.address().city());
        System.out.println(faker.animal().name());
        System.out.println(faker.color().name());
        System.out.println(faker.internet().password());
        System.out.println(faker.pokemon().name());
        System.out.println(faker.gameOfThrones().character());

    }
}

package com.example.spotifymusicsystem.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

public class MainControllerTest {

    @Test
    public void testMain() {
        MainController mainController = new MainController();

        String res = mainController.index();

        Assertions.assertEquals( "Hello World", res);
    }

    @Test
    public void test_Incorrect_Index() {
        MainController mainController = new MainController();

        String res = mainController.index();

        Assertions.assertNotEquals("Hello Fucking World", res);
    }
}

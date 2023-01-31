package com.example.demo.test.junit;

import com.example.demo.controller.AppController;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class TestCoverage {


        @Test
        public void testSomma() {

            int value = 0;
            AppController controller= new AppController();
            value=controller.somma(1,2);
            assertEquals(3, value);

        }
        @Test
        public void testSomma2() {

            int value = 0;
            AppController controller= new AppController();
            value=controller.somma(1,-2);
            assertEquals(0, value);

        }
    @Test
    public void testSomma3() {


        int value = 0;
        AppController controller= new AppController();
        value=controller.somma(-1,2);
        assertEquals(0, value);

    }

    @Test
    public void testSottrazione1() {

        int value = 0;
        AppController controller= new AppController();
        value=controller.sottrazione(1,2);
        assertEquals(-1, value);

    }
    @Test
    public void testSottrazione2() {

        int value = 0;
        AppController controller= new AppController();
        value=controller.sottrazione(1,-2);
        assertEquals(0, value);

    }
    @Test
    public void testSottrazione3() {

        int value = 0;
        AppController controller= new AppController();
        value=controller.sottrazione(-1,2);
        assertEquals(0, value);

    }

}

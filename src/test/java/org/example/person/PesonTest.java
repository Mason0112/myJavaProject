package org.example.person;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PesonTest {

    @Test
    public  void   bmiTest(){

        Person person = new Person(1.75f, 60f);
        Assertions.assertEquals(60f/(1.75f*1.75f),person.bmi());
    }

}

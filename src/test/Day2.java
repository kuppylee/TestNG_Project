package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

    @BeforeTest
    public void firstExecution(){
        System.out.println("i will execute first");
    }

    @Test
    public void firstTest(){
        System.out.println("good");
    }


}

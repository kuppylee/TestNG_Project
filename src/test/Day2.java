package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

    @AfterSuite
    public void goLast(){
        System.out.println("i will go last");
    }

    @BeforeTest
    public void firstExecution(){
        System.out.println("i will execute first");
    }

    @Test(groups = {"smoke"})
    public void firstTest(){
        System.out.println("good");
    }


}

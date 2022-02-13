package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1Test {
    @AfterTest
    public void lastExecution(){
        System.out.println(" i will execute last ");
    }

    @Test
    public static void demo(){
        System.out.println("hello");
    }

    @Test
    public static void secondTest(){
        System.out.println("Bye");
    }


}

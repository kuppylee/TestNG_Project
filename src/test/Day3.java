package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {

    @Test(groups = {"smoke"})
    public void webLoginCarLoan(){
        // selenium
        System.out.println("web login car ");
    }

    @Test
    public void mobileLoginCarLoan(){
        // Appium code
        System.out.println("mobile login car ");

    }
    @BeforeSuite
    public void suiteCheck(){
        System.out.println("i am the number 1 ");
    }
    @Test
    public void mobileSignInCarLoan(){
        // Appium code
        System.out.println("mobile login car ");

    }
    @Test
    public void mobileCheckCarLoan(){
        // Appium code
        System.out.println("mobile login car ");

    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("it will be executing before every method in Day 3");
    }
    @Test
    public void mobileConfirmCarLoan(){
        // Appium code
        System.out.println("mobile login car ");

    }

    @Test
    public void loginAPICarLoan(){
        // Rest API automation
        System.out.println("login API car ");
    }

}

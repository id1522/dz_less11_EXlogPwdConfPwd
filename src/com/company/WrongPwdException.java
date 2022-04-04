package com.company;

public class WrongPwdException extends Exception {

    WrongPwdException()
    {
        System.out.println("password not correct :");
    }
}

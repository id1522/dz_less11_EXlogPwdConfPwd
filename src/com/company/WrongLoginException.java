package com.company;

public class WrongLoginException extends Exception{
    WrongLoginException()
    {
        System.out.println("login not correct :");
    }
}

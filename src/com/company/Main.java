package com.company;


import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        final String login = "tiger";
        final String password = "scott";
        final String confirmPassword;


        Scanner sc = new Scanner(System.in);
        String log = "vide", pwd = "vide", confPwd = "vide";


        try {
            System.out.println("enter  login : ");
            log = sc.nextLine();
            if (log.length() > 20) throw new WrongInputLength();
            if (!log.equals(login)) throw new WrongLoginException();

            System.out.println("enter  password : ");
            pwd = sc.nextLine();
            if (pwd.length() > 20) throw new WrongInputLength();
            if (!pwd.equals(password)) throw new WrongPwdException();

            System.out.println("confirm password: ");
            confPwd = sc.nextLine();
            if (confPwd.length() > 20) throw new WrongInputLength();
            if (!confPwd.equals(password)) throw new WrongPwdException();

        } catch (WrongPwdException | WrongInputLength e) {

        } catch (WrongLoginException e) {
            e.printStackTrace();
        }
    }
}










package com.htp.validation;

import com.htp.validation.entity.ExceptionSexEnum;
import com.htp.validation.entity.User;
import com.htp.validation.exception.LoginToUpperCaseException;
import com.htp.validation.exception.NotEighteenException;

import java.util.ArrayList;
import java.util.List;

public class Validator {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Andrey", "Anarey98", "1231234", 18, ExceptionSexEnum.MEN));
        users.add(new User("GFKVBS", "GFKVBS", "1231232", 16, ExceptionSexEnum.EXCEPTION));
        users.add(new User("Anna", "Anna", "1231231", 16, ExceptionSexEnum.WOMAN));
        loginValid(users);
        System.out.println("=========================================================================================");
        ageValid(users);
    }

    private static void loginValid(List<User> users) {
        for (User user : users) {
            if (user.getLogin().toUpperCase().compareTo(user.getLogin()) == 0) {
                try {
                    throw new LoginToUpperCaseException(user.toString() + " Логин написан в Upper Case");
                } catch (LoginToUpperCaseException e) {
                    System.out.println(e);
                }
            } else {
                System.out.println(user.toString());
            }
        }
    }

    private static void ageValid(List<User> users) {
        for (User user : users) {
            if (user.getAge() < 18) {
                try {
                    throw new NotEighteenException(user.toString() + " Этому нету 18");
                } catch (NotEighteenException e) {
                    System.out.println(e);
                }
            } else {
                System.out.println(user.toString());
            }
        }
    }


}

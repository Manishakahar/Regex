package com.blz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeRegex {
    public static void main(String[] args) {
        System.out.println("Welcome to Regex Program");
        String pinCode = "400088";
        String regex = "^[0-9]{6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pinCode);
        if (matcher.matches()){
            System.out.println("Pin code is valid");
        }
        else {
            System.out.println("Enter the valid Pin code");
        }

    }

}


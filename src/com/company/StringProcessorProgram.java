package com.company;

/*
Trang Hoang
CS110B - Assignement 5B
 */

import java.util.Scanner;
import java.util.Arrays;


public class StringProcessorProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
//	    System.in.println("Enter a line of text: ");
//        String str = input.nextLine();
        String str1 = "One for the money, two for the show";
        String str2 = "3 Blind Mice is one of my favorite songs.";

        // Temporary test string (to delete)

        String test = str2;

        StringProcessor testStr = new StringProcessor(test);

        // The number of words
        System.out.println("words: " + testStr.wordCount());

        // The number of uppercase letters
        System.out.println("uppercase: " + testStr.uppercaseCount());

        // The number of digit characters

//        count = 0;
//        count1 = count2 = 0;

//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isDigit(str.charAt(i))) {
//                count++;
//            }
//        }
//
//        for (int i = 0; i < str1.length(); i++) {
//            if (Character.isDigit(str1.charAt(i))) {
//                count1++;
//            }
//        }
//
//        for (int i = 0; i < str2.length(); i++) {
//            if (Character.isDigit(str2.charAt(i))) {
//                count2++;
//            }
//        }
//
//        //        System.out.println("digits: " + count);
//        System.out.println("digits: " + count1);
//        System.out.println("digits: " + count2);

        // The number of words that are English words representing the ten digits

        //        count = 0;
//        count1 = count2 = 0;
//
//        String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//
//        int index;

//        str = str.toLowerCase();
//        str1 = str1.toLowerCase();
//        str2 = str2.toLowerCase();

//        for (String digit: digits) {
//            for (String s: token) {
//                if (digit.equalsIgnoreCase(s)) {
//                    count++;
//                }
//            }
////            index = str1.indexOf(digit);
////            System.out.println(digit + ": " + index);
////
////            while (index != -1) {
////                index = str1.indexOf(digit, index + 1);
////                System.out.println(index);
////                count1++;
////            }
//        }

//        for (String digit: digits) {
//            for (String s: token1) {
//                if (digit.equalsIgnoreCase(s)) {
//                    count1++;
//                }
//            }
//            index = str1.indexOf(digit);
//            System.out.println(digit + ": " + index);
//
//            while (index != -1) {
//                index = str1.indexOf(digit, index + 1);
//                System.out.println(index);
//                count1++;
//            }
//        }
//
//        for (String digit: digits) {
//            for (String s: token2) {
//                if (digit.equalsIgnoreCase(s)) {
//                    count2++;
//                }
//            }
//            index = str2.indexOf(digit);
//            System.out.println(digit + ": " + index);
//
//            while (index != -1) {
//                index = str2.indexOf(digit, index + 1);
//                System.out.println(index);
//                count2++;
//            }
//        }

//        System.out.println("digit words: " + count);
//        System.out.println("digit words: " + count1);
//        System.out.println("digit words: " + count2);


        // The line with all spaces removed

//        StringBuilder newstr = new StringBuilder(str);
        StringBuilder newstr1 = new StringBuilder(str1);
        StringBuilder newstr2 = new StringBuilder(str2);

//        index = newstr.indexOf(" ");
//
//        while (index != -1) {
//            newstr1.replace(index, index + 1, "");
//            index = newstr.indexOf(" ");
//        }

//        index = newstr1.indexOf(" ");
//
//        while (index != -1) {
//            newstr1.replace(index, index + 1, "");
//            index = newstr1.indexOf(" ");
//        }
//
//        index = newstr2.indexOf(" ");
//
//        while (index != -1) {
//            newstr2.replace(index, index + 1, "");
//            index = newstr2.indexOf(" ");
//        }
//
//        System.out.println("line with whitespace removed: \"" + newstr1 + "\"");
//        System.out.println("line with whitespace removed: \"" + newstr2 + "\"");


        // The line with all vowels replaced by the dash character '-'



        //
//
//        for (String s: token1) {
//            System.out.println(s);
//        }
//
//        for (String s: token2) {
//            System.out.println(s);
//        }


    }
}

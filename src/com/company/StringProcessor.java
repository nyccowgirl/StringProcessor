package com.company;

/*
Trang Hoang
CS110B - Assignment 5B
 */

import java.util.Arrays;

public class StringProcessor {
    private String str;


    /**
     * Default constructor
     */

    public StringProcessor() {
        str = "";
    }


    /**
     * Constructor with one argument
     * @param s String object
     */

    public StringProcessor(String s) {
        str = s;
    }


    /**
     * Sets string to data member
     * @param s String object
     */

    public void setString(String s) {
        str = s;
    }


    /**
     * Gets data member str
     * @return str data member
     */

    public String getString() {
        return str;
    }


    /**
     * Counts number of words
     * @return integer with number of words in string
     */

    public int wordCount() {
        String[] token = str.split("(, |,| )");
        return token.length;
    }


    /**
     * Counts number of uppercase letters
     * @return integer with number of uppercase letters
     */

    public int uppercaseCount() {
        int count = 0;

        for (char c: str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }

        return count;
    }


    /**
     * Counts number of digit characters
     * @return integer with number of digits
     */

    public int digitCount() {
        int count = 0;

        for (char c: str.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }

        return count;
    }


    /**
     * Counts number of words representing digits 1 - 9
     * @return integer with number of digit words
     */

    public int digitWordCount() {
        int count = 0;
        String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] token = str.split("(, |,| )");

        for (String digit: digits) {
            for (String s: token) {
                if (digit.equalsIgnoreCase(s)) {
                    count++;
                }
            }
        }

        return count;
    }


    /**
     * Modifies string to remove white spaces
     * @return modified string
     */

    public String getNoSpaceString() {
        String newStr;

        newStr = str.replace(" ", "");
        return newStr;
    }


    /**
     * Modifies string to replace vowels with '-'
     * @return modified string
     */

    public String getNoVowelString() {
        char[] vowels = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
        String newStr = str;

        for (char c: vowels) {
            newStr = newStr.replace(c, '-');
        }

        return newStr;
    }


    /**
     * Modifies string to replace words with digits 1-9 with the digit characters
     * @return modified string
     */

    public String getNoDigitWordString() {
        int index;
        String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuilder newStr = new StringBuilder(str);
        StringBuilder temp = new StringBuilder(str.toLowerCase());

        for (String digit: digits) {
            index = temp.indexOf(digit);

            while (index != -1) {

                if ((index == 0 && !(Character.isLetter(temp.charAt(index + digit.length())))) || ((index + digit.length()) == (temp.length())) ||
                        (!(Character.isLetter(temp.charAt(index - 1))) && (!(Character.isLetter(temp.charAt(index + digit.length())))))) {
                    temp = temp.replace(index, index + digit.length(), String.valueOf(Arrays.asList(digits).indexOf(digit)));
                    newStr = newStr.replace(index, index + digit.length(), String.valueOf(Arrays.asList(digits).indexOf(digit)));
                }

                index = temp.indexOf(digit, index + 1);
            }
        }

        return newStr.toString();
    }
}

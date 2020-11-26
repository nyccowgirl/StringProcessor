package com.company;

/*
Trang Hoang
CS110B - Assignment 5B
 */

import java.util.Scanner;

public class StringProcessorProgram {

    public static void main(String[] args) {
        String playAgain;
        Scanner input = new Scanner(System.in);

        do {

            // Get user input
            System.out.print("Enter a line of text: ");
            String str = input.nextLine();

            // Test strings
//            String str1 = "One for the money, two for the show";
//            String str2 = "3 Blind Mice is one of my favorite songs.";
//            String str3 = "Counting sheep from one, two, to three";

            StringProcessor testStr = new StringProcessor(str);

            // The number of words
            System.out.println("words: " + testStr.wordCount());

            // The number of uppercase letters
            System.out.println("uppercase: " + testStr.uppercaseCount());

            // The number of digit characters
            System.out.println("digits: " + testStr.digitCount());

            // The number of words that are English words representing the ten digits
            System.out.println("digit words: " + testStr.digitWordCount());

            // The line with all spaces removed
            System.out.println("line with whitespace removed: \"" + testStr.getNoSpaceString() + "\"");

            // The line with all vowels replaced by the dash character '-'
            System.out.println("line with vowels replaced: \"" + testStr.getNoVowelString() + "\"");

            // The line with all English words for digits replaced by digit characters
            System.out.println("line with digit words replaced: \"" + testStr.getNoDigitWordString() + "\"");

            // Ask user if he/she would like to enter another
            System.out.print("do you want to enter another? ");
            playAgain = input.nextLine();

        } while (playAgain.equalsIgnoreCase("y"));
    }
}

/*
Enter a line of text: One for the money, two for thw show
words: 8
uppercase: 1
digits: 0
digit words: 2
line with whitespace removed: "Oneforthemoney,twoforthwshow"
line with vowels replaced: "On- f-r th- m-n-y, tw- f-r thw sh-w"
line with digit words replaced: "1 for the money, 2 for thw show"
do you want to enter another? Y
Enter a line of text: 3 Blind Mice is one of my favorite songs.
words: 9
uppercase: 2
digits: 1
digit words: 1
line with whitespace removed: "3BlindMiceisoneofmyfavoritesongs."
line with vowels replaced: "3 Bl-nd M-c- -s -n- -f my f-v-r-t- s-ngs."
line with digit words replaced: "3 Blind Mice is 1 of my favorite songs."
do you want to enter another? y
Enter a line of text: Counting sheep from one, two, to three
words: 7
uppercase: 1
digits: 0
digit words: 3
line with whitespace removed: "Countingsheepfromone,two,tothree"
line with vowels replaced: "C--nt-ng sh--p fr-m -n-, tw-, t- thr--"
line with digit words replaced: "Counting sheep from 1, 2, to 3"
do you want to enter another? n
 */

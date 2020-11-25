package com.company;

public class StringProcessor {
    private String str;

    public StringProcessor() {
        str = "";
    }

    public StringProcessor(String s) {
        str = s;
    }

    public void setString(String s) {
        str = s;
    }

    public String getString() {
        return str;
    }

    public int wordCount() {
        String[] token = str.split("(, |,| )");
        return token.length;
    }

    public int uppercaseCount() {
        int count = 0;

//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isUpperCase(str.charAt(i))) {
//                count++;
//            }
//        }

        for (char c: str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }

        return count;
    }
}

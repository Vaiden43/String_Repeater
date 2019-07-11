package com.vaiden;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Here I am making two scanners one for the word and the next for the number of times
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);


        System.out.println("Please enter a word");
        String userInput = scanner1.next();
        System.out.println("Please enter a number of times");
        int numberOfTimes = scanner2.nextInt();

        //here I will invoke the repeating method
        System.out.println(repeating(userInput, numberOfTimes));
    }

    private static String repeating(String userInput, int numberOfTimes){
        String result = "";

        //here I will run for per number requested and add to the result string the word provided each time
        for (int i = 0; i < numberOfTimes; i++){
            result = result + userInput;
        }
        return result;
    }
}
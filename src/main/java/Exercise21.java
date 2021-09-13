/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */
import java.util.Scanner;
public class Exercise21 {
    public static void main(String[] args){

        int monthNumber;
        String monthName;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter the number of the month:");
        monthNumber = scnr.nextInt();

        switch(monthNumber){

            case 1:
                monthName = "January";
                break;

            case 2:
                monthName = "February";
                break;

            case 3:
                monthName = "March";
                break;

            case 4:
                monthName = "April";
                break;

            case 5:
                monthName = "May";
                break;

            case 6:
                monthName = "June";
                break;

            case 7:
                monthName = "July";
                break;

            case 8:
                monthName = "August";
                break;

            case 9:
                monthName = "September";
                break;

            case 10:
                monthName = "October";
                break;

            case 11:
                monthName = "November";
                break;

            case 12:
                monthName = "December";
                break;

            default:
                monthName = "INVALID";
                break;
        }

        System.out.println("The name of the month is " + monthName + ".");

        System.exit(0);
    }//end of main

}//end of program


package number_names;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Karen
 */
public class App {

    public static void main(String[] args) {
        Scanner kbrd = new Scanner(System.in);
        boolean exit = false;
        String numString = "";
        while (exit == false) {
            System.out.println("Input a number: ");
            try {
                //get input from box, set to var 'num'
                numString = kbrd.nextLine();

                int num = Integer.parseInt(numString);
                String numName = "";

                int numSize = numString.length();
                //loop to go through each number
                for (int i = 0; i < numSize; i++) {
                    //gets current number
                    String currNum = numString.substring(i, i + 1);
                    String currNumName = "";
                    //check for number 11 to 19 
                    if ((numSize > 1) && (i == 0|| i==3)) {
                        currNum = numString.substring(i, i + 2);
                        int intNum = Integer.parseInt(currNum);
                        if (intNum > 9 && intNum < 20) {
                            switch (intNum) {
                                case 10:
                                    currNumName = "ten";
                                    break;

                                case 11:
                                    currNumName = "eleven";
                                    break;

                                case 12:
                                    currNumName = "twelve";
                                    break;

                                case 13:
                                    currNumName = "thirteen";
                                    break;

                                case 14:
                                    currNumName = "fourteen";
                                    break;

                                case 15:
                                    currNumName = "fifteen";
                                    break;

                                case 16:
                                    currNumName = "sixteen";
                                    break;

                                case 17:
                                    currNumName = "seventeen";
                                    break;

                                case 18:
                                    currNumName = "eighteen";
                                    break;

                                case 19:
                                    currNumName = "nineteen";
                                    break;
                            }
                        } else {
                            switch (intNum) {
                                case 20:
                                    currNumName = "twenty";
                                    break;

                                case 30:
                                    currNumName = "thirty";
                                    break;

                                case 40:
                                    currNumName = "fourty";
                                    break;

                                case 50:
                                    currNumName = "fifty";
                                    break;

                                case 60:
                                    currNumName = "sixty";
                                    break;

                                case 70:
                                    currNumName = "seventy";
                                    break;

                                case 80:
                                    currNumName = "eighty";
                                    break;

                                case 90:
                                    currNumName = "ninty";
                                    break;
                            }
                        }
                    } else {
                        switch (currNum) {
                            case "0":
                                if (numSize == 1) {
                                    currNumName = "zero";
                                }
                                break;
                            case "1":
                                currNumName = "one";
                                break;
                            case "2":
                                currNumName = "two";
                                break;
                            case "3":
                                currNumName = "three";
                                break;
                            case "4":
                                currNumName = "four";
                                break;
                            case "5":
                                currNumName = "five";
                                break;
                            case "6":
                                currNumName = "six";
                                break;
                            case "7":
                                currNumName = "seven";
                                break;
                            case "8":
                                currNumName = "eigth";
                                break;
                            case "9":
                                currNumName = "nine";
                                break;
                        }
                        System.out.println("i = " + i + " size= " + numSize);
                        //checking position to add "and" in right place
                        if (i == numSize - 1 && numSize > 1 && !currNum.equals("0")) {
                            numName = numName + " and ";
                        }
                        //adding current number name to String
                        numName = numName + " " + currNumName;

                        //checking postion and length to choose correct defintion for number
                        String words = "";

                        //if positioned divided by 3 gives 0 then add hundred
                        if ((numSize % 4 == 0) && (i % 4 == 0)) {
                            words = "thousand";
                        } //else if ((numSize % 6 == 0) && (i % 6 == 0)) {
                        //  words = "hundred thousand";
                        //} 
                        else if ((numSize % 3 == 0) && (i % 3 == 0)) {
                            words = "hundred";
                        }
//                        if(i%4==0){
//                            numName = numName + " thousand";
//                        }
                        numName = numName + " " + words;
                    }

                }

                System.out.println(numName);
            } catch (NumberFormatException NFex) {
                if (numString.equals("end")) {
                    System.out.println("Goodbye");
                    exit = true;
                } else {
                    //if input is not a number
                    System.out.println("Numbers only");
                    System.out.println("");
                }
            }
        }
    }
}

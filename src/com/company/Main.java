package com.company;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        String string = scanner.next();
        //System.out.println(string);
        int len=string.length();
       // System.out.println(len);

       // System.out.println(num);
        System.out.println(deriveSequence(string));

        }
        static String deriveSequence(String number){
            StringBuilder result= new StringBuilder();

            char repeat= number.charAt(0);
            number= number.substring(1) + " ";
            int times= 1;

            for(char actual: number.toCharArray()){
                if(actual != repeat){
                    result.append(repeat + "" + times);
                    times= 1;
                    repeat= actual;
                }else{
                    times+= 1;
                }
            }
            return result.toString();
            }

    static void deriveSequence(String string){
        char compare=

        for(i=0;i<len;i++){
            int num= Character.getNumericValue(string.charAt(i));
            int count=0;
            for(j=i;j<len;j++){
                if(num==Character.getNumericValue(string.charAt(j)))
                    count++;
                else
                    break;
            }

            System.out.print(Character.getNumericValue(string.charAt(i))+Integer.toString(count));
        }
    }

    }



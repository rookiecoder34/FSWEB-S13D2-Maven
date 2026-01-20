package org.example;
import java.lang.Math;
import java.util.ArrayList;

public class Main {
    public static boolean isPalindrome(int i) {
        int absoluteNum = Math.abs(i);
        int original=absoluteNum;
        int reversed = 0;

        while (absoluteNum != 0) {
            int digit = absoluteNum % 10;
            reversed = reversed * 10+digit;
            absoluteNum /= 10;
        }

        return original==reversed;
    }

    public static boolean isPerfectNumber(int i){

        if (i<0) {
            return false;
        }
            ArrayList<Integer> divisors = new ArrayList<>();
            int sum = 0;
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    divisors.add(j);
                    sum += j;
                }
            }


            return sum==i;
        }



    public static void main (String[]args){
            System.out.println("Hello world!");
            System.out.println(isPalindrome(-121));
            System.out.println(isPerfectNumber(2));
        }
    }

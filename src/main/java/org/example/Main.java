package org.example;

import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {



        System.out.println(numberToWords(53));
    }

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number = Math.abs(number);
        }
        int num = number;
        int reversed = 0;

        while (num > 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;

        }
        reversed = Math.abs(reversed);


        return reversed == number;


    }


    public static boolean isPerfectNumber(int number) {

        if (number < 0) {
            return false;
        }
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        return total == number;


    }

    public static String numberToWords(int number){
        String cikti;
        if(number <0){
            cikti = "Invalid Value";
            return cikti;
        }
        String sayi = String.valueOf(number);
        String[] yazi = new String[sayi.length()];
        int[] sayiDizisi = new int[sayi.length()];
        for(int i = 0; i < sayi.length(); i++) {
            sayiDizisi[i] = sayi.charAt(i) - '0';
        }
        for(int k = 0; k<sayiDizisi.length; k++){
            switch (sayiDizisi[k]){
                case 0:
                    yazi[k] = "Zero";
                    break;
                case 1:
                    yazi[k] = "One";
                    break;
                case 2:
                    yazi[k] = "Two";
                    break;
                case 3:
                    yazi[k] = "Three";
                    break;
                case 4:
                    yazi[k] = "Four";
                    break;
                case 5:
                    yazi[k] = "Five";
                    break;
                case 6:
                    yazi[k] = "Six";
                    break;
                case 7:
                    yazi[k] = "Seven";
                    break;
                case 8:
                    yazi[k] = "Eight";
                    break;
                case 9:
                    yazi[k] = "Nine";
                    break;
            }
        }
        cikti = String.join(" ", yazi);
        return cikti;
    }

        }













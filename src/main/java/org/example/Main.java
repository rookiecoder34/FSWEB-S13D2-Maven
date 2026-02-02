package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPalindrome(int number) {

        if(number<0){
            number=Math.abs(number);
        }
        int num= number;
        int reversed=0;

        while (num>0){

            int digit=num%10;
            reversed=reversed*10+digit;
            num=num/10;

        }
        reversed=Math.abs(reversed);
        System.out.println(reversed);
        System.out.println(number);
        if(number==reversed){
            return true;
        }else {
            return false;
        }

    }


    public static boolean isPerfectNumber(int number) {

        if(number<0){
            return false;
        }
        int total=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                total+=i;
            }
        }
        return total==number;





    }
}
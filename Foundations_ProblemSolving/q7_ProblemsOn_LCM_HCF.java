package Foundations_ProblemSolving;

import java.util.*;

public class q7_ProblemsOn_LCM_HCF {


    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();


    public static void main(String[] args){

        // 1.
        // int result = calculateGCF(getInt("Enter number 1 : "), getInt("Enter number 2 : "));
        // System.out.println(result);

        // 2.
        // int result = getLCM_twoNum(getInt("Enter number 1 : "), getInt("Enter number 2 : "));
        // System.out.println(result);

        // 3.
        // int result = calculateHCF_threeNumbers(getInt("Enter number 1 : "), getInt("Enter number 2 : "), getInt("Enter number 3 : "));
        // System.out.println(result);

        // 4.
        // int result = getLCM_threeNum(getInt("Enter number 1 : "), getInt("Enter number 2 : "), getInt("Enter number 3 : "));
        // System.out.println(result);

        // 5.
        printFibonacciInRange(getInt("Enter number 1 : "), getInt("Enter number 2 : "));


    }

    // printMessage
    public static void printMessage(String message){
        System.out.print(message);
    }

    // getInt
    public static int getInt(String message){
        printMessage(message);
        int temp = sc.nextInt();
        return temp;
    }

    // getLongInt
    public static long getLongInt(String message){
        printMessage(message);
        long temp = sc.nextLong();
        return temp;
    }
   
    // 1.
    // method 1
    public static int calculateHCF_twoNumbers(int num1, int num2){

        int min = 0;
        int hcf = 1;
        if(num1<num2){
            min = num1;
        }
        else{
            min=num2;
        }

        for (int i = 2; i <= min; i++) {
            if(num1%i==0 && num2%i==0){
                hcf = i;
            }
        }
        return hcf;
    }
    // method 2
    public static int calculateGCF(int a, int b) {
        // Ensure both numbers are positive
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // 2.
    public static int getLCM_twoNum(int num1, int num2){

        int lcm = (num1*num2)/calculateGCF(num1, num2);
        return lcm;

    }

    // 3.
    public static int calculateHCF_threeNumbers(int num1,  int num2, int num3){

        int gcd = 1;
        int minNUm = num1;
        if(num2<num1 && num2<num3){
            minNUm = num2;
        }
        else if(num3<num1 && num3<num2){
            minNUm = num3;
        }
        for (int i = 2; i<=minNUm; i++){
            if(num1%i==0 && num2%i==0 && num3%i==0){
                gcd = i;
            }
        }
        return gcd;
    }

    // 4.
    public static int getLCM_threeNum(int num1, int num2, int num3){

        int lcm = (num1*num2*num3)/calculateHCF_threeNumbers(num1, num2, num3);
        return lcm;

    }

    // 5.
    public static void printFibonacci(int n){

        int pp = 0;
        int p = 1;
        int c = 0;
        for (int i = 1; i<=n; i++){
            System.out.print(pp+ " ");
            c = pp+p;
            pp = p;
            p=c;
        }
    }
    // fibonacci in range
    public static void printFibonacciInRange(int m, int n){

        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm = 0;
        while(firstTerm<=n){
            if (firstTerm>=m) {
                System.out.println(firstTerm+" ");
            }
            nextTerm = firstTerm+secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
    
}
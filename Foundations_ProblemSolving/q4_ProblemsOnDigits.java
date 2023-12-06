package Foundations_ProblemSolving;

import java.io.ObjectInputStream.GetField;
import java.util.*;


public class q4_ProblemsOnDigits {

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {
        // 1.
        // countNum_Digits(getInt("Enter digit : "));

        // 2.
        // checkLength_evenOdd(getInt("Enter digit : "));

        // 3.
        sumDigits(getInt("Enter digit : "));

        // 4.
        // sumOdd_positionDigits(getInt("Enter digit : "));

        // 5.
        // sumEven_positionDigits(getInt("Enter digit : "));
        
        // 6.
        // countEvenDigits(getInt("Enter digit : "));

        // 7.
        // countoddDigits(getInt("Enter digit : "));

        // 8.
        // sumoddDigits(getInt("Enter digit : "));
        
        // 9.
        // sumEvenDigits(getInt("Enter digit : "));

        // 10.
        // getLastDigit(getInt("Enter digit : "));

        // 11.
        // getFirstDigit(getInt("Enter digit : "));

        // 12.
        // isFirstLast_digitequal(getInt("Enter digit : "));

        // 13.
        // getDigits_maxValue(getInt("Enter digit : "));

        // 14.
        // int result = getDigitLoc_maxValue(getInt("Enter digit : "));
        // System.out.println(result);

        // 15.
        // getDigits_minValue(getInt("Enter digit : "));

        // 16.
        // int result = getDigitLoc_minValue(getInt("Enter digit : "));
        // System.out.println(result);

        // 17.
        // reverseInteger(getInt("Enter digit : "));

        // 18.
        // getDigitalroot(getInt("Enter digit : "));

        // 19.
        // boolean result = isAllDigitN_dividesN(getInt("Enter digit : "));
        // System.out.println(result);

        // 20.
        // int result = countNdigits_dividesK(getInt("Enter digit for n : "), getInt("Enter digit for k : "));
        // System.out.println(result);

        // 21.
        // boolean result = isPalindrome_3digit(getInt("Enter digit : "));
        // System.out.println(result);

        // 22.
        // boolean result = isPalindrome_longInt(getLongInt("Enter digit : "));
        // System.out.println(result);

        // 23.
        // int result = formMaxNum_usingDigits(getInt("Enter digit : "));
        // System.out.println(result);

        // 24.
        // int result = formMinNum_usingDigits(getInt("Enter digit : "));
        // System.out.println(result);

















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
    public static int countNum_Digits(int n){

        int count = 0;
        while(n>0) {        // for manipulating single input, "while loop" is the best choice, but also we can use "for loop "without iteration increament like this ==>(for (int i = 0; i <n;))
            n=n/10;
            count++;
        }
        System.out.println(count);
        return count;
    }
    
    // 2.
    public static int checkLength_evenOdd(int n){

        int count = 0;
        while(n>0) {        // for manipulating single input, "while loop" is the best choice, but also we can use "for loop "without iteration increament like this ==>(for (int i = 0; i <n;))
            n=n/10;
            count++;
        }
        if(count%2==0){
            System.out.println("Entered digit is even length. \n count is : "+count);
        }
        else{
            System.out.println("Entered digit is odd length. \n count is : "+count);
        }
        return count;
    }

    // 3.
    public static int sumDigits(int n){

        // int count = 0;
        int sum = 0;
        int reaminder = 0;
        while(n>0) {        // for manipulating single input, "while loop" is the best choice, but also we can use "for loop "without iteration increament like this ==>(for (int i = 0; i <n;))
            reaminder = n%10;
            sum +=reaminder;
            n=n/10;
        }
        System.out.println(sum);
        return sum;
    }

    // 4.
    public static int sumOdd_positionDigits(int n){
        int count = 0;
        int eSum = 0;
        int remainder = 0;
        while (n>0) {
            count++;
            remainder = n%10;
            if(count%2!=0){
                eSum+=remainder;
            }
            n=n/10;
            
        }
        System.out.println("Sum of odd digit is : "+eSum);
        return eSum;
    }

    // 5.
    public static int sumEven_positionDigits(int n){
        int count = 0;
        int oSum = 0;
        int remainder = 0;
        while (n>0) {
            count++;
            remainder = n%10;
            if(count%2==0){
                oSum+=remainder;
            }
            n=n/10;
        }
        System.out.println("Sum of even digit is : "+oSum);
        return oSum;
    }

    // 6.
    public static int countEvenDigits(int n){

        int count = 0;
        int remainder = 0;
        while (n>0) {
            remainder=n%10;
            if(remainder%2==0){
                count++;
            }
            n=n/10;
        }
        System.out.println("The count of even digit is : "+count);
        return count;
    }

    // 7.
    public static int countoddDigits(int n){

        int count = 0;
        int remainder = 0;
        while (n>0) {
            remainder=n%10;
            if(remainder%2!=0){
                count++;
            }
            n=n/10;
        }
        System.out.println("The count of odd digit is : "+count);
        return count;
    }

    // 8.
    public static int sumoddDigits(int n){

        int oSum = 0;
        int remainder = 0;
        while (n>0) {
            remainder=n%10;
            if(remainder%2!=0){
                oSum += remainder;
            }
            n=n/10;
        }
        System.out.println("The sum of odd digit is : "+oSum);
        return oSum;
    }

    // 9.
    public static int sumEvenDigits(int n){

        int eSum = 0;
        int remainder = 0;
        while (n>0) {
            remainder=n%10;
            if(remainder%2==0){
                eSum += remainder;
            }
            n=n/10;
        }
        System.out.println("The sum of even digit is : "+eSum);
        return eSum;
    }

    // 10.
    public static void getLastDigit(int n){

        int remainder = 0;
        // while (n>0) {
            remainder=n%10;
            System.out.println("The last digit of the integer is : "+remainder);
        //     break;
        // }
    }

    // 11.
    public static void getFirstDigit(int n){

        while (n>=10) {
            n=n/10;
        }
        System.out.println("The first digit of the integer is : "+n);
    }

    // 12.
    public static void isFirstLast_digitequal(int n){
        int reaminder = n%10;
        while (n>=10) {
            n=n/10;
        }
        if (n==reaminder) {
            System.out.println("First and Last digits are same. \nFirst Digit : Last Digit ======> "+n+" = = "+reaminder);
        } else {
            System.out.println("First and Last digits are not same");
        }
    }

    // 13.
    public static void getDigits_maxValue(int n){

        int max = 0;
        while (n>0) {
            int remainder = n%10;
            if(remainder>max)
            {
                max=remainder;
            }
            n=n/10;
        }
        System.out.println("The maximum value of the digit is : "+max);
    }

    // 14.
    public static int getDigitLoc_maxValue(int n){
        int remainder = 0;
        int max = 0;
        int count = 1;
        int placeValue = 0;
        while (n>0) {
            remainder = n%10;
            if (remainder>max) {    
                max = remainder;
                placeValue = count;
            }
            n = n/10;
            count *= 10; 
        }
        
        return placeValue;
    }

    // 15.
    public static void getDigits_minValue(int n){
        int min = 9;
        while (n>0) {
            int remainder = n%10;
            if (remainder<min) {
                min = remainder;
            }
            n=n/10;
        }
        System.out.println("The minimum value of the digit is : "+min);
    }

    // 16.
    public static int getDigitLoc_minValue(int n){
        int remainder = 0;
        int min = 9;
        int count = 1;
        int placeValue = 0;
        while (n>0) {
            remainder = n%10;
            if (remainder<min) {    
                min = remainder;
                placeValue = count;
            }
            n = n/10;
            count *= 10; 
        }
        
        return placeValue;
    }

    // 17.
    public static void reverseInteger(int n){

        int remainder = 0;
        int reverese = 0;
        while (n>0) {
            remainder = n%10;
            reverese = reverese*10+remainder;
            n=n/10;
            
        }
        System.out.println(reverese);
        
    }

    // 18.
    public static void getDigitalroot(int n){
        int sum = 0;
        int reaminder = 0;
        while (n>0) {
            while (n>0) {
                reaminder = n%10;
                sum +=reaminder;
                n=n/10;
            }
            if (sum>=10) {
                n=sum;
                sum=0;
            }
        }
        System.out.println(sum);
    }

    // 19.
    public static boolean isAllDigitN_dividesN(int n){
        int reaminder = 0;
        int copyn = n;
        int noDivideCount = 0;
        while (copyn>0) {
            reaminder =copyn%10;
            if(n%reaminder==0){
                System.out.println(n + " % " + reaminder + " == 0 ");
            }
            else{
                System.out.println(n + " % " + reaminder + " != 0 ");
                noDivideCount++;
            }
            copyn=copyn/10;
        }
        if(noDivideCount==0){
            // System.out.println("Yes the digits of the given integer n divides n");
            return true;
        }
        else{
            // System.out.println("No the digits of the given integer n divides n");
            return false;
        }
    }

    // 20.
    public static int countNdigits_dividesK(int n, int k){
        int remainder = 0;
        int divideCount = 0;
        while (n>0) {
            remainder = n%10;
            if (remainder%k==0) {
                divideCount++;
            }
            n=n/10;
        }
        return divideCount;
    }

    // 21.
    public static boolean isPalindrome_3digit(int n){

        int reaminder = 0;
        int reverese = 0;
        int copyN = n;
        while (copyN>0) {
            reaminder = copyN%10;
            reverese = reverese*10 + reaminder;
            copyN=copyN/10;
        }
        return n==reverese;         // we can also return boolean values like this, it will automatically detect the true or false
    }

    // 22.
    public static boolean isPalindrome_longInt(Long n){

        long reaminder = 0;
        long reverese = 0;
        long copyN = n;
        while (copyN>0) {
            reaminder = copyN%10;
            reverese = reverese*10 + reaminder;
            copyN=copyN/10;
        }
        return n==reverese;         // we can also return boolean values like this, it will automatically detect the true or false
    }

    // 23.
    public static int formMaxNum_usingDigits(int n){

        int remainder = 0;
        int reverse = 0;
        
        for (int i = 9; i>=0; i--)
        {
            int num = n;
            while (num>0)
            {
                remainder = num%10;            
                if (remainder==i)
                {
                    reverse = reverse*10+remainder;
                }
                num=num/10;
            }
        }
        return reverse;
        
    }

    // 24.
    public static int formMinNum_usingDigits(int n){

        int remainder = 0;
        int reverse = 0;
        
        for (int i = 0; i<=9; i++)
        {
            int num = n;
            while (num>0)
            {
                remainder = num%10;            
                if (remainder==i)
                {
                    reverse = reverse*10+remainder;
                }
                num=num/10;
            }
        }
        return reverse;
        
    }

}
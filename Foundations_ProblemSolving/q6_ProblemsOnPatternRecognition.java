package Foundations_ProblemSolving;

import java.util.*;

public class q6_ProblemsOnPatternRecognition {
    

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args){

        // 1.
        // boolean result = isn_power4(getInt("Enter the number for n : "));
        // System.out.println(result);

        // 2.
        // boolean result = isn_powerk(getInt("Enter the number for n : "), getInt("Enter the number for k : "));
        // System.out.println(result);

        // 3.
        // boolean result = isArmstrongNum(getInt("Enter number for n : "));
        // System.out.println(result);
        
        // 4.
        // armstrongNum_xtoy(getInt("Enter the number for x : "), getInt("Enter the number for y : "));

        // 5.
        int result1 = getPerfectsquare(getInt("Enter number for n : "));
        System.out.println(result1);

        // boolean result = isPerfectSquare_n(getInt("Enter number for n : "));
        // System.out.println(result);

        // 6.
        // int result = sumPerfectSquares_n(getInt("Enter number for n : "));
        // System.out.println(result);

        // 7.
        // int result = nextPerfectSquare_n(getInt("Enter number for n : "));
        // System.out.println(result);

        // 8.
        // int result = previousPerfectSquare_n(getInt("Enter number for n : "));
        // System.out.println(result);

        // 9.
        // int result = nearestPerfectSquare_n(getInt("Enter number for n : "));
        // System.out.println(result);

        // 10.
        // int result = nearestArmstrongNum_n(getInt("Enter number for n : "));
        // System.out.println(result);

        // 11.
        // int result = nextArmstrongNum_n(getInt("Enter number for n : "));
        // System.out.println(result);

        // 12.
        // int result = nextPalindromeNum_n(getInt("Enter number for n : "));
        // System.out.println(result);

        // 13.
        // int result = previousPalindromeNum_n(getInt("Enter number for n : "));
        // System.out.println(result);

        // 14.
        // int result = nearestPalindromeNum_n(getInt("Enter number for n : "));
        // System.out.println(result);

        // 15.
        // int result = kthPerfectSquare_n(getInt("Enter number for n : "), getInt("Enter number for k : "));
        // System.out.println(result);


        // 18.
        // nDigit_armstrongNum(getInt("Enter number for n : "));







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
    public static boolean isn_power4(int n){

        while(n%4==0){
            n/=4;
        }
        return n==1;
    }

    // 2.
    public static boolean isn_powerk(int n, int k){

        while(n%k==0){
            n/=k;
        }
        return n==1;
    }
    
    // 3.
                // getPower
    public static int getPower_n(int n, int power){
        int copyn = n;
        int count = 1;
        while(count<power){
            copyn = copyn*n;
            count++;
        }
        return copyn;
    }
    public static boolean isArmstrongNum(int n){

        int reaminder = 0;
        int digitCount = 0;
        int copyn = n;
        while (copyn!=0) {
            reaminder = copyn%10;
            digitCount++;
            copyn=copyn/10;
        }
        int digitPower = 0;
        int ans = 0;
        int copyn2 = n;
        while (copyn2!=0) {
            reaminder = copyn2%10;
            digitPower = getPower_n(reaminder, digitCount);
            ans += digitPower;
            copyn2=copyn2/10;
        }
        return ans==n;
    }

    // 4.
    public static void armstrongNum_xtoy(int x, int y){

        for(int i=x; i<=y; i++){
            if (isArmstrongNum(i)) {
                System.out.println(i);;
            }
        }
    }

    // 5.
                // getPerfectSquare
    public static int getPerfectsquare(int n){

        int result = 0;
        for(int i = 1; i<=n; i++){
            if(n/i==i ){
                result = i;
                break;
            }
        }
        return result;
    }
    
    public static boolean isPerfectSquare_n(int n){

        for (int i=1; i<=n; i++){       // for this question, we can use Math.sqrt() function, that is more efficient
            if(n/i==i && n%i==0){
                return true;
            }
        }
        return false;
    }

    // 6.
    public static int sumPerfectSquares_upton(int n){

        int sum = 0;
        for(int i=1; i<n; i++){
            if(isPerfectSquare_n(i)){
                sum +=i;
            }
        }
        return sum;
    }

    // 7.
    public static int nextPerfectSquare_n(int n){

        while(true){
            n++;
            if (isPerfectSquare_n(n)) {
                return n;
            }
        }
    }

    // 8.
    public static int previousPerfectSquare_n(int n){

        while(true){
            n--;
            if (isPerfectSquare_n(n)) {
                return n;
            }
        }
    }

    // 9.
    public static int nearestNumber_n(int m, int n, int o){

        int result = 0;
        int diff1 = Math.abs(n-o);
        int diff2 = Math.abs(m-n);

        if(diff1==diff2){
            result = o;
        }
        else if(diff1<diff2){
            result = o;
        }
        else if(diff2<diff1){
            result = m;
        }
        return result;
    }

    public static int nearestPerfectSquare_n(int n){

        // int result = 0;
        // int diff1 =Math.abs(n - nextPerfectSquare_n(n));
        // int diff2 = Math.abs(previousPerfectSquare_n(n) - n);
        
        // if(diff1==diff2){       // if nearest number is equal, take next number by default
        //     result = nextPerfectSquare_n(n);
        // }
        // else if(diff1<diff2){
        //     result = nextPerfectSquare_n(n);
        // }
        // else if(diff2<diff1){
        //     result = previousPerfectSquare_n(n);
        // }
        // return result;

        int result = nearestNumber_n(previousPerfectSquare_n(n), n, nextPerfectSquare_n(n));            // here i am using nearstNumber_n() function, which i was written above
        return result;
    }

    // 10.
    public static int nearestArmstrongNum_n(int n){

        int result = 0;
        int diff1 = Math.abs(n - nextArmstrongNum_n(n));
        int diff2 = Math.abs(previousArmstrongNum_n(n) - n);

        if(diff1==diff2){       // if nearest number is equal, take next number by default
            result = nearestArmstrongNum_n(n);
        }
        if(diff1<diff2){
            result =  nextArmstrongNum_n(n);
        }
        else if (diff2<diff1){
            result = previousArmstrongNum_n(n);
        }
        return result;
    }

    // 11.
    public static int nextArmstrongNum_n(int n){

        while (true) {
            n++;
            if (isArmstrongNum(n)) {
                return n;
            }
        }
    }
    public static int previousArmstrongNum_n(int n){

        while (true) {
            n--;
            if (isArmstrongNum(n)) {
                return n;
            }
        }
    }

    // 12.
                    // isPalindrome
    public static boolean isPalindrome(int n){

        int copyn = n;
        int reaminder = 0;
        int reverese = 0;
        while (copyn!=0) {
            reaminder = copyn%10;
            reverese = reverese*10+reaminder;
            copyn /= 10;
        }
        return n==reverese;
    }
    public static int nextPalindromeNum_n(int n){

        while (true) {
            n++;
            if (isPalindrome(n)) {
                return n;
            }
        }
    }

    // 13.
    public static int previousPalindromeNum_n(int n){

        while (true) {
            n--;
            if (isPalindrome(n)) {
                return n;
            }
        }
    }

    // 14.
    public static int nearestPalindromeNum_n(int n){

        int result = 0;
        int diff1 = Math.abs(n - nextPalindromeNum_n(n));
        int diff2 = Math.abs(previousPalindromeNum_n(n) - n);

        if (diff1==diff2) {         // if nearest number is equal, take next number by default
            result = nextPalindromeNum_n(n);
        }
        else if(diff1<diff2){
            result =  nextPalindromeNum_n(n);
        }
        else if (diff2<diff1){
            result = previousPalindromeNum_n(n);
        }
        return result;
    }

    // 15.
    public static int kthPerfectSquare_n(int n, int k){

        int count = 1;
        while(count<=k){
            n++;
            if(isPerfectSquare_n(n)){
                count++;
            }
        }
        return n;
    }


    // 18.
    public static void nDigit_armstrongNum(int n){
        
        int count = 1;
        int digitCount = 1;
        while (count<n) {
            if(n<=1){
                digitCount=1;
            }
            else{
                digitCount *= 10;
            }

            count++;
        }
        int endCount = 0;
        if(true){
            endCount = digitCount*10-1;
            // System.out.println(endCount);
        }
        for(int i = digitCount; i<endCount; i++){
            if(isArmstrongNum(i)){
                System.out.println(i);
            }
        }
    }
    
}
package Foundations_ProblemSolving;

import java.util.*;

public class q5_ProblemsOnPrimeNumbers {


    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    
    public static void main(String[] args){

        // 1.
        // int result = factorsN(getInt("Enter the number : "));
        // System.out.println(result);

        // 2.
        boolean result = isPrime(getInt("Enter the number : "));
        System.out.println(result);

        // 3.
        // int result = primenum_1ton(getInt("Enter the number : "));
        // System.out.println("Value of n is :  : "+result);

        // 4.
        // int result = first_nPrimeNo(getInt("Enter the number : "));
        // System.out.println("Value of n is :  : "+result);

        // 5.
        // int result = numPrimmeNum_n(getInt("Enter the number : "));
        // System.out.println("Value of n is :  : "+result);

        // 6.
        // int result = sum_firstN_primeNo(getInt("Enter the number : "));
        // System.out.println("Value of n is :  : "+result);

        // 7.
        // int result = sumPrimeNum_n(getInt("Enter the number : "));
        // System.out.println("Value of n is :  : "+result);

        // 8.
        // primeNum_mton(getInt("Enter the number for m : "), getInt("Enter the number for n : "));

        // 9.
        // primeFactors_n(getInt("Enter the number for n : "));

        // 10.
        // numPrimeNum_mton(getInt("Enter the number for m : "), getInt("Enter the number for n : "));

        // 11.
        // PrimeNum_mton(getInt("Enter the number for m (Assume m is greater than n) : "), getInt("Enter the number for n : "));

        // 12.
        // int result = primeNum(getInt("Enter the number for m : "), getInt("Enter the number for n : "));
        // System.out.println("Count of prime number is :  : "+result);

        // 13.
        // int result = nextPrimeNum_givenn(getInt("Enter the number for n : "));
        // System.out.println("Next prime number is : "+result);

        // 14.
        // int result = previousPrimeNum_givenn(getInt("Enter the number for n : "));
        // System.out.println("Previous prime number is : "+result);

        // 15.
        // int result = nearestPrimeNum_givenn(getInt("Enter the number for n : "));
        // System.out.println("The nearest prime number is : "+result);

        // 16.
        // int result = kthPrimeNum(getInt("Enter the number for k : "), getInt("Enter the number for n : "));
        // System.out.println("The kth prime number is : "+result);

        // 17.
        // boolean result = isPrime_mton(getInt("Enter the number for m : "), getInt("Enter the number for n : "));
        // System.out.println(result);

        // 18.
        // int result = getMinNum_primeFactors_mton(getInt("Enter the number for m : "), getInt("Enter the number for n : "));
        // System.out.println("The minimum prime number which has maximum number of distinct prime factors in the range m to n : "+result);

        // 19.
        // product_primeNum(getInt("Enter the number for n : "));

        // 20.
        // boolean result = isUniqueProduct_primeNum(getInt("Enter the number for n : "));
        // System.out.println(result);

        // 21.
        // int result = largestPrimenum_mton(getInt("Enter the number for m : "), getInt("Enter the number for n : "));
        // System.out.println("The largest prime number in the range m to n : "+result);

        // 22.
        // int result = smallestPrimenum_mton(getInt("Enter the number for m : "), getInt("Enter the number for n : "));
        // System.out.println("The smallest prime number in the range m to n : "+result);
        

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
    public static int factorsN(int n){

        for (int i = 1; i <=n ; i++) {
            if (n%i==0) {
                System.out.println(" The factors of "+n+" is "+i);
            }
        }
        return n;
    }

    // 2.
    // method 1 for prime
    public static boolean IsPrime(int n){
        
        int count = 0;
        for (int i = 1; i <=n; i++) {       //this method we are starting 1 to n, that means we divide 1 and also n so it is a prime no
            if(n%i==0){
                count++;
            }
        }
        return count==2;
    }

    // method 2 for prime
    public static boolean isprime(int n){
        if (n<=1) {
            return false;
        }
        int count = 0;
        for (int i = 2; i < n; i++) {       //this method we are starting 2 to n-1, that means we not divide 1 and also n, so it is a prime no
            if(n%i==0){
                count++;
                break;
            }
        }
        return count==0;
    }

    // method 3 for prime
    public static boolean isPrime(int n){

        if(n<=1){
            return false;
        }
        boolean isPrime = true;                 // here, we are creating flag value
        for (int i = 2; i < n; i++) {       // this method we are starting 2 to n-1, that means we not divide 1 and also n, so it is a prime no
            if (n%i==0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    // 3.
    // method 1 , using isPrime() function here, that is written above
    public static int primeNum_1ton(int n){

        for (int i = 1; i <=n; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        return n;
    }

    // method 2, using nested loop
    public static int primenum_1ton(int n){

        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    count ++;
                }
            }
            if(count == 0){
                System.out.println(i);
            }
            count = 0;
        }
        return n;
    }

    // 4.
    public static int first_nPrimeNo(int n){

        int count = 0;
        int i = 1;
        while(count<n){         // here, we can also use for loop, but while has more flexibility
            if(isPrime(i)){
                count++;
                System.out.println(i);
            }
            i++;
        }
        return n;
    }

    // 5.
    public static int numPrimmeNum_n(int n){
        
        int count = 0;
        for (int i = 1; i<=n; i++) {
            if (isPrime(i)) {
                count ++;
            }
        }
        System.out.println("The number of prime numbers less than or equal to "+n+" is : "+count);
        return n;
    }

    // 6.
    public static int sum_firstN_primeNo(int n){
        int sum = 0;
        int count = 0;
        for (int i = 1; count<n; i++) {
            if (isPrime(i)) {
                sum +=i;
                count++;
            }
        }
        System.out.println("The sum of first "+n+" prime number is : "+sum);
        return n;
    }

    // 7.
    public static int sumPrimeNum_n(int n){

        int sum = 0;
        for (int i = 1; i <=n; i++) {
            if (isPrime(i)) {
                sum +=i;
            }
        }
        System.out.println("The sum of prime numbers less than or equal to "+n+" is : "+sum);
        return n;
    }

    // 8.
    public static void primeNum_mton(int m, int n){

        for (int i = m; i <=n; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    // 9.
    public static int primeFactors_n(int n){
        int i = 0;
        for (i=1; i<=n; i++)
        {
            if (n%i==0)
            {                
                if (isPrime(i))
                {
                    System.out.println(i);
                }                
            }
        }  
        return n;
    }

    // 10.
    public static int numPrimeNum_mton(int m, int n){

        int count = 0;
        for (int i = m; i <=n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.printf("The number of prime numbers from %d to %d is : %d", m,n,count);
        return n;
    }

    // 11.assume m>n
    public static void PrimeNum_mton(int m, int n){

        for (int i = m; i>=n; i--) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // *Very important question 
    // 12. prime number for all cases, 
    // 1st case : number of prime number from m to n
    // 2nd case : if m is > n eg.)m = 20, n=10
    // 3rd case : The only even prime number is 2, so we no need to check rest of the even prime numbers, directly we can go for odd numbers iterations like ===> i=i+2;
    // 4th case : For 3rd case suppose the user can give even numbers like "m = 10"; we should check if it is a even number or not, if the number is even just do increament for "m"

    public static int primeNum(int m, int n){
        
        int count = 0;
        if(m>n){                            // 2nd case
            m = m*n;
            n = m/n;
            m = m/n;
        }
        if (m==2) {                         // 3rd case
            System.out.println(m);
            count++;
        }
        if(m%2==0){                         // 4th case
            m++;
        }
        for(int i = m; i<=n; i=i+2){          // 1st case
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    // 13.
    public static int nextPrimeNum_givenn(int n){

        int result = n+1;
        while (true) {
            if (isPrime(result)) {
                return result;
            }
            result++;
        }
    }

    // 14.
    public static int previousPrimeNum_givenn(int n){

        int result = n-1;
        while (true) {
            if (isPrime(result)) {
                return result;
            }
            result--;
        }
    }

    // 15.
    public static int nearestPrimeNum_givenn(int n){

        int nextPrimeNo = nextPrimeNum_givenn(n);
        int previousPrimeNo = previousPrimeNum_givenn(n);
        int diff1 = Math.abs(previousPrimeNo-n);                        // here we are using closer of numbers conditions
        int diff2 = Math.abs(n-nextPrimeNo);

        if(diff1==diff2){
            return nextPrimeNo;
        }
        else if (diff1<diff2){
            return previousPrimeNo;
        }
        else if(diff2<diff1){
            return nextPrimeNo;
        }
        return n;

    }

    // 16.
    public static int kthPrimeNum(int k, int n){

        int count = 1;
        while (count<=k) {
            n++;
            if(isPrime(n)){
                count++;
            }
        }
        return n;
    }

    // 17.
    public static boolean isPrime_mton(int m, int n){

        for(int i = m; i<=n; i++){
            if(isPrime(i)){
                return true;
            }
        }
        return false;
    }

    // 18.
    public static int getMinNum_primeFactors_mton(int m, int n){

        int minNum = 1;
        int i = 0;
        for(i=m; minNum<=n; i++){
            if(isPrime(i)){
                minNum *= i;
            }
        }
        i--;
        if (minNum>n) {
            minNum /=i;
        }
        return minNum;
    }

    // 19.
    public static void product_primeNum(int n){

        for(int i=1; i<=n; i++){
            if(isPrime(i)){
                while (n%i==0) {
                    n /= i;
                    System.out.print(i+"\t");
                }

            }
        }
    }

    // 20.
    public static boolean isUniqueProduct_primeNum(int n){

        int count = 0;
        for(int i=1; i<=n; i++){
            if(isPrime(i)){
                while (n%i==0) {
                    n /= i;
                    System.out.println(i);
                    count++;
                }
            }
        }
        return count==2;
    }

    // 21.
    public static int largestPrimenum_mton(int m, int n){

        int largest = 0;
        for(int i = m; i<=n; i++){
            if(isPrime(i)){
                largest = i;
            }
        }
        
        return largest;

        // return previousPrimeNum_givenn(n);       // here, i am using previousPrimeNum_givenn(n) function by calling, because "n" is the last number of the range, so just find the previous prime number of "n"
    }

    // 22.
    public static int smallestPrimenum_mton(int m, int n){

        int smallest = 0;
        for(int i = m; i<=n; i++){
            if(isPrime(i)){
                smallest = i;
                break;
            }
        }
        return smallest;

        // return nextPrimeNum_givenn(m);       // here, i am using nextPrimeNum_givenn(n) function by calling, because "m" is the first number of the range, so just find the next prime number of "m" that is the smallest number
    }


}
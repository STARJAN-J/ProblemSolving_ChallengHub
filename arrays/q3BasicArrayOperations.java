package arrays;

import java.util.Random;
import java.util.Scanner;
public class q3BasicArrayOperations {
    
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {

        // 1.
        // int[] result = sumOfArray(getInt("Enter size : "));
        // printArray(result);

        // 2.
        // int result = sumOfArrayInEvenPositions(getInt("Enter size : "));
        // System.out.printf("The sum of array in the even position is : %d\n", result);

        // 3.
        // int result = sumOfArrayInOddPositions(getUserArray(getInt("Enter the size : ")));
        // System.out.printf("The sum of array in the odd position is : %d\n", result);

        // 4.
        // boolean result = isSumOfOddAndEvenPositionEqual_InArray(getInt("Enter size : "));
        // System.out.print(result);

        // 5.
        // int[] result = subElementsBy_Index0(getUserArray(getInt("Enter the size : ")));
        // printArray(result);

        // 6.
        // double result = meanOfAnArray(getUserArray(getInt("Enter the size : ")));
        // System.out.printf("The mean of array is : %.5f\n", result);

        // 7.
        // int result = countOfNonZeroArray(getUserArray(getInt("Enter the size : ")));
        // System.out.printf("The count of non zero elements in an array is : %d\n", result);

        // 8.
        // int result = countOfPositiveElements_Array(getUserArray(getInt("Enter the size : ")));
        // System.out.printf("The count of positive elements in an array is : %d\n", result);

        // 9.
        // int result = countOfNegativeElements_Array(getUserArray(getInt("Enter the size : ")));
        // System.out.printf("The count of negative elements in an array is : %d\n", result);

        // 10.
        // boolean result = isCountOfPositiveNegativeElements_equal(getUserArray(getInt("Enter size : ")));
        // System.out.print(result);

        // 11.
        // boolean result = isSumOfPositiveNegativeElements_equal(getUserArray(getInt("Enter size : ")));
        // System.out.print(result);

        // 12.
        // double result = meanOfAnArray_IgnoreZero(getUserArray(getInt("Enter the size : ")));
        // System.out.printf("The mean of array is : %.2f\n", result);

        // 13.
        // int result = numberOfOddElements_array(getUserArray(getInt("Enter the size : ")));
        // System.out.printf("The number of odd elements in an array is : %d\n", result);

        // 14.
        // int result = numberOfEvenElements_array(getUserArray(getInt("Enter the size : ")));
        // System.out.printf("The number of even elements in an array is : %d\n", result);

        // 15.
        // int result = numberOfPerfectSquare_Array(getUserArray(getInt("Enter the size : ")));
        // System.out.printf("The number of perfect square elements in an array is : %d\n", result);

        // 16.
        int result = numberOfPrimeNum_Array(getUserArray(getInt("Enter the size : ")));
        System.out.printf("The number of prime num in an array is : %d\n", result);







    }
    
    //#region
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
       

    // printArray for 1 dimension integer
    public static void printArray(int[] array){
        System.out.println("The array elements are : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
    
    // printArray for 1 dimension float
    public static void printArray(float[] array){
        System.out.println("The array elements are : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }

    // getUserArray
    public static int[] getUserArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for "+i+" : ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    // getRandomArray
    public static int[] getRandomArray(int size, int max){

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(max);
        }
        return array;
    }
    

    // printArray for 2 dimension
    public static void printArray2d(int[][] array){
        System.out.println("The elements are : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }

    // getArray2d
    public static int[][] getArray2d(int row, int col){
        int[][] array = new int[row][col];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter the value for ["+ i + "] [" + j+"] : ");
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }
    
    // jaggedArray
    public static void printJaggedArray(int [][] array){
        System.out.println("The elements for jagged array is : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }    
    
    // getJaggedArray ---doubt--------
    public static int[][] getJaggedArray(int row){
        int [][] array = new int[row][];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter the element for : "+i + " "+j);
                array[i][j] = sc.nextInt();
            }
        }
        return array;

    }
    //#endregion    


    // 1.
    public static int[] sumOfArray(int size){

        int[] array = getUserArray(size);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.printf("The sum of array elements are : %d \n",sum);
        return array;
    }

    // 2.
    public static int sumOfArrayInEvenPositions(int[] array){

        // int[] array = getUserArray(size);
        int sum = 0;
        for (int i = 0; i < array.length; i = i+2) {
            sum += array[i];
        }
        
        return sum;
    }

    // 3.
    public static int sumOfArrayInOddPositions(int[] array){

        // int[] array = getUserArray(size);
        int sum = 0;
        for (int i = 1; i < array.length; i = i+2) {
            sum += array[i];
        }
        return sum;
    }

    // 4.
    public static boolean isSumOfOddAndEvenPositionEqual_InArray(int size){

        int[] array = getUserArray(size);
        int eSum = sumOfArrayInEvenPositions(array);
        int oSum = sumOfArrayInOddPositions(array);
        return eSum==oSum;
    }

    // 5.
    public static int[] subElementsBy_Index0(int[] array){

        int sub = 0;
        for (int i = 0; i < array.length; i++) {
            if (i==0) {
                sub=array[i];
            }
            array[i] = array[i]-sub;

        }
        return array;
    }

    // 6.
    public static double meanOfAnArray(int[] array){

        double mean = 0;            //here using double type, because mean might be come from double value
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return mean=(double)sum/array.length;
    }

    // 7.
    public static int countOfNonZeroArray(int [] array){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=0) {
                count++;
            }
        }
        return count;
    }

    // 8.
    public static int countOfPositiveElements_Array(int [] array){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>=0) {
                count++;
            }
        }
        return count;
    }

    // 9.
    public static int countOfNegativeElements_Array(int [] array){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<0) {
                count++;
            }
        }
        return count;
    }

    // 10.
    public static boolean isCountOfPositiveNegativeElements_equal(int[] array){

        int positive = countOfPositiveElements_Array(array);
        int negative = countOfNegativeElements_Array(array);
        return positive==negative;
    }

    // 11.
    public static boolean isSumOfPositiveNegativeElements_equal(int[] array){

        int postiveSum = 0;
        int negativeSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>=0) {
                postiveSum += array[i];
            }
            else{
                negativeSum += Math.abs(array[i]);
            }
        }
        return postiveSum==negativeSum;
    } 

    // 12.
    public static double meanOfAnArray_IgnoreZero(int[] array){

        double mean = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=0) {
                count++;
                sum += array[i];
            }            
        }
        if (count == 0) {           //this condition helps to avoid division, it is more efficient by doing this
            return 0.0;
        }
        return mean=(double)sum/count;
    }

    // 13.
    public static int numberOfOddElements_array(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                count++;
            }
        }
        return count;
    }

    // 14.
    public static int numberOfEvenElements_array(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                count++;
            }
        }
        return count;
    }

    // 15.
    public static boolean isPerfectSquare(int n){
        int value = (int)Math.sqrt(n);
        return value*value==n;

    }
    public static int numberOfPerfectSquare_Array(int[] array){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPerfectSquare(array[i])) {
                count++;
            }
        }
        return count;
    }

    // 16.
    public static boolean isPrime(int n){
        boolean isPrime = true;
        if (n<=1) {
            return false;
        }
        for (int i = 2; i <n; i++) {
            if (n%i==0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;

    }
    public static int numberOfPrimeNum_Array(int[] array){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                count++;
            }
        }
        return count;
    }





}

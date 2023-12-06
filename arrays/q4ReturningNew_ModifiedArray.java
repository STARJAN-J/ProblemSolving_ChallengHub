package arrays;

import java.util.Random;
import java.util.Scanner;
public class q4ReturningNew_ModifiedArray {

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {

        // 1.
        // int[] result = copyOfArray(getUserArray(getInt("Enter the size : ")));
        // printArray(result);

        // 2.
        // int[] result = subArrayElementsByMeanOfArray(getUserArray(getInt("Enter the size : ")));
        // printArray(result);

        // 3.
        // boolean[] result = isValueEvenOrOdd(getUserArray(getInt("Enter the size : ")));
        // printArray(result);

        // 4.
        // boolean[] result = isLocOdd(getUserArray(getInt("Enter the size : ")));
        // printArray(result);

        // 5.
        // boolean[] result = isIndexValuePrime(getInt("Enter size : "));
        // printArray(result);

        // 6.
        // boolean[] result = isIndexValuePerfectSquare(getInt("Enter size : "));
        // printArray(result);






        
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
    
    // printArray for 1 dimension boolean
    public static void printArray(boolean[] array){
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
    public static int[] copyOfArray(int[] array){

        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i]=array[i];
        }
        return arrayCopy;
    }

    // 2.
    public static int[] subArrayElementsByMeanOfArray(int[] array){

        double mean = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            sum += array[i];
        }
        mean = (double)sum/count;
        for (int i = 0; i < array.length; i++) {
            array[i] -= (int)mean;
        }
        return array;
    }

    // 3.
    public static boolean[] isValueEvenOrOdd(int[] array){

        boolean[] array1=new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i]%2==0;
        }
        return array1;
    }

    // 4.
    public static boolean[] isValueOdd(int[] array){

        boolean[] array1=new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i]%2!=0;
        }
        return array1;
    }

    // 5.
    public static boolean isPrime(int n){

        if (n<=1) {
            return false;
        }
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static boolean[] isIndexValuePrime(int n){

        boolean[] prime = new boolean[n];
        for (int i = 0; i < n; i++) {
            prime[i]=isPrime(i);
        }
        return prime;
    }

    // 6.
    public static boolean isPerfectSquare(int n){
        int value = (int)Math.sqrt(n);
        return value*value==n;

    }
    public static boolean[] isIndexValuePerfectSquare(int n){

        boolean[] perfectSquare = new boolean[n];
        for (int i = 0; i < n; i++) {
            perfectSquare[i] = isPerfectSquare(i);
        }
        return perfectSquare;
    }








}

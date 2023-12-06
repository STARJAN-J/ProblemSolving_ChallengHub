package arrays;

import java.util.Random;
import java.util.Scanner;

public class q7InsertionAndRemovalOfarray {

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    
    public static void main(String[] args) {



        // 1.
        // int[] result = getOddNumFromArray_copyToNewArray(getUserArray(getInt("Enter size : ")));
        // printArray(result);

        // 2.
        // int[] result = getEvenNumFromArray_copyToNewArray(getUserArray(getInt("Enter size : ")));
        // printArray(result);

        // 3.
        // int[] result = getPerfectSquareFromArray_copyToNewArray(getUserArray(getInt("Enter size : ")));
        // printArray(result);

        // 4.
        // int[] result = getPrimeNumFromArray_copyToNewArray(getUserArray(getInt("Enter size : ")));
        // printArray(result);

        // 5.
        int[] result = findOccurenceD_ReplaceK(getUserArray(getInt("Enter size : ")), getInt("Enter the value for d : "), getInt("Enter the value for k : "));
        printArray(result);

        // 6.
        // int[] result = findAndRemoveOccurenceOfK_InArray(getUserArray(getInt("Enter size : ")), getInt("Enter the value for k : "));
        // printArray(result);

        // 7.
        // int[] result = insertKAt_LocationX(getUserArray(getInt("Enter size : ")), getInt("Enter the value for k : "), getInt("Enter the location for x : "));
        // printArray(result);

        // 8.
        // int[] result = removeValueAt_LocationX(getUserArray(getInt("Enter size : ")), getInt("Enter the location for x : "));
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
    public static int[] getOddNumFromArray_copyToNewArray(int[] array){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2!=0) {
                count++;
            }
        }
        int[] oddArray = new int[count];
        for (int i = 0, j=0; i < array.length; i++) {
            if (array[i]%2!=0) {
                oddArray[j] = array[i];
                j++;
            }
        }
        return oddArray;
    }

    // 2.
    public static int[] getEvenNumFromArray_copyToNewArray(int[] array){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0) {
                count++;
            }
        }
        int[] oddArray = new int[count];
        for (int i = 0, j=0; i < array.length; i++) {
            if (array[i]%2==0) {
                oddArray[j] = array[i];
                j++;
            }
        }
        return oddArray;
    }

    // 3.
    public static boolean isPerfectSquare(int n){


        for (int i = 1; i <= n; i++) {
            if (n/i==i) return true;
        }
        return false;
    }
    public static int[] getPerfectSquareFromArray_copyToNewArray(int[] array){

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (isPerfectSquare(array[i])) count++;
        }

        int[] perfectSquareArray = new int[count];

        for (int i = 0, j=0; i < array.length; i++) {
            if (isPerfectSquare(array[i])) {
                perfectSquareArray[j] = array[i];
                j++;
            }
        }
        return perfectSquareArray;
    }

    // 4.
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
    public static int[] getPrimeNumFromArray_copyToNewArray(int[] array){
        
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) count++;
        }

        int[] primeArray = new int[count];
        for (int i = 0, j=0; i < primeArray.length; i++) {
            if (isPrime(array[i])) {
                primeArray[j] = array[i];
                j++;
            }
        }
        return primeArray;

    }

    // 5.
    public static int[] findOccurenceD_ReplaceK(int[] array, int d, int k){

        int[] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) { 
            newArray[i] = array[i];
            if (d==newArray[i]) {
                newArray[i]=k;
            }
        }
        return newArray;
    }

    // 6.
    public static int countOfOccurenceInArray(int[] array, int k){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==k) {
                count++;
            }
        }
        return count;
    }
    public static int[] findAndRemoveOccurenceOfK_InArray(int[] array, int k){

        int count = countOfOccurenceInArray(array, k);

        int[] newArray = new int[array.length-count];

        for (int i = 0, j=0; i < array.length; i++) {
            if (array[i]!=k) {
                newArray[j]=array[i];
                j++;
            }
        }
        return newArray;

    }

    // 7.
    public static int[] insertKAt_LocationX(int[] array, int k, int x){


        int[] newArray = new int[array.length+1];

        for (int i = 0, j=0; i < array.length; i++, j++) {

            if (i==x) {
                newArray[j]=k;
                newArray[j+1]=array[i];                
                j++;
            }

            if (i!=x) {
                newArray[j]=array[i];
            }

            if (x>=array.length) {
                return array;
            }
        }
        return newArray;
    }

    // 8.
    public static int[] removeValueAt_LocationX(int[] array, int x){

        int[] new_array = new int[array.length-1];

        for (int i = 0, j=0; i < array.length; i++, j++) {
            
            if (i==x) {
                j--;
                continue;
            }
            new_array[j]=array[i];
            if (x>=array.length) {
                return array;
            }
        }
        return new_array;
    }
    










}

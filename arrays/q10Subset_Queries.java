package arrays;

import java.util.Random;
import java.util.Scanner;

public class q10Subset_Queries {

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {

        // 1.
        // boolean result = isSubsetOfArray_AddsUpToX(getUserArray(getInt("Enter size : ")), getInt("Enter the value for x : "));
        // System.out.println(result);

        // 2.
        // printIndicesOfValues_addsUptoX(getUserArray(getInt("Enter size : ")), getInt("Enter the value for x : "));
        
        // 3. 
        // printPairOfElements_addsUptoX(getUserArray(getInt("Enter size : ")), getInt("Enter the value for x : "));

        // 4.
        

        // 5.
        boolean result = isSubsetOfA_addsUpto3pair(getUserArray(getInt("Enter size : ")), getInt("Enter the value for x : "));
        System.out.println(result);













        
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
    public static boolean isSubsetOfArray_AddsUpToX(int[] array, int x){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i!=j && array[i]+array[j]==x) {
                    return true;
                }
            }
        }
        return false;
    }

    // 2.
    // this is for three combination
    public static void printIndicesOfValues_addsUptoX(int[] array, int x){

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                for (int k = j+1; k < array.length; k++){
                    if (array[i]+array[j]+array[k]==x) {
                        System.out.println(i+","+j+","+k);
                    }

                    // here, using ternary operator
                    // System.out.println((array[i]+array[j]+array[k]==x)?i+","+j+","+k:"Not Found");
                }
            }
               
        }
    }

    // 3.
    public static void printPairOfElements_addsUptoX(int[] array, int x){

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]+array[j]==x) {
                    System.out.println(i+","+j);
                }
            }
        }
    }

    // 4.
    public static void printPairOfElements_sumCloserToX(int[] array, int x){

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                
            }
        }
    }

    // 5.
    public static boolean isSubsetOfA_addsUpto3pair(int[] array, int x){

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                for (int k = j+1; k < array.length; k++) {
                    if (array[i]+array[j]+array[k]==x) {
                        return true;
                    }
                }
            }
        }
        return false;
    }














}

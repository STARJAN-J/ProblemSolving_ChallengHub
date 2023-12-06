package arrays;

import java.util.Random;
import java.util.Scanner;

public class q1arrayInitialization {

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {

        // int[] result = getUserArray(getInt("Enter the size of the array : "));
        // printArray(result);

        // int[][] a = new int[][] {{1,2,3},{4,5},{7,8,9, 10}};
        // printJaggedArray(a);

        // int [][] result = getJaggedArray(getInt("Enter row size : "));
        // printJaggedArray(result);

        // 1.
        // int[] result = arrayWithZero(getInt("Enter the size : "));
        // printArray(result);

        // 2.
        // int[] result = arrayWithK(getInt("Enter the size : "), getInt("Enter the velue for k : "));
        // printArray(result);

        // 3.
        // int[] result = getUserArray(getInt("Enter the size : "));
        // printArray(result);

        // 4.
        // int[] result = getRandomArray(getInt("Enter the size : "), getInt("Enter the value for random origin i : "), getInt("Enter the value for random bound j : "));
        // printArray(result);

        // 5.
        // int[] result = getRandomArray_WithRandomSize(getInt("Enter the size for random origin x : "), getInt("Enter the size for random bound y : "),getInt("Enter the value for random origin i : "), getInt("Enter the value for random bound j : "));
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
       

    // printArray for 1 dimension
    public static void printArray(int[] array){
        System.out.println("The array elements are : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
    public static void printArray(float[] array){
        System.out.println("The array elements are : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
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
    public static int[] arrayWithZero(int size){
        int [] array = new int[size];
        return array;
    }

    // 2.
    public static int[] arrayWithK(int size, int k){
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i]=k;
        }
        return array;
    }

    // 3.
    public static int[] getUserArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for "+i+" : ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    // 4.
    public static int[] getRandomArray(int size, int i, int j){

        int[] array = new int[size];
        for (int k = 0; k < array.length; k++) {
            array[k] = r.nextInt(i,j);
        }
        return array;
    }

    // 5.
    public static int[] getRandomArray_WithRandomSize(int x, int y, int i, int j){
        int size = r.nextInt(x,y);
        int count = 0;
        int [] array = new int[size];
        for (int k = 0; k < array.length; k++) {
            array[k] = r.nextInt(i,j);
            count++;
        }
        System.out.println(count);
        return array;
    }









}

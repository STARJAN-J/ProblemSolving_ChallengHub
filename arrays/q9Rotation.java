package arrays;

import java.util.Random;
import java.util.Scanner;

public class q9Rotation {

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {

        // 1.
        // int[] result = rotateArrayClockWise_1Position(getUserArray(getInt("Enter size : ")));
        // printArray(result);

        // 2.
        // int[] result = rotateArrayAntiClockWise_1Position(getUserArray(getInt("Enter size : ")));
        // printArray(result);

        // 3.
        // int[] result = rotateArrayClockWise_2Position(getUserArray(getInt("Enter size : ")));
        // printArray(result);
        // additional model based on 3rd question
        // int[] result = rotateArrayAntiClockWise_2Position(getUserArray(getInt("Enter size : ")));
        // printArray(result);

        // 4.
        // int[] result = rotateArrayClockWise_kPosition(getUserArray(getInt("Enter size : ")),getInt("Enter the rotation value for k : "));
        // printArray(result);

        // 5.
        // int[] result = rotateArrayAntiClockWise_kPosition(getUserArray(getInt("Enter size : ")),getInt("Enter the rotation value for k : "));
        // printArray(result);

        // 6.
        // int[] result = rotateArrayClockWise_kGreaterThanN(getUserArray(getInt("Enter size : ")),getInt("Enter the rotation value for k : "));
        // printArray(result);

        // this my own question based on below problem
        // int[] result = rotateArrayClockWise_getValueByPositions(getUserArray(getInt("Enter size : ")), getInt("Enter rotation value for k : "), getInt("Enter the position : "));
        // printArray(result);

        // 7.
        // int result = rotateArrayClockwise_getValueByPositions(getUserArray(getInt("Enter size : ")), getInt("Enter the rotation value for k : "), getInt("Enter the position : "));
        // System.out.println(result);

        // 8.
        int result = rotateArrayAntiClockwise_getValueByPositions(getUserArray(getInt("Enter size : ")), getInt("Enter the rotation value for k : "), getInt("Enter the position : "));
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
    public static int[] rotateArrayClockWise_1Position(int[] array){

        int count = 0;
        
        while (count<1) {
            int lastElement = array[array.length-1];
            for (int i = array.length-1; i > 0; i--) {
                array[i]=array[i-1];
            }
            count++;
            array[0]=lastElement;
        }
        return array;
    }

    // 2.
    public static int[] rotateArrayAntiClockWise_1Position(int[] array){

        int count = 0;

        while (count<1) {
            int firstElement = array[0];
            for (int i = 1; i < array.length; i++) {
                array[i-1]=array[i];
            }
            array[array.length-1]=firstElement;
            count++;
        }
        return array;
    }

    // 3.
    public static int[] rotateArrayClockWise_2Position(int[] array){
        
        int count = 0;
        while (count<2) {
            int lastElement = array[array.length-1];
            for (int i = array.length-1; i > 0; i--) {
                array[i]=array[i-1];                
            }
            count++;
            array[0]=lastElement;
        }
        return array;
    }
    // additional model based on 3rd question
    public static int[] rotateArrayAntiClockWise_2Position(int[] array){
        
        int count = 0;
        while (count<2) {
            int firstElement = array[0];
            for (int i = 1; i < array.length; i++) {
                array[i-1]=array[i];                
            }
            count++;
            array[array.length-1]=firstElement;
        }
        return array;
    }

    // 4. k is alwasys less than n for this question
    public static int[] rotateArrayClockWise_kPosition(int[] array, int k){

        int count = 0;
        while (count<k) {
            int lastElement = array[array.length-1];
            for (int i = array.length-1; i > 0; i--) {
                array[i]=array[i-1];                
            }
            count++;
            array[0]=lastElement;
        }
        return array;
    }

    // 5. k is alwasys less than n for this question
    public static int[] rotateArrayAntiClockWise_kPosition(int[] array, int k){

        int count = 0;
        while (count<k) {
            int firstElement = array[0];
            for (int i = 1; i < array.length; i++) {
                array[i-1]=array[i];                
            }
            count++;
            array[array.length-1]=firstElement;
        }
        return array;
    }

    // 6.k is greater than n for this question
    public static int[] rotateArrayClockWise_kGreaterThanN(int[] array, int k){

        int count = 0;
        while (count<k) {
            int lastElement = array[array.length-1];
            for (int i = array.length-1; i > 0; i--) {
                array[i]=array[i-1];                
            }
            count++;
            array[0]=lastElement;
        }
        return array;
    }

    // this my own question based on below problem
    public static int[] rotateArrayClockWise_getValueByPositions(int[] array, int k, int position){

        int count = 0;
        int value = 0;
        while (count<k) {
            int lastElement = array[array.length-1];
            for (int i = array.length-1; i > 0; i--) {
                array[i]=array[i-1];       
                while (i==position && i!=0) {
                    value = array[i];
                    break;
                }         
            }
            count++;
            array[0]=lastElement;
        }
        if (position==0) {
            value = array[0];
        }
        System.out.println(value);
        return array;
    }

    // 7.
    public static int rotateArrayClockwise_getValueByPositions(int[] array, int k, int position) {
        int n = array.length;
        int[] rotatedArray = new int[n];
    
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;  // Calculate the new index after rotating by k positions
            rotatedArray[newIndex] = array[i];
        }
        int rotatedValue = rotatedArray[position];
        return rotatedValue;
    }
  
    // 8.
    public static int rotateArrayAntiClockwise_getValueByPositions(int[] array, int k, int position) {
        int n = array.length;
        int[] rotatedArray = new int[n];
    
        for (int i = 0; i < n; i++) {
            int newIndex = (i - k + n) % n;  // Calculate the new index after rotating by k positions
            rotatedArray[newIndex] = array[i];
        }
        int rotatedValue = rotatedArray[position];
        return rotatedValue;
    }

    // 9 and 10 th questions are generic case,that is solved above 7 and 8th problems, so no need to solve one more time

    // 10. 





    
}

package arrays;

import java.util.Random;
import java.util.Scanner;

public class q2printingArrays {

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {
        
        // 1.
        // int[] result = printElementsOfArray(getInt("Enter size : "));
        // printArray(result);

        // 2.
        // int[] result = printReverse_ElementsOfArray(getInt("Enter size : "));
        // printArray(result);

        // 3.
        // int[] result = printArray_oddLocation(getInt("Enter size : "));
        // printArray(result);

        // 4.
        // int[] result = printArray_evenLocation(getInt("Enter size : "));
        // printArray(result);

        // 5.
        // int[] result = printElement_uptoK(getInt("Enter size : "), getInt("Enter k value : "));
        // printArray(result);

        // 6.
        // int[] result = printElement_ktoArrayEnd(getInt("Enter size : "), getInt("Enter k value : "));
        // printArray(result);

        // 7.
        // int[] result = printElements_ktoAlternateElementsArray(getInt("Enter size : "), getInt("Enter k value : "));
        // printArray(result);

        // 8.
        // printContentOfArray(getInt("Enter size : "));

        // 9.
        // printElements_EachLineContain_kElements(getInt("Enter size : "), getInt("Enter k value : "));
        printArrayInGroups(getInt("Enter size : "), getInt("Enter k value : "));
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
    public static int[] printElementsOfArray(int size){

        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the elements "+i+" : ");
            array[i]=sc.nextInt();
        }
        return array;
    }

    // 2.
    public static int[] printReverse_ElementsOfArray(int size){

        int[] array = new int[size];
        for ( int i = 0; i<array.length; i++){
            System.out.print("Enter the elements "+i+" : ");
            array[i]=sc.nextInt();
        }
        System.out.println("The array reverse is : ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        return array;

    }

    // 3.
    public static int[] printArray_oddLocation(int size){

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the elements "+i+" : ");
            array[i]=sc.nextInt();
        }
        System.out.print("Elements in the odd position : ");
        for (int i = 1; i < array.length; i = i+2) {
            System.out.print(array[i]+"  ");
        }    
        System.out.println();
        return array;
    }

    // 4.
    public static int[] printArray_evenLocation(int size){

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the elements "+i+" : ");
            array[i]=sc.nextInt();
        }
        System.out.print("Elements in the odd position : ");
        for (int i = 0; i < array.length; i = i+2) {
            System.out.print(array[i]+"  ");
        }    
        System.out.println();
        return array;
    }
    
    // 5.
    public static int[] printElement_uptoK(int size, int k){

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the elements "+i+" : ");
            array[i]=sc.nextInt();
        }
        System.out.print("Elements upto kth position : ");
        for (int i = 0; i <= k; i++) {
            System.out.print(array[i]+"  ");
        }    
        System.out.println();
        return array;
    }

    // 6.
    public static int[] printElement_ktoArrayEnd(int size, int k){

        int[] array = getUserArray(size);
        System.out.print("Elements starting from k to end of an array : ");
        for (int i = k; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }    
        System.out.println();
        return array;
    }

    // 7.
    public static int[] printElements_ktoAlternateElementsArray(int size, int k){

        int[] array = getUserArray(size);
        System.out.print("Elements starting from k to alternate position of elements of an array : ");
        for (int i = k; i < array.length; i=i+2) {
            System.out.print(array[i]+"  ");
        }
        System.out.println();
        return array;
    }

    // 8.
    public static void printContentOfArray(int size){

        int[] array = getUserArray(size);
        System.out.print("The given format of array :  { ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i+":"+array[i]);
            if (i<array.length-1) {
                System.out.print(" , ");
            }
        }
        System.out.print(" }");
        System.out.println();
    }

    // 9.
    // method 1
    public static void printElements_EachLineContain_kElements(int size, int k){

        int[] array = getUserArray(size);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
            if ((i+1)%k==0) {
                System.out.println();
            }
        }
    }
    // method 2
    public static void printArrayInGroups(int size, int k) {
        int [] array = getUserArray(size);
        for (int i = 0; i < array.length; i += k) {
            for (int j = i; j < i + k; j++) {
                System.out.print(array[j]);
                if (j < i + k-1) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Print a newline after each group of k elements.
        }
    }
    
}
    











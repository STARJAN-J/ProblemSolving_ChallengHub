package arrays;

import java.util.Random;
import java.util.Scanner;

public class q6RestrictedOrFocusedSearch {

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    
    public static void main(String[] args) {

        // 1.
        // int result = findNumOf_uniqueElements(getUserArray(getInt("Enter size : ")));
        // System.out.println("The number of unique element from 0 to 9 in an array is : "+result);

        // 2.
        // int result = countOfOccurenceInArray(getUserArray(getInt("Enter size : ")), getInt("Enter the element for count the occurence : "));
        // System.out.println(result);
        // int result = getMostOccursUniqueElementFrom0to9_Array(getRandomArray(getInt("Enter size for random value generation : "), getInt("Enter maximum value for random bound : ")));
        // int result =getMostOccursUniqueElementFrom0to9_Array(getUserArray(getInt("Enter size : ")));
        // System.out.println("The most occurent unique element from 0 to 9 in an array is : "+result);

        // 3.
        // int result = getLeastOccursUniqueElementFrom0to9_Array(getRandomArray(getInt("Enter size for random value generation : "), getInt("Enter maximum value for random bound : ")));
        // int result =getLeastOccursUniqueElementFrom0to9_Array(getUserArray(getInt("Enter size : ")));
        // System.out.println("The least occurent unique element from 0 to 9 in an array is : "+result);

        // 4.
        // int[] result = getMissingElement_0to9(getUserArray(getInt("Enter size : ")));
        // printArray(result);

        // 5.
        // int[] result = removeDuplicatesInArray(getUserArray(getInt("Enter size : ")));
        // printArray(result);
        // int[] result = findRemoveOccurence(getUserArray(getInt("Enter size : ")), getInt("Enter the element for remove the occurence : "));
        // printArray(result);
        // findCount_eachElement(getUserArray(getInt("Enter size : ")));

        // 6.
        // int result = missing_element__55(getUserArray(getInt("Enter size : ")));
        // System.out.println(result);

        int[] array = getUserArray(getInt("Enter size : "));
        int n = array.length + 1;

        int missingElement = findMissingElement(array, n);

        System.out.println("The missing element is: " + missingElement);
  




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
    public static int findNumOf_uniqueElements(int[] array){

        int uniqueCount = 0;
        
        for (int i = 0; i < array.length; i++) {

            // check is the element is 0 to 9
            if (array[i]>=0 && array[i]<=9) {

                boolean isUnique = false;

                // check the unique element
                for (int j = 0; j < i; j++) {
                    if (array[i]==array[j]) {
                        isUnique = true;
                    }
                }
                if (!isUnique) {
                    uniqueCount++;
                }
            }
        }
        return uniqueCount;
    }

    // 2.
    public static int countOfOccurenceInArray(int[] array, int element){

        int occurenceCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==element) {
                occurenceCount++;
            }
        }
        return occurenceCount;
    }
    public static int getMostOccursUniqueElementFrom0to9_Array(int[] array){

        int occurenceCount=0, lessOccurenceCount = 0, element = 0, count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>=0 && array[i]<=9) {
                lessOccurenceCount = occurenceCount;
                occurenceCount = countOfOccurenceInArray(array, array[i]);
                if (occurenceCount>lessOccurenceCount) {
                    element = array[i];
                    count = occurenceCount;
                }
            }
            // if you get the array as random generation use the print statement to view the elements
            // System.out.printf("The random of %d index is :  %d \n", i, array[i]);
        }
        System.out.println("The most occur element count is : "+count);
        return element;
    }

    // 3.
    public static int getLeastOccursUniqueElementFrom0to9_Array(int[] array){

        int[] sameOccursElement = new int[array.length-1];
        int occurenceCount=0, lessOccurenceCount = 0, element = 0, count = 0;
        for (int i = 0, j=0; i < array.length; i++) {
            if (array[i]>=0 && array[i]<=9) {
                lessOccurenceCount = occurenceCount;
                occurenceCount = countOfOccurenceInArray(array, array[i]);
                if (occurenceCount<lessOccurenceCount) {
                    element = array[i];
                    count = occurenceCount;
                }
                if (occurenceCount==lessOccurenceCount) {
                    sameOccursElement[j]=element;
                    j++;
                }
            }
            // if you get the array as random generation use the tprint statement to view the elements
            // System.out.printf("The random of %d index is :  %d \n", i, array[i]);
        }
        if (count>0) {
            System.out.println("The least occur element count is : "+count);
            return element;
        }
        else{
            printArray(sameOccursElement);
            return -1;
        }
    }

    // 4.
    public static int[] getMissingElement_0to9(int[] array){

        // int[] missingElementArray = new int[10];
        for (int i = 0; i <= 9; i++) {
            boolean isPresent = false;
            for (int j = 0; j < array.length; j++) {
                if (i==array[j]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                // missingElementArray[k]=i;
                // k++;
                System.out.println(i);
            }
        }
        return array;
    }

    // 5.
    public static int[] removeDuplicatesInArray(int[] array){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = false;
            for (int j = 0; j < i; j++) {
                if (array[i]==array[j]) {
                    isUnique = true;
                }
            }
            if (!isUnique) {
                count++;
            }
        }

        int[] uniqueArray = new int[count];
        for (int i = 0, k=0; i < array.length; i++) {
            boolean isUnique = false;
            for (int j = 0; j < i; j++) {
                if (array[i]==array[j]) {
                    isUnique = true;
                }
            }
            if (!isUnique) {
                uniqueArray[k]=array[i];
                k++;
            }
        }
        return uniqueArray;
    }
    
    public static int[] findRemoveOccurence(int[] array, int element){

        int count = countOfOccurenceInArray(array, element);

        int[] newArray = new int[array.length-count];
        for (int i = 0, k=0; i < array.length; i++) {
            if (array[i]!=element) {
                newArray[k]=array[i];
                k++;
            }
        }
        return newArray;
    }
    
    public static void findCount_eachElement(int[] array){

        for (int i = 0; i < array.length; i=0) {
        int temp = array[i];
        int occurenceCount = countOfOccurenceInArray(array, array[i]);
        array = findRemoveOccurence(array, array[i]);
        System.out.printf("The count of %d is : %d \n", temp, occurenceCount);
        }
    }

    // 6. ----doubt----
    public static int missing_element__55(int[] a)
    {
        int sum = 0, total_sum = 0, missing_element;
        for(int i=0; i<a.length; i++) sum=sum+a[i];
        for(int j=0; j<=a.length+1; j++) total_sum = total_sum + j;
        missing_element = total_sum - sum;
        return missing_element;
    }
    
    public static int findMissingElement(int[] array, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : array) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }













}









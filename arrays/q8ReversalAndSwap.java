package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class q8ReversalAndSwap {

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    
    public static void main(String[] args) {

        // 1.
        // int[] result = swapTwoElementsUsingIndices_InArray(getUserArray(getInt("Enter size : ")), getInt("Enter index 1 : "), getInt("Enter index 2 : "));
        // printArray(result);

        // int[] result = swapTwoElementsUsingIndices_InArrayWithoutTemp(getUserArray(getInt("Enter size : ")), getInt("Enter index 1 : "), getInt("Enter index 2 : "));
        // printArray(result);

        // 2.
        // boolean result = isArrayContainsNon_DecreasingOrder(getUserArray(getInt("Enter size : ")));
        // System.out.println(result);

        // 3.
        // int result = getIndexUpto_NonDecreasingOrder(getUserArray(getInt("Enter size : ")));
        // System.out.println(result);

        // 4.
        // int[] result = reverseArray_UsingNewArray(getUserArray(getInt("Enter size : ")));
        // printArray(result);

        // 5.
        // int[] result = reverseArray_WithoutUsingNewArray(getUserArray(getInt("Enter size : ")));
        // printArray(result);

        // 6.
        // boolean result = isTwoArraysIdentical(getUserArray(getInt("Enter size for 1st array : ")), getUserArray(getInt("Enter size for 2nd array : ")));
        // System.out.println(result);

        // 7.
        // int result = getIndexForIdentical_UptoWhich(getUserArray(getInt("Enter size for 1st array : ")), getUserArray(getInt("Enter size for 2nd array : ")));
        // System.out.println(result);

        // 8.
        // printDistinctElements(getUserArray(getInt("Enter size : ")));

        // 9.
        // int result = getMostDuplicatedValue(getUserArray(getInt("Enter size : ")));
        // System.out.println(result);

        // 10.
        // int[] result = duplicatesRemoved_array(getUserArray(getInt("Enter size : ")));
        // printArray(result);

        // 11.
        // int result = countOfElementsLessOr_EqualToX(getUserArray(getInt("Enter size : ")), getInt("Enter the value for x : "));
        // System.out.println(result);

        // 12.
        // int result = countOfElementsGreaterOr_EqualToX(getUserArray(getInt("Enter size : ")), getInt("Enter the value for x : "));
        // System.out.println(result);

        // 13.
        // int result = kthLargestElement(getUserArray(getInt("Enter size : ")), getInt("Enter the value for k : "));
        // System.out.println(result);

        // 14.
        // int[] result = ascendingArray(getUserArray(getInt("Enter size : ")));
        // printArray(result);

        // int result = kthSmallestElement(getUserArray(getInt("Enter size : ")), getInt("Enter the value for k : "));
        // System.out.println(result);

        // 15.
        // int[] result = descendingArray(getUserArray(getInt("Enter size : ")));
        // printArray(result);

        // int result = kthLargestElement(getUserArray(getInt("Enter size : ")), getInt("Enter the value for k : "));
        // System.out.println(result);


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
    public static int[] swapTwoElementsUsingIndices_InArray(int[] array, int index1, int index2){

        int temp = 0;       // here i am using temp for swap
        // we can also swap two elements without using loop and temp variable, the required code is below
        for (int i = 0; i < array.length; i++) {
            if (i==index1) {
                temp = array[i];
                array[index1]=array[index2];
            }
            else if (i==index2) {
                array[index2]=temp;
            }
        }
        return array;
    }
    // method 2 without using temp variable
    public static int[] swapTwoElementsUsingIndices_InArrayWithoutTemp(int[] array, int index1, int index2){

        // we dont need to use for loop for swap type of problems
        if(index1>=0 && index1<array.length && index2>=0 && index2<array.length){       
            array[index1] = array[index1]*array[index2];
            array[index2] = array[index1]/array[index2];
            array[index1] = array[index1]/array[index2];
        }
        return array;
    }

    // 2.
    public static boolean isArrayContainsNon_DecreasingOrder(int[] array){

        if (array.length<0) {
            return false;   // An empty array is not considered non-decreasing.
        }

        boolean isNonDecreaingOrder = true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>array[i+1]) {
                isNonDecreaingOrder = false;
                break;
            }
        }
        return isNonDecreaingOrder;
    }

    // 3.
    public static int getIndexUpto_NonDecreasingOrder(int[] array){

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (i!=array.length-1 && array[i]>array[i+1]) {
                break;
            }
            index = i;
        }
        return index;
    }

    // 4.
    public static int[] reverseArray_UsingNewArray(int[] array){

        int[] newArray = new int[array.length];

        for (int i = array.length-1, j=0; i>=0; i--, j++) {
            newArray[j] = array[i];
        }
        return newArray;
    }

    // 5.
    // this is my own code, but it is little more complex
    public static int[] reverseArray_WithoutUsingNewArray(int[] array){

        int temp = 0;
        for (int i = array.length-1, j=0; i>=0; i--, j++) {
    
            int length = array.length-1;
    
            if (length/2==i) {
                break;
            }
            
            if (length/2!=i && length%2==0) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            else  {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }
    // this code is more efficient
    public static int[] reverseArray_WithoutUsingNewArray1(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
        return array;
    }
    
    // 6.
    public static boolean isTwoArraysIdentical(int[] array, int[] array1){

        if (array.length!=array1.length) {
            return false;
        }

        boolean isIndentical = true;

        for (int i = 0; i < array1.length; i++) {
            if (array[i]!=array1[i]) {
                isIndentical = false;
                break;
            }
        }
        return isIndentical;

    }

    // 7.
    public static int getIndexForIdentical_UptoWhich(int[] array, int[] array1){

        if (array.length!=array1.length) {
                return -1;
        }

        int index = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array[i]!=array1[i]) {
                index = i;
                break;
            }
            index = i;
        }
        return index;
    }

    // 8.
    // method 1
    public static void printDstinctElements(int[] array){

        for (int i = 0; i < array.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (array[i]==array[j]) {
                    break;
                }                
            }
            if (i==j) {
                System.out.println(array[i]);
            }
        }
    }
    // method 2
    public static void printDistinctElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(array[i]);
            }
        }
    }
 
    // 9. ----pending------
    public static int getMostDuplicatedValue(int[] array){

        int duplicate = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isUniqueValue = true;
            for (int j = 0; j < i; j++) {
                if (array[i]==array[j]) {
                    isUniqueValue = false;
                    break;
                }
            }
            if (isUniqueValue) {
                System.out.println(array[i]);
            }
        }
        return -4;
    }

    // 10.
    public static int[] duplicatesRemoved_array(int[] array){

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (array[i]==array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                count++;
                
            }
        }

        int[] uniqueArray = new int[count];
        for (int i = 0, k=0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (array[i]==array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueArray[k]=array[i];
                k++;
                
            }
        }
        return uniqueArray;
    }

    // 11.
    public static int countOfElementsLessOr_EqualToX(int[] array, int x){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<=x) {
                count++;
            }
        }
        return count;
    }

    // 12.
    public static int countOfElementsGreaterOr_EqualToX(int[] array, int x){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>=x) {
                count++;
            }
        }
        return count;
    }

    // 13.
    public static int[] descendingArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]<array[j]) {
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
    public static int kthLargestElement(int[] array, int k){

        int kLarge = 0;
        int count=0;
        int[] newArray = descendingArray(array);
        int[] sortedUniqueArray = duplicatesRemoved_array(newArray);

        for (int i = 0; i < sortedUniqueArray.length; i++) {
            if (count<k) {
                kLarge=sortedUniqueArray[i];
                count++;
            }
            else{
                break;
            }
        }

        return kLarge;
    }

    // 14.
    public static int[] ascendingArray(int[] a){

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                int temp =a[i];
                a[i]=a[j];
                a[j]=temp;
                }
            }
        } 
        return a;
    }
    public static int kthSmallestElement(int[] array, int k){

        int kSmall = 0;
        int count = 0;
        int[] newArray = ascendingArray(array);
        int[] sortedUniqueArray = duplicatesRemoved_array(newArray);

        for (int i = 0; i < array.length; i++) {
            
            if (count<k) {
                kSmall = sortedUniqueArray[i];
                count++;
            }
            else{
                break;
            }
        }
        return kSmall;
    }




}
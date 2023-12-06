package arrays;

import java.util.Random;
import java.util.Scanner;

public class q5LinearSearch {

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    
    public static void main(String[] args) {

        // 1.
        // boolean result = isArrayContainValueX(getUserArray(getInt("Enter size : ")), getInt("Enter value x : "));
        // System.out.println(result);

        // 2.
        // int result = getIndexOfXValue(getUserArray(getInt("Enter size : ")), getInt("Enter value x : "));
        // System.out.println(result); 

        // 3.
        // boolean result = isX_MoreThanOne(getUserArray(getInt("Enter size : ")), getInt("Enter value x : "));
        // System.out.println(result); 

        // 4.
        // int result = getCountOf_x(getUserArray(getInt("Enter size : ")), getInt("Enter value x : "));
        // System.out.println("The count of value x is : "+result); 

        // 5.
        // int[] result = getIndicesOf_x(getUserArray(getInt("Enter size : ")), getInt("Enter value x : "));
        // printArray(result);

        // 6.
        // int result = getSecondOccurenceOf_TargetValueX(getUserArray(getInt("Enter size : ")), getInt("Enter value x : "));
        // System.out.println("The second occurence of target values is : "+result); 

        // 7.
        // int result = getKthOccurenceOf_TargetValueX(getUserArray(getInt("Enter size : ")), getInt("Enter value x : "), getInt("Enter the value for occurence k : "));
        // System.out.println("The kth occurence of target values is : "+result); 

        // 8.
        // int result = getSmallestElementInAnArray(getUserArray(getInt("Enter size : ")));
        // System.out.println("The smallest element in an array is : "+result); 

        // int result = getSecondSmallestElementInAnArray(getUserArray(getInt("Enter size : ")));
        // System.out.println("The second smallest element in an array is : "+result); 

        // 9.
        // int result = getIndexOfSmallestElementInAnArray(getUserArray(getInt("Enter size : ")));
        // System.out.println("The index of the smallest element in an array is : "+result); 

        // 10.
        // int result = getLargestElementInAnArray(getUserArray(getInt("Enter size : ")));
        // System.out.println("The largest element in an array is : "+result); 

        // 11.
        // int result = getSecondLargestElementInAnArray(getUserArray(getInt("Enter size : ")));
        // System.out.println("The second largest element in an array is : "+result); 

        // 12.
        // getLargestAndSecondLargestElement(getUserArray(getInt("Enter size : ")));
        // getSmallestAndSecondSmallestElement(getUserArray(getInt("Enter size : ")));

        // 13.
        // int result = getMaximumPairwiseProduct(getUserArray(getInt("Enter size : ")));
        // System.out.println("The maximum product that can be obtained by multiplying of two integers in the given array is : "+result);

        // 14.
        // int result = getCountOfSmallestelement_Array(getUserArray(getInt("Enter size : ")));
        // System.out.println("The number of smallest element in an array is : "+result); 

        // 15.
        // int result = getCountOfLargestelement_Array(getUserArray(getInt("Enter size : ")));
        // System.out.println("The number of largest element in an array is : "+result);
        
        // 16.
        // int result = getCountOfValueBetweenMin_Max(getUserArray(getInt("Enter size : ")));
        // System.out.println("The count of value between min and max in an array is : "+result);


        









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
    public static boolean isArrayContainValueX(int[] array, int x){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==x){
                return true;
            }
        }
        return false;
    }

    // 2.
    public static int getIndexOfXValue(int[] array, int x){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==x) {
                return i;
            }
        }
        return -1;      // if the value is not in the particular index, return -1 is the default value, because index starts from zero
    }

    // 3.
    public static boolean isX_MoreThanOne(int[] array, int x){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==x) {
                count++;
            }
            if (count>1) {          // Here, i break the loop, because we find the value more then one, so we no need to check rest of the values, this is the optimal solution
                break;
            }
        }
        return count>1;
    }

    // 4.
    public static int getCountOf_x(int[] array, int x){
        
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==x) {
                count++;
            }
        }
        return count;
    }

    // 5.
    public static int[] getIndicesOf_x(int[] array, int x){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==x) {
                count++;
            }
        }
        int[] array1 = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==x) {
                array1[index]=i;
                index++;
            }
        }
        return array1;
    }

    // 6.
    public static int getSecondOccurenceOf_TargetValueX(int[] array, int x){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==x) {
                count++;
                if (count==2) {
                    return i;
                }
            }
        }
        return -1;
    }

    // 7.
    public static int getKthOccurenceOf_TargetValueX(int[] array, int x, int k){

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==x) {
                count++;
                if (count==k) {
                    return i;
                }
            }
        }
        return -1;
    }

    // 8.
    public static int getSmallestElementInAnArray(int[] array){

        int smallestValue = array[0];
        for (int i = 1; i < array.length; i++) {        // Start iterate from the second index '1', because the first index of '0' is already assigned
        
            if (array[i]<smallestValue) {
                smallestValue = array[i];
            }
        }
        return smallestValue;
    }
    // secondSmallestElement
    public static int getSecondSmallestElementInAnArray(int[] array){

        int smallestValue = array[0];
        int secondSmallestValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<smallestValue) {
                secondSmallestValue = smallestValue;
                smallestValue=array[i];
            }
            else if(array[i]<secondSmallestValue && array[i]>smallestValue){
                secondSmallestValue = array[i];
            }
        }
        return secondSmallestValue;
    }
    

    // 9.
    public static int getIndexOfSmallestElementInAnArray(int[] array){

        if (array.length == 0) {
            // Handle the case of an empty array (you can choose to return a special value or throw an exception)
            return -1; // For example, returning -1 for an empty array
        }

        int smallestValue = array[0];
        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++) {        // Start iterate from the second index '1', because the first index of '0' is already assigned
            if (array[i]<smallestValue) {
                smallestValue = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    // 10.
    public static int getLargestElementInAnArray(int[] array){

        int largestValue = array[0];
        for (int i = 1; i < array.length; i++) {        // Start iterate from the second index '1', because the first index of '0' is already assigned
        
            if (array[i]>largestValue) {
                largestValue = array[i];
            }
        }
        return largestValue;
    }

    // 11.***important ques
    public static int getSecondLargestElementInAnArray(int[] array){

        int largestValue = array[0];
        int secondLargestValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>largestValue) {
                secondLargestValue = largestValue;
                largestValue=array[i];
            }
            else if(array[i]>secondLargestValue && array[i]<largestValue){
                secondLargestValue = array[i];
            }
        }
        return secondLargestValue;
        
    }

    // 12. ***Important ques
    public static void getLargestAndSecondLargestElement(int[] array){

        int largestValue = array[0];
        int secondLargestValue = array[0];      // or we can give any element from the array
        for (int i = 0; i < array.length; i++) {
            if (array[i]>largestValue) {
                secondLargestValue=largestValue;
                largestValue=array[i];
            }
            else if (array[i]>secondLargestValue && array[i]<largestValue) {
                secondLargestValue = array[i];
            }
        }
        System.out.printf("The largest value is : %d \nThe second largest value is : %d", largestValue,secondLargestValue);
    }
    // additional ques
    public static void getSmallestAndSecondSmallestElement(int[] array){

        int smallestValue = array[0];
        int secondSmallestValue = array[0];      // or we can give any element from the array
        for (int i = 0; i < array.length; i++) {
            if (array[i]<smallestValue) {
                secondSmallestValue=smallestValue;
                smallestValue=array[i];
            }
            else if (array[i]<secondSmallestValue && array[i]>smallestValue) {
                secondSmallestValue = array[i];
            }
        }
        System.out.printf("The smallest value is : %d \nThe second smallest value is : %d", smallestValue, secondSmallestValue);
    }

    // 13. ***Important ques
    public static int getMaximumPairwiseProduct(int[] array){

        int largest = getLargestElementInAnArray(array);
        int secondLargestValue = getSecondLargestElementInAnArray(array);
        int smallest = getSmallestElementInAnArray(array);
        int secondSmallestValue = getSecondSmallestElementInAnArray(array);
        int max = 0;
        if (largest*secondLargestValue > smallest*secondSmallestValue) {
            System.out.printf("The maximum pairwise product is %d and %d \n", largest, secondLargestValue);
            max = largest*secondLargestValue;
        }
        else if (smallest*secondSmallestValue > largest*secondLargestValue) {
            System.out.printf("The maximum pairwise product is %d and %d \n", smallest, secondSmallestValue);
            max = smallest*secondSmallestValue;
        }
        return max;
    }

    // 14.
    public static int getCountOfSmallestelement_Array(int[] array){
        
        int count = 0;
        int smallestValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<smallestValue){
                smallestValue = array[i];
                count = 1;
            }
            else if(smallestValue==array[i]){
                count++;
            }
        }        
        System.out.println("The smallest value of an array : "+smallestValue);
        return count;
    }

    // 15.
    public static int getCountOfLargestelement_Array(int[] array){
        
        int count = 0;
        int largestValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>largestValue){
                largestValue = array[i];
                count = 1;
            }
            else if(largestValue==array[i]){
                count++;
            }
        }        
        System.out.println("The largest value of an array is : "+largestValue);
        return count;
    }

    // 16.
    public static int getCountOfValueBetweenMin_Max(int[] array){

        int count = 0;
        int smallestValue = getSmallestElementInAnArray(array);
        int largestValue  = getLargestElementInAnArray(array);
        for (int i = smallestValue; i < largestValue; i++) {
            count++;
        }
        return count;
    }










}

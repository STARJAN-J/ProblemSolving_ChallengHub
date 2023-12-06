package Foundations_ProblemSolving;

import java.io.Console;
import java.net.SocketPermission;
import java.util.*;
import java.util.concurrent.CancellationException;

import javax.sound.midi.Synthesizer;
import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.Region;

public class q1_Funtions
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    
     // 1.
     sum_diff_pro(GetInt("Enter the num1 : "), GetInt("Enter the num2 : "));

     // 2.
     // power();

     // 3.
    // int volume = 
    // volumeOfRectangle(GetInt("Enter the length : "), GetInt("Enter the breadth : "), 
    //  GetInt("Enter the height : "));
    //  System.out.println(volume);

     // 4.
    //  double result4 = perimeter_of_circle(getDouble("Enter the area : "), getDouble("Enter the radius : "));
    //  System.out.println(result4);

     // 5.
    //  quotient_remainder(getDouble("Enter the numerator : "), getDouble("Enter the denominator : "));

     // 6.
    //  double squareOfNum = squareOfNum(getDouble("Enter the number : "));
    //  System.out.println(squareOfNum);

     // 7.
    //  squareRoot_fun();

     // 8.
    //  areaOfTriangle(GetInt("Enter the length : "), GetInt("Enter the breadth : "));

     // 9.
    //  double km_m = kilometers_miles(GetInt("Enter the kilometers : "));
    //  System.out.println(km_m);

     // 10.
     // float celcius_fareheit=celcius_fareheit();
     // System.out.println(celcius_fareheit);

     // 11.
    //  int swap_variables= swap_variables(GetInt("Enter the number for a"), GetInt("Enter the number for b"));
     // System.out.println(swap_variables);

     // 12.
     // swap_not_using_TemporaryVariable();

     // 13.

     // 14.
     //generating_random();

     // 15.
     // AreOfField_acres(GetInt("Enter the lenght : "), GetInt("Enter the width : "));

     // 16.
     // natural_num();

     // 17.
     // input_avg(GetInt("Enter the first number : "), GetInt("Enter the second number : "), GetInt("Enter the third number : "));

     // 18.
     // tip_calculation(GetInt("Enter the total amount : "));

     // 19.
     // netAmnt_calculationn(GetInt("Enter the amount paid : "), GetInt("Enter the tex percentage : "));

     // 20.
     // grossPay_Calculation(GetInt("Enter the Basic pay : "), GetInt("Enter the DA : "), GetInt("Enter the TA : "), GetInt("Enter the PF : "));

     // 21.
     // simpleInterest(GetInt("Enter the p(principal) value : "), GetInt("Enter the n(number of times) : "), GetInt("Enter the r(rate of interest) : "));

     // 22.
     // compundInterest(GetInt("Enter the p(principal balance) value : "), GetInt("Enter the n(number of times) value : "), GetInt("Enter the r(rate of interest) value : "), GetInt("Enter the t(number of time period) value : "));

     // 23.
     // calculate_height(GetInt("Enter the height of the person in 'cm' : "));

     // 24.
     // calculate_BMI(GetInt("Enter the height of the person : "), GetInt("Enter the weight of the person : "));

     // 25.
    //  calculate_marks(GetInt("Enter the sub 1 : "), GetInt("Enter the sub 2 : "), GetInt("Enter the sub 3 : "));




}

    // get string
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // get int
    public static int GetInt(String message) {
        printMessage(message);
        int temp = sc.nextInt();
        return temp;        
    }

    // get double
    public static double getDouble(String message)
    {
        printMessage(message);
        double temp = sc.nextDouble();
        return temp;
    }

    // sum
    public static int sum(int num1, int num2)
    {
        return num1+num2;
    }

    // diff
    public static int diff(int num1, int num2)
    {
        return num1-num2;
    }

//#Product functions

    public static int product(int num1, int num2){
        return num1*num2;
    }

    public static int product(int num1, int num2, int num3){
        return num1*num2*num3;
    }

    public static double product(double num1, double num2, double num3){
        return num1*num2*num3;
    }

    public static double product(double num1, double num2){
        return num1*num2;
    }
//#endregion



// using functions

    // 1.
    public static void sum_diff_pro(int num1, int num2){
        int sum = sum(num1, num2);
        System.out.println("Sum of two integers is "+sum);
        int diff = diff(num1, num2);
        System.out.println("Difference of two integers is "+diff);
        int prod = product(num1, num2);
        System.out.println("Product of two integers is "+prod);
     }
     
     // 2.
    public static void power(){
        int x=2;
        int y=5;
        System.out.println(Math.pow(2, 3));
     }
 
     // 3.
    public static int volumeOfRectangle(int l, int b, int h){
        if(l>0 && b>0 && h>0)
        {
            int volume = product(l, b, h);
            System.out.println(volume);
            return volume;
        }
        else
        {
            System.out.println("Invalid Input");
            return 1;      // You might return a special value to indicate an error here, or use exceptions.
        }
    }    
 
     // 4.
    public static double perimeter_of_circle(double a, double r){
        double prod = product(a, Math.PI, r);
        return prod;
    }

    //5.    
    public static void quotient_remainder(double numerator, double denominator){
         double quotient=numerator/denominator;
         double remainder = numerator%denominator;
         System.out.println("Qoutient : "+ quotient);
         System.out.println("Remainder : "+ remainder);
    }
    
    // 6.
    public static double squareOfNum(double a) {   
    
        product(a, a);
        //  double a=25;
        //  System.out.println(a*a);   // this is also one method/
        //  System.out.println(Math.pow(a, 2));
        return Math.pow(a, 2);
    }
 
    // 7.
    public static void squareRoot_fun() {
         int a = 8;
         System.out.println(Math.sqrt(a));
    }
 
    // 8.
    public static void areaOfTriangle(int l , int b) {
         double area = product(1/2.0, l, b);
                 // or
         double area1 = 0.5*l*b;
         System.out.println("area of triangle is : " + area);
         System.out.println("area of triangle is : " + area1);
    }
 
    // 9.
    public static double kilometers_miles(double km) {
        // System.out.println("Enter the kilometers");
        //  km = sc.nextDouble();
         double miles = km*0.621371;
         System.out.println(km+" km is aqual to : "+miles+" miles");
         return miles;
    }
     
    // 10.
    public static float celcius_fareheit(){
         float celcius = 23;
         float farenheit = (celcius*9/5)+32;
        //  System.out.println(farenheit);
        return farenheit;
    }
 
    // 11.
    public static void swap_variables(int a, int b, int c) {
         c=a;
         a=b;
         b=c;
         System.out.println("a="+a);
         System.out.println("b="+b);
    }
 
    // 12.
    public static void swap_not_using_TemporaryVariable() {
         int a = 25;
         int b=24;
         a = a*b;
         b=a/b;
         a=a/b;
         System.out.println("a="+a);
         System.out.println("b="+b);
    }
         
    // 13.
 
    // 14.
    public static void generating_random() {
         Random r = new Random();
         int ra=r.nextInt(1,100);
         System.out.println(ra);
    }
 
    // 15.
    public static void AreOfField_acres(double length, double width) {
         double acres = 43560;
         double feet = length*width;
         double area_of_field=feet/acres;
         System.out.println(feet+" area of a field is "+area_of_field);
    }
 
     // 16.
     public static void natural_num() {
         System.out.println("Enter the n for natural number : ");
         int n = sc.nextInt();
         int sum_n=n*(n+1)/2;
         System.out.println(n+" of natural numbers upto n is : "+ sum_n);
     }
         
     // 17.
     public static void input_avg(int first, int second, int third) {
         int avg=(first+second+third)/3;
         System.out.println("The average is : "+avg);
     }
 
     // 18.
     public static void tip_calculation(double amnt) {
         double tips = (5.0/100.0)*amnt;
         System.out.println("5% of total "+ amnt+ " is "+tips);
     }
 
     // 19.
     public static void netAmnt_calculationn(double amnt_paid, double tax_percent) {
         double net_amount = amnt_paid/(1+tax_percent);
         System.out.println("The calculation of total amount "+amnt_paid+" and tax percent "+tax_percent+"% of net amount is : "+net_amount);
     }
 
     // 20.
     public static void grossPay_Calculation(double basic_pay, double DA, double TA, double PF) {
         double gross_pay = basic_pay+DA+TA-PF;
         System.out.println("Gross pay is : "+ gross_pay);
     }
 
     // 21.
     public static void simpleInterest(double p, double n, double r) {
         double simple_interest = (p*n*r)/100;
         System.out.println("The total simple interest is : "+simple_interest);
     }
 
     // 22.
     public static void compundInterest(double p, double n, double r, double t) {
         double compound_interest = p*Math.pow((1+r/n),(n*t));
         System.out.println("The total compound interest is : "+compound_interest);
     }
 
     // 23.
     public static void calculate_height(double height) {
         double inch = height/2.54;
         System.out.println("The height of "+height+"cm is "+inch+" inches");
     }
 
     // 24.
     public static void calculate_BMI(double height, double weight) {
         double BMI = weight/(height*height);
         System.out.println("The BMI is : "+BMI);
     }
 
     // 25.
     public static void calculate_marks(String roll_no, String name, double sub1, double sub2, double sub3) {
        //  System.out.print("Enter the roll no : ");
        //  String rollno = sc.next();
        //  System.out.print("Enter the name : ");
        //  String name = sc.next();
         double total = sub1+sub2+sub3;
         double avg = total/3;
         System.out.println("total : "+total+"\n"+"average : "+avg);   
     }

}
package Foundations_ProblemSolving;

import java.io.Console;
import java.net.SocketPermission;
import java.util.*;
import java.util.concurrent.CancellationException;

import javax.sound.midi.Synthesizer;
import javax.sql.rowset.spi.SyncResolver;

public class q1_Basics
{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

    //    // 1.
    //    int a=2;
    //    int b=3;
    //    int c=a+b;
    //    int d=a-b;
    //    int e=a*b;
    //    System.out.println(c);
    //    System.out.println(d);
    //    System.out.println(e);
   

    //    //2.
    //    int x=2;
    //    int y=5;
    //    System.out.println(Math.pow(2, 3));


        // // 3.
        // int l = 5;
        // int w=6;
        // int h=4;
        // System.out.println(l*w*h);

        //  // 4.
        //  int a = 2;
        //  int r = 6;
        //  System.out.println(a*Math.PI*r);

        // 5.
        // float numerator=2;
        // float denominator=3;
        // float quotient=numerator/denominator;
        // float remainder = numerator%denominator;
        // System.out.println(quotient);
        // System.out.println(remainder);

        // 6.
        // int a=25;
        // System.out.println(a*a);
        // System.out.println(Math.pow(a, 2));

        // 7.
        // int a = 8;
        // System.out.println(Math.sqrt(a));

        // 8.
        // int l = 15;
        // int b = 6;
        // double area = 1/2.0*l*b;
        //         // or
        // double area1 = 0.5*l*b;
        // System.out.println("area of triangle is : " + area);
        // System.out.println("area of triangle is : " + area1);

        // 9.
        // System.out.println("Enter the kilometers : ");
        // // Scanner sc = new Scanner(System.in);
        // double km = sc.nextDouble();
        // double miles = km*0.621371;
        // System.out.println(km+" km is aqual to : "+miles+" miles");
    
        // 10.
        // float celcius = 23;
        // float farenheit = (celcius*9/5)+32;
        // System.out.println(farenheit);

        // 11.
        // int a=25;
        // int b=35;
        // int c=a;
        // a=b;
        // b=c;
        // System.out.println("a="+a);
        // System.out.println("b="+b);

        // 12.
        // int a = 25;
        // int b=24;
        // a = a*b;
        // b=a/b;
        // a=a/b;
        // System.out.println("a="+a);
        // System.out.println("b="+b);
        
        // 13.

        // 14.
        // Random r = new Random();
        // int ra=r.nextInt(1,100);
        // System.out.println(ra);

        // 15.
        // System.out.println("Enter the length : ");
        // double length = sc.nextInt();
        // System.out.println("Enter the width : ");
        // double width = sc.nextInt();
        // double feet = length*width;
        // double acres = 43560;
        // double area_of_field=feet/acres;
        // System.out.println(feet+" area of a field is "+area_of_field);

        // 16.
        // System.out.println("Enter the n for natural number : ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum_n=n*(n+1)/2;
        // System.out.println(n+" of natural numbers upto n is : "+ sum_n);

        // 17.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the first number : ");
        // int first = sc.nextInt();
        // System.out.println("Enter the second number");
        // int second = sc.nextInt();
        // System.out.println("Enter the third number");
        // int third = sc.nextInt();
        // int avg=(first+second+third)/3;
        // System.out.println("The average is : "+avg);

        // 18.
        // System.out.println("Enter the bill amount : ");
        // double amnt = sc.nextDouble();
        // double tips = (5.0/100.0)*amnt;
        // System.out.println("5% of total "+ amnt+ " is "+tips);

        // 19.
        // System.out.println("Enter the amount paid : ");
        // double amnt_paid=sc.nextDouble();
        // System.out.println("Enter the tax : ");
        // double tax_percent=sc.nextDouble();
        // double net_amount = amnt_paid/(1+tax_percent);
        // System.out.println("The calculation of total amount "+amnt_paid+" and tax percent "+tax_percent+"% of net amount is : "+net_amount);

        // 20.
        // System.out.print("Enter the basic pay : " );
        // double basic_pay=sc.nextDouble();
        // System.out.print("Enter the DA : " );
        // double DA = sc.nextDouble();
        // System.out.print("Enter the TA : " );
        // double TA = sc.nextDouble();
        // System.out.print("Enter the PF : " );
        // double PF = sc.nextDouble();
        // double gross_pay = basic_pay+DA+TA-PF;
        // System.out.println("Gross pay is : "+ gross_pay);

        // 21.
        // System.out.print("Enter the p value : ");
        // double p = sc.nextDouble();
        // System.out.print("Enter the n value : ");
        // double n = sc.nextDouble();
        // System.out.print("Enter the r value : ");
        // double r = sc.nextDouble();
        // double simple_interest = (p*n*r)/100;
        // System.out.println("The total simple interest is : "+simple_interest);

        // 22.
        System.out.print("Enter the p(principal balance) value : ");
        double p = sc.nextDouble();
        System.out.print("Enter the n(number of times) value : ");
        double n = sc.nextDouble();
        System.out.print("Enter the r(rate of interest) value : ");
        double r = sc.nextDouble();
        System.out.print("Enter the t(number of time period) value : ");
        double t = sc.nextDouble();
        double simple_interest = p*Math.pow((1+r/n),(n*t));
        System.out.println("The total compound interest is : "+simple_interest);

        // 23.
        // System.out.print("Enter the height of the person : ");
        // double height = sc.nextDouble();
        // double inch = height/2.54;
        // System.out.println("The height of "+height+"cm is "+inch+" inches");

        // 24.
        // System.out.print("Enter the height : ");
        // double height = sc.nextDouble();
        // System.out.print("Enter the weight : ");
        // double weight = sc.nextDouble();
        // double BMI = weight/(height*height);
        // System.out.println("The BMI is : "+BMI);

        // 25.
        // System.out.print("Enter the roll no : ");
        // String rollno = sc.next();
        // System.out.print("Enter the name : ");
        // String name = sc.next();
        // System.out.print("Enter the subject 1 : ");
        // double sub1=sc.nextDouble();
        // System.out.print("Enter the subject 2 : ");
        // double sub2=sc.nextDouble();
        // System.out.print("Enter the subject 3 : ");
        // double sub3=sc.nextDouble();
        // double total = sub1+sub2+sub3;
        // double avg = total/3;
        // System.out.println("total : "+total+"\n"+"average : "+avg);
    }

}
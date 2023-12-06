package Foundations_ProblemSolving;

import java.io.Console;
import java.net.SocketPermission;
import java.util.*;
import java.util.concurrent.CancellationException;

import javax.sound.midi.Synthesizer;
import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.Region;

public class q2_Conditionals
{
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {

        // 1.
        check_positive_negative_zero(GetInt("Enter the number : "));

        // 2.
        // twoInt_Equal_not(GetInt("Enter the number 1 : "), GetInt("Enter the number 2 : "));

        // 3.
        // twoFloat_Equal_not(GetFloat("Enter the number 1 : "), GetFloat("Enter the number 2 : "));

        // 4.
        // check_odd_even(GetInt("Enter the number for check even or odd : "));

        // 5.
        // check_leapYear(GetInt("Enter the year : "));

        // 6.
        // age_checking(GetInt("Enter the age : "));

        // 7.
        // check_height(GetInt("Enter the height in centimeteres : "));

        // 8.
        // largestThreeNum(GetInt("Enter the num 1 : "), GetInt("Enter the num 2 : "), GetInt("Enter the num 3 : "));

        // 9.
        // smallestAmongThreeNum(GetInt("Enter the num 1 : "), GetInt("Enter the num 2 : "), GetInt("Enter the num 3 : "));

        // 10.
        // largestAmongFourNum(GetInt("Enter the num 1 : "), GetInt("Enter the num 2 : "), GetInt("Enter the num 3 : "), 
        // GetInt("Enter the num 4 : "));

        // 11.
        // closer_num(GetInt("Enter the num 1 : "), GetInt("Enter the num 2 : "), GetInt("Enter the num 3 : "));

        // 12.
        // farther_num(GetInt("Enter the num 1 : "), GetInt("Enter the num 2 : "), GetInt("Enter the num 3 : "));

        // 13.
        // sortThreeint(GetInt("Enter the num 1 : "), GetInt("Enter the num 2 : "), GetInt("Enter the num 3 : "));

        // 14.
        // find_triangle(GetInt("Enter the num 1 : "), GetInt("Enter the num 2 : "), GetInt("Enter the num 3 : "));

        // 15.
        // quadrant_coordinate(GetInt("Enter the x coordinate : "), GetInt("Enter the y coordinates : "));

        // 16.
        // findChar_vowel_consonant(GetString("Enter the character for finding vowel or constant : "));

        // 17.
        // find_shapeName(GetInt("Enter the shape : "));

        // 18
        // Find_month(GetString("Enter the month : "));

        // 19.

        // 20.
        // sides_of_Triangle(GetInt("Enter the length 1 : "), GetInt("Enter the length 2 : "), GetInt("Enter the length 3 : "));

        // 21.
        // GradePoints_LetterGrades(GetInt("Enter the Grade : "));

        // 22.
        // find_color(GetString("Enter the column(a-h) : "), GetInt("Enter the row : "));
        // ----------alternate TERNARY OPERATOR using this question--------------
        // char character = 'a';
        // GetChessBoardColor(character, GetInt("Enter the number for chess board row : "));

        // 24.
        // String profitLoss = profitLoss(GetDouble("Enter the price : "), GetDouble("Enter the number of item : "), GetDouble("Enter the selling price : "));
        // System.out.println(profitLoss);

        // 25.
        // calculator(GetInt("Enter the number 1 : "), GetInt("Enter the number 2 : "), GetString("Enter the sign(+,-,*,/,%) : "));

        // 26.
        // String RPS = rps_game(GetInt("Let's start the game \n\nEnter the value\n0--->Rock\n1--->Paper\n2--->Scissor"));
        // System.out.println(RPS);

        // 27.
        // dayOfWeek(GetInt("Enter the day of the month in digit : "));

        // 28.
        // char character = 'a';
        // isDigit(character);

        // 29.
        // char character= 'V';
        // isUppercase(character);

        // 30.
        // char character= '1';
        // isLowercase(character);

    }


    // printString
    public static void printMessage(String message){
        System.out.println(message);
    }

    // get int 
    public static int GetInt(String message) {
        printMessage(message);
        int temp = sc.nextInt();
        return temp;
    }

    // get double 
    public static double GetDouble(String message) {
        printMessage(message);
        double temp = sc.nextDouble();
        return temp;
    }

    // get string
    public static String GetString(String message)
    {
        printMessage(message);
        String temp = sc.next();
        return temp;
    }

    // get float
    public static float GetFloat(String Message) 
    {
        printMessage(Message);
        float temp = sc.nextFloat();
        return temp;        
    }





    //#1.check_positive_negative_zero
    public static void check_positive_negative_zero(int num){
        if(num>0)
        {printMessage("The number is positive");}
        else if(num<0)
        {printMessage("The number is negative");}
        else
        {printMessage("The number is zero");}
    }
    
    //#2.twoInt_Equal_not
    public static void twoInt_Equal_not(int num1, int num2){
        if(num1==num2)
        {printMessage("The two number is equal");}
        else if (num1!=num2)
        {printMessage("The numbers is not equal");}
        else
        {printMessage("Entry is incorrect");}
    }
    
    //#3.twoFloat_Equal_not
    public static void twoFloat_Equal_not(Float num1, Float num2){
        if(num1==num2)
        {printMessage("The two number is equal");}
        else if (num1!=num2)
        {printMessage("The numbers is not equal");}
        else
        {printMessage("Entry is incorrect");}
    }
    
    //#4.check_odd_even
    public static void check_odd_even(int num){
        if (num%2==0)
        {printMessage("The number is even");}
        else
        {printMessage("The number is odd");}
    }
    //#endregion

    //#5.check_leapYear
    public static void check_leapYear(int year) {       // DOUBT WITH &&, != LOGIC 
        if (year%4==0 && (year%100!=0 || year%400==0))
        {System.out.println(year+ " is a leap year");}
        else
        {System.out.println(year+ " is not a leap year");}
    }    
    
    //#6.age_checking
    public static void age_checking(int age) {
        if (age>=18)
        {printMessage("This candidate is elligible for vote");}
        else{printMessage("This candidate is not elligible for vote");}        
    }

    //#7.check_height
    public static void check_height(int height){
        int tall = 160;
        int medium = 100;
        int Short = 85;
        if (height>=tall)
        {printMessage("tallest person");}
        else if (height>Short && height<tall)
        {printMessage("medium person");}
        else if(height<=Short)
        {printMessage("shortest person");}
    }
    
    //#8.largestThreeNum
    public static void largestThreeNum(int num1, int num2, int num3)
    {
        if (num1>num2) {
            System.out.println(num1 + "is the largest num");
        } 
        else if (num2>num3){
            System.out.println(num2 + "is the largest num");
        }
        else if(num3>num1){
            System.out.println(num3 + "is the largest num");
        }
    }
    
    //#9.smallestAmongThreeNum
    public static void smallestAmongThreeNum(int num1, int num2, int num3) {
        if (num1<num2)
        {printMessage("num 1 is the smallest number");}
        else if (num2<num3)
        {printMessage("num 2 is the smallest number");}
        else if(num3<num1)
        {printMessage("num3 is the smallest number");}
    }

    //#10.Largest among four numbers
    public static int largestAmongFourNum(int num1, int num2, int num3, int num4)
    {   int largestNum = num1;
        String largestnoName="Num1";
        //#Method no:1 

        // if(num1>num2 && num1>num3 && num1>num4)
        // {
        //     System.out.println("Num1 : "+num1+" is the largest number");
        // }
        // else if(num2>num1 && num2>num3 && num2>num4)
        // {
        //     System.out.println("Num2 : "+num2+" is the largest number");
        // }
        // else if(num3>num1 && num3>num2 && num3>num4)
        // {
        //     System.out.println("Num3 : "+num3+" is the largest number");
        // }
        // else if(num4>num1 && num4>num2 && num4>num3)
        // {
        //     System.out.println("Num4 : "+num4+" is the largest number");
        // }
        // else{System.out.println("Invalid Input");}
        //#endregion
        
        //#Method no:2
        if(largestNum<num2)
        {
            largestNum=num2;
            largestnoName = "Num2";
        }
        if(largestNum<num3)
        {
            largestNum=num3;
            largestnoName = "Num3";
        }
        if(largestNum<num4)
        {
            largestNum=num4;
            largestnoName = "Num1";
        }
        System.out.println(largestnoName + ": " + largestNum + " is the largest number");

        return -1;
        //#endregion
    }

    //#11.closer_num
    public static void closer_num(int num1, int num2, int num3)
    {
        int diff1 = Math.abs(num1-num2);
        int diff2 = Math.abs(num2-num3);
        int diff3 = Math.abs(num3-num1);

        if (diff1<diff2 && diff1<diff3)
        {
            System.out.println("Num1 = "+num1+" and " + "Num2 = "+num2+ " are closer");
        }
        else if(diff2<diff1 && diff2<diff3){
            System.out.println("Num2 = "+num2+" and " + "Num3 = "+num3+ " are closer");
        }
        else if(diff3<diff1 && diff3<diff2){
            System.out.println("Num3 = "+num3+" and " + "Num1 = "+num1+ " are closer");
        }
    }

    //#12.farther_num
    public static void farther_num(int num1, int num2, int num3){

        int diff1=Math.abs(num1-num2);
        int diff2 = Math.abs(num2-num3);
        int diff3=Math.abs(num3-num1);

        if(diff1>diff2 && diff1>diff3)
        {printMessage("num1 and num2 are farther");}
        else if(diff2>diff1 && diff2>diff3)
        {printMessage("num2 and num3 are farther");}
        else
        {printMessage("num3 and num1 are farthers");}
    }

    //#13.sortThreeint
    public static void sortThreeint(int num1, int num2, int num3)
    {
        int min=0;        int mid=0;        int max=0;
        if(num1<num2 && num1<num3)
        {
            min = num1;
            if(num2<num3){
                mid= num2;
                max = num3;
            }
            else{
                mid = num3;
                max = num2;
            }
        }
        else if(num2<num1 && num2<num3)
        {
            min = num2;
            if(num1<num3){
                mid= num1;
                max = num3;
            }
            else{
                mid = num3;
                max = num1;
            }
        }
        else if(num3<num1 && num3<num2)
        {
            min = num3;
            if(num2<num1){
                mid= num2;
                max = num1;
            }
            else{
                mid = num1;
                max = num2;
            }
        }
        else{
            System.out.println("Invalid Input");
        }
        System.out.println(min+","+mid+","+max);
    }

    //#14.find_triangle
    public static int find_triangle(int value1, int value2, int value3){
        int angles = value1+value2+value3;
        if (angles==180)
        {printMessage("It is a trangle");}
        else
        {printMessage("It is not a triangle");}
        return angles;
    }

    //#15.quadrant_coordinate
    public static void quadrant_coordinate(int x, int y){
        if(x>0 && y>0)
        {System.out.println("The entered points of ("+x+","+y+") is a first quadrant");}
        if(x<0 && y>0)
        {System.out.println("The entered points of ("+x+","+y+") is a second quadrant");}
        if(x<0 && y<0)
        {System.out.println("The entered points of ("+x+","+y+") is a third quadrant");}
        if(x>0 && y<0)
        {System.out.println("The entered points of ("+x+","+y+") is a fourth quadrant");}
    }

    //#16.findChar_vowel_consonant
    public static void findChar_vowel_consonant(String alphabet) {
        String v1="a";
        String v2="e";
        String v3="i";
        String v4="o";
        String v5="u";

        if (alphabet.equals(v1) || alphabet.equals(v2) || alphabet.equals(v3) || alphabet.equals(v4) || alphabet.equals(v5))
        // if (alphabet=="a" || alphabet==v2 || alphabet==v3 || alphabet==v4 || alphabet==v5)
        {   System.out.println("The entered character '"+ alphabet+ "' is vowel");}
        else
        {   System.out.println("This "+ alphabet+ " is consonant");}        
    }

    //#17.find_shapeName
    public static void find_shapeName(int size){
        if(size==1)
        {System.out.println("The entered size '"+size+"' is Henagon");}
        else if(size==2)
        {System.out.println("The entered size '"+size+"' is Digon");}
        else if(size==3)
        {System.out.println("The entered size '"+size+"' is Triangle");}
        else if(size==4)
        {System.out.println("The entered size '"+size+"' is Quadrilateral");}
        else if(size==5)
        {System.out.println("The entered size '"+size+"' is Pentagon");}
        else if(size==6)
        {System.out.println("The entered size '"+size+"' is Hexagon");}
    }

    //#18.Find_month
    public static void Find_month(String month_name) {
        if (month_name.equalsIgnoreCase("january") || month_name.equalsIgnoreCase("march") || month_name.equalsIgnoreCase("may")|| month_name.equalsIgnoreCase("july")|| month_name.equalsIgnoreCase("august")|| month_name.equalsIgnoreCase("october")|| month_name.equalsIgnoreCase("december"))
        {
            System.out.println(month_name + " had a 31 days");
        }
        else if (month_name.equalsIgnoreCase("april") || month_name.equalsIgnoreCase("june") || month_name.equalsIgnoreCase("september")|| month_name.equalsIgnoreCase("november"))
        {
            System.out.println(month_name + " had a 30 days");
        }
        else
        {
            System.out.println(month_name + " had a 28 days");
        }        
    }

    //#19.
    
    //#endregion

    //#20.sides_of_Triangle
    public static void sides_of_Triangle(int length1, int length2, int length3){
        if (length1==length2 && length2==length3 && length3==length1)
        {printMessage("This is Equilateral triangle");}
        else if (length1==length2 || length2==length3 || length3==length1)
        {printMessage("This is Isosceles triangle");}
        else if (length1!=length2 && length2!=length3 && length3!=length1)
        {printMessage("This is Scalene triangle");}
    }

    //#21.GradePoints_LetterGrades
    public static void GradePoints_LetterGrades(int grade){
        int a=90;
        int b=80;
        int c=60;
        int d=50;
        int f=50;
        if(grade>=a)
        {printMessage("'O' Grade");}
        else if(grade>=b)
        {printMessage("'A' Grade");}
        else if(grade>=c)
        {printMessage("'A+' Grade");}
        else if(grade>=d)
        {printMessage("'B' Grade");}
        else if(grade<f)
        {printMessage("'B+' Grade");}
    }

    //#22.find_color
    public static void find_colorFromChessBoard(String column, int row){
        if (column.equals("a") && row%2==0 || column.equals("c") && row%2==0 || column.equals("e") && row%2==0 || column.equals("g") && row%2==0)
        {System.out.println(column+row+" the color is white");}
        else
        {System.out.println(column+row+" the color is black");}   
    }
    // ----------alternate TERNARY OPERATOR using this question
    public static void GetChessBoardColor(char column, int row){
        int columnValue = (int) column;
        System.out.println(row+columnValue%2==0? "Black":"White");
        System.out.println(row%2!=0 && (columnValue==97||columnValue==99||columnValue==101||columnValue==103)? "Black":"White");
    }

    // 23............................

    //#24.profitLoss
    public static String profitLoss(Double price, Double numberOf_item, Double selling_price)
    // public static String Profit_loss(double price, double numberOf_item, double selling_price) {
    {
        double Total_Revenue=numberOf_item*selling_price;
        double Total_cost=numberOf_item*price;
        double profit=Total_Revenue-Total_cost;
        double loss = Total_cost-Total_Revenue;
        if (profit>loss)
        {return "profit";}        
        else
        {return "loss";}
    }

    //#25.calculator
    public static void calculator(int num1, int num2, String sign)
    {
        if (sign.equals("+"))
        {System.out.println(num1+"+"+num2+"="+(num1+num2));}
        else if (sign.equals("-"))
        {System.out.println(num1+"-"+num2+"="+(num1-num2));}
        else if (sign.equals("*"))
        {System.out.println(num1+"*"+num2+"="+(num1*num2));}
        else if (sign.equals("/"))
        {System.out.println(num1+"/"+num2+"="+(num1/num2));}
        else if (sign.equals("%"))
        {System.out.println(num1+"%"+num2+"="+(num1%num2));}
        else
        {
            System.out.println("Invalid input");
        }
    }

    //#26.Rps Game
    public static String rps_game(int user)
    {
        int rock = 0;
        int paper = 1;
        int scissor = 2;
        int bot = r.nextInt(3);

        if (user==bot)
        {
            System.out.println("User Enter : " + user + " and Bot Enter : " + bot);
            return "Match Draw";
        }
        else if (user==rock && bot==2 || user==paper && bot==0 || user == scissor && bot==1)
        {
            System.out.println("User Enter : " + user + " and Bot Enter : " + bot);
            return "User Wins";
        }
        else
        {
            if (bot==0 && user==scissor && bot==1 && user==rock || bot==2 && user==paper )
            {
                System.out.println("User Enter : " + user + " and Bot Enter : " + bot);
                return "Bot Wins";
            }
            // else if(user<0 && user>2)
            // {
            //     return "Invalid Input";
            // }
            else{
                    return "Invalid Input Kindly ReCheck And ReEnter The Input\nThanks for playing";
                }
            }
        }
    
    //#27.dayOfWeek
    public static void dayOfWeek(int dayOfMonth)
    {
        if (dayOfMonth==1 || dayOfMonth==8 || dayOfMonth==15 || dayOfMonth==22 || dayOfMonth==29)
        {
            System.out.println("You entered day of "+dayOfMonth+ " is Monday");
        }
        else if (dayOfMonth==2 || dayOfMonth==9 || dayOfMonth==16 || dayOfMonth==23 || dayOfMonth==30)
        {
            System.out.println("You entered day of "+dayOfMonth+ " is Tuesday");
        }
        else if (dayOfMonth==3 || dayOfMonth==10 || dayOfMonth==17 || dayOfMonth==24 )
        {
            System.out.println("You entered day of "+dayOfMonth+ " is Wednesday");
        }
        else if (dayOfMonth==4 || dayOfMonth==11 || dayOfMonth==18 || dayOfMonth==25 )
        {
            System.out.println("You entered day of "+dayOfMonth+ " is Thursday");
        }
        else if (dayOfMonth==5 || dayOfMonth==12 || dayOfMonth==19 || dayOfMonth==26 )
        {
            System.out.println("You entered day of "+dayOfMonth+ " is Friday");
        }
        else if (dayOfMonth==6 || dayOfMonth==13 || dayOfMonth==20 || dayOfMonth==27 )
        {
            System.out.println("You entered day of "+dayOfMonth+ " is Saturday");
        }
        else if (dayOfMonth==7 || dayOfMonth==14 || dayOfMonth==21 || dayOfMonth==28 )
        {
            System.out.println("You entered day of "+dayOfMonth+ " is Sunday");
        }
        else
        {
            System.out.println("Invalid input kindly reCheck and reEnter your value");
        }


        
    }

    //#28.isDigit
    public static void isDigit(char characterToCheck)
    {
        int value1 = (int) characterToCheck;
        int asciiInitialDigit = 48;
        int asciiFinalDigit = 57;

       
        if(value1>=asciiInitialDigit && value1<=asciiFinalDigit)
        {
            System.out.println("The entered character " + characterToCheck + " is digit");
        }
        else
        {
            System.out.println("The entered character " + characterToCheck + " is not digit");
        }
    }

    //#29.isUppercase
    public static void isUppercase(char characterToCheck)
    {
        int value1 = (int) characterToCheck;
        int asciiInitialUppercase = 65;
        int asciiFinalUppercase = 90;
        
        if (value1>=asciiInitialUppercase && value1<=asciiFinalUppercase)
        {
            System.out.println("The entered character  " + characterToCheck + " is UpperCase");
        }
        else
        {
            System.out.println("The entered character  " + characterToCheck + " is not UpperCase");
        }
    }

    //#30.isLowercase
    public static void isLowercase(char characterToCheck)
    {
        int value1 = (int) characterToCheck;
        int asciiInitialLowercase = 97;
        int asciiFinalLowercase = 122;
        
        if (value1>=asciiInitialLowercase && value1<=asciiFinalLowercase)
        {
            System.out.println("The entered character  " + characterToCheck + " is LowerCase");
        }
        else
        {
            System.out.println("The entered character  " + characterToCheck + " is not LowerCase");
        }
    }
    
}
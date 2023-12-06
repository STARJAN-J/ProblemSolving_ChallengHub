package Foundations_ProblemSolving;

import java.io.Console;
import java.net.SocketPermission;
import java.util.*;
import java.util.concurrent.CancellationException;

import javax.sound.midi.Synthesizer;
import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.Region;

public class q3_Loops_Iterations
{
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {

        // 1.
        // getNum_N(GetInt("Enter the num n : "));

        // 2.
        // int result1 = getNum_MtoN(GetInt("Enter the num m : "), GetInt("Enter the num n : "));
        // System.out.println(result1);

        // 3.
        // int resul1 = 
        // getEven_num(getNum_N(GetInt("Enter the number : ")));   // here i call another funtion in the arguments
        // System.out.println(resul1);

        // 4.
        // getOdd_num(GetInt("Enter the number for n : "));

        // 5.
        // even_numM_N(GetInt("Enter the number for m : "), GetInt("Enter the number for n : "));

        // 6.
        getOdd_numM_N(GetInt("Enter the number for m : "), GetInt("Enter the number for n : "));

        // 7.
        // getDivisible_num(GetInt("Enter the number n : "), GetInt("Enter the number for k : "));

        // 8.
        // mulTable_upto20(GetInt("Enter the number n : "), GetInt("Enter the number for multiplication : "));
        
        // 9.
        // getSum(GetInt("Enter the number n : "));

        // 10.
        // getEven_sum(GetInt("Enter the number n : "));

        // 11.
        // getOdd_sum(GetInt("Enter the number n : "));

        // 12.
        // getSum_multiples(GetInt("Enter the number n : "), GetInt("Enter the number for k : "));

        // 13.
        // fizzBuzz(GetInt("Enter the number for finding fizz buzz : "));

        // 14.
        // factorial(GetInt("Enter the number n : "));

        // 15.
        // calculateMarks(GetInt("Enter the number n : "));

        // 16.
        // runnigScores(GetInt("Enter the number n : "));

        // 17.
        // mulTables(GetInt("Enter the multiplication table upto : "), GetInt("Enter the rows to display  : "));

        // 18.
        // calculator("Hi! enjoy calculation");

        // 19.
        // rpsGame(msgForMA(), GetInt("Enter the number of rounds : "));

        // 20.
        // numGuessingGame();


            
    






    }


    // show string
    public static void printMessage(String message){
        System.out.print(message);
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
    public static float GetFloat(String Message) {
        printMessage(Message);
        float temp = sc.nextFloat();
        return temp;        
    }





    // 1.getNum_N
    public static int getNum_N(int n)
    {   int i = 0;
        while (i<=n) {              // here, we can also use for loop
            // System.out.println(i);
             i++;
        }
        return n;

    }

    // 2.getNum_MtoN
    public static int getNum_MtoN(int m, int n)
    {
        // int  i = 0;
        for(int i=m; i<=n; i++)
        {
            System.out.println(i);
        }
        return n;
    }

    // 3.getEven_num
    public static void getEven_num(int n)
    {
        for(int i = 1; i<=n; i++){
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
        // return n;
    }

    // 4.getOdd_num
    public static void getOdd_num(int n)
    {  
        for (int i=1; i<=n; i=i+2)      // here, i=i+2 vantu n odd no kudutha mattum tha i um odd la varum, even kudutha even verum
        {
            // if (i%2!=0)
            {System.out.println(i);}
        }
    }

    // 5.getEven_numM_N
    public static void getEven_numM_N(int m, int n)
    {
        for (int i=m; i<=n; i++)
        
            if (i%2==0)
            {System.out.println(i);}
    }

    // 6.getOdd_numM_N
    public static void getOdd_numM_N(int m, int n)
    {
        for (int i=m; i<=n; i=i+2)  // here, i=i+2 vantu n even kudutha mattum tha i um odd la varum even, illena odd no kudutha odd tha varum, 
        {
            // if (i%2!=0)
            {System.out.println(i);}
        }
    }

    // 7.getDivisible_num
    public static void getDivisible_num(int n, int k)
    {
        for (int i=0; i<=n; i++){
            int j = i%k;
            switch (j){
                case (0):
                    System.out.println(i);
                    break;
                default :   // default is optional
                    System.out.println("Invalid Input");
            }
        }
    }

    // 8.mulTable_upto20
    public static int mulTable_upto20(int n, int mulNum)
    {
        int i = 1;
        while (i<=n)
        {
            System.out.println(i+"*"+mulNum+"="+mulNum*i);
            i++;
        }
        return n;
    }

    // 9.getSum
    public static void getSum(int n){
        int sum = 0;
        for (int i = 0; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    // 10.getEven_sum
    public static void getEven_sum(int n){
        int sum = 0;
        for (int i = 0; i<=n; i++){
            if(i%2==0){
                sum +=i;
            }
        }
        System.out.println(sum);
    }

    // 11.getOdd_sum
    public static void getOdd_sum(int n){
        int sum = 0;
        for (int i = 0; i<=n; i++){
            if(i%2!=0){
                sum +=i;
            }
        }
        System.out.println(sum);
    }

    // 12.getSum_multiples
    public static void getSum_multiples(int n, int k)
    {
        int sum = 0;
        for (int i = 0; i<=n; i++){
            if(i%k==0){
                sum +=i;
            }
        }
        System.out.println(sum);
    }

    // 13.fizzBuzz, also we can used ternary operator for condition
    public static void fizzBuzz(int n)
    {
        for (int i=0; i<=n; i++){
            // if(i%3==0 && i%5==0){
            //     System.out.println(i+"=Fizz Buzz\t\t||");
            // }
            // else if(i%3==0){
            //     System.out.println(i+"=Fizz\t\t\t||");
            // }
            // else if(i%5==0)
            // {
            //     System.out.println(i+"=Buzz\t\t\t||");
            // }
            // else
            // {
            //     System.out.println("\t\t\t\t\t\t"+i+"=Invalid Input Kindly check \t||");
            // }

            System.out.println(i%3==0 && i%5==0?i+"=Fizz Buzz\t\t||":(i%3==0?i+"=Fizz\t\t\t||":(i%5==0? i+"=Buzz\t\t\t||":"\t\t\t\t\t\t"+i+"=Invalid Input Kindly check \t||")));
        }
    }

    // 14.factorial
    public static void factorial(int n)
    {
        int factor = 1;        
        for (int i = 1; i<=n; i++){
            factor *= i;
        }
        System.out.println("Factorial of "+n+" is "+factor);
    }

    // 15.calculateMarks
    public static void calculateMarks(int n)
    {
        int mark = 0;
        int average = 0;
        int total = 0;
        for (int i = 1; i<=n; i++){
            mark = GetInt("Enter the mark of subject : "+ i);
            total += mark;
        }
        System.out.println("Total Mark : "+total);
        average = total/n;
        System.out.println("Average Mark : "+average);
    }

    // 16.runningScores
    public static void runningScores(int n)
    {
        int score = 0;
        int cummulative = 0;
        for (int i=1; i<=n; i++){
            score = GetInt("Enter the score for round "+i+" : ");
            cummulative += score;
            System.out.println("Cummulative score of round "+i+" : "+cummulative);
        }
    }

    // 17.mulTables
    public static void mulTables(int n, int k)
    {
        for (int i=1; i<=k; i++){
            for (int j = 1; j<=n; j++){
                int result = i * j;
                System.out.printf("%2d*%2d=%3d", j, i, result);     // here "%2d*%2d=%3d"--> this is formatting the output to arrange integers
                if (j<n) {
                    System.out.print(" || ");
                } 
                else {
                    System.out.println(" ||");
                }
                
            }
            // System.out.println();
        }
    }

    // 18.calculator
    public static String calculator(String msg)
    {
        System.out.println(msg);
        int num1 = GetInt("Enter number 1 for calculation : ");
        int num2 = GetInt("Enter number 2 for calcualtion : ");
        String sign = " ";
        String input = " ";
        do {
            sign = GetString("Enter the sign for perfoming calculations '+', '-'', '*', '/', '%' : ");
            switch (sign) 
            {
                case ("+"):
                    int add = num1+num2;
                    System.out.println("The sum is : "+add);
                    break;

                case ("-"):
                    int diff = Math.abs(num1-num2);
                    System.out.println("The diiference is : "+diff);
                    break;

                case ("*"):
                    int mul = num1*num2;
                    System.out.println("The multiply is : "+mul);
                    break;

                case ("/"):
                    int div = num1/num2;
                    System.out.println("The division is : "+div);
                    break;

                case ("%"):
                    int modulo = num1%num2;
                    System.out.println("The modulo is : "+modulo);
                    break;
            }
            input = GetString("Do you want to continue to one more calculation, Enter 'yes' : ");
        } 
        while (input=="yes" || input.equals("Yes")|| input.equals("YES"));

        return msg;
    }

    // 19.rpsGame
    public static String msgForMA()
    {
        String msg = "\n\t\t\t\tWelcome to the world of Mark Antony \n\t\tA game consist of 5 rounds, whoever wins three rounds, they WON the game\n\n";
        System.out.println(msg);
        return msg;
    }
    public static void rpsGame(String msg,int n)
    {

        // int toss = r.nextInt(2);
        int rock = 0;
        int paper = 1;
        int scissor = 2;

        // int draw;
        int userWinCount = 0;
        int botWinConunt = 0;
        
        for (int i=1; i<=5; i++){
            System.out.println("\n\tRound : "+i);
            int user = GetInt("You are player 1 \nEnter rock = 0, paper = 1, scissor = 2 : ");
            int bot = r.nextInt(3);
            if(user==bot)
            {
                System.out.println("User enter : "+user+" || Bot enter : "+ bot+" ====> Match Draw");
            }
            else if (user == rock && bot == 2 || user==paper && bot==0 || user==2 && bot==1)
            {
                System.out.println("User enter : "+user+" || Bot enter : "+ bot+" ====> Player 1 wins");
                userWinCount++;
            }
            else if (bot==0 && user==scissor || bot==1 && user==rock || bot==2 && user==paper)
            {
                System.out.println("User enter : "+user+" || Bot enter : "+ bot+" ====> Bot Wins");
                botWinConunt++;
            }
            else
            {   int j = 0;
                int invalidCount = 1;
                while(j<invalidCount)
                {
                System.out.println("Invalid Input, Kindly recheck and reenter the input");
                System.out.println("\n\tRound : "+i);
                user = GetInt("You are player 1 \nEnter rock = 0, paper = 1, scissor = 2 : ");
                bot = r.nextInt(3);
                if(user==bot)
                {
                    System.out.println("User enter : "+user+" || Bot enter : "+ bot+" ====> Match Draw");
                }
                else if (user == rock && bot == 2 || user==paper && bot==0 || user==2 && bot==1)
                {
                    System.out.println("User enter : "+user+" || Bot enter : "+ bot+" ====> Player 1 wins");
                    userWinCount++;
                }
                else if (bot==0 && user==scissor || bot==1 && user==rock || bot==2 && user==paper)
                {
                    System.out.println("User enter : "+user+" || Bot enter : "+ bot+" ====> Bot Wins");
                    botWinConunt++;
                }
                else{
                    invalidCount++;
                }
                j++;
                }

            }
        }
        if (userWinCount>botWinConunt)
        {
            System.out.println("\nPlayer 1 won the game\nTotal round wins : "+userWinCount);
        }
        else if (userWinCount<botWinConunt){
            System.out.println("\nBot won the game\n");
        }
        else {
            System.out.println("\nNo one won the game\n");
        }
    }

    // 20.
    public static void numGuessingGame()
    {
        int x = r.nextInt(30);
        int guessCount = 0;
        for (int i=0; i<guessCount; i++){
            int guess = GetInt("Guess the number : ");
            if(x==guess){
                System.out.println("you guessed the magic number");
                guessCount++;
            }
            else if (x<guess)
            {
                System.out.println("your guess is the more than the magic number");
                guessCount++;
            }
            else if (x>guess)
            {
                System.out.println("your guess is less than the magic number");
                guessCount++;
            }
            else
            {
                System.out.println("Invalid Input");
            }
        }
        System.out.println("You guessed the magic number "+guessCount+" attempts");
    }
}
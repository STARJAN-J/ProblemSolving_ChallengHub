package Foundations_ProblemSolving;

import java.util.*;


public class q8PatternPrinting {

    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();

    public static void main(String[] args) {

        // 1.
        // squareBoard();

        // 2.
        // checkerBoard();

        // 3.a
        // leftDown_leadingDiagonal();
        
        // 3.b
        // leftUpper_trailingDiagonal();

        // 3.c
        // rightUpper_leadingDiagonal();

        // 3.d
        rightLower_trailingDiagonal();

        // 3.e
        // boxDiagonal();

        // 3.f
        // reverseZ();

        // 3.g
        // straigtZ();

        // 3.h
        // doublDiagonal_uRowl();

        // 3.i
        // boxDoublDiagonal_uRowl();

        // 3.j
        // letterincreamentLeftDown_leadingDiagonal();

        // 3.k
        // numLeftDown_leadingDiagonal();

        // 3.l
        // numIncreamentLeftDown_leadingDiagonal();

        // 3.m
        // leftPyramidDaiagonal();



        
    }

    // get int 
    public static int getInt(String message) {
        System.out.print(message);
        int temp = sc.nextInt();
        return temp;
    }


    // 1.squareBoard
    public static void squareBoard(){
        int n = 5;
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    // 2.checkerBoard
    public static void checkerBoard(){
        int n = 7;
        for (int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                if(row%2==0){
                System.out.print(" *");}
                else{
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
    }

    // 3.a
    public static void leftDown_leadingDiagonal(){
        int n = getInt("Input your matrix format : ");
        int x = 0;
        for (int row=1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                if(row>=col){
                    System.out.print("* ");
                }
            }
            System.out.println(" ");
        }
    }
    
    // 3.b
    public static void leftUpper_trailingDiagonal(){
        int n = getInt("Input your matrix format : ");
        for (int row=1; row<=n; row++){
            for(int col = 1; col<=n; col++){
                if(row<=col){
                    System.out.print(" *");
                }
            }
            System.out.println(" ");
        }
    }

    // 3.c ----------doubt------------
    public static void rightUpper_leadingDiagonal(){

        int n = getInt("Input your matrix format : ");

        for (int row=0; row<=n; row++){

            for (int col = row; col<= n; col++){
                System.out.print("* ");
            }
            for(int col = 0; col<=row; col++){    
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 3.d
    public static void rightLower_trailingDiagonal(){

        int n = getInt("Input your matrix format : ");

        for (int row=1; row<=n; row++){

            for (int col = row; col<=n; col++){
                System.out.print("  ");
            }
            for(int col = 1; col<=row; col++){    
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3.e
    public static void boxDiagonal(){
        int n = getInt("Input your matrix format : ");
        for (int row=1; row<=n; row++){
            for (int col = 1; col<=n; col++) {
                if(row==1 || row==n || col==1 || col==n)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");     //Two space for symmetry
                }
            }
            System.out.println();
        }
    }

    // 3.f
    public static void reverseZ(){
        int n = getInt("Input your matrix format : ");
        for (int row=1; row<=n; row++){
            for (int col = 1; col<=n; col++) {
                if(row==1 || row==n || row==col)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");     //Two space for symmetry
                }
            }
            System.out.println();
        }
    }

    // 3.g
    public static void straigtZ(){
        int n = getInt("Input your matrix format : ");
        for (int row=1; row<=n; row++){
            for (int col = 1; col<=n; col++) {
                if(row==1 || row==n || row+col==n+1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");     //Two space for symmetry
                }
            }
            System.out.println();
        }
    }

    // 3.h
    public static void doublDiagonal_uRowl(){
        int n = getInt("Input your matrix format : ");
        for (int row=1; row<=n; row++){
            for (int col = 1; col<=n; col++) {
                if(row==1 || row==n || row+col==n+1 || row==col)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");     //Two space for symmetry
                }
            }
            System.out.println();
        }
    }

    // 3.i
    public static void boxDoublDiagonal_uRowl(){
        int n = getInt("Input your matrix format : ");
        for (int row=1; row<=n; row++){
            for (int col = 1; col<=n; col++) {
                if(row==1 || row==n || row+col==n+1 || row==col || col==1 || col==n)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");     //Two space for symmetry
                }
            }
            System.out.println();
        }
    }

    // 3.j
    public static void letterincreamentLeftDown_leadingDiagonal()
    {
        int n = getInt("Input your matrix format : ");
        int x = 97;
        for (int row=1; row<=n; row++){
            for (int col=1; col<=n; col++){
                if(row>=col){
                    System.out.print((char)(x++)+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // 3.k
    public static void numLeftDown_leadingDiagonal()
    {
        int n = getInt("Input your matrix format : ");
        int x = 1;
        for (int row=1; row<=n; row++){
            for (int col=1; col<=n; col++){
                if(row>=col){
                    System.out.print(x +" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            x++;
        }
    }

    // 3.l
    public static void numIncreamentLeftDown_leadingDiagonal()
    {
        int n = getInt("Input your matrix format : ");
        int x = 0;
        for (int row=1; row<=n; row++){
            for (int col=1; col<=n; col++){
                if(row>=col){
                    System.out.print(x++ +" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // 3.m
    public static void leftPyramidDaiagonal()
    {
        int n = getInt("Input your matrix format : ");
        for (int row = 1; row <=n; row++) {
            String v = sc.next();
            for (int col = 1; col<=n; col++) {
                if(row==col)
                {
                    
                    System.out.print(v + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    

    
















}
package com.bridgelabz.largestofthree;
import java.util.Scanner;
public class LargestOfThree {

    public static void c1(int a,int b,int c)
    {
        if(a>b && a>c){
            System.out.println("first number is largest");
        } else if (b>c) {
            System.out.println("Second number is largest");
        }
        else{
            System.out.println("Third number is largest");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter First number ");
        int a=sc.nextInt();
        System.out.println("enter second number ");
        int b=sc.nextInt();
        System.out.println("enter second number ");
        int c=sc.nextInt();
        c1(a,b,c);


    }




}

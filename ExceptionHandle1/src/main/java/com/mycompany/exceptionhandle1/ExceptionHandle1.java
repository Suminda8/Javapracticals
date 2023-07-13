

package com.mycompany.exceptionhandle1;

import java.util.Scanner;


public class ExceptionHandle1 {

    public static void main(String[] args) {
        int n1,n2,ans;
        Scanner sc=new Scanner(System.in);
       
        try
        {
            System.out.println("Enter 1st Number :");
            n1=sc.nextInt();
            System.out.println("Enter 2nd Number :");
            n2=sc.nextInt();
           
            ans=n1/n2;
            System.out.println("Answer is :"+ans);
        }
        catch(ArithmeticException e)
        {
            //System.out.println("e.getMessage");
            System.out.println("Error : Divide by the zero is not allowed");
        }
    }
}

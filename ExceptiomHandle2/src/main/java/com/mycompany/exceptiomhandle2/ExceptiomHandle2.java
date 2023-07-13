

package com.mycompany.exceptiomhandle2;

import java.util.Scanner;


public class ExceptiomHandle2 {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        try
        {
            int value = numbers[10];
            int result = value/0;
            System.out.println("Value "+ value);
        }
        catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Error Array Index Out of Bounds"); 
                }
        finally{
            for(int i=0;i<numbers.length;i++)
            {
                System.out.println(numbers[i]+" ");
            }
        }
    }
}

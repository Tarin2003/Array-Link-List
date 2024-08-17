package array_linkedlist;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
        System.out.println("How many numbers : ");
        int n = input.nextInt();
        System.out.println("Please enter numbers :");
        for(int i =0; i<n; i++)
        {
            number[i]= input.nextInt();
        }
        System.out.print("Array element : ");
        for(int a : number){
            System.out.print(a+" ");
        }
        System.out.println("\n");
        Arrays.sort(number);
        for(int a : number){
            System.out.print(a+" ");
        }
    }
   
    
}

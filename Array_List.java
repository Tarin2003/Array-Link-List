/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_linkedlist;

import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        ArrayList<Integer> number1 = new ArrayList<Integer>();
        //adding element
        number.add(20);
        number.add(30);
        number.add(2, 40);
        System.out.println("Array element :"+number);
        System.out.println("Size : "+number.size());
        number1.addAll(number);
        System.out.println("number1 : "+number1);
        //60 contain
        boolean b = number.contains(60);
        System.out.println("60 is the list :"+b);
        //30 index
        int pos = number.indexOf(30);
        System.out.println("The index of 30 is :"+pos);
        //0 index value
        int x = number.get(0);
        System.out.println("Index 0 ="+x);
        //remove
        number.remove(1);
        System.out.println("Remove element :"+number);
        //clear
        number.clear();
        System.out.println(number);
        b = number.isEmpty();
        System.out.println("Arraylist empty :"+b);
        
    }
}

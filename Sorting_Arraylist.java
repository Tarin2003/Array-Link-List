/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_linkedlist;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Hp
 */
public class Sorting_Arraylist {
     public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        //adding element
        number.add(30);
        number.add(3);
        number.add(-40);
        number.add(2);
        System.out.println("Before sorting :"+number);
        Collections.sort(number);
        System.out.println("After sorting in ascending :"+number);
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("After sorting in descending :"+number);
     }
}

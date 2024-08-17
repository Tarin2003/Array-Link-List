/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_linkedlist;

/**
 *
 * @author Hp
 */
public class String_Comparism {
    public static void main(String[] args) {
        String pass1 = "Anis123";
        String pass2 = "Anis123";
        String pass3 = new String("Anis123");
        String pass4 = new String("Anis123");
         String pass5 = "anis123";
        System.out.println("pass1 equal pass2: " +pass1.equals(pass2));//equal content
        System.out.println("pass1 equal pass3: " +pass1.equals(pass3));
        System.out.println("pass3 equal pass4: " +pass3.equals(pass4));
         System.out.println("pass1 equal pass5: " +pass1.equals(pass5));
        
        System.out.println("pass1 == pass2: " +(pass2 == pass1));//== operator refference
        System.out.println("pass1 == pass3: " +(pass1==pass3));
        System.out.println("pass3 == pass4: " +(pass3==pass4));
        System.out.println("pass1 == pass5: " +(pass1==pass5));
        
    }
    
}

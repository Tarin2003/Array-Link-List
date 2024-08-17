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
public class string {
    public static void main(String[] args) {
        String s1 = "Sadia Tarin";
        String s2 = "Ummehani";
        String s3 = new String("Ummehani");
        String s4 = "sadia tarin";
        System.out.println(s1+" "+s2);//cocatanation
        System.out.println("Length : "+s1.length());
        if(s2==s3){
            System.out.println("s1 equal s2");
            
        }else{
            System.out.println("False");
        }
        if(s2.equals(s3)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
        if(s1.equalsIgnoreCase(s4)){
            System.out.println("s1 equal s4");
        }else{
            System.out.println("s1 equal s4");
        }
        boolean b = s1.contains("tarin");
        System.out.println(b);
          b = s1.contains("Tarin");//case sensitive
        System.out.println(b);
        b = s1.startsWith("S");//case sensitive
        System.out.println(b);
        b = s1.endsWith("n");
        
         System.out.println(b);
    }
    
}

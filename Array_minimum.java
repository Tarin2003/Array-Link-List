package array_linkedlist;

/**
 *
 * @author Hp
 */
public class Array_minimum {
    public static void main(String[] args) {
        int[] number ={10,2,3,20,40};
    int max = number[0];
    int min = number[0];
    for(int i=0;i< number.length;i++)
      {
          if (max<number[i])
            max = number[i];
   
      
          if (min>number[i])
            min = number[i];
    }
        System.out.println("Maximum : "+max);
        System.out.println("Minimum : "+min);
}
    }


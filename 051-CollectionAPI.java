import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

 class Lesson51 {
    
  
    public static void main(String[] args) {
        // // Concept of Array
        // //'<>' inside this bracket we specify the datatype of values we store
        //  // Collectrion does not support hte index value
        // Collection <Integer> nums = new ArrayList <Integer>();

        List <Integer> nums = new ArrayList <Integer>();
        //List Supports index value 

        //// Same values are only saved once
        //Set <Integer> nums = new HashSet<Integer>();

        // to get sorted values use 'Tree Set' instead of 'Hash Set' 
        // Collection <Integer> nums = new TreeSet<Integer>();
        
        nums.add(69);
        nums.add(95);
        nums.add(75);
        nums.add(99);
        nums.add(69);
        
        // Iterator <Integer> values = nums.iterator();
        // values.next();
 
        // while(values.hasNext())
        //     System.out.println(values.next());

    //    System.out.println(nums.get(3));
    //    nums.set(2, 23);            
        // Can't use normel for loop use enhance for loop

        for (int n : nums) {
            System.out.println(n);
        }
    //     System.out.println(nums);
    // }
}
 }
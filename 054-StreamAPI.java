
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
// Stream is an interface
class Lesson54 {
    public static void main(String[] args) {
        int sum = 0;
        List <Integer> nums =  /* new ArrayList<Integer>(); instead you can write*/ Arrays.asList(2,6,3,9,4,1);

        // for (int n : nums){
        //     System.out.println(n);
        //     // if(n % 2 == 0) {
        //     //     n += 2;
        //     //     sum += n;
        //     // }
        // }
        // System.out.println(nums);
        // System.out.println(sum);



            // Consumer <Integer> con = new Consumer<Integer>() {
            //     public void accept (Integer n) {
            //         System.out.println(n);
            //     }
     
            // };
            // nums.forEach(con);

//              |
//              V

            // nums.forEach( n -> System.out.println(n));


        // (+) to print each and every elemnt you have to use 
        // nums.forEach(n -> System.out.println(n));


        // --------------------------------------------------------------------------------------------------------------
        // Stream <Integer> s1 = nums.stream();
        // // s1.forEach( n -> System.out.println(n)); // we can't reuse the object s1

        // // to print only even numbers
        // Stream <Integer> s2 = s1.filter(n -> n%2 == 0);
        // // s2.forEach( n -> System.out.println(n));

        // // to double each values
        // Stream <Integer> s3 = s2.map(n -> n += 2);
        // // s3.forEach( n -> System.out.println(n));

        // // to add each doubled values of an array
        // int result = s3.reduce(2, (c , e ) -> c + e );
        // System.out.println(result);



        // Function <Integer, Integer> f1 = n -> n * 2;
            
            
        
        // int result = nums.stream()
        //                     .filter(n -> n%2 == 0)
        //                     .map(/*n -> n += 2*/f1)
        //                     .reduce(2, (c , e ) -> c + e);   
        // System.out.println(result);               
        
        

        
            
            
        
        Stream <Integer> sortedValues = nums.stream()
                            .filter(n -> n%2 == 0)
                            .sorted();
                               
        sortedValues.forEach(n -> System.out.println(n));                                                                                                                                                                                                                                                                                                                                



        

        
    }
}

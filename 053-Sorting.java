// import java.lang.invoke.StringConcatException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// class Lesson53 {

//     public static void main(String[] args) {

        // Comparator <Integer> com = new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer i, Integer j) {
        //         if ((i % 10 > j % 10))
        //             return 1;
        //         else 
        //             return -1;    
        //     }
        // };

        // List <Integer> nums = new ArrayList<>();
        // nums.add(69);
        // nums.add(96);
        // nums.add(75);
        // nums.add(43);
        
        // // to sort 
        // Collections.sort(nums);
        // // to print the sorted array
        // System.out.println(nums);

        // // to sort based on the last digit
        // Collections.sort(nums,com);
        // System.out.println(nums);
       

        //// Creat an array of Strings and sort based on the length of array

        //// ----------------------------------------------------------------------------------------------------------

        // Comparator <String> com = new Comparator<String>() {
        //     @Override
        //     public int compare(String i, String j) {
        //         if ((i.length()  > j.length() ))
        //             return 1;
        //         else 
        //             return -1;    
        //     }
        // };
        // List <String> names = new ArrayList<>();

        // names.add("Haloworld");
        // names.add("deepu");
        // names.add("ajlu");
        // names.add("Rayyan");
        

        // Collections.sort(names,com);
        // System.out.println(names);

        

//// ----------------------------------------------------------------------------------------------------------------------------------------
class Students /* implements Comparable<Students> */ {
    int age;
    String name;
    @Override
    public String toString() {
        return "Students [age =  " + age + ", name = " + name + " ]";
    }
    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    
    // @Override
    // public int compareTo(Students that) {

    //     if (this.age > that.age)
    //             return 1;
    //     else 
    //             return -1; 
       
        
    

}

class Lesson53 {

   
    public static void main(String[] args) {

        Comparator<Students> com =  (Students i , Students j) ->  i.age > j.age ? 1 : -1;

        List <Students> nums = new ArrayList<>();

        nums.add(new Students(21, "Ajlan"));
        nums.add(new Students(20, "Rayyan"));
        nums.add(new Students(19, "Kiran"));

       // System.out.println(nums);
    //    for (Students s : nums)
    //         System.out.println(s);

        Collections.sort(nums , com);   

        for (Students s : nums)
            System.out.println(s);
     }
}
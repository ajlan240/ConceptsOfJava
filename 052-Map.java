import java.util.HashMap;
import java.util.Map;

class Lesson52 {
    // using Map Concept you can store values in a name insyead of index
    // Map has 1.Key & 2.Value
    public static void main(String[] args) {
        
        Map<String, Integer> students  = new HashMap<>();
        students.put("Ajlan", 34);
        students.put("Rayyan", 94);
        students.put("Deepu", 73);
        students.put("Manu", 64);
        // Values Can be changed
        students.put("Ajlan", 84);
        System.out.println(students);
        System.out.println(students.get("Rayyan"));

        // to print all the keys 
        System.out.println(students.keySet());
        for(String key : students.keySet())
        {
            System.out.println(key + " : " + students.get(key));
        }
        
        
    }
}

class AB {
    public AB() {
        System.out.println(" Object Created");
    }

    public void show(){
        System.out.println("in method show");

    }
}

class Lesson26 {
    public static void main(String[] args) {

        new AB(); // Anonymous Object -> Objects does not have a specific name 
        // you cant reuse it
        

        AB obj; // declaring the variable as the datatype AB(class name)
        obj = new AB(); // assighning the Properties of the class to the declared variable (Object Creation)
        obj.show();

        
        
    }
}

/// Camel Casing 
// class and interface - First letter capital
// methods and variable - First letter small
// constants - all letter capital

// this make your code readable
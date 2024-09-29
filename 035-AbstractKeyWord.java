
                   // if method is abstract it's class mustbe abstract
                                      // it's jus used for declaring a function
                                      // abstract class's object cannot be created 😢
                                      // abstract method is not mendatory for abstract class
abstract class Car {                 // if there is abstract method in an abstract class the method must be defined in it's Child Class
    public abstract void drive();

    public void playMusic() {

        System.out.println("Music is played");
    }
}

class Benz extends Car {               // |Child class of abstract class is called  CONCRETE CLASS
    public void drive() {
        System.out.println("Driving..");
    }
    
}

class Lesson35 {
    public static void main(String[] args) {

        // Car obj = new Car(); //this cannot be possible 'Car' DataType can be used

        Car obj = new Benz();
        obj.playMusic();
        obj.drive();
        
    }
}
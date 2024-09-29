

// // abstract class first {
// //     public abstract void show();
// //     public abstract void config();

// // }

// // INTERFACE -> means it's like a class wich contain only public abstract methods
// // all methods are public abstract by default if not mention also

// interface First {
// // all the variable inside the interface are static and final
//     int age = 12;
//     String name = "Ajlu";

//     // public abstract void show();
//     // public abstract void config();

//     void show();
//     void config();

// }

// interface X {

//     void run(); // methods of the interface must be defined int  he chaild class

// }
// interface Y extends X {
//     //method 'run' is present here
// }
// class Second implements First,Y { // implement is used for interface instead of extend , and only method s can be accesses to the second class 
//                                     // multiple interfaces can be impleented to a class

//     @Override
//     public void config() {
       
//         System.out.println("in config");
        
//     }

//     @Override
//     public void show() {
//         System.out.println("in show");
        
//     }

//     @Override
//     public void run() {
//         System.out.println("Running..");
        
//     }
    

// }

// class lesson38 {
//     public static void main(String[] args) {
//         First obj;
//         obj = new Second();
//         obj.config();
//         obj.show();
        
//         // as a result of when variable are final and static we can call them directly with name of inteface   
//         System.out.println(First.name+ " : "+ First.age);
      
//     }
// }

// // class - class -> extends 
// // interface - interface -> extends
// // interface - class -> implements


//-----------------------------------------------------------------------------------------------

interface Computer1 {
     public abstract void code();

}
class LaptopNew implements Computer1 {
    public void code(){
        System.out.println("Code : Compile : Run");
    }
}

class Desktop implements Computer1 {
    public void code(){
        System.out.println("Code : Compile : Run : Faster");
    }

}

class Developer  {
    public void devApp(Computer1 obj){
        obj.code();
        
    }
}
class lesson39 {
    public static void main(String[] args) {
        // Computer1 onj3 = new Computer1; // this is impossible
        Developer obj = new Developer();
        //Desktop desk = new Desktop();
        LaptopNew obj2 = new LaptopNew();
        obj.devApp(obj2);

        
    }
}


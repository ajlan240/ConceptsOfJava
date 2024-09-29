// //POLY MORPHISM
// // POLY - many
// // MORPHISM - behavior

// // means varying behaviour 

// // poly morphism is of two types
// //             1. Compile time (eg : method overloading)
// //             2. Run time  (eg : method overriding)

// // Dynamic method dispatch

// class C {
//     public void show() {

//         System.out.println("in C show");
//     }
// }
 
// class D extends C {.
//     public void show() {

//         System.out.println("in D show");

//     }
// }   
// class E extends C {

//     public void show() {

//         System.out.println("in E show");

//     }
    
// }


// class lesson31 {
//     public static void main(String[] args) {
//         C obj = new C(); // we can refer 'obj' to the datatype of 'C'
//         obj.show();

//         obj = new D(); // we can assign object of "D" to obj because its data type is C & D is extended to C
//         obj.show();

//         obj = new E(); 
//         obj.show();

//         // During the run time it changes the method to call -> RunTime PolyMorphism
                                                  
//     }
// }
 

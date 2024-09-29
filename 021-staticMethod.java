// Static Methods 

class MobileNew {

    String brand;
    int price;
    static String name; 


   public void show()
   {
    System.out.println(brand + " : "+ price+ "$ "+ name);
   }

   public static  void show1(MobileNew obj) // this is the ststic method 
   {
      // we cannot use non-static variable inside a static method
      // we can only use static variable inside static method

    // System.out.println(brand + " : "+ price+ "$ "+ name); // dont do this 


    // but we can access non static variable to static method by creating object to the class and passing that object to the static method

    System.out.println("in static method");
    System.out.println(obj.brand + " : "+ obj.price+ "$ "+ name);
    
   }

}


class class21 {
    public static void main(String[] args) {

        MobileNew obj1 = new MobileNew();
        obj1.brand = "Apple";
        obj1.price = 1500;
        MobileNew.name = "Smart Phone";

        MobileNew obj2 = new MobileNew();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        MobileNew.name = "Smart Phone";

        // obj1.show();
        // obj2.show();

        MobileNew.show1(obj1); // can be called directly using class name
        
    }
    
}
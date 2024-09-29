// CONSTRUCTOR

class mobile1 {

    String brand;
    int price;
    static String name; 


    // all Static variables are initialise inside static block
    static 
    {
        System.out.println("in static block");
        name = "Smart Phone ";
    }

    public mobile1()  //  This is the constructor
    {
        brand = "";
        price = 1200;
        

    }

   public void show()
   {
    System.out.println(brand + " : "+ price+ "$ "+ name);
   }

}
// Note :  During an object creation two process occurs **class load** and *object instantiation** 
       //  Here class load occur first 


class class20 {
    public static void main(String[] args) throws ClassNotFoundException {

        mobile1 obj1 = new mobile1(); // to initialise some variable from this line we use Construcotr
        obj1.brand = "Apple";
        obj1.price = 1500;
        //mobile1.name = "Smart Phone";   no need of this

        mobile1 obj2 = new mobile1();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        

        obj1.show();
        obj2.show();
        

        // //// we can load class without calling constructor
        // Class.forName("mobile1"); // -> just load the class without calling anythoing



    }
    
}
 

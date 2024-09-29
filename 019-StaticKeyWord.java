
// STATIC VARIABLES

class mobile {
    String brand;
    int price;
    static String name; // static variable are common for all objects -> any change in this Static variable @anywere will affect all other objects
    // these all are instance variable

   public void show()
   {
    System.out.println(brand + " : "+ price+ "$ "+ name);
   }

}


class class19 {
    public static void main(String[] args) {

        mobile obj1 = new mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        mobile.name = "Smart Phone"; // static variables are called by 

        mobile obj2 = new mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        mobile.name = "Smart Phone";

        obj1.show();
        obj2.show();
        
    }
    
}

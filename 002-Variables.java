 class basic2 {
    public static void main(String[] args) {
        // integer data types 
        int num1 = 3; // '=' is assignment operator
        short num2 = 5;
        byte num4 = 1;
        long num5 = 1234;
        long result = num1 + num2 + num4 + num5;
        System.out.println(result);

        // decimel datatypes
        float num3 = 3.0f ;        // by default decimel values hava 'double' DATATYPE in java  
                                    // so we have to typeCast to float so you have to add 'f' at the end of the number 
                                
        double marks = 3.4;
        System.out.println(marks + num3);

        // charecter DATATYPE
        char c = 'k';
        System.out.println(c);

        // boolean DATATYPE
        boolean b = true;
        System.out.println(!b);

        // we can write binary codde of a number
        int num6 = 0b101;
        System.out.println(num6);

        int num7 = 10_00_00_00; // we can count number of zeros by putting underscore

        double num8 = 12e10; //  store big value 12 x 10^10


        // charecter incrementing 
        char ch = 'a';
        System.out.println(++ch); // when  we try to increment the charecter  we will get the next alphabet 
        




    }
}
// DATATYPE 

// 1) Primitive Datatype
        // * integer [byte - 1 bytes , short-2 bytes , int-4 bytes, long- 8 bytes]
                // byte can store values in between in -128 to 127    
                
        // * float  [float - 4 bytes, double - 8 bytes]
        // * charecter
        // * boolean

    
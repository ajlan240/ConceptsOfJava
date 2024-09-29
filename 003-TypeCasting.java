 class basic3 {
    public static void main(String[] args) {
        /// Casting 
        int a = 300;
        byte b = 12;
        //b = a; this operatiopn is invalid becauese we cannot store an integere value in byte 
       //            we can store reversly

      // a = b; //-> this is possible here 'conversion' occurs
       b = (byte)a; // this is the process casting
       System.out.println((b)); 
       // -128 to 128 , 128 to 256
       
       float c= 2.23f;
       int d= (int)c;
       System.out.println(d);

       double num1 = 4.5;
       int num2 = (int)num1;
       System.out.println(num2);
    
       








    }
}

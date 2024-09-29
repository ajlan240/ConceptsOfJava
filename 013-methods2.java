class calculator 
{   // Method Overloading
    // here the concept is we can create a severel methods of same name with diffrent no of parameters or different datatype of parameter 
    
    public int add(int num1, int num2)
     {
        return num1 + num2;
    }

    public int add(int num1, int num2 , int num3)
     {
        return num1 + num2 + num3;
    }

    public double add(float  num1, int num2)
     {
        return num1 + num2;
    }
}



 class class13 {
    public static void main(String[] args) 
    {
        calculator calc = new calculator();
        // calculator calc1 = new calculator(); 
        // float num1 = 1.0f;
        // int num2 = 2;

      
       System.out.println(calc.add(1,2));
      
       



    }
    
}
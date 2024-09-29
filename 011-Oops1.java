 class calculator 
{   
    int a;
    public int add(int num1, int num2) {
        
        return num1 + num2;
    }
}



 class class11 {
    public static void main(String[] args) {
        // object oriented programming 
        // object - properties and behavior

        calculator calc = new calculator(); // calc here is an object
        //Left side - first class name , then referance variable name
        // Right Side - 'new ' means creating new space , 'calculator()' is the constructor
        
       /// calling the add method by just puttting a dot

       System.out.println(calc.add(9,3)); 
       



    }
    
}

 
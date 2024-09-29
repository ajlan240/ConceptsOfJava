class a { // this is the super class

    public a() {
        super(); // this super calling the constructor of object classs  
        System.out.println("in cons a");
    }
    public a(int n) 
    {    super();
        System.out.println("in para cons a");
    }
}

class b extends a { // this is subclass 



    public b() 
    // in every constructor there is a unseen method called "Super()" which called first
    {  
        super(); // 'super()' means to call the default constructor of the super class
        System.out.println("in cons b");
    }
    public b(int n) 

    {   
        //super(n); // to call parameterised constructor of super class you have to pass a value in super() method

        this(); // 'this()' method call the default constructor of the same class
        System.out.println("in para cons b");
    }

   
    
}


// Note : Every class in JAVA extends the object class(behind the scene)


class lesson25 {
    public static void main(String[] args) {
        
        @SuppressWarnings("unused")
        b objB = new b(3);

        
    }

}
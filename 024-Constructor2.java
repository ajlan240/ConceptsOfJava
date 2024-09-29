

class human3 
{
   private int age = 0;
   private String name; 
   

    public human3() // this is the construcor (default construcor)
    // used initialise values when an object is created 
    // this constructor is created by our java for us containing empty values behind the curtains
    // we can use 'source action to create constructor'
    {
        System.out.println("in Constructor");
        age = 12;
        name = "Ajlu";
    }

    public human3(int a, String n)  // paremetrised constructor
    {
       age = a;
       name = n;
    }
    public human3( String n)  // paremetrised constructor
    {
       this.age = 12;
       name = n;
    }

   public int getAge() {
       return age;
   }

    public void setAge(int age) 
    {
    
        this.age = age;
    }
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
}   
class lesson24 {
    public static void main(String[] args) {

        human3 huObj1 = new human3(); 
        human3 huObj2 = new human3(21 , "Ajlu");
        // huObj1.setAge(21);
        // huObj1.setName("Ajlan");
        
        
        System.out.println(huObj1.getName()+ " : "+ huObj1.getAge()); 
        System.out.println(huObj2.getName()+ " : "+ huObj2.getAge());
        
    }
    
}
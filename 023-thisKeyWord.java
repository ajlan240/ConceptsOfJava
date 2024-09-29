// 'this' KeyWord

class human2 
{
   private int age = 0;
   private String name; 
   

    // this keyword are used when local and instance avriable are same 
    // 'this' means instance variable of that class 

   public int getAge() {
       return age;
   }
//    public void setAge(int age, human2 obj1) {
//        human2 obj2 = new human2();
//        obj2 = obj1;
//        obj2.age = age;
//        
//    }

// to avoid this we use 'this' KeyWord
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
class lesson23 {
    public static void main(String[] args) {

        human2 huObj = new human2();
        // huObj.setAge(21 , huObj);
         huObj.setAge(21);
        huObj.setName("Ajlan");
        System.out.println(huObj.getName()+ " : "+ huObj.getAge()); 
        
    }
    
}

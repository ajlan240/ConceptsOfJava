 
  class ABC {

    public void show() {
        System.out.println("In A Show");
    }

     class B {
        public void config() {
            System.out.println("in config");
        }
    }
 }
 
 
 
 
 
 
 
 
 
 
 class Lesson36 {
    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.show();

        // to make object of innerclass
        ABC.B obj2 = obj.new B();

        obj2.config();

        //  if the inner class is Static
        // ABC.B obj3 = new ABC.B();
            
        
    }
    
}

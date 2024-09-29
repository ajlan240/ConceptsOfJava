 class Computer 
 {
    public void musicPlay() {
        System.out.println("music playing...");
    }

    public String getMePen(int cost) {
        if ( cost >  10)
            return "pen";
            
        return "nil"  ;  
    }
 }
 
 
 
 
 class class12 {
    public static void main(String[] args) {
        Computer obj1 = new Computer();
        String str = obj1.getMePen(5);
        System.out.println(str);
        
    }
    
}

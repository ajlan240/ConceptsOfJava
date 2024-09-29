 
 // ANNOTATIONS -> are the certain keywords that is used to tell our intention to the compiler
 
 @Deprecated
 class one {
    public void showTheDataWhicBelongsToThisClass(){
        System.out.println("in one Show");
    }

 }
 class two extends one {
    @Override // --> used to say the below method is used for overriding
    public void showTheDataWhicBelongsToThisClass(){
        System.out.println("in one Show");
    }

 }
 
 class lesson41 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        two obj = new two();
        obj.showTheDataWhicBelongsToThisClass();

  
    
        
       
        
    }
}
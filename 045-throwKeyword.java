

class AjlansException extends Exception {
    public AjlansException(String err){
        super(err);
    }
}
// you can create your own exception class
class Lesson44 {
    public static void main(String[] args) {
        
        int i =23;
        
        int j = 0;
  


        try
        {
            j = 18 / i;
            // if you want to call cathch block while executing try block 
            // you have to just creat the object of the class eg : class of Arithametic Exception

            // here you have called arithememticException Catch block when value of j=0
            // if (j == 0)
            //     throw new ArithmeticException("I dont want to print zero");

            // our own exception classes 
            if (j==0)
                throw new AjlansException("I dont want print zero");

        }
        catch (AjlansException e) 
        {
            System.out.println("That is the default "+ e);
        }
        catch (Exception e)
        {
            System.out.println("Some thing went wrong.."+ e);
        }
        System.out.println(j);

        System.out.println("Bye");
    }

}

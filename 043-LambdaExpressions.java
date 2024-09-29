
// Lambda Expressions are used 
interface FirstOne {
    public int add(int i, int j);
}


class Lesson43{
    public static void main(String[] args) {

        // Lambda Expression
        //FirstOne obj = (int i) -> System.out.println("in Second Show " + i); //'->' this is Lambda 
        // variable type is also no need to mention

        
        
        // FirstOne obj = new FirstOne() {
        //     public int add(int i, int j) {
        //         return i + j;
        //     }
        // };
        //OR
        FirstOne obj =  (i,j) -> j + i;
                
        
        System.out.println(obj.add(12,13));

        
    }
}
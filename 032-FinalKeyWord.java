// 'final' keyword in variable, method, class 


class lesson31 {
    public static void main(String[] args) {
            //final variable
        final int num = 15;
        //num = 12; -> this shows error bcz we could not change the final variable further once its finalize (making Constants)
        System.out.println(num);
        
    }
}
// 'final' with class -> Stops inheriting to other
// 'final' with methods -> stops method overriding {sub-classes cannot use the same method name}

class Calc {
    public void show() {
        System.out.println("in clac show");

    }
    
    public void add(int a, int b) {
        System.out.println(a + b);
        
    }
}

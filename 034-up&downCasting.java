
class F {
    public void show1() {
        System.out.println("in F Show");
    }
}
class G extends F {

    public void show2() {
        System.out.println("in G Show");
    }

}



class lesson34 {
    public static void main(String[] args) {
        // UP-CASTING
        F obj = (F) new G(); // here is the case that object of 'G' is assigned to variable 'obj' where 'obj' is of dataType 'F'
        obj.show1();



        // DOWN-CASTING
        G obj2 = (G) new F(); // here is the case that object of 'F' is assigned to 'obj2' but unfortunatly we got an error 
                              // bcz 'obj2' is of DataType 'G' unfortunatly  object of 'F' Does not support DataType G
        obj2.show2();


        
    }
}

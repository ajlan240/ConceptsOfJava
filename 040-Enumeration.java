
// // inside enum YOu can write method, variable

// enum Status { // we could write any key word instead of status
//                 // these all are objects of 'Status' so we can write any thing it will be printed
//                 // enum in JAVA extends enum class
//     Running, Failed, Pending, Success; 
   
// }


// class Lesson40 {
//     public static void main(String[] args) {
        
//         // Status[] S = Status.values();

//         // for(Status stat : S)
//         //     System.out.println((stat)+ " : "+ stat.ordinal()+ "  "); 

//         Status ss = Status.Failed;

//         // if (ss == Status.Running )
//         //     System.out.println("All Good");
//         // else if (ss == Status.Failed )
//         //     System.out.println("Try Again");
//         // else if (ss == Status.Pending )
//         //     System.out.println("Please Wait");
//         // else if (ss == Status.Success )
//         //     System.out.println("Well Done");
//         // else 
//         // System.out.println("Done");    

//         // OR you can use switch case


//                 switch (ss) {

//                     case Running:
//                         System.out.println("All Good");
//                         break;

//                     case Pending:
//                         System.out.println("Please Wait");
//                         break;

//                     case Failed:
//                         System.out.println("Try Again");
//                         break;

//                     case Success:
//                         System.out.println("Well Done");
//                         break;
   
//                     default:
//                         break;
//                 }
//     }

// }
enum Laptop12 {
    

    MacBook(2000), XPS(2200), Surface, ThinkPad(1500); // these all are onjects of Laptop 

    private int price;
    
    private Laptop12() { // this is default constructor that we use when doesn't specify parameter in object
        price  = 1000;
    }
    private Laptop12(int price) {
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
        
    }
}
class Lessongud {
    public static void main(String[] args) {
        // Laptop12 lap = Laptop12.MacBook;
        // lap.setPrice(2100);
        // System.out.println(lap + " : "+ lap.getPrice());

        for (Laptop12 lap : Laptop12.values()) 
        {
            System.out.println(lap + " : "+ lap.getPrice());
        }

        
    }
}
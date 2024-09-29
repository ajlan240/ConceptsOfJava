 // Concept of Thread is that You have to run two programs parallely at the same time
// creating thread by extending a class with Thread Class
// class Hi implements Runnable{
// //  class Hi extends Thread{
//     public void run(){
//         for(int i = 0; i<5;i++)
//             System.out.println("hi");
//             try {
//                 Thread.sleep(50);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//     }
//  }
//  class Helo implements Runnable {
// //   class Helo extends Thread  {
//     public void run(){
//         for(int i = 0; i<5;i++)
//             System.out.println("helo");
//             try {
//                 Thread.sleep(1);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//     }
//  }
 
 class Lesson49 {
    public static void main(String[] args) {
        Runnable obj = () -> {
            
                for(int i = 0; i<5;i++)
                    System.out.println("hi");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                     e.printStackTrace();
                }
            };
            
        


    
        // Helo obj2 = new Helo();
        //OR

        Runnable obj2 = () -> {
            
            for(int i = 0; i<5;i++)
                System.out.println("helo");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                 e.printStackTrace();
            }
        };
        // System.out.println(obj.getPriority());
        // System.out.println(obj2.getPriority());

        // obj.setPriority(Thread.MAX_PRIORITY);

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);
        t1.start();
      
        t2.start();
        
    }
    
}




class Counter {
    int count = 0;
    public synchronized void increment(){
        count++;
    }
}



class Lesson50 {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();
        Runnable obj = () -> {
            
                for(int i = 0; i<100;i++)
                    c.increment();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                     e.printStackTrace();
                }
            };
            
        


    

        Runnable obj2 = () -> {
            
            for(int i = 0; i<100;i++)
                c.increment();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                 e.printStackTrace();
            }
        };
        

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        
        System.out.println(c.count);
    }
    
}

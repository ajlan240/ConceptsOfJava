class basic10 {
    public static void main(String[] args) {



        // for - loop

        for ( int i = 1; i <= 7 ; i++)
        {
            System.out.println("DAY "+i);

            for(int j = 1 ; j <= 9 ; j++) 
            {
                System.out.println("  "+(j + 8) + " - "+ (j + 9));
            }
        }



        // // while loop
        // int i = 0;
        // while ( i <= 100)
        // {
        //     System.out.println("hi : "+i);
        //     i++;
        // }




        // // Do while loop
        // int i = 6;
        // do {
        //     System.out.println(i);
        //     i++;
        // } while(i<5); // execute block at least one time  even the condition is false 



        // // // nested while loop
        //     int i = 0;
        //     while ( i <= 5)
        //     {
        //         System.out.println("hi : "+i);
        //         int j = 0;
        //         while (j <= 3) {
        //             System.out.println("hoo");
        //             j++;
        //         }
                
        //         i++;
        //     }
    }
}

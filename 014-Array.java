
 class class14 {


    public static void main(String[] args) {



        // int num[] = {1, 2, 3, 4, 5};
        // int num2[] = new int[4]; 
        // // these are the ways to represet an array
        // // value inside 
        // System.out.println(num[1]);
        // num2[0] = 4;
        // num2[1] = 12;
        // num2[2] = 22;
        // num2[3] = 33;

        // System.out.println(num2[3]);

        // // changing element of an array
        // num[1] = 90;
        // System.out.println(num[1]);





        // // multidimensional array
        // int num3[][] = new int[3][4]; // here num3 array contain '3' arrays having '4' elements each
        // int num4[][] = {{1, 2, 3},   // here numbers of first array  is called as 'num4[0][0]' 'num4[0][1]''num4[0][2]'
        //                 {4, 3, 8},
        //                 {2, 8, 7}
        //             };

        //             for (int i = 0; i <= 2; i++)
        //             {
        //                 for (int j = 0; j <= 2; j++)
        //             {
        //                 System.out.print(num4[i][j] + " ");
        //             }
        //             System.err.println();
 
        //             }





        //             //assign the values using math.random() method

        //             int num5[][] = new int[3][3];

        //             for (int i = 0; i <= 2; i++)
        //             {
        //                 for (int j = 0; j <= 2; j++)
        //             {
        //                 num5[i][j] = (int)(Math.random() * 10);
        //             }
        //             System.out.println();
 
        //             }


        //             for (int i = 0; i <= 2; i++)
        //             {
        //                 for (int j = 0; j <= 2; j++)
        //             {
        //                 System.out.print(num5[i][j] + " ");
        //             }
        //             System.out.println();
 
        //             }


        //             // another method of printing the array (using enhance foor loop)
        //             System.out.println();


        //             for (int m[] : num5) {
        //                 for (int n : m)  {
        //                     System.out.print(n + " ");
        //                 }
        //                 System.out.println();
        //             }







        // // JAGGED ARRAYS (Varying number of columns)

        // int arr[][] = new int[3][];
        //                 //    ^ this '3' represents arrays inside the multi dimensiuonal array
        //                 // second box is kept blank because the no of column is vaying 
                        
        //  arr[0] = new int[3]; // first array cocntain 3 elements    
        //  arr[1] = new int[4]; // second array cocntain 4 elements   
        //  arr[2] = new int[2]; // third array cocntain 2 elements           
         
        // for (int i = 0; i < 3; i++)
        // {
        //         for (int j = 0; j < arr[i].length; j++)
        //         {
        //             arr[i][j] = (int)(Math.random() * 10);
        //         }

        //         System.out.println();
  
        // }     
        
        
        // for (int m[] : arr) 
        // {
        //     for (int n : m)  
        //     {
        //         System.out.print(n + " ");
        //     }
        //     System.out.println();
        // }
    
        


        // // 3D array 
        // int arr1[][][] = new int[3][][];


        // Draw Backs of Array

        // * array in java is an object
        // 1) you cant  expand the size of array
        // 2)  for searching and inserting values it travel through each and every element in that array
        // 3) we cannot save elements of different dataTyppe in our array

        
    }
    
}

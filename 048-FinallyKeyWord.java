// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// class Lesson46 {
 
    
//     public static void main(String[] args) throws IOException {

         
//         int num = 0;
//         // try {
//         //     InputStreamReader in = new InputStreamReader(System.in);
//         //     bf =new BufferedReader(in);
//         //     num = Integer.parseInt(bf.readLine());
//         //     System.out.println(num);

//         // }
//         // // finally also used to close the opened file 
//         // finally 
//         // {
//         //     bf.close();
//         // }


//         // to close the files Automatically
//         try (BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));) 
//         {
//             num = Integer.parseInt(bf.readLine());
//             System.out.println(num);

//         }
        



//     }
// }
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.Buffer;
import java.util.Scanner;

@SuppressWarnings("unused")
class Lesson46 {
 
    public static void main(String[] args) throws IOException {

        // Old method of fetching values
        System.out.println("Enter a number");
        // int num =System.in.read();
        // System.out.println(num - 48); // it gives the ASCII value of the number that you have entered only can reead on charecter at a time 

        // // next gen

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num); // primitive method to do this
        // bf.close(); // buffer reader can read values from the data

        //Simple method to fetch values from the user

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt();
        System.out.println(num);
       

    }
}

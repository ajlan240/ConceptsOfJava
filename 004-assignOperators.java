 class basic4 {
    public static void main(String[] args) {
        // Arithametic operators 
        // in java we can do + - \ * 
        int num1 = 12;
        int num2 = 23;
        int result = num1 + num2;
        System.out.println(result);


        //  incrementing 
        num1 = num1 + 1;
        num1 += 1;
        num1 += 2;
        num1++ ; /// these 3 are same stuff


        // Decrementing
        num1 = num1 - 1;
        num1 -= 1;
        num1--;

        // preincrement
        int num3 = 5;
        int num4 = 5;
        int a = ++num3;
        int b = num4++;
        System.out.println(a); // first incremnt and then asssign
        System.out.println(b); // first assign and then increment

    }
}

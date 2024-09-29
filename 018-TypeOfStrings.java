 class class18 {
    public static void main(String[] args) {
        // There are two type of strings 
        // mutable and immutable Strings
        // mutable -> it can be changed
        // immutable -> Cannot be changed (generally Strings in java are immutable)
        // mutable Strings  were 2 differents classes are there 
        // 'StringBuffer' or 'StringBuilder' are the claasses uswd to implement mutable string

        // StringBuffer

        StringBuffer sb = new StringBuffer("Ajlan");  // it store name and give additional '16' space
        System.out.println(sb.capacity()); // this additional storage is to avoid rel-location of the memory
        sb.append(" Ashraf");
        sb.delete(2, 3); // to delete something
        sb.insert(11,  " king"); 
        sb.setLength(30); // store space upto 30 
        sb.ensureCapacity(100); // minimum capacity will be 100
        System.out.println(sb);

        String str = sb.toString(); // we can convert a string buffer to string
        System.out.println(str);




    }
    

}

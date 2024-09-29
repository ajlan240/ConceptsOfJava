 class Student {
    int rollNo ;
    String name;
    int mark;
 }
 
 class class15 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Ajlan";
        s1.mark = 55;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Rayyan";
        s2.mark = 75;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "jane";
        s3.mark = 95;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int i = 0; i < students.length; i++){
        //     System.out.println(students[i].name+ " : "+ students[i].mark);
        // }
        
        // using enhance for loop (For Each loop)

        for(Student stud : students) 
        {
            System.out.println(stud.name + " : " + stud.mark);
        }
    }
}

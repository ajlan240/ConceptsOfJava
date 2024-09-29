
// INHERITANCE

// through inheritance features of super class can be accessed to sub class

class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

  // SINGLE LEVEL INHERITANCE
 class AdvCalc extends Calc {  // here AdvCalc use the property of Calc  
    public int multi(int n1, int n2) {
        return n1 * n2;
    }
    public float div(float n1, int n2) {
        return n1 / n2;
    }

}

class VeryAdvCalc extends AdvCalc { //VeryAdvCalc is inherited from AdvCalc and AdvCalc is inherited from Calc 
    //                               this phenomenan is called MULTILEVEL INHERITANCE
     

    public double power (int n1 , int n2 ) {
        return Math.pow(n1, n2);

    }
}
//Note : JAVA Does not support Multiple inheritance (2 different classes are extended to a class ) Other languages does


class lesson27 {
    public static void main(String[] args) {

        VeryAdvCalc objCalc = new VeryAdvCalc();
        int r1 = objCalc.add(3,4);
        int r2  = objCalc.sub(9,5);
        int r3 = objCalc.multi(3,4);
        float r4  = objCalc.div(9,5);
        double r5 = objCalc.power(2, 3);


        System.out.println(r1+ " : "+ r2+ " : "+ r3+ " : "+ r4+ " : "+ r5);
        
    }
}

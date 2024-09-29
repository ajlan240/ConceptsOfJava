

class Halo {
    public void show() {
        System.out.println("In First show");
    }

} 

// no need of this class to implement changes to method show
// class World extends Halo {
//     public void show() {
//         System.out.println("In new show");
//     }

// }


class lesson37 {
    public static void main(String[] args) {

        // World obj = new World();

        // Creating Anonymoys INNER CLASS
        Halo obj = new Halo() {

            public void show() {

                System.out.println("In new show");
            } 


        };
        obj.show();
        
        
    }

}
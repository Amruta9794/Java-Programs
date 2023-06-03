public class InstanceBlock {
     int x=10;
     InstanceBlock(){
        System.out.println(" In Constructor");
     }

     {
        System.out.println("In Instance Block1");
     }

     public static void main(String[] args) {
        InstanceBlock obj=new InstanceBlock();
        System.out.println("Main");
     }

     {
        System.out.println("Instance Block 2");
     }
}

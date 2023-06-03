public class SequenceCode2 {
   
        int x=10;
        static int y=20;
         
        SequenceCode2(){
            System.out.println("In Constructor");
        }
    
        static{
            System.out.println("In Static Block");
        }
        {
            System.out.println("In Instance Block");
        }
    
        public static void main(String[] args) {
            System.out.println("In Main");
            SequenceCode2 obj=new SequenceCode2();
        }
        
        static{
            System.out.println("In Static Block2");
        }
    
        {
            System.out.println("In Instance Block");
        }
    
    
        }
    
    


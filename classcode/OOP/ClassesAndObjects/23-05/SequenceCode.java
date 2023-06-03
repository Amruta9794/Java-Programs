public class SequenceCode {
    int x=10;
    static int y=20;
     
    SequenceCode(){
        System.out.println("In Constructor");
    }

    static{
        System.out.println("In Static Block");
    }
    {
        System.out.println("In Instance Block");
    }

    public static void main(String[] args) {
        SequenceCode obj=new SequenceCode();
    }
    
    static{
        System.out.println("In Static Block2");
    }

    {
        System.out.println("In Instance Block");
    }


    }


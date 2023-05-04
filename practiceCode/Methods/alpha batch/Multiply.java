
import java.util.*;

public class Multiply {
         
    static void mul(int a ,int b)
    {
        int mul=a*b;
        System.out.println(mul);
    }

    static void mul(float a ,float b)
    {
        float mul=a*b;
        System.out.println(mul);
    }

    static void mul(double a ,double b)
    {
        double mul=a*b;
        System.out.println(mul);
    }
    static void mul(float a ,float b,float c)
    {
        float mul=a*b*c;
        System.out.println(mul);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int c = sc.nextInt(); 

        mul(a,b,c);
        mul(a,b);
        
        
    }

}

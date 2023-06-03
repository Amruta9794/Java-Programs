

public class StaticVarMethods {
    static int x=10;
    static int y=20;
    
    static void disp(){
        System.out.println(x);
        System.out.println(y);
    }
}

class Client{
    public static void main(String[] args){
        System.out.println(StaticVarMethods.x);
        System.out.println(StaticVarMethods.y);
        StaticVarMethods.disp();
    }
}

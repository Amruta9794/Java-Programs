public class ErrorScopeOfStatic {
    static int x=10;  //valid statement
    static{
        static int y=10; //invalid
    }
    void fun(){
        static int z=20; //invalid
    }

    static void gun(){
        static int w=30;  //Invalid...
    }
}

//java Supports Static Global Variable....



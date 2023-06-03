class Parent{
    int x=10;
    static int y=20;
    static{
        System.out.println("Parent static Block");
    }

    Parent(){
        System.out.println("In Parent Constructor");

    }

    void MethodOne(){
        System.out.println(x);
        System.out.println(y);
    }

    static void MethodTwo(){
        System.out.println(y);
    }
}

class Child extends Parent{
    static{
        System.out.println("In Child Static Block");
    }
    Child(){
        System.out.println("In Child Constructor");
    }
}

class StaticInstance{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.MethodOne();
        obj.MethodTwo();
    }
}
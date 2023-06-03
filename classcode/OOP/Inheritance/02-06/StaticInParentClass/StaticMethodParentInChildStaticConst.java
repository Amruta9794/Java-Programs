class Parent{
    static int x=10;
    int z=10;
    Parent(int x){
        System.out.println(x);
    }
    static{
        System.out.println("In Parent Static Block");
    }

    static void access(){
        System.out.println(x);
    }

}
class Child extends Parent{
    int z=50;
    Child(){
        super(40);
    }
    static{
        System.out.println("In Child Static Block");
        System.out.println(x);
        access();
    }
    {
        System.out.println(z);
    }
}

class StaticMethodParentInChildStaticConst{
    public static void main(String[] args) {
        System.out.println("In main");
        Child obj=new Child();
    }
}
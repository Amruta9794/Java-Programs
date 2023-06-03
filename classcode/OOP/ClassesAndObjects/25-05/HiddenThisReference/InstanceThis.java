package HiddenThisReference;

public class InstanceThis {
    int x=10;
    InstanceThis(){
        System.out.println("In Constructor");
        System.out.println(this);
        System.out.println(this.x);
    }
    void fun(){
        System.out.println(this);
        System.out.println(x);

    }
    public static void main(String[] args) {
        InstanceThis obj=new InstanceThis();

        System.out.println(obj);
        obj.fun();
    }
}

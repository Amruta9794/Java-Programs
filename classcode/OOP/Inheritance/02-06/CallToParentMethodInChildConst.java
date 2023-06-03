public class CallToParentMethodInChildConst {
    CallToParentMethodInChildConst(){
        System.out.println("In Parent Constructor");
    }

    void access(){
        System.out.println("Parent Instance Method");
    }
}

class Child extends CallToParentMethodInChildConst{
    Child(){
        System.out.println("In Child Constructor");
        access();
    }
}

class Client{
    public static void main(String[] args) {
        Child obj=new Child();

    }
}

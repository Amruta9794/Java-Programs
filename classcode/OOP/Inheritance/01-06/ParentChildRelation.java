import javax.swing.plaf.synth.SynthScrollBarUI;

class Parent{
    Parent(){
        System.out.println("In Parent Constructor");
    }

    void ParentProp(){
        System.out.println("Flat,Gold,Silver");
    }

}

class Child extends Parent{
    Child(){
        System.out.println("IN Child Constructor");
    }
}

class Client{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.ParentProp();
    }
}
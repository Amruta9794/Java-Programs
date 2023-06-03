class Parent{
Parent(){
    System.out.println("In Parent Constructor");
    System.out.println(this);
}
}

class Child extends Parent{
        Child(){
            System.out.println("In Child Constructor");
            System.out.println(this);

        }
}

class Client{
    public static void main(String[] args) {
        Parent obj=new Child();
    }
}
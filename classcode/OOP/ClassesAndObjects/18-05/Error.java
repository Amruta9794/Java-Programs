class Demo{
    int x=10;
    private int y=20;
    void fun(){
        System.out.println(x);
        System.out.println(y);

    }
}

class MainDemo{
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.fun();
        System.out.println(obj.x);
        //System.out.println(obj.y);   // we cannot access private variable from other class....
       // System.out.println(x);
        //System.out.println(y);    //we cannot access instance variable directly from other class....
    }
}
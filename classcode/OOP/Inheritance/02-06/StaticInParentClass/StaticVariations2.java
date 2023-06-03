class StaticVariations2 {
    static{
        System.out.println("In Static Block1");
    }
}

class A1class{
    static{
        System.out.println("In Static Block2");
    }

    public static void main(String[] args) {
        StaticVariations2 obj=new StaticVariations2();
    }
}

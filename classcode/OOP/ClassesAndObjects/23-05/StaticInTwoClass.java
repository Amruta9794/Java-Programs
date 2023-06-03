class Demo{
    static{
        System.out.println("In Static Block1");
    }
    public static void main(String[] args) {
        System.out.println("In Demo Main");
    }
} 
class Client{
    static{
        System.out.println(" In Static Block2");
    }

    public static void main(String[] args) {
        System.out.println("In client Main");
    }

    static{
        System.out.println("In Static Block3");
    }
}
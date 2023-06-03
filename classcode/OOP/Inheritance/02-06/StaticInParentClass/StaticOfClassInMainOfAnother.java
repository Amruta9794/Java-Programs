class StaticOfClassInMainOfAnother {
    static int y=20;
}
class Child{
    
    public static void main(String[] args) {
    System.out.println( StaticOfClassInMainOfAnother.y);
     
    }
}

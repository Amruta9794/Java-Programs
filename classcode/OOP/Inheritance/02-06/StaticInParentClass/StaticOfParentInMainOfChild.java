class StaticOfParentInMainOfChild {
    
    static int y=20;
}
class Child extends StaticOfParentInMainOfChild{

        public static void main(String[] args) {
            System.out.println(y);
        }
}

class SuperInConstructor{
    
    SuperInConstructor(){
        super();
        System.out.println("In Constructor");
    }

    public static void main(String[] args) {
        SuperInConstructor obj=new SuperInConstructor();
    }
}
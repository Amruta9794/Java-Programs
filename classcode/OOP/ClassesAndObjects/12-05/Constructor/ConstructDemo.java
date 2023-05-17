class ConstructDemo{
	
	ConstructDemo(){
		System.out.println("In Constructor");
	}
	void fun(){
		ConstructDemo obj=new ConstructDemo();
		System.out.println(obj);
	}
	public static void main(String[] args){
		ConstructDemo obj1=new ConstructDemo();
		ConstructDemo obj2=new ConstructDemo();

		obj1.fun();
		System.out.println(obj1);
		System.out.println(obj2);
	}
}


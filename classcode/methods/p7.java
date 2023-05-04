class Demo{
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.fun(10);
		obj.fun(10.5f);//error :incompatible types:possible loosy conversion from float to int.
	}
	void fun(int x) {
		 System.out.println(x);
		  System.out.println("In fun");
	}
}


		

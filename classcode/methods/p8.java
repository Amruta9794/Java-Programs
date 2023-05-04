class Demo{
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.fun(10);        // 10.0
		obj.fun(10.5f);     //10.5
		obj.fun('A');       //65.0
		}
		void fun(float x) { // int can be stored in float datatype beacuse here is no loss of any data
		 System.out.println("In fun");
	 	 System.out.println(x);
		}
}


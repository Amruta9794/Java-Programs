class Demo{
	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.fun(true); //erroe:incompatible types boolean cannot be convert to float.     
		}
		void fun(float x) { 
		 System.out.println("In fun");
	 	 System.out.println(x);
		}
}


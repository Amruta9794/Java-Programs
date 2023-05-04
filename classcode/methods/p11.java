class Demo{
	void fun(int x) {
		int y=x+10;
	}
	public static void main(String[] args) {
		Demo obj = new Demo();
		int a=obj.fun(10);     //error:void cannot be coverted to int
		System.out.println(a);
	}
}


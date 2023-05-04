class MDemo{
	int x=10;
	static int y=20;

	void fun() {
		System.out.println("In fun method");
	}
	static void gun() {
		System.out.println("In gun method");
	}


	public static void main(String[] args) {

		MDemo obj=new MDemo();

		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.gun();

	}
}



class ObjectInStaticBlock{
	int x=10;
	static int y=20;

	void fun(){
		System.out.println("In Fun");
	}
	
	static void fun2(){
		System.out.println("In Static fun2");
	}

	static{
		ObjectInStaticBlock obj=new ObjectInStaticBlock();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(y);
		obj.fun();
		ObjectInStaticBlock.fun2();
	//	System.out.println(x);  error:nonstatic variable x cannot be refernce from  static context...
	}
	public static void main(String[] args){
	
	}
}


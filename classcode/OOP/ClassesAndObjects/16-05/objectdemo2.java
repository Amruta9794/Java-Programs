class ObjectDemo2{
	int x=10;
	String str1="Amruta";

	void fun(){
		String str2="Amruta";
		String str3=new String("AmrutaDalavi");
	}
	public static void main(String[] args){
		ObjectDemo2 obj  =new ObjectDemo2();

		obj.fun();
	}
}

//here str1 and str2 are same strings both can show refrence for same objet...			

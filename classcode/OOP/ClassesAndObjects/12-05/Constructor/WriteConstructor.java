class WriteConstructor{

	int x=10;

	
	WriteConstructor(){
		// invokspecial-we cant write directly invokespecial here , it is internal calling method for parent class....
		System.out.println("In Constructor");
	}
	public static void main(String[] args){
	}
}


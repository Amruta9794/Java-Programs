class IdHashCodeCompare{
	public static void main(String[] args){
		String svar1="this is a string";
		String svar2="a string";
		String svar3="this is "+svar2;  //it can call append method -creates new object

		if(System.identityHashCode(svar1)==System.identityHashCode(svar3)){
			System.out.println("Equal");
		}else{
			System.out.println("Not Equal");
		}
	}
}


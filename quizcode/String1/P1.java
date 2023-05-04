class IDHashCode{
	public static void main(String[] args){
		String svar1="this is a string";
		String svar2="this is a string";
		if(System.identityHashCode(svar2)==System.identityHashCode(svar1)){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not equal");
		}
	}
}
/* idhashcode is same because it creates only one object at scp for both strings*/

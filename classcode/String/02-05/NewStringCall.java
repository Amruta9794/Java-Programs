class NewStringCall{
	public static void main(String[] args){
		String str1="Amruta";          //scp
		String str2="Dalavi";          //scp
		System.out.println(str1+str2);   
		String str3="AmrutaDalavi";      //scp
		String str4=str1+str2;       //call to newstring method() here it can new object on heap[runtime]
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

	
	}
}


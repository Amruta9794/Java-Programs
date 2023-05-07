class StringBuffInitialize4{
	public static void main(String[] args){
		StringBuffer str1=new StringBuffer("Amruta");

		System.out.println(System.identityHashCode(str1));

		str1.append("Dalavi");

		System.out.println(str1);

		System.out.println(System.identityHashCode(str1));
	}
}


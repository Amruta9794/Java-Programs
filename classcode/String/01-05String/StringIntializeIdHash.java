class StringIntializeIdHash{
	public static void main(String[] args){
		String str1="Core2Web";
		String str2=new String("Core2Web");
		String str3="Core2Web";
		String str4=new String("Core2Web");

		System.out.println(System.identityHashCode(str1));  //same id for StringConstantPool
		System.out.println(System.identityHashCode(str2));  //different id at HeapSection
		System.out.println(System.identityHashCode(str3));  //same id for StringConstantPool
		System.out.println(System.identityHashCode(str4));  //different id at HeapSection
	}
}


class OnlyObject{
	public static void main(String[] args){
		String str1="Amruta";
		String str2="Dalavi";

		System.out.println(str1);
		System.out.println(str2);

		str1.concat(str2);  // here only object created,no refernce because we are not store it in any avariable.
		System.out.println(str1);
		System.out.println(str2);
	}
}


class StriingObject1{
	public static void main(String[] args){
		String str1="Kanha";
		String str2=str1;
		String str3=new String(str2);

		System.out.println(System.identityHashCode(str1));   //scp=same
		System.out.println(System.identityHashCode(str2));   //scp=same
		System.out.println(System.identityHashCode(str3));  //heap=diffrent
	}
}


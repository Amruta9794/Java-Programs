class StriingObject{
	public static void main(String[] args){
		String str1="Kanha";     //scp
		String str2="Kanha";    //scp
		String str3=new String("Kanha");    //heap
		String str4=new String("Kanha");   //heap
		String str5=new String("Rahul");  //heap
		String str6="Rahul";    //SCP


		//overall 5objects are created here.
		//2 =scp
		//3 =heap
		System.out.println(System.identityHashCode(str1));   //same
		System.out.println(System.identityHashCode(str2));   //same
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
	}
}


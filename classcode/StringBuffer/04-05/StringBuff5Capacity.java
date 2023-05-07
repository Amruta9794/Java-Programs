class StringBuff5Capacity{
	public static void main(String[] args){
		StringBuffer str1= new StringBuffer("Amruta");
		System.out.println(str1.capacity());
		System.out.println(System.identityHashCode(str1));



		str1.append("AmrutaTukaramDala");
		System.out.println(str1.capacity());      //(oldcapacity*2)+2.
		System.out.println(System.identityHashCode(str1));

		StringBuffer str2=new StringBuffer();
		System.out.println(str2.capacity());

		StringBuffer str3=new StringBuffer("Amrutatukaramdalaviskncoe");
		System.out.println(str3.capacity());
	}
}


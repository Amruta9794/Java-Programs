class HashCodeMethod{
	public static void main(String[] args){
		String str1="Amruta";
		String str2=new String("Amruta");
		String str3="Amruta";
		String str4=new String("Amruta");		                                                       
	//if content of all strings are same then hashcode is same for all strings.....
	
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
	}
}




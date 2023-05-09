class AppendParameters{
	public static void main(String[] args){
		
		String str1="Amruta";
		String str2=new String("Dalavi");
		StringBuffer str3=new StringBuffer("Pune");

		String str4=str3.append(str1);          
		 //Error:IncomaptibleTypes:stringBuffer Cannot be converted to string......
		//	ithe Append method cha returntype ha stringBuffer Ahe ani apan tyala String Class Madhe initialized kraych try krtoy...
		System.out.println(str4);
	
	}
}

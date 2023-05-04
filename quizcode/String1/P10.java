class CompareObjectLevel{
	public static void main(String[] args){
		String str1=new String("java");
		String str2=new String("java");

		System.out.println(str1==str2);  //it compare strings at object level not at value level
						//it returns false 
	}
}

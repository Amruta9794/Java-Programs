class IntAsAString{
	public static void main(String[] args){
		
		int[] arr={97,98,99,100};
		String str=new String(arr);  //error: no suitable constructor found for String(int[])
		
		System.out.println(str);
	}
}


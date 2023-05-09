class MyReverseMethod{
	public static void main(String[] args){

		String str1="Amruta";

		char arr1[]=str1.toCharArray();
		char arr2[]=new char[arr1.length];
		int j=0;
		for(int i=arr1.length-1;i>=0;i--){
			arr2[i]=arr1[j];
				j++;
		}
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}


		str1=new String(arr2);
		System.out.println(str1);

		
	}
}


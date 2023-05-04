class ArrayDemo{
	public static void main(String[] args) {
		int arr1[]={10,20,30,40};
		char arr2[]={'A','B','C'};
		float arr3[]={10.5f,20.5f};
		boolean arr4[]={true,false,true};
		
		//int array
		System.out.println("int array");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);

		
		// char array
		System.out.println("char array");
		System.out.println(arr2[0]);
	        System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
		// float array
		System.out.println("float array"); 
	        System.out.println(arr3[0]);
	        System.out.println(arr3[1]);
		System.out.println(arr3[2]);  //Runtime= Exception: array index out of bound

		//  boolean array
		System.out.println("boolean array");
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		 System.out.println(arr4[2]);
	}
}

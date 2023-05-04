class NullPointer{
	public static void main(String[] args){
		int arr1[][]={{},{},{}};
		int arr2[][]=new int[3][];

		System.out.println(arr1.length);
		System.out.println(arr1[0].length);

		System.out.println();
		System.out.println(arr2.length);
	//	System.out.println(arr2[0].length);  //NULLPoiterException....

		//Repair code
		arr2[0]=new int[3];
		System.out.println(arr2[0].length);
	}
}


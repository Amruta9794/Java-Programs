class HashCode1{
	public static void main(String[] args) {
		int arr[]={10,128};
		int arrr[]={10,128};

		char ch[]={'a','b'};
		char ch1[]={'a','b'};

		float f1[]={1.2f,1.3f};
		float f2[]={1.2f,1.3f};
		
		boolean b1[]={true,false,true,false};
		boolean b2[]={true,false,true,false};
			
		System.out.println("Array index 0");
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arrr[0]));
		
		System.out.println("Array index 1");
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arrr[1]));
		
		System.out.println("second array address");
		System.out.println(arrr);

		System.out.println("char array index 0");
		System.out.println(System.identityHashCode(ch[0]));
		System.out.println(System.identityHashCode(ch1[0]));
		System.out.println(ch);
		
		System.out.println("Float Array index 0");
		System.out.println(System.identityHashCode(f1[0]));
		System.out.println(System.identityHashCode(f2[0]));
		System.out.println(f1);
			
		System.out.println("boolean Array index 0");
		System.out.println(System.identityHashCode(b1[0]));
		System.out.println(System.identityHashCode(b2[0]));

		System.out.println("boolean Array index 1");
	        System.out.println(System.identityHashCode(b1[1]));
	        System.out.println(System.identityHashCode(b2[1]));
		System.out.println(b1);
	}
}


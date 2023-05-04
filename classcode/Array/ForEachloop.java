class ForEachDemo{
	public static void main(String[] args) {
		int arr[]={10,20,30,40};
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		  System.out.println();
		for(int x:arr){
		
	       		System.out.println(x);
			 System.out.println(arr[0]);
	                 //System.out.println(x[0]); error:array required int found
		}
		 System.out.println();
		 for(float x:arr){
			  System.out.println(x);
			   System.out.println(arr[0]);
			    // System.out.println(x[0]); error:
		 }

		  System.out.println();
		  for(int x:arr){
			  if(x%2==0){
				   System.out.println(x);
				   break;
			  }
		  }
	}
}


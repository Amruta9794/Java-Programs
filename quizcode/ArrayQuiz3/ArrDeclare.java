class ArrDeclare{
	public static void main(String[] args){
		int arr=new int[5];  //erroe
		for(int i=0;i<arr.length;i++){
			arr[i]=i*i;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}


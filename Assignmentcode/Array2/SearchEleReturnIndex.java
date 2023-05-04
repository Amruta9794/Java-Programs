import java.io.*;
class SearchEleReturnIndex{
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enetr Array Size");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];

		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
              
	      System.out.println("Enter Element to Search ");
      	      int Ele=Integer.parseInt(br.readLine());	      

	      int index=Search(arr,Ele);
	      System.out.println("Element Found At Index:"+index);
	}

	
	public static int Search(int arr[],int ele){
		
			int i=0;
		
			for(;i<arr.length;i++){
			if(arr[i]==ele)
				break;
		
		}
		return i;
	}

 

}

import java.io.*;
class UnCommonEle{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Size of First  Array");
		int size1=Integer.parseInt(br.readLine());

		System.out.println("Enter Size Of Second Array");
		int size2=Integer.parseInt(br.readLine());

		int arr1[]=new int[size1];
		int arr2[]=new int[size2];

		System.out.println("Enter First Array Elements");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Enter Second Array Elements");
		for(int i=0;i<arr2.length;i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}

		Uncommon(arr1,arr2);
	}

	public static void Uncommon(int arr1[],int arr2[]){
			System.out.println("Uncommon Elements Are:");
		for(int i=0;i<arr1.length;i++){
			int flag=0;
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j])
				flag=1;
				
			}
			
			if(flag==0){
				System.out.println(arr1[i]);
			}
		}

		for(int i=0;i<arr2.length;i++){
			int flag=0;
			for(int j=0;j<arr1.length;j++){
				if(arr2[i]==arr1[j]){
					flag=1;
				}
			}
				if(flag==0){
					System.out.println(arr2[i]);
				}
			
		}
	
	
	}
}


//CompareTo method Implementation........
class CompareTo4{
       public static void main(String[] args){

	String str1="Amrutaa";
	String str2="Amrutaai";
	
	int Result=MyCompareTo(str1,str2);	
	System.out.println(Result);

       }
       public static int MyCompareTo(String str1,String str2){
	       char arr1[]=str1.toCharArray();
	       char arr2[]=str2.toCharArray();

	       
	       for(int i=0;i<arr1.length && i<arr2.length;i++){

		       if(arr1[i]!=arr2[i]){
			      //int diff=arr1[i]-arr2[i]; 
		       		return arr1[i]-arr2[i];
		       }
	       }  
	       if(arr1.length!=arr2.length){
		       return arr1.length-arr2.length;
	       }  

	       return 0;
		       
       }
}


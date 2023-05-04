class CacheDemo{
	public static void main(String[] args){
		char ch='A';
		int x=65;

		System.out.println(System.identityHashCode(ch));     //bipush 65  //internally jatana dogh pn 65 mhnun ch jatat 
		System.out.println(System.identityHashCode(x));   //bipush 65    // pn jevha idhashcode sathi vicahrto tevha char cha Character wrapper class ha valoueof() la call karto ani valueof() ha new object banvun deto tyamule id hash code vegla yeto.........                            
       
		char arr[]={'A','B','C'};
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
 
	}
}


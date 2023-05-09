class ReverseStringUsingReverseM{
	public static void main(String[] args){
		String str1="Amruta";

		StringBuffer sb=new StringBuffer(str1);

		str1=sb.reverse().toString();

		System.out.println(str1);
	}
}


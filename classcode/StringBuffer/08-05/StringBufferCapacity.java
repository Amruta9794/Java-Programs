class StringBufferCapacity{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer();

		System.out.println(sb.capacity());
		System.out.println(sb);

		sb.append("Amruta");
		System.out.println(sb.capacity());
		System.out.println(sb);
		
		sb.append("Dalavi");
		System.out.println(sb.capacity());
		System.out.println(sb);

		sb.append("JavaProgramming");
		System.out.println(sb.capacity());
		System.out.println(sb);

		StringBuffer sb1=new StringBuffer("Amruta");
		System.out.println(sb1.capacity());
		System.out.println(sb1);

		sb1=sb1.append(sb);
		System.out.println(sb1.capacity());
		System.out.println(sb1);
	}
}


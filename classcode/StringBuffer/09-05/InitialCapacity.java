class InitialCapacity{
	public static void main(String[] args){
		StringBuffer sb=new StringBuffer(100);   //initial capacity......
		sb.append("ABCDEFGH");
		sb.append("IJKLMNOP");

		System.out.println(sb);
		System.out.println(sb.capacity());
		 
		sb.append("QRSTUVWXYZ");
		System.out.println(sb);
		System.out.println(sb.capacity());

	}
}


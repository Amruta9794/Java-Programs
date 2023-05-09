class StringBufferCapacity{
	public static void main(String[] args){

		StringBuffer sb=new StringBuffer();

		sb.append("Beincaps");
		sb.append("core2web");

		System.out.println(sb);
		System.out.println(sb.capacity());

		sb.append("Incubator");
		System.out.println(sb);
		System.out.println(sb.capacity());
	}
}


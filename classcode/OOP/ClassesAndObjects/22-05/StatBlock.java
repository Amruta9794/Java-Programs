class StatBlock{
	int x=10;
	static int y=10;
	static{
		System.out.println("STAIC BLOCK 1");
	}
	public static void main(String[] args){
		System.out.println("MAIN METHOD");
		StatBlock obj=new StatBlock();
		System.out.println(obj.x);
	}
	static {
		System.out.println("STATIC BLOCK 2");
	}
}



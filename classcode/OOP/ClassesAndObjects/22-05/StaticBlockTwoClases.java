class StaticBlockOne{
	static {
		System.out.println("In Static Block One");
	} 
	int x=10;
}
class StaticBlockTwo{
	static {
		System.out.println("In Static Block Two");
	}
	int y=10;
}
class StaticBlockTwoClases{
	public static void main(String[] args){
		StaticBlockOne obj1=new StaticBlockOne();
		StaticBlockTwo obj2=new StaticBlockTwo();
	}
}



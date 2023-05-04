class IntegerEqualOperator{
	public static void main(String[] args){
		int x=200;
		int y=200;

        		if(System.identityHashCode(x)==System.identityHashCode(x)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}

		if(x==y){
			System.out.println("true");
		}
	}
}


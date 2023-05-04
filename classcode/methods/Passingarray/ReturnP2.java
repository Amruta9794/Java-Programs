class FunDemo{
	public static void main(String[] args){
		FunDemo obj=new FunDemo();
		int ret  = obj.Fun(10);
		System.out.println(ret);
	}
	int Fun(int x){
		int val=x+50;
		return val;
	}
}


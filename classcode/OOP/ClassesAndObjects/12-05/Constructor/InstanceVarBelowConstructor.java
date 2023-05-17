class InstanceVarBelowConstructor{

	InstanceVarBelowConstructor(){
		System.out.println("In Constructor");
	}
	int x=10; //instance var
		public static void main(String[] args){

			InstanceVarBelowConstructor obj=new InstanceVarBelowConstructor();
			System.out.println("In main");
			System.out.println(obj.x);
			System.out.println(obj.y);
		}

	int y=10;
}

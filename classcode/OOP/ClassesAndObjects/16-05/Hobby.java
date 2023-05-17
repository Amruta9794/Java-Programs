class Company{
	int employeecount=10;
	float salary=7.5f;

	void project(){
		String project_Type="Development";
		int sprint=3;
		System.out.println("Salary");
	}


	public static void main(String[] args){
		Company obj=new Company();
		obj.project();

		
		System.out.println(obj.salary);
	}
}


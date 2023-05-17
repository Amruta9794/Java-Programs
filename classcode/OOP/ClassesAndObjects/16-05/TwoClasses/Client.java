
class Client{

	public static void main(String[] args){
	Project obj=new Project();

	obj.ClientInfo();
}
}

class Project{
	String ProjectName="OnlineEdu";
	int NoOfEmp=20;

	void ClientInfo(){
		String ClientName="Amrita";
		System.out.println(ClientName);
		System.out.println(ProjectName);
		System.out.println(NoOfEmp);
	}
}




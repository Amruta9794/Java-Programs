class Employee{
    int empId=10;
    String empName="Amruta";

    void empInfo(){
        System.out.println("Id="+empId);
        System.out.println("empName="+empName);
    }
}

class MainDemo{
    public static void main(String[] args) {
        Employee emp1=new Employee();

        emp1.empInfo();
        System.out.println(emp1.empId);
        System.out.println(emp1.empName);
    }
}
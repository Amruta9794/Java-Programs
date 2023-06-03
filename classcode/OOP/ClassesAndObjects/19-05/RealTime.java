

class University{
    static int NoOfColleges=50;
    static String University_Name="SPPU";
    String College_Name="Sinhgad";

    void College_Info(){
        System.out.println(NoOfColleges);
        System.out.println(University_Name);
        System.out.println(College_Name);
    }

    static void University_Info(){
        System.out.println(NoOfColleges);
        System.out.println(University_Name);
    }
}

class Student{
        public static void main(String[] args) {
            University obj=new University();

            obj.College_Info();
            obj.University_Info();

            System.out.println(obj.NoOfColleges);
            System.out.println(obj.College_Name);
        }
}

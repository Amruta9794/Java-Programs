class AppendStoredReferenceOfObject{
    public static void main(String[] args){
        String str1="Amruta";
		String str2=new String("Dalavi");
		StringBuffer str3=new StringBuffer("Pune");

        str1.concat(str2);  //ha object cha refernce store karat nahi(garbage collector)
        str3.append(str2);  //ha object cha referenced stored karto...tyamul je append kelay te str3 madhe pn hotay..

        System.out.println(str1);
        System.err.println(str2);
        System.out.println(str3);
    }
}


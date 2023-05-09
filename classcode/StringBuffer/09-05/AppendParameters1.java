public class AppendParameters1{

    public static void main(String[] args) {
        
        String str1="Amruta";
		String str2=new String("Dalavi");
		StringBuffer str3=new StringBuffer("Pune");

        StringBuffer str4=str3.append(str1);
        
        System.out.println(str1);       //Amruta
        System.out.println(str2);       //Dalavi
        System.out.println(str3);       //PuneAmruta   -ithe Append kelela reference store krto jya var Append Method Perform Jhali
        System.out.println(str4);       //PuneAmruta
        
    }
}
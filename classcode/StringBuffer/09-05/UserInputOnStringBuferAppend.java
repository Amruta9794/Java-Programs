import java.io.*;
class UserInputOnStringBuferAppend{
    public static void main(String[] args)throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter three String");
        String str1=br.readLine();
        String str2=br.readLine();
        StringBuffer sb1=new StringBuffer(br.readLine());

        str1.concat(str2);
        sb1.append(str2);
        
        System.out.println(str1);
        System.out.println(sb1);



    }
}

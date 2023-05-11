import java.io.*;
public class NestedLoop64 {
    public static void main(String[] args)throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter start");
        int start=Integer.parseInt(br.readLine());

        System.out.println("Enter End");
        int end=Integer.parseInt(br.readLine());

        for(int i=start;i<=end;i++){
            for(int j=1;j<=i;j++){
                if((j*j*j)==i){
                    System.out.println(i);
                }
            }
        }
    }
}

import java.io.*;
public class NestedLoop62 {
    public static void main(String[] args)throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Start");
        int Start=Integer.parseInt(br.readLine());

        System.out.println("Enter End");
        int End=Integer.parseInt(br.readLine());

        for(int i=Start;i<=End;i++){
            int Count=0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    Count++;
                }

            } 
            if(Count>=2){
                System.out.println(i);
            }
        }
        
    }
}

import java.io.*;

class NestedLoop63{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Start");
        int Start=Integer.parseInt(br.readLine());

        System.out.println("Enter End");
        int End=Integer.parseInt(br.readLine());

        for(int i=Start;i<=End;i++){
            for(int j=1;j<=i;j++){
                if(j*j==i){
                    System.out.println(i+" ");
                }
            }
        }
    }
}
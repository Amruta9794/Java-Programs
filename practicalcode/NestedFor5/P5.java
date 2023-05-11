import java.io.*;
class NestedFor54{
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter No Of Rows");

        int row=Integer.parseInt(br.readLine());

        int F=0;
        int S=1;
        int n=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print(n+" ");

                F=S;
                S=n;
                n=F+S;
            

            }
            System.out.println();
        }
    }
}

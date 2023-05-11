import java.io.*;
class NestedLoop61{
    public static void main(String[] args)throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Lower Limit");
        int LowerL=Integer.parseInt(br.readLine());

        System.out.println("Enter Uppar Limit");
        int UpperL=Integer.parseInt(br.readLine());

        int count=0;
        for(int i=LowerL;i<=UpperL;i++){

            if(i%5==0){
                System.out.println(i);
                if(i%2==0){
                    count++;
                }
            }
        }
        
        System.out.println("Count Of Even Number"+count);
    }
}

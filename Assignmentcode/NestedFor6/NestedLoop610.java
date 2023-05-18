import java.io.*;

public class NestedLoop610 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Start");
        int Start=Integer.parseInt(br.readLine());

        System.out.println("Enter End");
        int End=Integer.parseInt(br.readLine());


        for(int i=Start;i<=End;i++){
            int num=i;
            int count=0;
            int sum=0;
            while(num>0){
                count++;
                num=num/10;
            }

            num=i;
            while(num>0){
                int mul=1;
                int rem=num%10;
                for(int j=1;j<=count;j++){
                    mul=mul*rem;
                }
                sum=sum+mul;
                num=num/10;

            }
            if(sum==i){
                System.out.println(i);
            }
        }


    }
}

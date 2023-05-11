import java.io.*;
class NestedFor59{
   public static void main(String[] args)throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number");

        int n=Integer.parseInt(br.readLine());
        int temp=n;
        
        int sum=0;
        while(n!=0){
            int rem=n%10;
            int fact=1;
            for(int i=1;i<=rem;i++){

                 fact=fact*i;

            }
            n=n/10;
            sum=sum+fact;
        }

        System.out.println("Addition Of Factorial of each Digit from "+temp+"="+sum);
   } 
}

import java.io.*;
public class Nestedloop66 {
  public static void main(String[] args)throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter Five Numbers");

    for(int i=1;i<=5;i++){

        int x=Integer.parseInt(br.readLine());
        int temp=x;
        int count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }

        System.out.println("The Digit Count in "+x+" is "+count);
    }
    
  }  
}

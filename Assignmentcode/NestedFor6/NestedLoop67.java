import java.io.*;

import javax.swing.plaf.synth.SynthDesktopIconUI;
public class NestedLoop67 {
    public static void main(String[] args)throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Start");
        int start=Integer.parseInt(br.readLine());

        System.out.println("Enter End");
        int end=Integer.parseInt(br.readLine());
        int num=0;
        

        System.out.println("Reverse Numbers");
        for(int i=start;i<=end;i++){
              int rev=0;
              num=i;
            while(num!=0){
                int rem=0;
                rem=num%10;
                rev=rev*10+rem;
                num=num/10;

            }

            System.out.println(rev);
        }
        
    }
}

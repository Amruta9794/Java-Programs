import java.io.*;
public class CompositeNoIndex {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Size Of Array");
        int size=Integer.parseInt(br.readLine());
        int arr[]=new int[size];

        System.out.println("Enter Elements In Array");

        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        System.out.println("Composite Number And Its Index:");
        for(int i=0;i<arr.length;i++){
            int count=0;

            for(int j=1;j<arr[i];j++){
                if(arr[i]%j==0){
                    count++;
                }
            }
            if(count>=2){
                System.out.println(arr[i]+"="+ i);
            }
        }
    }
}

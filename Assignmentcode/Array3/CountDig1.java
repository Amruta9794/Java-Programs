import java.io.*;

class CountDig1{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Size OF Array");
        int size=Integer.parseInt(br.readLine());

        int arr[]=new int[size];

        System.out.println("Enter Elements in Array ");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }

        System.out.println("count Of Digits In Elements:");

        for(int i=0;i<arr.length;i++){
            int count=0;
            int temp=arr[i];
            while(temp!=0){
                count++;
                temp=temp/10;
            }
            System.out.println(arr[i] +"="+count);
        }
    }
}
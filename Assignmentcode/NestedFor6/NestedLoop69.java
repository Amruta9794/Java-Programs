import java.io.*;
public class NestedLoop69 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Start");
        int Start = Integer.parseInt(br.readLine());

        System.out.println("Enter End");
        int End = Integer.parseInt(br.readLine());

        for (int i = Start; i <= End; i++) {
            int num = i;

            int sum = 0;
            while (num> 0) {
                int rem = num % 10;
                int fact = 1;
                for (int j = 1; j <= rem; j++) {
                    fact = fact * j;
                    }
                    sum = sum + fact;
                    num = num / 10;

                
                }
            if (sum == i) {
                System.out.println(i);
            }
        }
    
    }
}

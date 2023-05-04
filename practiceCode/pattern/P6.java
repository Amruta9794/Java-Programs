import java.util.Scanner;

class RightAngtTria {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int row= sc.nextInt();
        System.out.println("Enter columns");
        int col= sc.nextInt();
        for(int i=1;i<=row;i++) {
            for(int j=1;j<=col;j++)
            {
                if(j<=i)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }    
    }
    
}

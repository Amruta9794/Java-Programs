import java.io.*;
class NestedFor57 {

    public static void main(String[] args)throws IOException {
                
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter No Rows");
                int row=Integer.parseInt(br.readLine());
                    int x=(row*(row+1))/2 ;
                
                for(int i=1;i<=row;i++){
                    for(int j=1;j<=i;j++){
                        if(i%2==1){
                            System.out.print((char)(64+x)+ "  ");
                        }else{
                            System.out.print(x+ "  ");
                            
                        }
                        x--;
                    }System.out.println();
                }
            }
        }

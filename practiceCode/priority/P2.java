class Priority{
	  public static void main(String[] args) {
	    int i=4;
	    int j=5;
	    int k=6;
	    int sum= ++i + j++ * k + i/2; //5+30+2=37
	    System.out.println(sum);  //4*5%6-perform the operation left to right
													        }
}


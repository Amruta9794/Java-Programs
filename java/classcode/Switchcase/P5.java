 class SwitchDemo{
	 public static void main(String[] args) {
		 int x=3;
		 int a=1;
		 int b=2;
		 switch(x) {
			 case a:                            // error 1: constant expression required
				 System.out.println("1");
				 break;
			 case b:                            // error 2: constant expression required
				 System.out.println("2");
				 break;
			 case a+b:                          // error 3: constant expression required
				 System.out.println("3");
				 break;
			 case a+a+b:                        // error 4: constant expression required
				 System.out.println("4");
			         break;
			 case a+b+b:                        // error 5: constant expression required
				 System.out.println("5");
				 break;
                         default:
				 System.out.println("invalid");
				 break;
		 }
	 }
 }
				 


class IntegerCache{
	public static void main(String[] args){
		int x=10;
		int y=10;
		int y1=200;
		Integer z=10;
		Integer z1=new Integer(10);
		System.out.println(System.identityHashCode(x));
		 System.out.println(System.identityHashCode(y));
		  System.out.println(System.identityHashCode(y1));
		  System.out.println(System.identityHashCode(z));
		   System.out.println(System.identityHashCode(z1));

		    System.out.println();
		    float f=10.0f;
		    float f1=10.0f;
		    Float f2=10.0f;
		    Float f3=new Float(10.0f);
		    System.out.println(System.identityHashCode(f));
		     System.out.println(System.identityHashCode(f1));
		      System.out.println(System.identityHashCode(f2));
		       System.out.println(System.identityHashCode(f3));

		        System.out.println();
			char c='c';
			char c1='c';
			Character c2='c';
			Character c3=new Character('c');
			 System.out.println(System.identityHashCode(c));
			  System.out.println(System.identityHashCode(c1));
			   System.out.println(System.identityHashCode(c2));
			    System.out.println(System.identityHashCode(c3));

			     System.out.println();
			     boolean b1=true;
			     boolean b2=true;
			     Boolean b3=true;
			     Boolean b4=new Boolean(true);
			      System.out.println(System.identityHashCode(b1));
			       System.out.println(System.identityHashCode(b2));
			        System.out.println(System.identityHashCode(b3));
				 System.out.println(System.identityHashCode(b4));
				
				  System.out.println();

	}
}


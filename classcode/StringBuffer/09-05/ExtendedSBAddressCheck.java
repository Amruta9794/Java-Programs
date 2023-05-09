class ExtendedSBAddressCheck{
       public static void main(String[] args){
       	StringBuffer sb=new StringBuffer();
	sb.append("Amruta");                       
	System.out.println(sb.capacity());                      //16

	sb.append("Dalavi");
	System.out.println(sb.capacity());                      //16
	System.out.println(System.identityHashCode(sb));

	
	sb.append("SinhgadCollegeOfEngineering");
	System.out.println(sb.capacity());		       //16+1*2=34+5characters=39
	System.out.println(System.identityHashCode(sb));

	sb.append("Pune");
	System.out.println(sb.capacity());                    //39+1*2=80
	System.out.println(System.identityHashCode(sb));

       }
}


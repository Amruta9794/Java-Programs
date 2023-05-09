public class ConcatOnStringBuffer{
    public static void main(String[] args){
        String str1="Amruta";
		String str2=new String("Dalavi");
		StringBuffer str3=new StringBuffer("Pune");

        String str4=str1.concat(str3); /*error:incompatible types:StringBuffer cannot be converted to String.
                                    ithe concat method hi String class chi ahe ani ti parameter ghetana pn
                                    string class chach ghete ani stringbuffer jar as parameter pass kela tr
                                    error yeto...*/
                                        
         StringBuffer str5=str3.append(str2);
    }

}

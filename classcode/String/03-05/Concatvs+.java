class ConcatvsPlus  { 
       public static void main(String[] args){
       String str1="Amruta";
       String str3="Dalavi";
       String str2=str1+str3;   //internally calls append method of stringbuilder class
       String str4=str1.concat(str3);

       System.out.println(str2);  
       System.out.println(str4);
       }
}


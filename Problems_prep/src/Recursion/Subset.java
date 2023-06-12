package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
      //  subset("", "abc");
     //   System.out.println(s1);
   //  System.out.println(padRev("", "12"));
        String str[] =
            {"flower","flow","flight"};
      //  System.out.println(longestCommonPrefix(str));
        Subset subset=new Subset();
        System.out.println(subset.s1);
        
    }
    static List<String> s1=new ArrayList<>();
    public static void subset(String pro,String unprp) {
        if(unprp.isEmpty()) {
            s1.add(pro);
            return;
        }
        char c=unprp.charAt(0);
       
         
        
         subset(pro+c, unprp.substring(1));
         subset(pro, unprp.substring(1));
        
    }
    
    
    public static ArrayList<String> padRev(String pro,String unpro){
        if(unpro.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(pro);
            return list;
        }
        ArrayList<String> listouterArrayList=new ArrayList<>();
        int digit=unpro.charAt(0)-'0';
        for(int i=(digit)-1;i<digit*3;i++) {
            listouterArrayList.addAll(padRev(pro+ (char)('a'+i), unpro.substring(1))) ;
            
        }
        return listouterArrayList;
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
    
  return "";
}
else if(strs.length==1){
    return strs[0];
}
String temp="" ;
String temp2="";

for(int i=0;i<strs[0].length();i++){
    temp=strs[0].substring(0,i+1);
    System.out.println("temp:"+temp);
    for(int j=1;j<strs.length;j++){
System.out.println("test:"+strs[j].indexOf(temp));
        if(strs[j].indexOf(temp) !=0){
            System.out.println("last:"+temp2);
            return temp2;
        }
        
    }
    temp2=temp;
}
return temp2;
}

}

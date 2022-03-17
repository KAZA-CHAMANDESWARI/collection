import java.util.*;  
public class Hashset1{  
 public static void main(String args[]){  
  HashSet<String> obj=new HashSet<String>();  
  obj.add("97");  
  obj.add("87");  
  obj.add("97");  
  obj.add("86");
  obj.add("95");
  obj.add("86");
  obj.add("74");
  Iterator<String> itr=obj.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
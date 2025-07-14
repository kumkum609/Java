public class Split {
 public static void main(String[] args) {
//Split ==> It split the entire string on the based of delimetre
 String str = "This is a java program";
     String s[];
     s=str.split(" ");
     for(int i=0;i<s.length;i++)
     System.out.println(s[i]);

    }
}

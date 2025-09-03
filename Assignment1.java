public class Assignment1{
    public static String removeDoubleLetter(String str){
     StringBuilder result = new StringBuilder();
     for(int i=0;i<str.length();i++){
        if(i==0||str.charAt(i)!=str.charAt(i-1)){
            result.append(str.charAt(i));
        }
     }
     return result.toString();
    }
    public static void main(String[]args){
    String str ="Bookkeeper";
    String str2= "tresidder";
    System.out.println(removeDoubleLetter(str));
    System.out.println(removeDoubleLetter(str2));
    }
}
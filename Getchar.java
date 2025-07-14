public class Getchar {
    
    public static void main(String[] args) {
//getchars
        String a="Batman";
        
        char arr[]=new char[3];
        a.getChars(3,6,arr,0);
        System.out.println(arr);
    }

}

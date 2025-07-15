public class VowelsConsonents {
    public static void main(String[]args){
        String str = "This is a Java program";
        int c1=0,c2=0;
        str = str.toLowerCase();
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u')
            c1++;
            else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                c2++;

            } 
            System.out.println("Number of vowels=" +c1);
            System.out.println("Number of consonants=" +c2);
            
        }
    }
    
}

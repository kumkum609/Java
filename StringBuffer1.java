public class StringBuffer1 {
    public static void main(String[] args) {
        //String Buffer

         StringBuffer Sb = new StringBuffer("Hello");
        System.out.println("Before append String = "+Sb);

        // Now use append
        Sb.append(" world");
        System.out.println("After using append string = "+Sb);
    }
}
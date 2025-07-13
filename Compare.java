public class Compare {
    public static void main(String[] args)
    // CompareTo
    String S1="boy", S2="boy";
    int a;
    a = S1.compareTo(S2);
    System.out.println("a="+a);

            //compareToIgnoreCase
    String C1="Boy", C2="boY";
    int b;
    b = C1.compareToIgnoreCase(C2);
    System.out.println("b="+b);

    }
}
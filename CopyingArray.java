public class CopyingArray {
    public static void main(String[] args) {
    int a[] = {1,2,3,4,5};
    int b[] = new int[a.length];
    // Copying array a to array b

    for(int i = 0; i<a.length; i++)
    b[i] = a[i];

     //Printing array b 

     System.out.println("After Copying array a to array b:");
     for(int i=0; i<b.length; i++)
     
     System.out.println(b[i]);

             }
     }
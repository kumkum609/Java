import java.util.Scanner;
class library{

    /*Implement a library using java class library
     * Methods--addBooks,issuedBook,availableBooks,
     * Array to store the available books
     * Arraay to store the issued Books
     */
    Scanner sc = new Scanner(System.in);
    String[] avbooks = new String[10];
    String[] issuedbooks = new String[10];
    int n; //no. of available books
    int m; //no. of issued books

    library(){
        avbooks[0] ="Java";
        avbooks[1] ="Python";
        avbooks[2] ="C++";
        avbooks[3] ="Html";
         n = 4;
         m = 0;
    }
    void addBook(){
        if(n==10){
            System.out.println("Library is full....");
        }
        else{
            System.out.println("Enter the name of book you want to add:");
            avbooks[n] = sc.nextLine();
            n++;
            System.out.println("BOOK ADDED");
        }
    }
    void avbook(){
        System.out.println("Available books are:");
        for(int i =0;i<n;i++){ 
            System.out.println(i+1+"." +avbooks[i]); //printing available books 
        }
    }
    void issuedbook(){
        avbook();
    
        System.out.println("Enter the name of book you want to issue:");
        String s = sc.nextLine();
        for(int j =0;j<n;j++){
            if(s.equals(avbooks[j])){  
                System.out.println("BOOK ISSUED");
                issuedbooks[m] = s;
                m++;
                for(int k =j;k<n;k++){
                    avbooks[k] = avbooks[k+1]; //shifting
                    n--;
                    break;
                }
            }
            else if(j==n-1){ 
                System.out.println("Book not found");
            }
        }
    }
}
public class LibraryManagement {
    public static void main(String[]args){
     library obj = new library();
     
    Scanner s = new Scanner(System.in);
     String ch = "n";
     obj.avbook();
     System.out.println("Do you want to add book(Y/N) :");
     ch = s.next();
     if(ch.equals("Y")|| ch.equals("y")){
        obj.addBook();
    }
     System.out.println("Want to add more books(Y/N):");
     ch = s.next();
     if(ch.equals("y")|| ch.equals("Y")){
        obj.addBook();
    } 
    System.out.println(" books are:");
    obj.avbook();
    System.out.println("Do you want to issue book(Y/N) :");
     ch =s.next();
     if(ch.equals("Y")|| ch.equals("y")){
        obj.issuedbook();
     }

    
     else{
        System.out.println("Thank you");
     }
      s.close();
   } 
   
  }
  


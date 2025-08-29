import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandle {
    public static void main(string[]args){
   
        //create a new file 
     File myFile = new File("myfile.txt");
     try{
        myFile.createNewFile();

     }
     catch(IOException e){
        System.out.println("Unable to create file");
        e.printStackTrace();
     }
     //write to file
     try{
     FileWriter myWriter = new FileWriter("myfile.txt");
       myWriter.write("Hello! \n This is a first file in java");
       myWriter.close();
   }
   catch(IOException e){
      e.printStackTrace();
   }

     //check if files exists
     if(myFile.exists()){
      System.out.println("File name:" +myFile.getName());

     }
    }
    
}

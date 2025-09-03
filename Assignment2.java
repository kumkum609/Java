import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class Assignment2 {
  public static int neverEndingBirthdayParty(){
    int totalbirthdays = 366;
    Set<Integer> birth = new HashSet<>();
    Random random = new Random();
    int count = 0;
    while(birth.size()<totalbirthdays){
        int bday = random.nextInt(totalbirthdays);
        count++;
    }
    return count;
  }
    public static void main(String[]args){
        int result = neverEndingBirthdayParty();
        System.out.println("No. of people needed :" +result);
    }
    
}

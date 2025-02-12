public class continue {

public static void main(String[] args) {

    //Continue

    for(int i=0;i<5;i++){
        if(i==4){

            System.out.println("End the loop");
            continue;
        }

        System.out.println(i);
    }
}
}
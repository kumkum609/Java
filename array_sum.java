public class array_sum {
    public static void main(String[] args) {

        //Array of 5 floats and calculate their sum

        float[]marks={45.9f,98.5f,98.8f,87.3f,52.8f};
        float sum=0;

        //For each loop

        for(float element:marks){
            sum=sum+element;

        }
        System.out.println("The value of sum is:"+sum);
    }
}
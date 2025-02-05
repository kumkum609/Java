public class cond {
    public static void main(String[] args) {
        //if-else statement

        byte s1,s2,s3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Physics marks:");
        s1=sc.nextByte();

        System.out.println("Enter chemistry marks:");
        s2=sc.nextByte();

        System.out.println("Enter Biology marks:");
        s3=sc.nextByte();

        float avg=(s1+s2+s3)/3.0f;
        System.out.println("Percentage is:"+avg);
        if(avg>=40 && s1>=33 && s2>=33 && s3>=33 && );{
            System.out.println("you are passed");
        }
        else{
            System.out.println("You are fail! Try again");
        }

    }
}
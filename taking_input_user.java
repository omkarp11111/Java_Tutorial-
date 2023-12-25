import java.util.Scanner;

public class taking_input_user {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter our standard ");
        int std=sc.nextInt();
        System.out.println("i am in "+std+"th year ");

        //  just like that we can input float by changing only nextFloat ,
        //nextByte,nextShort,nextLong 

        System.out.println("inputing an string ");
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter our name ");
        String name=sc1.next();
        System.out.println("my name is "+name + " (only first word)"  ) ;
        //here next( ) only store first word of input string 
        //if we want to store entire string then we need to use nextLine 

        String name1=sc1.nextLine();
    
        System.out.println("my name is  "+name1 +" entrire string will print ");



    }
    
}

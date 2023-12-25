public class operators {
    public static void main(String[] args) {
        // There many operator are in Java 
        //Arithmetic operators 
        float first=2.0F;
        float second= 5.6F;
        float sum= first +second ;
        System.out.println(sum);
        //Just like sum we can perform substraction ,multiplication , division 
         
        float diff= first - second ;
        System.out.println(diff);

        
        float mul = first * second ;
        System.out.println(mul );

       
        float div= first / second ;
        System.out.println(div);
         
        System.out.println("just like that we can use modulo operator-% ,for getting an remainder ");
         
        float remainder= first %second ;
        System.out.println(remainder);


        System.out.println("we can use assignment operator - unary operator ++ --");
        int num=2;
        // incremental operator 
        System.out.println(num++);//2
        System.out.println(num);//3

        System.out.println(++num);//3
        System.out.println(num);//3
                


        //decremental operator 
        System.out.println(num--);//2
        System.out.println(num);//1
        
        System.out.println(--num);//1
        System.out.println(num);//1



        
    }
    
}

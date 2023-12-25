public class casting {
    public static void main(String[] args) {
        // casting is nothing but the type conversion 
        //  we can easily store the int value to an double type -because the int has 4 byte 
        // and double has 8 byte
        double first =200.20;
        double second=first +50;
        System.out.println(second);// we can store the int into the double 
        
        int f=200;
        // int s=f+50.34; we cannot write like that ,we need to write type cast this 50.34 to int 
        int s=f+(int)50.91;
        System.out.println(s);
    }
    
}

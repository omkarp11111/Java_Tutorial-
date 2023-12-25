public class try_catch {
    public static void main(String[] args) {
        System.out.println("we can handle the exception by using catch statement");
        int []marks={97,98,99,100,96,98};
        try{
            System.out.println(marks[10]);
        }
        catch(Exception exception){
            //exception statment 
             
        }

        System.out.println("statment after the try catch block ,can be print as it is ");
    }
    
}

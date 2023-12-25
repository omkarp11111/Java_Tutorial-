public class break_continuou {
    public static void main(String[] args) {
        System.out.println("break statment");
        int x=0;
        while(true){
            System.out.println(x);
            if(x>6){
                break;
            }
            x++;
        }


        System.out.println("continuou statement ");
        int y1=0;
        while(true){
            System.out.println(y1);
            if(y1==3){
                y1++;
                continue;
            }
            y1++;
            if (y1>5){
                break;
            }
        }
    }
    
}

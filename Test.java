class Test{  
    public static void main(String args[]){  
     System.out.println("Hello Java"); 
    /* two types of variable are 
     * 1. premitive 
     * 2. non-premitive / reference 
     */
    /* 
     * premitive data types 
     * 1.byte-1
     * 2.short -2
     * 3.int -4   1,3,4,
     * 4.long -8 
     * 5.float -4 3.14
     * 6.double-8
     * 7.char-2  a,b,c ,d
     * 8.boolean -1 true/false 
    */
    int phone =1234567890;
    long phone2=12345678900L;// we are adding L-LONG ,F-FLOAT for indicating this is that particular type 
    float pi=3.14F;
    char letter='@';
    boolean isAdult=true;
    /* Non premitive data types  -that has there particular set of functions */
    String name="Omkar";
    System.out.println(name.length());
    // we can also use new keyword of assigning value to an string 
    String myname=new String("omkar");

    System.out.println("There are many methods for string ");
    System.out.println("concat by + ");
    String name1="my";
    String name2 ="name";
    String name3=name1+" " +name2;
    System.out.println(name3);
    System.out.println("charAt"+" "+name.charAt(2));
    System.out.println("repalce method");
    String name_replace=name.replace("k","c");
    System.out.println(name_replace);//but original string is immutable ,we cannot change name String at all 
    
    System.out.println("substring method in string "+  name.substring(0,2));//but here last index in exclude in the substring 
    }  
} 
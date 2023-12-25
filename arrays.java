import java.util.Arrays;
public class arrays {
    public static void main(String[] args) {
        int [] marks=new int[5];
        marks[0]=98;
        marks[1]=99;
        marks[2]=96;
        marks[3]=100;
        marks[4]=100;
        System.out.println(marks);//we cannot direct print the array  by array name .we can print the array data byusing index 
        System.out.println(marks[4]);
        // if we not intialized the array elements of any type ,then it bydefault assigna a particulat value ,lets 
        //take int -0,boolean-false 
        
        System.out.println("Two methods of arrays 1.length  2.Arrays.sort");
        System.out.println(marks.length);//here for length function we don't need to write parenthesis
        System.out.println("marks before sorting "+marks[0]);
        Arrays.sort(marks);
        System.out.println("marks after sorting "+marks[0]);

        //we can use curly brace for defining an array 
        int[] mark1={91,92};
        //we can used 2d arrays for accessing different student marks for different subject 
        int[][] final_array= {{98,99},{95,96}};
        System.out.println(final_array[1][1]);



    }
}

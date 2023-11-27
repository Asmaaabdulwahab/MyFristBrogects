import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        int element []=new int[4];
        Scanner input=new Scanner(System.in);
        for (int i=0;i<element.length;i++){

            element [i]= input.nextInt();
        }
        for (int i=0; i<element.length;i++){
           System.out.println(element[i]);
        }


    }

}

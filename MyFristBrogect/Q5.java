import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        int[]num={45,87,99,100};
        print(num);
        input(num);
        print(num);
    }

    public static void print(int element[]){}
    public static void input(int element[]){
        Scanner input= new Scanner(System.in);
        for (int i =0; i< element.length;i++){
            element[i]=input.nextInt();
        }
    }
}

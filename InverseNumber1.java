import java.io.* ;
import java.util.Scanner;

public class InverseNumber1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        int nod = 0; //Number of Digit
        while(temp != 0){
            temp = temp /10;
            nod ++;
        }
        int i = 1;
        while(i <= nod){
            int d = n%10;
            int y = i*(int)Math.pow(10,d-1);
            sum = sum + y;
            n = n/10;
            i++;
        }
        System.out.println(sum);
    }
}

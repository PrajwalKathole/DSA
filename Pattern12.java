import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int temp ;
        for (int i = 1 ; i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+"\t");
                temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println();
        }
    }
}

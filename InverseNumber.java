import java.util.Scanner;
public class InverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int inv =0;
        int op = 1; //Orginal PLace
        while(n !=0){
            int od = n % 10; //Orginal Digit
            int id = op; //Inverted digit
            int ip = od; // inverted place

            //make chnge to inv using ip and id
            inv = inv + id * (int)Math.pow(10,ip - 1);

            n = n / 10;
            op++;
        }
        System.out.println(inv);

    }
}

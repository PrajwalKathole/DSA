import java.util.*;
public class AnyBaseToDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();
        int dn = getValueInDecimal(num,base);
        System.out.println(dn);
    }
    public static int getValueInDecimal(int num,int base){
        int rv=0;

        int p = 1;
        while(num > 0){
            int dig= num % 10;
            num = num /10;

            rv += dig * p;
            p = p * base;
        }
        return rv;

    }

}

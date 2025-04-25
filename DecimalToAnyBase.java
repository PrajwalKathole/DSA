import java.util.*;
public class DecimalToAnyBase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int base = sc.nextInt();
        int dn = getValueInBase(num,base);
        System.out.println(dn);
    }

    public static int getValueInBase(int num,int base){
        int rv=0;

        int p =1;
        while(num>0){
            int dig = num % base;
            num = num / base;

            rv += dig * p;
            p = p * 10;
        }
        return rv;
    }
}

import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base1 = sc.nextInt();
        int base2 = sc.nextInt();
        int dn = getValue(num,base1,base2);
        System.out.println(dn);
    }
    public static int getValue(int num,int base1,int base2){
        int dec = getValueInDecimal(num ,base1);
        int dn = getValueInBase(dec , base2);
        return dn;
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

import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp =0;
        int st =1;

        for(int i=1;i<=n;i++){
            //System.out.print(sp +" "+st);
            for(int j =1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            sp++;
            System.out.println();
        }

    }

}

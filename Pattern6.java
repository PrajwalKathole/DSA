import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();

     int sp = 1;
     int st1 = n -2;
     int st2 = n -2;

     for(int i =1;i<=n;i++){
         //System.out.print(st1 +" "+sp+" "+st2);
         for(int j=1;j<=st1;j++){
             System.out.print("*\t");
         }
         for(int j=1;j<=sp;j++){
             System.out.print("\t");
         }
         for(int j=1;j<=st2;j++){
             System.out.print("*\t");
         }
         if(i<= n/2){
             sp +=2;
             st1 --;
             st2 --;
         }else{
             sp -=2;
             st1 ++;
             st2 ++;
         }
         System.out.println();
     }
    }
}

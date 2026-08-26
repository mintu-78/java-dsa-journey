import java.util.*;

public class SumNnaturalNo{

    public static void main(String args[]){

        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int sum  = 0; //sum is a variable 
         for  (int i = 0; i<=n; i++){
          sum = sum + i;    
         }
        sc.close();
         System.out.println(sum);
    }
    
}

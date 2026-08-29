//  import java.util.*;

//  public class Take2VariavlesPrintSum {
     
//         public static void main(String[] args){
//             Scanner sc = new Scanner (System.in);
//             int x = sc.nextInt();
//             int y = sc.nextInt();
//             int sum = x + y;

//             System.out.println(sum);
//             sc.close();

//         }
        
     
// }  


import java.util.*;

public class Calculate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        sc.close();
    }
}
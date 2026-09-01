// import java.util.*;

// public class Conditions {

//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//     //     int age = sc.nextInt();

//     // if(age > 18){
//     //     System.out.println("Adult");
//     // }else {
//     //     System.out.println("Not Adult");
//     // }

//     // Example 2 //

//     // int x = sc.nextInt();

//     // if(x % 2 == 0){
//     //     System.out.println("Even");
//     // }else{
//     //     System.out.println("odd");
//     // }

//     // Example 3 //

//     int a = sc.nextInt();
//     int b = sc.nextInt();

//     if( a == b){
//         System.out.println("Equal");
//     }else {
//         if (a > b){
//             System.out.println("a is greater ");
//         }else{
//             System.out.println( "a is lesser");
//         }
//         sc.close();
//     }

    
    
//     }
// }
     
   // Practice Example:

import java.util.*;

public class CheckNumber {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}
// import java.util.*;
// public class InvertedHalfPyramid{

//     public static void main(String args []){

//         int n = 4;

//         for(int i = n; i >= 1; i--){
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



    //    IINVERTED HALF PYRAMID(rotated by 180 deg)//



    import java.util.*;
    public class InvertedHalfPyramidby180deg{

        public static void main(String args[]){

        int n = 4;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }
 }
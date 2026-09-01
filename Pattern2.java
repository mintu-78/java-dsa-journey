public class Pattern2 {

    public static void main(String[] args) {

        for (int j = 1; j <= 2; j++) {

            for (int i = 1; i <= 5; i++) {
                if (i == 1) {
                    System.out.print("*");
                } else if (i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}

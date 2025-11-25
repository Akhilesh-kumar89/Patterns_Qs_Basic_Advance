//=================Hourglass_pattern===
//       *******
//        *   *
//         * *
//          *
//         * *
//        *   *
//       *******

public class Hourglass_pattern {
    public static void main(String[] args) {
         int n = 7;  
        for (int i = 0; i < n / 2 + 1; i++) {
            
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            int cols = n - 2 * i;

            for (int j = 0; j < cols; j++) {

                if (i == 0 || cols == 1) {
                    System.out.print("*");
                }
               
                else if (j == 0 || j == cols - 1) {
                    System.out.print( "*");
                }
               
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = n / 2 - 1; i >= 0; i--) {

           
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }

            int cols = n - 2 * i;

            for (int j = 0; j < cols; j++) {

                if (i == 0 || cols == 1) {
                    System.out.print("*");
                } else if (j == 0 || j == cols - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    
}

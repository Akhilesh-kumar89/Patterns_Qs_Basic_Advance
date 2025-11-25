//=============Hollow_Inverted_pyramid=========
//       *************
//        *         *
//        *         *
//         *       *
//         *       *
//          *     *
//           *   *
//            * *
//             *


public class Hollow_Inverted_pyramid {
    public static void main(String[] args) {
       int n = 7;  
     for (int i = 0; i < n; i++) {
            
        for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                
                if (i == 0 || i == n - 1) {
                    System.out.print("*");
                } 
              
                else if (j == 0 || j == 2 * (n - i) - 2) {
                    System.out.print("*");
                } 
            
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    
    }
}

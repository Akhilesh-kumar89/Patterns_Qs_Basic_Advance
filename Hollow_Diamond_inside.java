//================ Hollow_Diamond_inside====
//           **********
//           ***    ***
//           * **  ** *
//           *  ****  *
//           *   **   *
//           *  ****  *
//           * **  ** *
//           ***    ***
//           **      **
//           **********
public class Hollow_Diamond_inside {
    public static void main(String[] args) {
        int n=10;
        for(int i=0; i< n; i++){
            for(int j=0; j<n; j++){
                   //Print Border
                if(i == 0 || i==n-1 || j == 0 || j == n-1){
                    System.out.print("*");
                }//Print left Digonal
                else if(i == j){
                    System.out.print("*");
                }//print right Digonal
                else if(i+j == n-1){
                    System.out.print("*");
                }//Print digonal just next to left digonal
                else if(j ==i+1){
                    System.out.print("*");
                }//Print Diagonal just next to right diagonal
                else if(j == n-2-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    
}

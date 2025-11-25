// ==========Number Pyramid
//     1
//    121
//   12321
//  1234321
// 123454321
public class Number_pyramid {
    public static void main(String[] args) {
        int num=5;
        for(int i=1 ; i<=num; i++){
           
            for(int j=1 ; j<= num-i; j++){
                System.out.print(" ");
                
            }
            for(int j=1; j<= (2*i -1); j++){
                System.out.print(j);
            }System.out.println();
        }
    }
}

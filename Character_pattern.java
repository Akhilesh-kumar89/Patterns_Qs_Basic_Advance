//=========Character pattern===
//       A
//       BC
//       DEF
//       GHIJ
//       KLMNO

public class Character_pattern {
    public static void main(String[] args) {
        int num=5;
        char ch='A';
        for(int line=1; line<=num; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }System.out.println();
        }

    }
    
}

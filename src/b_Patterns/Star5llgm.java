package b_Patterns;

import java.util.Scanner;

public class Star5llgm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int space = 1;
            while(space<=i-1) {
                System.out.print(' ');
                space += 1;
            }
            int star = 1;
            while(star<=n){
                System.out.print('*');
                star+=1;
            }
            System.out.println();
            i+=1;
        }
    }
}

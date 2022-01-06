// import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        int n = 6; // This is hard-coded but you can change it to user input
        int a = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)a + " ");
                a++;
            }
            
            System.out.println();
        }

    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);  // Create a Scanner object
        int A, B, X;
        A = ler.nextInt();
        B = ler.nextInt();
        X = A + B;
        System.out.println("X = "+ X);

    }

}
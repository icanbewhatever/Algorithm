import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for(int a = 1; a < 10; a++) {
            System.out.println(N + " * " + a + " = " + N * a);
        }
        
        sc.close();
    }
}
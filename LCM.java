import java.util.Scanner;

public class LCM {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = 25;
        int b = 7;
        int lcm = findLCM(a, b);
        System.out.println("LCM of " + a + " and " + b
                           + " is " + lcm);
        sc.close();
    }
    public static int findLCM(int a, int b)
    {
        int greater = Math.max(a, b);
        int smallest = Math.min(a, b);
        for (int i = greater;; i += greater) {
            if (i % smallest == 0)
                return i;
        }
    }
}

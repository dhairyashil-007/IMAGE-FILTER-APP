import java.util.Scanner;

public class hii {
    public static void main(String[] args) {
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int max = a;
        // if (b > max) {
        // max = b;
        // }
        // if (c > max) {
        // max = c;
        // }
        // System.out.println(max);
        // int max = Math.max(c, Math.max(a, b));
        // System.out.println(sc.next().trim().charAt(0));
        // Scanner sc = new Scanner(System.in);
        // char ch = sc.next().trim().charAt(0);
        // if (ch >= 'a' && ch <= 'z') {
        // System.out.println("Lowecase");
        // } else {
        // System.out.println("Uppercase");
        // // }
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int a = 0;
        // int b = 1;
        // int count = 2;
        // while (count <= n) {
        // int temp = b;
        // b = b + a;
        // a = temp;
        // count++;
        // }
        // System.out.println(b);
        // int a = 345555545;
        // int count = 0;
        // while (a > 0) {
        // int rem = a % 10;
        // if (rem == 5) {
        // count++;
        // }
        // a = a / 10;

        // }

        // System.out.println(count);
        int a = 779879867;
        int ans = 0;
        while (a > 0) {
            int rem = a % 10;
            a = a / 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }

}
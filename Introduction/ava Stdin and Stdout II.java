import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.skip("[\r\n]+");
        double d = scan.nextDouble();
        scan.skip("[\r\n]+");
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

//we use scan.skip("[\r\n]+"); because after scan.nextInt(); the scanner takes nextLine(); as empty line after int.

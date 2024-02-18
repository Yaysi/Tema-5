import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first Number");
        int n1 = sc.nextInt();
        System.out.println("Input the second Number");
        int n2 = sc.nextInt();
        System.out.println("Input the third Number");
        int n3 = sc.nextInt();
        System.out.println(n1 + "+" + n2 +"+"+n3+ "="+(n1+n2+n3));
        System.out.println(n1+ "-" +n2 + "+" +n3 +"="+(n1-n2+n3));
        System.out.println(n1+ "/" +n2 + "+" +n3 +"="+(n1/n2+n3));
    }
}
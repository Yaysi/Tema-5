import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner me = new Scanner(System.in);
        System.out.println("Enter number");
        number=me.nextInt();
        me.close();
        if (number>0){
            System.out.printf("The number is positive",number);
        } else if (number<0) {
            System.out.printf("%d is negative number",number);

        }
        else System.out.printf("%d is zero", number);

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first Number");
        int n1 = sc.nextInt();
        System.out.println("Input the second Number");
        int n2 = sc.nextInt();
        System.out.println("Input the third Number");
        int n3 = sc.nextInt();
        System.out.println(n1 + "+" + n2 +"+"+n3+ "=" +(n1+n2+n3));
    }
}


    }}

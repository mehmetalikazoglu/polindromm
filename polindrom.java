import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;

public class polindrom {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelime giriniz : ");
        String kelime = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < kelime.length(); i++) {
            stack.push(kelime.charAt(i));
        }
        String yenikelime = "";
        while (!stack.isEmpty()) {
            yenikelime += stack.pop();

        }
        if (kelime.equals(yenikelime)) {
            System.out.println("Kelime polindromdur");

        } else {
            System.out.println("Kelime polindrom değildir");
        }


    }
}

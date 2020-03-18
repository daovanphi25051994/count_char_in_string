import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your name : ");
        String fullName = scanner.nextLine();
        System.out.printf("Enter a character : ");
        char character = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < fullName.length(); i++) {
            char charInString = fullName.charAt(i);
            if (charInString == character) {
                count++;
            }
        }
        System.out.printf("amount of \"%c\" in \"%s\" is %d", character, fullName, count);
    }
}

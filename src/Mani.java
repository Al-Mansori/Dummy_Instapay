import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Terminal terminal = new Terminal();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(terminal.getCurrentDirectory() + ":$ ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            terminal.chooseCommandAction(input);
        }
        scanner.close();
    }
}

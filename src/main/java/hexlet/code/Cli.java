package hexlet.code;
import java.util.Scanner;


class Cli {

    /**
     * Класс для роаботы взаимодействия с пользователем.
     */
    private String greetingMessage =
            "Welcome to the Brain Games!\n"
            +
            "May I have your name?";

    public void greet() {
        System.out.println(greetingMessage);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);
    }
}

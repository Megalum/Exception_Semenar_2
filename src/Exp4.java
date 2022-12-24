import java.util.Scanner;

public class Exp4 {

    //Запуск задания 4
    public static void start() throws Exception {
        String s = new Scanner(System.in).nextLine();
        if (s.isEmpty()) {
            throw new Exception("Пустые строки вводить нельзя");
        }
    }

}

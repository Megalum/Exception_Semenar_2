import java.util.Scanner;

public class Exp1 {

    //Запуск задания 1
    public static void start() {
        System.out.printf("Введите число вещественного типа: ");
        System.out.println(isNumber(new Scanner(System.in).next()));
    }

    //Метод проверки на число
    private static double isNumber(String val) {
        char[] charArr = val.toCharArray();
        int i = 0;
        boolean floatNumber = false;

        //Проверка на отрицательное значение
        if (charArr[0] == '-'){
            i = 1;
        }

        //Проверка на число
        for (; i < charArr.length; i++) {
            if (!Character.isDigit(charArr[i])){
                if (!floatNumber && charArr[i] == '.') {
                    floatNumber = true;
                } else {
                    System.out.printf("Введенное значение не соответствует требованиям" +
                            "\nВведите новое значение: ");
                    return isNumber(new Scanner(System.in).next());
                }
            }
        }

        //Проверка на тип float
        if (floatNumber) {
            return Double.valueOf(val);
        } else {
            System.out.printf("Введенное значение не соответствует требованиям" +
                    "\nВведите новое значение: ");
            return isNumber(new Scanner(System.in).next());
        }
    }
}

public class Exp2 {

    //Запуск задания 2
    public static void start(){
        int[] intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        try {
            int d = 0;
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }

    }


}

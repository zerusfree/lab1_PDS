import java.util.Scanner;

public class Main {
    private static Scanner MyScan;

    public static void main(String[] args) {
        Scanner MyScan = new Scanner(System.in);

        System.out.println("Введіть номер завдання (1 або 2)");
        int choise = MyScan.nextInt();
        switch (choise) {
            case 1:
                zavd1();
                break;
            case 2:
                zavd2();
                break;
            default:
                System.out.println("Ви ввели не правильно!)");
        }
    }

    public static void zavd1()
    {
        boolean p,q;
        System.out.println("Введіть p (true/false):");
        p = MyScan.nextBoolean();
        System.out.println("Введіть q (true/false):");
        q = MyScan.nextBoolean();

        boolean conjunction = p && q; // Кон'юнкція
        boolean disjunction = p || q; // Диз'юнкція
        boolean exclusiveOr = p ^ q; // Альтернативне "або"
        boolean implication = !p || q; // Імплікація
        boolean equivalence = p == q; // Еквівалентність

        System.out.println("Кон'юнкція: " + conjunction);
        System.out.println("Диз'юнкція: " + disjunction);
        System.out.println("Альтернативне 'або': " + exclusiveOr);
        System.out.println("Імплікація: " + implication);
        System.out.println("Еквівалентність: " + equivalence);

    }
    public static void zavd2()
    {
        byte a = 0b00110100; // a = 52
        byte b = (byte) 0b11011011; // b = 219, оскільки не входить
                                    // у діапазон від -128 до 127 то за замовчуванням вважається int

        System.out.println("Результат виконання порозрядної операції OR: " + Integer.toBinaryString((a | b) & 0xFF));
        System.out.println("Результат виконання порозрядної операції AND: " + Integer.toBinaryString((a & b) & 0xFF));
        System.out.println("Результат виконання порозрядної операції XOR: " + Integer.toBinaryString((a ^ b) & 0xFF));
    }
}
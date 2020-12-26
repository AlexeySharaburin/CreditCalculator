import java.util.Scanner;

public class Main {
    // написание тестов в начале сделало кодболее лаконичным и облегчило проверку программы,
    // но от человеского фактора (перепутал методы для подсчета различных сумм) не спасает
    public static void main(String[] args) {
        CreditCalculator creditCalculator = new CreditCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите общую сумму кредита в рублях: ");
        int genSum = scanner.nextInt();
        System.out.println("Введите срок, на который выдан кредит в годах: ");
        int term = scanner.nextInt();
        System.out.println("Введите процентентную ставку по кредиту в процентах: ");
        int procent = scanner.nextInt();

        System.out.println("\nЕжемесячный платеж по кредиту, руб.: " + creditCalculator.calculateMonathlyPayment(genSum, term, procent));
        System.out.println("Общий размер суммы выплаты банку, руб.: " + creditCalculator.calculateGeneralSum(genSum, term, procent));
        System.out.println("Сумма переплаты, руб.: " + creditCalculator.calculateOverPayment(genSum, term, procent));

    }
}

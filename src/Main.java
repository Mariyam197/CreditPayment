import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double creditPayment1 = service.calculate(1_000_000, 9.99, 12);
        System.out.printf("Ежемесячный платеж со сроком на 1 год: " + "%.0f", creditPayment1);


        double creditPayment2 = service.calculate(1_000_000, 9.99, 24);
        System.out.println();
        System.out.println();
        System.out.printf("Ежемесячный платеж со сроком на 2 года: " + "%.0f", creditPayment2);


        double creditPayment3 = service.calculate(1_000_000, 9.99, 36);
        System.out.println();
        System.out.println();
        System.out.printf("Ежемесячный платеж со сроком на 3 года: " + "%.0f", creditPayment3);

    }
}

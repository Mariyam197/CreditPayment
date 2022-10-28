public class CreditPaymentService {

    public double calculate(double S, double R, double n) {
        // S - сумма кредита
        // n - количество месяцев
        // R - годовая процентная ставка

        double r; // r - месячная процентная ставка
        r = R / 100 / 12;

        double result;
        result = S * r * (Math.pow((1 + r), n)) / ((Math.pow((1 + r), n)) - 1);

        return result;
    }
}

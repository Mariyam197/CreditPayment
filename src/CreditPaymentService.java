public class CreditPaymentService {

    public double calculate(double amount, double annualInterestRate, double numberOfMonths) {
        // amount - сумма кредита
        // numberOfMonths - количество месяцев
        // annualInterestRate - годовая процентная ставка

        double monthlyInterestRate; // monthlyInterestRate - месячная процентная ставка
        monthlyInterestRate = annualInterestRate / 100 / 12;

        double monthlyPayment;
        monthlyPayment = amount * monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), numberOfMonths)) / ((Math.pow((1 + monthlyInterestRate), numberOfMonths)) - 1);

        return monthlyPayment;
    }
}


public class Main {
    public static void main(String[] args) {

        double CreditSumm = 1_000_000; //сумма платежа
        double Percent = 9.99; // годовая процентная ставка
        //int Duration = 36; // количество платежей

        CreditPaymentService service = new CreditPaymentService();

        int MonthlyPaid = service.Calculate(CreditSumm, Percent, 12);
        System.out.println("Ваш ежемесячный аннуитетный платеж при сроке кредита 12 месяцев составляет " + MonthlyPaid + " руб.");

        System.out.println();
        MonthlyPaid = service.Calculate(CreditSumm, Percent, 24);
        System.out.println("Ваш ежемесячный аннуитетный платеж при сроке кредита 24 месяца составляет " + MonthlyPaid + " руб.");

        System.out.println();
        MonthlyPaid = service.Calculate(CreditSumm, Percent, 36);
        System.out.println("Ваш ежемесячный аннуитетный платеж при сроке кредита 36 месяцев составляет " + MonthlyPaid + " руб.");
    }
}
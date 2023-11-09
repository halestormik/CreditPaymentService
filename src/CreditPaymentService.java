public class CreditPaymentService {
    public int Calculate(double CreditSumm, double Percent, int Duration) {

        double MonthlyPercent = Percent / 12 / 100; //ежемесячная ставка
        double Koef = MonthlyPercent * Math.pow(1 + MonthlyPercent, Duration) / (Math.pow(1 + MonthlyPercent, Duration) - 1); //коэффициент расчета
        double MonthlyPaid = CreditSumm * Koef; // размер платежа

        return (int) MonthlyPaid;
    }
}

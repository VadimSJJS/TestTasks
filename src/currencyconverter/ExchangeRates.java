package currencyconverter;

// Класс для хранения и управления курсами обмена
public class ExchangeRates {
    private final double usdRate;
    private final double eurRate;
    private final double gbpRate;
    private final double jpyRate;
    private final double audRate;

    public ExchangeRates(double usdRate, double eurRate, double gbpRate, double jpyRate, double audRate) {
        this.usdRate = usdRate;
        this.eurRate = eurRate;
        this.gbpRate = gbpRate;
        this.jpyRate = jpyRate;
        this.audRate = audRate;
    }

    public double getUsdRate() {
        return usdRate;
    }

    public double getEurRate() {
        return eurRate;
    }

    public double getGbpRate() {
        return gbpRate;
    }

    public double getJpyRate() {
        return jpyRate;
    }

    public double getAudRate() {
        return audRate;
    }
}

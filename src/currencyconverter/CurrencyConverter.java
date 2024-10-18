package currencyconverter;

public class CurrencyConverter {
    private final ExchangeRates rates;

    public CurrencyConverter(ExchangeRates rates) {
        this.rates = rates;
    }

    public double convertToUSD(double amount) {
        return amount * rates.getUsdRate();
    }

    public double convertToEUR(double amount) {
        return amount * rates.getEurRate();
    }

    public double convertToGBP(double amount) {
        return amount * rates.getGbpRate();
    }

    public double convertToJPY(double amount) {
        return amount * rates.getJpyRate();
    }

    public double convertToAUD(double amount) {
        return amount * rates.getAudRate();
    }
}

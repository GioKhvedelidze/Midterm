package ge.edu.btu.currency.service.impl;

import ge.edu.btu.currency.service.CurrencyService;

public class CurrencyServiceImpl implements CurrencyService {

    private double exchangeRate;

    public double convert(double amount) {
        double result = amount / exchangeRate;
        return result;
    }

    public double convert(int amount) {
        double result = amount / exchangeRate;
        return result;
    }

    public void setExchangeRate(double value) {
        exchangeRate = value;
    }

}
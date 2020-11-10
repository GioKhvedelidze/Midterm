package ge.edu.btu.currency;

import ge.edu.btu.currency.service.CurrencyService;
import ge.edu.btu.currency.service.impl.CurrencyServiceImpl;
import org.apache.log4j.Logger;

public class Main {
    public static void main(String args[]) {

        final Logger log = Logger.getLogger(Main.class);

        CurrencyServiceImpl currencyService = new CurrencyServiceImpl();
        log.info("currency service object created");
        currencyService.setExchangeRate(5);
        log.info("exchange rate 5");
        System.out.println(currencyService.convert(25));
        log.info("conversation parameter: " + 25 + " Result " + currencyService.convert(25));
        System.out.println(currencyService.convert(50.4));
        log.info("conversation parameter: " + 50.4 + " Result " + currencyService.convert(50.4));
    }
}
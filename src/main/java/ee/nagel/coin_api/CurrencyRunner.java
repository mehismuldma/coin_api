package ee.nagel.coin_api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CurrencyRunner implements CommandLineRunner {

    private CurrencyCheck currencyCheck;

    public CurrencyRunner(CurrencyCheck currencyCheck) {
        this.currencyCheck = currencyCheck;
    }

    @Override
    public void run(String... args) throws Exception {
        currencyCheck.request();
    }
}

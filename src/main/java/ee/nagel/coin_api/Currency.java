package ee.nagel.coin_api;

public class Currency {
    String code;
    String symbol;
    Double rate;
    String description;
    Double rate_float;

    public Currency(String code, String symbol, Double rate, String description, Double rate_float) {
        this.code = code;
        this.symbol = symbol;
        this.rate = rate;
        this.description = description;
        this.rate_float = rate_float;
    }

    public String getCode() {
        return code;
    }
}

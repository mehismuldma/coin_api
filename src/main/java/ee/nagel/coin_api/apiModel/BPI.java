package ee.nagel.coin_api.apiModel;

import java.io.Serializable;
import java.util.Currency;
import java.util.Map;

public class BPI  implements Serializable {
    Map<String, Currency> bpi;

    public Map<String, Currency> getBpi() {
        return bpi;
    }

    public void setBpi(Map<String, Currency> bpi) {
        this.bpi = bpi;
    }

    public BPI(Map<String, Currency> bpi) {
        this.bpi = bpi;
        bpi.containsKey("eur");
    }
}

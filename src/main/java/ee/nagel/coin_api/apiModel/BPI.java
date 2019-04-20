package ee.nagel.coin_api.apiModel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Currency;

@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "USD",
        "GBP",
        "EUR"
})
public class BPI implements Serializable {
    Currency USD;
    Currency GBP;
    Currency EUR;

    public Currency getEUR() {
        return EUR;
    }

    public void setEUR(Currency EUR) {
        this.EUR = EUR;
    }

    public Currency getUSD() {
        return USD;
    }

    public void setUSD(Currency USD) {
        this.USD = USD;
    }

    public Currency getGBP() {
        return GBP;
    }

    public void setGBP(Currency GBP) {
        this.GBP = GBP;
    }

}

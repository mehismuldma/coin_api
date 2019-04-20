package ee.nagel.coin_api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Data
public class Currency implements Serializable {
    String code;
    String symbol;
    String rate;
    String description;
    Double rate_float;

}

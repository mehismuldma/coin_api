package ee.nagel.coin_api.apiModel;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;

import java.io.Serializable;
import java.util.Map;

@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response implements Serializable {
    Time time;
    String disclaimer;
    String chartName;
    Map<String, Double> bpi;
    
//    Map<String, Currency> bpi;

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getChartName() {
        return chartName;
    }

    public void setChartName(String chartName) {
        this.chartName = chartName;
    }

    public Map<String, Double> getBpi() {
        return bpi;
    }

    public void setBpi(Map<String, Double> bpi) {
        this.bpi = bpi;
    }
}

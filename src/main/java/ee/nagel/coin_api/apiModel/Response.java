package ee.nagel.coin_api.apiModel;

import java.io.Serializable;
import java.util.Currency;
import java.util.Map;

public class Response implements Serializable {
    Time time;
    String disclaimer;
    String chartName;
    Map<String, Currency> bpi;


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

    public Map<String, Currency> getBpi() {
        return bpi;
    }

    public void setBpi(Map<String, Currency> bpi) {
        this.bpi = bpi;
    }

    public Response(Time time, String disclaimer, String chartName, Map<String, Currency> bpi) {
        this.time = time;
        this.disclaimer = disclaimer;
        this.chartName = chartName;
        this.bpi = bpi;
    }
}

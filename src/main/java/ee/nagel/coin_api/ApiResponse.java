package ee.nagel.coin_api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.Arrays;

@Service
public class ApiResponse {

    public void ad() {

        RestTemplate restTemplate = new RestTemplate();

        LocalDate start = LocalDate.now().minusDays(30);
        LocalDate end = LocalDate.now();
        String currency = "EUR"; // Tuleb konsooli
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter =
                new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter.setSupportedMediaTypes(
                Arrays.asList(
                        MediaType.APPLICATION_JSON,
                        MediaType.APPLICATION_OCTET_STREAM));
        restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);
//        restTemplate.setMessageConverters(Arrays.asList(new MappingJackson2HttpMessageConverter()));
        //Response response = restTemplate.getForObject("https://api.coindesk.com/v1/bpi/historical/close.json?start=" + start + "&end=" + end + "&currency=" + currency, Response.class);
//        Response response = restTemplate.getForObject("https://api.coindesk.com/v1/bpi/currentprice.json", Response.class);
        ResponseEntity<String> response = restTemplate.getForEntity("https://api.coindesk.com/v1/bpi/currentprice.json", String.class);
    }
}


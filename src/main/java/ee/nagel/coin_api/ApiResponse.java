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

    public void ad(String input) {

        RestTemplate restTemplate = new RestTemplate();

        LocalDate start = LocalDate.now().minusDays(30);
        LocalDate end = LocalDate.now();
        ResponseEntity<String> response = restTemplate.getForEntity("https://api.coindesk.com/v1/bpi/historical/close.json?start=" + start + "&end=" + end + "&currency=" + input, String.class);
        System.out.println(response);
    }
}


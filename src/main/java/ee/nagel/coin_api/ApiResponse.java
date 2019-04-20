package ee.nagel.coin_api;

import ee.nagel.coin_api.apiModel.Response;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ApiResponse {

    public void ad(String input) {

        RestTemplate restTemplate = new RestTemplate();

      List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
      //Add the Jackson Message converter
      MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
      // Note: here we are making this converter to process any kind of response, 
      // not only application/*json, which is the default behaviour
      converter.setSupportedMediaTypes(Arrays.asList(MediaType.ALL));
      messageConverters.add(converter);
      restTemplate.setMessageConverters(messageConverters);
        
        LocalDate start = LocalDate.now().minusDays(30);
        LocalDate end = LocalDate.now();
        ResponseEntity<Response> response = restTemplate.getForEntity("https://api.coindesk.com/v1/bpi/historical/close.json?start=" + start + "&end=" + end + "&currency=" + input, Response.class);
        System.out.println(response);
    }
}


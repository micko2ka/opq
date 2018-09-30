package fun.opq.myapplication;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class MyThread extends Thread {
    @Override
    public void run() {

        // The connection URL
        String url = "https://www.google.co.jp/search?q={query}";

        // Create a new RestTemplate instance
        RestTemplate restTemplate = new RestTemplate();

        // Add the String message converter
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter());

        // Make the HTTP GET request, marshaling the response to a String
        String result = restTemplate.getForObject(url, String.class, "aizawananako");

        System.out.println("result = " + result);

    }
}

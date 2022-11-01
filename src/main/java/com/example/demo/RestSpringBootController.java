package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class RestSpringBootController {



    @GetMapping("/countries")
    public List<Object> getFromUrl() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        Object[] countries = restTemplate.getForObject("http://api.instantwebtools.net/v1/airlines",
                Object[].class);
        return Arrays.asList(countries);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getCountrys() {

            String uri="https://cpmsapi.tatabexuat.com:8099/api/titles";
            RestTemplate restTemplate = new RestTemplate();
            String result = restTemplate.getForObject(uri, String.class);
          //  return new ResponseEntity<>(result, HttpStatus.OK);
        return result;

    }
}

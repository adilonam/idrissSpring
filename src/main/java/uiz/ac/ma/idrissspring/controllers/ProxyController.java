package uiz.ac.ma.idrissspring.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*; 


@RestController
public class ProxyController {

   
    @Value("${custom.forward-url}")
    private String forwardUrl;


    
  
 @PostMapping("/v1/")
    public ResponseEntity<?> postDataToAnotherService(@RequestBody Map<String, Object> data) {
        RestTemplate restTemplate = new RestTemplate();

        // Create an HttpEntity that includes the headers and the body of the request
        HttpEntity<Map<String, Object>> requestEntity = new HttpEntity<>(data);

        // Forward the post data to localhost:8000/v1/ and retrieve the response
        ResponseEntity<String> response = restTemplate.postForEntity(forwardUrl, requestEntity, String.class);

  
        // Return the response body from the forwarded call to the client
        return ResponseEntity.status(response.getStatusCode()).body(response.getBody());
    }



    }


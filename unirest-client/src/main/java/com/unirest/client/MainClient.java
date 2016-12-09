package com.unirest.client;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author armdev
 */
public class MainClient {

    public static void main(String[] args) {
        try {
            HttpResponse<JsonNode> jsonResponse = Unirest.post("http://httpbin.org/post")
                    .header("accept", "application/json")
                    .queryString("apiKey", "123")
                    .field("parameter", "value")
                    .field("foo", "bar")
                    .asJson();
            System.out.println("Response " + jsonResponse.getBody().toString());

            HttpResponse<JsonNode> ipResponse = Unirest.get("http://httpbin.org/ip")
                    .header("accept", "application/json")
                    //.queryString("apiKey", "123")
                    .asJson();

            System.out.println("Ip Response " + ipResponse.getBody().toString());

        } catch (UnirestException ex) {
            Logger.getLogger(MainClient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

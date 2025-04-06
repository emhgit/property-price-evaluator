package com.starter.stoock.configs;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.stereotype.Component;

@Component
public class DotenvConfig {

    private final Dotenv dotenv = Dotenv.load();

    //returns the api key from the .env file
    public String getApiKey() {
        return dotenv.get("ALPHAVANTAGE_API_KEY");
    }
    
    //returns the api url from the .env file
    public String getApiUrl() {
        return dotenv.get("ALPHAVANTAGE_API_URL");
    }
}

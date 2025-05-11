package com.starter.stoock.configs;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.stereotype.Component;

@Component
public class DotenvConfig {

    private final Dotenv dotenv = Dotenv.load();

    //returns the api key from the .env file
    public String getAttomApiKey() {
        return dotenv.get("ATTOM_API_KEY");
    }
}

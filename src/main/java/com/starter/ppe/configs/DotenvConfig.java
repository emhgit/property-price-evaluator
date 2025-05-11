package com.starter.ppe.configs;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.stereotype.Component;

@Component
public class DotenvConfig {

    private final Dotenv dotenv = Dotenv.load();

    //returns the api key from the .env file
    public String getApiKey() {
        return dotenv.get("ATTOM_API_KEY");
    }
}

package com.starter.ppe;

import org.springframework.stereotype.Service;

import com.starter.ppe.configs.DotenvConfig;

@Service
public class AttomClient{
    private String apiKey;
    private String apiUrl;

    public AttomClient(DotenvConfig dotenvConfig) {
        this.apiKey = dotenvConfig.getApiKey(); // Get the API key from dotenvConfig
    }

    public String fetchData(){
        //TODO: Implement the logic to call the external API using the apiUrl and apiKey
        return "";
    }

}
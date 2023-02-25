package com.Fotball.Fotball.Abstract;

import lombok.Getter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Getter
@Component
public abstract class FotballAbstract {

    protected FotballAbstract(){
        this.key = "9875f86095a839a52077d7b1fe1d63e0";
        this.Url = "https://v3.football.api-sports.io";
    }

    public abstract String getToken();
    private final String key;

    public abstract String getLink();
    private final String Url;
}

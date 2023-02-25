package com.Fotball.Fotball.Template;

import com.Fotball.Fotball.Abstract.FotballAbstract;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
public class LigaTemplate extends FotballAbstract {

    public WebClient getWebClient() {
        String accessToken = "9875f86095a839a52077d7b1fe1d63e0";
        String url = "https://v3.football.api-sports.io";

        WebClient client = WebClient.builder()
                .baseUrl(url)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultHeader("access_token", accessToken)
                .build();
        return client;
    }
    @Override
    public String getToken() {
        return this.getToken();
    }

    @Override
    public String getLink() {
        return this.getUrl();
    }
}

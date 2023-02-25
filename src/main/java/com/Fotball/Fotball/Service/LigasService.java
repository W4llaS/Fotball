package com.Fotball.Fotball.Service;

import com.Fotball.Fotball.Model.Dto.LigaDto;
import com.Fotball.Fotball.Template.LigaTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
@Service
public class LigasService {

    public LigasService(){
        this.ligaTemplate = new LigaTemplate();
    }

    public LigaTemplate ligaTemplate;

    public ResponseEntity<?> findAll() {

        WebClient client = ligaTemplate.getWebClient();

        LigaDto clienteAsaas = client.get()
                .uri("/")
                .retrieve()
                .bodyToMono(LigaDto.class)
                .block();
        return ResponseEntity.ok(clienteAsaas);
    }

}

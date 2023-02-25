package com.Fotball.Fotball.Controller;

import com.Fotball.Fotball.Service.LigasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Clientes")
@RequestMapping("/api/ligas")
public class LigasController {
    @Autowired
    public LigasService ligasService;
    @GetMapping
    public ResponseEntity<?> findAll(){
        return ligasService.findAll();
    }
}

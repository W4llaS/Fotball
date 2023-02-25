package com.Fotball.Fotball.Model.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LigaDto {
        @JsonProperty("name")
        private String nome;
        @JsonProperty("email")
        private String email;

    }


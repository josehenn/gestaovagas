package br.com.josehenn.gestao_vagas.modules;

import lombok.Data;

import java.util.UUID;

@Data
public class CandidateEntity {

    private UUID id;
    private String username;
    private String name;
    private String email;
    private String password;
    private String description;
    private String curriculum;

}

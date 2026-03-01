package br.com.josehenn.gestao_vagas.modules.candidate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.UUID;

@Data // getter and setters of ALL atributes (LOMBOK)
@Entity(name = "candidate")
public class CandidateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // gera um UUID automaticamente para o id
    private UUID id;

    private String name;

    @Pattern(regexp = "^\\S+$", message = "Username cannot contain whitespace")
    private String username;
    @Email(message = "Email should be valid")
    private String email;
    @Length(min = 8, max = 100, message = "Password must be between 8 and 100 characters")
    private String password;
    private String description;
    private String curriculum;

    @CreationTimestamp
    private LocalDateTime createdAt;

}

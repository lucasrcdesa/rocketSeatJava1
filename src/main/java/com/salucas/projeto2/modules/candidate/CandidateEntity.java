package com.salucas.projeto2.modules.candidate;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import lombok.Data;
import jakarta.persistence.Entity;


import java.util.UUID;

@Data
@Entity("candidate")
public class CandidateEntity {
    private UUID id;
    private String name;
    @Email(message = "digita um email correto")
    private String email;
    private String username;
    private String password;
    private String description;
    private String curriculum;



}

package br.com.springboot.sendemailmicroservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springboot.sendemailmicroservice.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
    
}

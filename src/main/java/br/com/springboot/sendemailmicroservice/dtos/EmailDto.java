package br.com.springboot.sendemailmicroservice.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class EmailDto {
    
    @NotBlank
    private String ownerRef;
    @Email
    @NotBlank
    private String emailFrom;
    @Email
    @NotBlank
    private String emailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
}

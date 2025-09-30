package com.br.devs.hosp.notification.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class NotificationRequest {

    @NotBlank(message = "Title é obrigatório")
    private String title;

    @NotBlank(message = "Message é obrigatória")
    private String message;

    @NotBlank(message = "User email é obrigatório")
    @Email(message = "Email deve ter formato válido")
    private String userEmail;

    @NotBlank(message = "User ID é obrigatório")
    private String userId;
}
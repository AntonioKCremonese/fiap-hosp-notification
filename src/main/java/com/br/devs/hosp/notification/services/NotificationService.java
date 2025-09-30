package com.br.devs.hosp.notification.services;

import com.br.devs.hosp.notification.dto.NotificationRequest;
import com.br.devs.hosp.notification.entities.Notification;
import com.br.devs.hosp.notification.repositories.NotificationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void processNotification(NotificationRequest request) {
        Notification notification = Notification.builder()
                .title(request.getTitle())
                .message(request.getMessage())
                .userEmail(request.getUserEmail())
                .userId(request.getUserId())
                .build();

        Notification savedNotification = notificationRepository.save(notification);

        sendNotification(savedNotification);
    }

    // Método para simular o envio da notificação
    private void sendNotification(Notification notification) {
        log.info("=== SIMULANDO ENVIO DE NOTIFICAÇÃO ===");
        log.info("Título: {}", notification.getTitle());
        log.info("Mensagem: {}", notification.getMessage());
        log.info("Destinatário: {}", notification.getUserEmail());
        log.info("=== NOTIFICAÇÃO ENVIADA COM SUCESSO ===");
    }
}
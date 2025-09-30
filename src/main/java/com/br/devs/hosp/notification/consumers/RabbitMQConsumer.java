package com.br.devs.hosp.notification.consumers;

import com.br.devs.hosp.notification.dto.NotificationRequest;
import com.br.devs.hosp.notification.services.NotificationService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsumer {

    private final NotificationService notificationService;

    public RabbitMQConsumer(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @RabbitListener(queues = "appointmentsQueue")
    public void receiveMessage(NotificationRequest notificationRequest) {
        notificationService.processNotification(notificationRequest);
    }
}
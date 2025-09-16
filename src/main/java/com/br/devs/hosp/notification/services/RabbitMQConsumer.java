package com.br.devs.hosp.notification.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMQConsumer {

    @RabbitListener(queues = "appointmentsQueue")
    public void receiveMessage(String message) {
        log.info("📩 Mensagem recebida: {}", message);
    }
}

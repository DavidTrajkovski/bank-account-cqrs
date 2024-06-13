package com.techbank.account.query.infrastructure.consumers;

import com.techbank.account.common.events.AccountClosedEvent;
import com.techbank.account.common.events.AccountOpenedEvent;
import com.techbank.account.common.events.FundsDepositedEvent;
import com.techbank.account.common.events.FundsWithdrawnEvent;
import com.techbank.account.query.infrastructure.handlers.EventHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class AccountEventConsumer implements EventConsumer {

    private final EventHandler eventHandler;

    public AccountEventConsumer(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    @Override
    @KafkaListener(topics = "AccountOpenedEvent", groupId = "${spring.kafka.consumer.groupId}") // this comes from app.yml file
    public void consume(AccountOpenedEvent event, Acknowledgment ack) {
        eventHandler.on(event);
        ack.acknowledge(); // commit the offset
    }

    @Override
    @KafkaListener(topics = "FundsDepositedEvent", groupId = "${spring.kafka.consumer.groupId}") // this comes from app.yml file
    public void consume(FundsDepositedEvent event, Acknowledgment ack) {
        eventHandler.on(event);
        ack.acknowledge();
    }

    @Override
    @KafkaListener(topics = "FundsWithdrawnEvent", groupId = "${spring.kafka.consumer.groupId}") // this comes from app.yml file
    public void consume(FundsWithdrawnEvent event, Acknowledgment ack) {
        eventHandler.on(event);
        ack.acknowledge();
    }

    @Override
    @KafkaListener(topics = "AccountClosedEvent", groupId = "${spring.kafka.consumer.groupId}") // this comes from app.yml file
    public void consume(AccountClosedEvent event, Acknowledgment ack) {
        eventHandler.on(event);
        ack.acknowledge();
    }

}

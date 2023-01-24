package com.immagixe.emailsender.services.rabbitmq

import com.immagixe.emailsender.services.ConsumerHandler
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RabbitConsumer(@Autowired private val consumerHandler: ConsumerHandler) {

    @RabbitListener(queues = ["\${rabbit.queue}"])
    fun consumeMessage(message: String) {
        consumerHandler.handle(message)
    }
}
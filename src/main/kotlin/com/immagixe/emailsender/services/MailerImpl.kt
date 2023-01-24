package com.immagixe.emailsender.services

import com.immagixe.emailsender.interfaces.Mailer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MailerImpl (@Autowired private val emailService: EmailService): Mailer {
    override fun send(recipientAddress: String, title: String, text: String) {
        emailService.sendSimpleMessage(recipientAddress, title, text)
    }
}
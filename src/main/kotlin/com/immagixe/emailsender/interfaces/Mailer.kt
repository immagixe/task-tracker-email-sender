package com.immagixe.emailsender.interfaces

interface Mailer {
    fun send(recipientAddress: String, title: String, text: String)
}
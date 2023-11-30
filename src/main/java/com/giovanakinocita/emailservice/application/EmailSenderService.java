package com.giovanakinocita.emailservice.application;

import com.giovanakinocita.emailservice.core.EmailSenderUseCase;

public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGateway;

    public EmailSenderService(EmailSenderGateway emailGateway){
        this.emailSenderGateway = emailGateway;
    }
    @Override
    public void sendEmail(String to, String subject, String body) {

    }
}

package vn.academy.notificationservice.service;

import vn.academy.notificationservice.dto.MessageRequest;

public interface IEmailService {
    void sendEmail(MessageRequest messageRequest);
}

package vn.academy.notificationservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vn.academy.notificationservice.dto.MessageRequest;
import vn.academy.notificationservice.service.impl.EmailService;

@RestController
public class NotificationController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send-notification")
    public void sendNotification(@RequestBody MessageRequest messageRequest) {
        emailService.sendEmail(messageRequest);
    }
}

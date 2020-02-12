package com.example.xmail;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MailController {
    private XMailSender XMailSender;

    public MailController(XMailSender XMailSender) {
        this.XMailSender = XMailSender;
    }

    @PostMapping("/send")
    public void sendMessage(@RequestBody XMail mail) {
        XMailSender.sendPlainText(mail.to, mail.subject,mail.text);
    }
}

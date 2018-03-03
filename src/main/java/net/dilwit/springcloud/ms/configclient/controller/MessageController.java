package net.dilwit.springcloud.ms.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class MessageController {
	
	
	// @TODO: trigger refreshScope

    @Value("${message.welcome:Default welcome...}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }
}
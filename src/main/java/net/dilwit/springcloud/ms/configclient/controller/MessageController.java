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
    
    @Value("${customer.message:Default customer message...}")
    private String customerMessage;
    
    @Value("${env.message:Default env message...}")
    private String envMessage;

    @RequestMapping("/message")
    String getMessage() {
    	
    	StringBuilder sb = new StringBuilder();
    	sb.append(this.message);
    	sb.append(" | ");
    	sb.append(this.customerMessage);
    	sb.append(" | ");
    	sb.append(this.envMessage);
    	
        return sb.toString();
    }
}
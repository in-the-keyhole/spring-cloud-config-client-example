package com.config.client.example.configClientExample.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientController {

	@Value("${position.price.queue}")
	private String positionPriceQueueName;

	@Value("${position.price.notification.sendTo}")
	private String positionNoteSentTo;

	@RequestMapping("/showClientConfigs")
	@ResponseBody
	public String showClientConfigs() {

		return "Generic Price Queue Name : " + positionPriceQueueName +
				"<br/> Notification Email Address (TEST) : " + positionNoteSentTo;
	}
}
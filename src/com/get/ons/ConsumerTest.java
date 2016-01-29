package com.get.ons;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aliyun.openservices.ons.api.Consumer;
import com.aliyun.openservices.ons.api.ONSFactory;
import com.aliyun.openservices.ons.api.PropertyKeyConst;

public class ConsumerTest {
	private static final Logger logger = LoggerFactory.getLogger(MessageListenerAction.class.getName());
	public static void main(String[] args) {
		logger.info("start ------>ok");
        Properties properties = new Properties();
        properties.put(PropertyKeyConst.ConsumerId, "CID-CLK-QXY");
        properties.put(PropertyKeyConst.AccessKey, "JqkUliuzNAjWHupu");
        properties.put(PropertyKeyConst.SecretKey, "E0eXrLZV4jwKcyArf6xmF1cd73GxgV");
        Consumer consumer = ONSFactory.createConsumer(properties);
        consumer.subscribe("Test-FG", "*", new MessageListenerAction());
        consumer.start();
        logger.info("Consumer Started");
    }
}

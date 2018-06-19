package com.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author huangweiyue
 * @Date Created in 2018-06-19 16:51
 * @ModifiedBy
 * @Version v1.0
 */
//@Configuration
//@ConditionalOnProperty(prefix = "spring.rabbitmq",name = "enable", matchIfMissing = false)
@Component
public class MQInitConfig {
    // 队列名称
    final static String queueName="hello";

    @Bean(name = "link")
    public Queue queueMessage() {
        return new Queue("insurance.link");
    }

    @Bean(name = "hb")
    public Queue queueMessages() {
        return new Queue("insurance.hb");
    }

//    @Bean
//    public MessageConverter jsonMessageConverter() {
//        return new JsonMessageConverter();
//    }
}

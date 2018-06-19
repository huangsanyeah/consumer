package com.rabbit;

import com.quyiwang.dto.Book;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Description
 * @Author huangweiyue
 * @Date Created in 2018-06-18 17:52
 * @ModifiedBy
 * @Version v1.0
 */
@Component
public class HelloReceive {
    @RabbitListener(queues="queue")
    @RabbitHandler//监听器监听指定的Queue
    public void processC(Book book) {
        System.out.println("Receive:"+book.toString()+"---"+new Date()+"---"+System.currentTimeMillis());
    }
}

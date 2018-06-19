package com.rabbit;

import com.quyiwang.dto.Book;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description directMOSHI
 * @Author huangweiyue
 * @Date Created in 2018-06-19 16:12
 * @ModifiedBy
 * @Version v1.0
 */
@Component
public class TopicReceive {
    @RabbitListener(queues="insurance.link")
    @RabbitHandler//监听器监听指定的Queue
    public void process1(Book book) {
        System.out.println("link获取的消息:"+book.toString());
    }
    @RabbitListener(queues="insurance.hb")
    @RabbitHandler//监听器监听指定的Queue
    public void process2(Book book) {
        System.out.println("hb获取的消息:"+book.toString());
    }
}

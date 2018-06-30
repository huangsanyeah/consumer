注意
1.对象传输必须是同一个包的 新建实体类 该实体类在项目提供者 消费者中的位置，必须一致，即包名必须一致
2.topic的consumer启动会报找不到QUEUE的异常 解决办法 MQInitConfig把队列初始化
3.com.rabbitmq.client.AuthenticationFailureException: ACCESS_REFUSED - Login was refused using authentication mechanism PLAIN
报错原因是把密码guest误操作成了guset

E:\RabbitMQSetUp\rabbitmq_server-3.7.6\sbin下的rabbitmq-server(不是service哦) 点击启动服务
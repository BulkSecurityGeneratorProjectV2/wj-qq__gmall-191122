package com.atguigu.gmall.mq;


import lombok.Data;
import org.springframework.amqp.rabbit.connection.CorrelationData;

/**
 * 自定义实现类
 */
@Data
public class GmallCorrelationData extends CorrelationData {

    //消息体
    private Object message;
    //交换机
    private String exchange;
    //路由键
    private String routingKey;
    //重试次数
    private int retryCount = 0;
    //是否延迟消息
    private boolean isDelay = false;
    //延迟时长
    private int delayTime = 10;
}

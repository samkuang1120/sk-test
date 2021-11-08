package com.sk.sktest.component.impl;

import com.sk.sktest.component.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
* @Author Sam Kuang
* @Description //TODO
* @Date 11:31 2021-11-08
* @Param 
* @return 
**/

@Service
@Slf4j
public class MailServiceImpl implements MailService {

    /**
     *  springboot 提供的一个发送邮件的简单抽象，直接注入即可
     */
    @Autowired
    private JavaMailSender mailSender;


    @Value("${spring.mail.from}")
    private String from;

    /**
     * 发送邮件
     * @param to 收件人
     * @param subject 主题
     * @param content 内容
     */
    @Override
    public void sendMail(String to, String subject, String content) {

        //创建一个邮箱消息对象
        SimpleMailMessage message = new SimpleMailMessage();

        //配置邮箱发送人
        message.setFrom(from);

        //邮件的收件人
        message.setTo(to);

        //邮件的主题
        message.setSubject(subject);

        //邮件的内容
        message.setText(content);

        mailSender.send(message);

        log.info("邮件发送成功:{}",message.toString());

    }
}

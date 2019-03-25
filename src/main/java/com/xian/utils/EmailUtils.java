package com.xian.utils;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import java.util.Random;
import java.util.Scanner;

public class EmailUtils {
    public static void main(String[] args){
        EmailUtils emailUtils = new EmailUtils();
        emailUtils.emailCode("1422728529@qq.com");
    }
    public static Integer  emailCode(String userEmail) {
        Integer random = new Random().nextInt(9000) + 1000;
        HtmlEmail email = new HtmlEmail();
        email.setHostName("smtp.163.com");
        email.setCharset("utf-8");
        try {
            email.addTo(userEmail);
            email.setFrom("lirun0907@163.com","李润");
            email.setAuthentication("lirun0907@163.com","lirun0907");
            email.setSubject("测试");
//            email.setMsg(random.toString());
            email.setMsg("叼毛，这是我用代码给你发的邮件,嘿嘿");

            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }
        return random;
    }
}

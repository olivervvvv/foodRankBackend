package com.twoTeam.groupProject.mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.util.Properties;

import javax.mail.PasswordAuthentication;
public class Mail {

    // 註冊成功發送通知信件
    public static void sentSignUpMail() {

        // 寄件人
        String senderName = "食物排行機構";
        String senderEmail = "sm29729443@gmail.com";  //email填入自己的email
        String senderPassword = "pxjmlhuxcocvemvx"; //pwd填入向google申請的應用程式密碼

        // 收件人
        String recipientEmail = "sm29729443@gmail.com"; //輸入要寄送郵件對象的email

        // 設定SMTP
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com"); // 以 Gmail 為例
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2"); // 指定協議

        // 創建 Session
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // 設定 MimeMessage
            Message message = new MimeMessage(session);

            // 設定寄件人
            message.setFrom(new InternetAddress(senderEmail, senderName));

            // 設定收件人
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));

            // 設定信件主題
            message.setSubject("註冊成功");

            // 設定信件內容
            message.setText("你成為了皮皮蝦會員");

            // 發送信件
            Transport.send(message);

            System.out.println("發送成功!!!");

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("發送失敗!!!");
        }
    }
}

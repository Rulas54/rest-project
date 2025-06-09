package edu.udelp.movil.restproject.service;

import edu.udelp.movil.restproject.model.EmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void enviarCorreo(EmailRequest emailRequest) {
        SimpleMailMessage mensaje = new SimpleMailMessage();
        mensaje.setTo(emailRequest.getPara());
        mensaje.setSubject(emailRequest.getAsunto());
        mensaje.setText(emailRequest.getMensaje());

        mailSender.send(mensaje);
    }
}

package edu.udelp.movil.restproject.controller;

import edu.udelp.movil.restproject.model.EmailRequest;
import edu.udelp.movil.restproject.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest emailRequest) {
        try {
            emailService.enviarCorreo(emailRequest);
            return ResponseEntity.ok("Correo enviado correctamente");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al enviar correo: " + e.getMessage());
        }
    }
}
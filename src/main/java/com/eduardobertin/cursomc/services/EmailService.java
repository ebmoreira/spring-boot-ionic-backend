package com.eduardobertin.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.eduardobertin.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}

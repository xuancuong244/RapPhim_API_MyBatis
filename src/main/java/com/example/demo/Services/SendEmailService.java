package com.example.demo.Services;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.example.demo.Models.SendEmail;

import java.io.IOException;
import java.util.List;

public interface SendEmailService {
    List<SendEmail> getAll();
}

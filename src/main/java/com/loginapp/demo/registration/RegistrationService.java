package com.loginapp.demo.registration;

public class RegistrationService {

    public static String register(RegistrationRequest request) {
        return "Your account has been registered successfully for" + request.getFirstName() + "with email" + request.getEmail();
    }
}

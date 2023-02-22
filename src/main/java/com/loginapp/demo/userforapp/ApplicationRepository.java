package com.loginapp.demo.userforapp;

import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface ApplicationRepository {
}

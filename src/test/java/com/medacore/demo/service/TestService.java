package com.medacore.demo.service;

import com.medacore.demo.model.Account;
import com.medacore.demo.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@RequiredArgsConstructor
public class TestService {
    private final AccountRepository accountRepository;

    @Test
    @Transactional
    public void testCreateEntity() {
        Account account = new Account();
        account.setEmail("aa@gmail.com");
        account.setPassword("aa@gmail.com");
        account.setUsername("aa@gmail.com");
        accountRepository.save(account);
    }
}

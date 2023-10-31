package com.secu1.phising1.service;

import com.secu1.phising1.model.Account;
import com.secu1.phising1.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountService {

    private final AccountRepository repository;

    public List<Account> getAccount() {
        return repository.findAll();
    }

    public Account createAccount(Account login) {
        return repository.save(login);
    }
}

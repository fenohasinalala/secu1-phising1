package com.secu1.phising1.controller;

import com.secu1.phising1.model.Account;
import com.secu1.phising1.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/logins")
    public List<Account> getAccount(){
        return accountService.getAccount();
    }

    @PostMapping("/logins")
    public Account getAccount(@RequestBody Account login){
        return accountService.createAccount(login);
    }

}

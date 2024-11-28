package com.pdm.farming.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pdm.farming.Entities.Account;
import com.pdm.farming.repository.AccountRepository;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    // Lấy danh sách tất cả các tài khoản
    @GetMapping
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    // Lấy tài khoản theo ID
    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id) {
        //convert id string to int id

        return accountRepository.findById(id).orElseThrow(() -> 
            new RuntimeException("Account not found with id: " + id));
    }

    // Tạo tài khoản mới
    @PostMapping
    public Account createAccount(@RequestBody Account account) { //POST
        return accountRepository.save(account);
    }

    // Cập nhật thông tin tài khoản
    @PutMapping("/{id}")
    public Account updateAccount(@PathVariable Long id, @RequestBody Account accountDetails) {   // PATCH
        Account account = accountRepository.findById(id).orElseThrow(() -> 
            new RuntimeException("Account not found with id: " + id));
        
        account.setAccountRole(accountDetails.getAccountRole());
        account.setUsername(accountDetails.getUsername());
        account.setEmail(accountDetails.getEmail());
        account.setPassword(accountDetails.getPassword());
        
        return accountRepository.save(account);
    }

    // Xóa tài khoản
    @DeleteMapping("/{id}")
    public String deleteAccount(@PathVariable Long id) {
        accountRepository.deleteById(id);
        return "Account deleted with id: " + id;
    }
}

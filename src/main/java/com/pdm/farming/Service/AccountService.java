package com.pdm.farming.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdm.farming.Entities.Account;
import com.pdm.farming.repository.AccountRepository;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    // Lấy tất cả tài khoản
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
    
    // Lấy tài khoản theo ID
    public Account getAccountById(Long id) {
        return accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Account not found with id: " + id));
    }

    // Tạo tài khoản mới
    public Account createAccount(Account account) {
        // Kiểm tra email có tồn tại không
        if (accountRepository.existsByEmail(account.getEmail())) {
            throw new RuntimeException("Email already exists!");
        }
        // (Có thể thêm bước mã hóa mật khẩu ở đây nếu cần)
        return accountRepository.save(account);
    }

    // Cập nhật tài khoản
    public Account updateAccount(Long id, Account accountDetails) {
        // Tìm tài khoản cũ
        Account account = getAccountById(id);

        // Cập nhật thông tin
        account.setUsername(accountDetails.getUsername());
        account.setEmail(accountDetails.getEmail());
        account.setAccountRole(accountDetails.getAccountRole());
        account.setPassword(accountDetails.getPassword());
        // Lưu lại
        return accountRepository.save(account);
    }

    // Xóa tài khoản
    public void deleteAccount(Long id) {
        // Kiểm tra tài khoản có tồn tại
        if (!accountRepository.existsById(id)) {
            throw new RuntimeException("Account not found with id: " + id);
        }
        accountRepository.deleteById(id);
    }
}

package com.pdm.farming.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdm.farming.Entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
   // Tìm kiếm tài khoản theo tên người dùng
   Optional<Account> findByUsername(String username);

   // Tìm kiếm tài khoản theo email
   Optional<Account> findByEmail(String email);

   // Kiểm tra xem username có tồn tại hay không
   boolean existsByUsername(String username);

   // Kiểm tra xem email có tồn tại hay không
   boolean existsByEmail(String email);
}


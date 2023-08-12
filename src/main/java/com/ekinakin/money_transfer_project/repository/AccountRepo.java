package com.ekinakin.money_transfer_project.repository;

import com.ekinakin.money_transfer_project.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account,Long> {
}

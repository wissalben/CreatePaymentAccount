package com.cmi.create_payment_account_micoservice.repositories;


import com.cmi.create_payment_account_micoservice.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AccountRepository extends JpaRepository<Account, Long> {
}

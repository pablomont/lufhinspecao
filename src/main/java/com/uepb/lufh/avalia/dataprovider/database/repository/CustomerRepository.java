package com.uepb.lufh.avalia.dataprovider.database.repository;

import com.uepb.lufh.avalia.dataprovider.database.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository  extends JpaRepository<CustomerEntity, Long> {

    Optional<CustomerEntity> findByCpfCnpj(String cpfCnpj);

}

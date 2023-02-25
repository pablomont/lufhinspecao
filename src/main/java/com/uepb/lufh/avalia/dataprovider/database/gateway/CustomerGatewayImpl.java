package com.uepb.lufh.avalia.dataprovider.database.gateway;

import com.uepb.lufh.avalia.core.domain.CustomerDomain;
import com.uepb.lufh.avalia.core.gateway.CustomerGateway;
import com.uepb.lufh.avalia.dataprovider.database.entity.CustomerEntity;
import com.uepb.lufh.avalia.dataprovider.database.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerGatewayImpl implements CustomerGateway {

    private final CustomerRepository customerRepository;

    @Override
    public Optional<CustomerDomain> findCustomerByCpfCnpj(final String customerCpfCnpj) {

        log.info("Find customer by cpfCnpj {}", customerCpfCnpj);
        return customerRepository.findByCpfCnpj(customerCpfCnpj).map(CustomerEntity::toDomain);
    }

}

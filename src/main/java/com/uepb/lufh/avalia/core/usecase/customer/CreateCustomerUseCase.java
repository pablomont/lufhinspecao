package com.uepb.lufh.avalia.core.usecase.customer;

import com.uepb.lufh.avalia.core.domain.CustomerDomain;
import com.uepb.lufh.avalia.core.gateway.CustomerGateway;
import com.uepb.lufh.avalia.dataprovider.exception.CustomerNotSavedException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreateCustomerUseCase {

    private final CustomerGateway customerGateway;

    public CustomerDomain execute(CustomerDomain customerDomain){

        return customerGateway.save(customerDomain)
            .orElseThrow(() -> new CustomerNotSavedException(customerDomain.getCpfCnpjValueObject().toString()));

    }

}

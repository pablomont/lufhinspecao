package com.uepb.lufh.avalia.core.usecase.customer;

import com.uepb.lufh.avalia.core.domain.CustomerDomain;
import com.uepb.lufh.avalia.core.gateway.CustomerGateway;
import com.uepb.lufh.avalia.core.domain.vo.CpfCnpjValueObject;
import com.uepb.lufh.avalia.core.domain.vo.EmailValueObject;
import com.uepb.lufh.avalia.core.domain.vo.PhoneNumberValueObject;
import com.uepb.lufh.avalia.dataprovider.exception.CustomerNotSavedException;
import com.uepb.lufh.avalia.entrypoint.contract.model.CustomerInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.CustomerOutput;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreateCustomerUsecase {

    private final CustomerGateway customerGateway;

    public CustomerOutput execute(CustomerInput customerInput){

        var customerDomain = CustomerDomain.builder()
            .cpfCnpjValueObject(new CpfCnpjValueObject(customerInput.getCpfCnpj()))
            .phoneNumberValueObject(new PhoneNumberValueObject(customerInput.getPhoneNumber()))
            .emailValueObject(new EmailValueObject(customerInput.getEmail()))
            .customerName(customerInput.getCustomerName())
            .build();

        return customerGateway.save(customerDomain)
            .orElseThrow(() -> new CustomerNotSavedException(customerInput.getCpfCnpj()))
            .toOutput();

    }

}

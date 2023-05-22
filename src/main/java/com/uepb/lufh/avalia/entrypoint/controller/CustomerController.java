package com.uepb.lufh.avalia.entrypoint.controller;

import com.uepb.lufh.avalia.core.domain.CustomerDomain;
import com.uepb.lufh.avalia.core.domain.vo.CpfCnpjValueObject;
import com.uepb.lufh.avalia.core.domain.vo.EmailValueObject;
import com.uepb.lufh.avalia.core.domain.vo.PhoneNumberValueObject;
import com.uepb.lufh.avalia.core.usecase.customer.CreateCustomerUseCase;
import com.uepb.lufh.avalia.entrypoint.contract.api.CustomersApi;
import com.uepb.lufh.avalia.entrypoint.contract.model.CustomerInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.CustomerOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController implements CustomersApi {

    private final CreateCustomerUseCase createCustomerUsecase;


    @Override
    public ResponseEntity<CustomerOutput> createCustomer(final CustomerInput customerInput) {

        var customerDomain = CustomerDomain.builder()
            .cpfCnpjValueObject(new CpfCnpjValueObject(customerInput.getCpfCnpj()))
            .phoneNumberValueObject(new PhoneNumberValueObject(customerInput.getPhoneNumber()))
            .emailValueObject(new EmailValueObject(customerInput.getEmail()))
            .customerName(customerInput.getCustomerName())
            .build();

        return ResponseEntity.ok(createOutput(createCustomerUsecase.execute(customerDomain)));
    }

    private CustomerOutput createOutput(final CustomerDomain customerDomain) {
        var customerOutput = new CustomerOutput();
        customerOutput.setId(Math.toIntExact(customerDomain.getId()));
        customerOutput.setCustomerName(customerDomain.getCustomerName());
        customerOutput.setCpfCnpj(customerDomain.getCpfCnpjValueObject().toString());
        customerOutput.setEmail(customerDomain.getEmailValueObject().toString());
        customerOutput.setPhoneNumber(customerDomain.getPhoneNumberValueObject().toString());

        return customerOutput;
    }

}

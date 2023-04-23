package com.uepb.lufh.avalia.entrypoint.controller;

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
        return ResponseEntity.ok(createCustomerUsecase.execute(customerInput));
    }

}

package com.uepb.lufh.avalia.entrypoint.controller;

import com.uepb.lufh.avalia.core.usecase.customer.CreateCustomerUsecase;
import com.uepb.lufh.avalia.entrypoint.contract.api.CustomersApi;
import com.uepb.lufh.avalia.entrypoint.contract.model.CustomerInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.CustomerOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController implements CustomersApi {

    private final CreateCustomerUsecase createCustomerUsecase;


}

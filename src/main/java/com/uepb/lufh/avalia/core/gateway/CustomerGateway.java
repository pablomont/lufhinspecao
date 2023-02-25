package com.uepb.lufh.avalia.core.gateway;

import com.uepb.lufh.avalia.core.domain.CustomerDomain;

import java.util.Optional;

public interface CustomerGateway {

    Optional<CustomerDomain> findCustomerByCpfCnpj(String customerCpfCnpj);

}

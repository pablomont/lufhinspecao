package com.uepb.lufh.avalia.dataprovider.database.gateway;

import com.uepb.lufh.avalia.core.domain.CustomerDomain;
import com.uepb.lufh.avalia.core.gateway.CustomerGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerGatewayImpl implements CustomerGateway {

    @Override
    public Optional<CustomerDomain> findCustomerByCpfCnpj(final String customerCpfCnpj) {
        return Optional.empty();
    }

}

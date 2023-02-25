package com.uepb.lufh.avalia.core.domain;

import com.uepb.lufh.avalia.core.vo.CpfCnpjValueObject;
import com.uepb.lufh.avalia.core.vo.EmailValueObject;
import com.uepb.lufh.avalia.core.vo.PhoneNumberValueObject;
import com.uepb.lufh.avalia.entrypoint.contract.model.CustomerOutput;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Builder
@Getter
@RequiredArgsConstructor
public class CustomerDomain {

    private final String id;
    private final String customerName;
    private final CpfCnpjValueObject cpfCnpjValueObject;

    private final EmailValueObject emailValueObject;

    private final PhoneNumberValueObject phoneNumberValueObject;

    private final List<RequestEvaluationDomain> requestEvaluationDomainList;


    public CustomerOutput toOutput() {
        var customerOutput = new CustomerOutput();
        customerOutput.setId(Integer.valueOf(this.id));
        customerOutput.setCustomerName(this.getCustomerName());
        customerOutput.setCpfCnpj(this.getCpfCnpjValueObject().toString());
        customerOutput.setEmail(this.getEmailValueObject().toString());
        customerOutput.setPhoneNumber(this.getPhoneNumberValueObject().toString());

        return customerOutput;
    }

}

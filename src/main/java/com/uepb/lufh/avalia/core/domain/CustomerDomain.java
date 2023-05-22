package com.uepb.lufh.avalia.core.domain;

import com.uepb.lufh.avalia.core.domain.vo.CpfCnpjValueObject;
import com.uepb.lufh.avalia.core.domain.vo.EmailValueObject;
import com.uepb.lufh.avalia.core.domain.vo.PhoneNumberValueObject;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Builder
@Getter
@RequiredArgsConstructor
public class CustomerDomain {

    private final Long id;
    private final String customerName;
    private final CpfCnpjValueObject cpfCnpjValueObject;

    private final EmailValueObject emailValueObject;

    private final PhoneNumberValueObject phoneNumberValueObject;

    private final List<RequestEvaluationDomain> requestEvaluationDomainList;

}

package com.uepb.lufh.avalia.dataprovider.database.entity;

import com.uepb.lufh.avalia.core.domain.CustomerDomain;
import com.uepb.lufh.avalia.core.vo.CpfCnpjValueObject;
import com.uepb.lufh.avalia.core.vo.EmailValueObject;
import com.uepb.lufh.avalia.core.vo.PhoneNumberValueObject;
import lombok.NoArgsConstructor;
import org.springframework.util.ObjectUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "customer")
@NoArgsConstructor
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "cpf_cnpj")
    private String cpfCnpj;


    @Column(name = "phone_number")
    private String phoneNumber;

    private String email;

    @OneToMany(mappedBy = "customerEntity")
    private List<RequestEvaluationEntity> evaluations;

    public CustomerEntity(final CustomerDomain customerDomain) {
        if(!ObjectUtils.isEmpty(customerDomain.getId()))
            this.customerId = customerDomain.getId();
        this.customerName = customerDomain.getCustomerName();
        this.cpfCnpj = customerDomain.getCpfCnpjValueObject().toString();
        this.email = customerDomain.getEmailValueObject().toString();
        this.phoneNumber = customerDomain.getPhoneNumberValueObject().toString();
    }

    public CustomerDomain toDomain() {

        return CustomerDomain.builder().customerName(customerName)
            .id(customerId)
            .cpfCnpjValueObject(new CpfCnpjValueObject(cpfCnpj))
            .emailValueObject(new EmailValueObject(email))
            .phoneNumberValueObject(new PhoneNumberValueObject(phoneNumber))
            .build();

    }

}

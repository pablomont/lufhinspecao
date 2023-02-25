package com.uepb.lufh.avalia.dataprovider.database.entity;

import com.uepb.lufh.avalia.core.domain.CustomerDomain;
import com.uepb.lufh.avalia.core.domain.RequestEvaluationDomain;
import com.uepb.lufh.avalia.core.vo.CpfCnpjValueObject;
import com.uepb.lufh.avalia.core.vo.EmailValueObject;
import com.uepb.lufh.avalia.core.vo.PhoneNumberValueObject;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    private List<RequestEvaluationEntity> evaluations = new ArrayList<>();

    public CustomerEntity(final CustomerDomain customerDomain) {
        this.customerId = customerDomain.getId();
        this.customerName = customerDomain.getCustomerName();
        this.cpfCnpj = customerDomain.getCpfCnpjValueObject().toString();
        this.email = customerDomain.getEmailValueObject().toString();
        this.phoneNumber = customerDomain.getPhoneNumberValueObject().toString();
        this.evaluations = new ArrayList<>();
        //setEvaluations(customerDomain.getRequestEvaluationDomainList());

    }

    public CustomerDomain toDomain() {

        return CustomerDomain.builder().customerName(customerName)
            .id(customerId)
//            .requestEvaluationDomainList(evaluations.stream().map(RequestEvaluationEntity::toDomain).collect(
//            Collectors.toList()))
            .cpfCnpjValueObject(new CpfCnpjValueObject(cpfCnpj))
            .emailValueObject(new EmailValueObject(email))
            .phoneNumberValueObject(new PhoneNumberValueObject(phoneNumber))
            .build();

    }

    public void setEvaluations(final List<RequestEvaluationDomain> evaluations) {
        var evaluationsEntity =  evaluations.stream().map(RequestEvaluationEntity::new).collect(Collectors.toList());
        evaluationsEntity.forEach(this::addEvaluations);
    }

    public void addEvaluations(RequestEvaluationEntity evaluation){
        evaluations.add(evaluation);
    }

}

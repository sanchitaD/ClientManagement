package com.sanchitacodes.ClientManagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientDetail {

    @Id
    Integer id;
    String client;
    String status;
    String billingInterval;
    String email;
    String feesType;
    float fees;

}

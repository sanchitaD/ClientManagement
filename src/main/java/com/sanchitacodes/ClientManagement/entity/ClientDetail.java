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
    private Integer id;
    private String client;
    private String status;
    private String billing_interval;
    private String email;
    private String fees_type;
    private float fees;
}

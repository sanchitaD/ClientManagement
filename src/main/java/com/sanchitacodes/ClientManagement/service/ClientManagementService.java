package com.sanchitacodes.ClientManagement.service;

import com.sanchitacodes.ClientManagement.entity.ClientDetail;

import java.util.List;

public interface ClientManagementService {

    //Insert the client details
    ClientDetail addClientDetail(ClientDetail clientDetail);

    //Get the list of client and its details
    List<ClientDetail> fetchClientDetail();

    //Update the client details
    ClientDetail updateClientDetail(ClientDetail clientDetail, Integer id);

    //Delete the client details
    void deleteClientDetailById(Integer id);

}

package com.sanchitacodes.ClientManagement.service;

import com.sanchitacodes.ClientManagement.entity.ClientDetail;
import com.sanchitacodes.ClientManagement.repository.ClientManagementRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@Transactional
public class ClientManagementServiceImpl implements ClientManagementService{

    @Autowired
    private ClientManagementRepository clientManagementRepository;
    @Override
    public ClientDetail addClientDetail(ClientDetail clientDetail) {
        log.info("Inside addClientDetail of ClientManagementServiceImpl, adding records!");
        return clientManagementRepository.save(clientDetail);
    }

    @Override
    public List<ClientDetail> fetchClientDetail() {
        log.info("Inside fetchClientDetail of ClientManagementServiceImpl, fetching records!");
        return clientManagementRepository.findAll();
    }

    public ClientDetail fetchClientDetailByClientName(String clientName) {
        log.info("Inside fetchClientDetailByClientName of ClientManagementServiceImpl, fetching records!");
        final String ACTIVE = "active";
        Optional<ClientDetail> clientDetail = clientManagementRepository
                .findAll()
                .stream()
                .filter(record-> record.getClient().equals(clientName) && record.getStatus().equals(ACTIVE))
                .findFirst();
        return clientDetail.isPresent() ? clientDetail.get() : null; // TODO: Instead of null you can also return empty clientDetail Object
    }

    @Override
    public ClientDetail updateClientDetail(ClientDetail clientDetail, Integer id) {
        log.info("Inside updateClientDetail of ClientManagementServiceImpl, updating records!");
        return clientManagementRepository.save(clientDetail);
    }

    @Override
    public void deleteClientDetailById(Integer id) {
        log.info("Inside deleteClientDetailById of ClientManagementServiceImpl, deleting records!");
        clientManagementRepository.deleteById(id);
    }
}

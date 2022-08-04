package com.sanchitacodes.ClientManagement.service;

import com.sanchitacodes.ClientManagement.entity.ClientDetail;
import com.sanchitacodes.ClientManagement.repository.ClientManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class ClientManagementServiceImpl implements ClientManagementService{

    @Autowired
    private ClientManagementRepository clientManagementRepository;
    @Override
    public ClientDetail addClientDetail(ClientDetail clientDetail) {
        return clientManagementRepository.save(clientDetail);
    }

    @Override
    public List<ClientDetail> fetchClientDetail() {
        return (List<ClientDetail>) clientManagementRepository.findAll();
    }

    public List<ClientDetail> fetchClientDetailByClientName(String clientName) {
        return clientManagementRepository
                .findAll()
                .stream()
                .filter(rec-> rec.getClient().equals(clientName))
                .collect(Collectors.toList());
    }

    @Override
    public ClientDetail updateClientDetail(ClientDetail clientDetail, Integer id) {
        //TODO
        return null;
    }

    @Override
    public void deleteClientDetailById(Integer id) {
        clientManagementRepository.deleteById(id);
    }
}

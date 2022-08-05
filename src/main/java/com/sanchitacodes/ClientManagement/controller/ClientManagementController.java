package com.sanchitacodes.ClientManagement.controller;

import com.sanchitacodes.ClientManagement.entity.ClientDetail;
import com.sanchitacodes.ClientManagement.service.ClientManagementService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
public class ClientManagementController {

    @Autowired
    private ClientManagementService clientManagementService;

    @PostMapping("/clientDetail")
    public ClientDetail addClientDetail(@Valid @RequestBody ClientDetail clientDetail){
        log.info("Inside addClientDetail of ClientManagementController!");
        return clientManagementService.addClientDetail(clientDetail);
    }

    @GetMapping("/clientDetail")
    public List<ClientDetail> fetchClientDetail(){
        log.info("Inside fetchClientDetail of ClientManagementController!");
        return clientManagementService.fetchClientDetail();
    }

    @PutMapping("/clientDetail/{id}")
    public ClientDetail updateClientDetail(@RequestBody ClientDetail clientDetail,
                                     @PathVariable("id") Integer id){
        log.info("Inside updateClientDetail of ClientManagementController!");
        return clientManagementService.updateClientDetail(clientDetail, id);
    }

    @DeleteMapping("/clientDetail/{id}")
    public String deleteClientDetailById(@PathVariable("id") Integer id){
        log.info("Inside deleteClientDetailById of ClientManagementController!");
        clientManagementService.deleteClientDetailById(id);
        return "Deleted Successfully!!";
    }
}

package com.sanchitacodes.ClientManagement.controller;

import com.sanchitacodes.ClientManagement.entity.ClientDetail;
import com.sanchitacodes.ClientManagement.service.ClientManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ClientManagementController {

    @Autowired
    private ClientManagementService clientManagementService;

    @PostMapping("/clientDetail")
    public ClientDetail addClientDetail(@Valid @RequestBody ClientDetail clientDetail){
        return clientManagementService.addClientDetail(clientDetail);
    }

    @GetMapping("/clientDetail")
    public List<ClientDetail> fetchClientDetail(){
        return clientManagementService.fetchClientDetail();
    }

    @PutMapping("/clientDetail/{id}")
    public ClientDetail updateClientDetail(@RequestBody ClientDetail clientDetail,
                                     @PathVariable("id") Integer id){

        return clientManagementService.updateClientDetail(clientDetail, id);
    }

    @DeleteMapping("/clientDetail/{id}")
    public String deleteClientDetailById(@PathVariable("id") Integer id){
        clientManagementService.deleteClientDetailById(id);
        return "Deleted Successfully!!";
    }
}

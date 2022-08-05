package com.sanchitacodes.ClientManagement.repository;

import com.sanchitacodes.ClientManagement.entity.ClientDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientManagementRepository extends JpaRepository<ClientDetail,Integer> {
}

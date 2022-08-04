package com.sanchitacodes.ClientManagement;

import com.sanchitacodes.ClientManagement.entity.ClientDetail;
import com.sanchitacodes.ClientManagement.service.ClientManagementServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class ClientManagementApplicationTests {

	@Autowired
	ClientManagementServiceImpl clientManagementServiceImpl;
	@Test
	void contextLoads() {
	}

	@Test
	void testFetchClientDetailByClientName(){
		List<ClientDetail> clientDetail =
				clientManagementServiceImpl.fetchClientDetailByClientName("Pizza House");
		assertNotNull(clientDetail);
	}

}

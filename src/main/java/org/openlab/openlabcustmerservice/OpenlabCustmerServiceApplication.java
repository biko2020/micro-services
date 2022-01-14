package org.openlab.openlabcustmerservice;

import org.openlab.openlabcustmerservice.dto.CustomerRequestDTO;
import org.openlab.openlabcustmerservice.services.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpenlabCustmerServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(OpenlabCustmerServiceApplication.class, args);
    }

    @Bean // pour l'execution de l'application au démarrage
    CommandLineRunner Start(CustomerService customerService) {
        return args -> {
            customerService.save(new CustomerRequestDTO("C01", "Adria", "adria@gmail.com"));
            customerService.save(new CustomerRequestDTO("C02", "OpenLop", "OpenLop@gmail.com"));
        };
    }
}

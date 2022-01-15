package org.openlab.openlabcustmerservice;

import org.openlab.openlabcustmerservice.dto.CustomerRequestDTO;
import org.openlab.openlabcustmerservice.services.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication

public class OpenlabCustmerServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(OpenlabCustmerServiceApplication.class, args);
    }


    @Bean
          //start app


    CommandLineRunner Start(CustomerService customerServices) {
        return args -> {
            customerServices.save(new CustomerRequestDTO("C01", "Adria", "adria@gmail.com"));
            customerServices.save(new CustomerRequestDTO("C02", "OpenLop", "OpenLop@gmail.com"));
        };

    }
}


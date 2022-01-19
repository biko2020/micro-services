package org.openlab.openlabcustmerservice.web;


import org.openlab.openlabcustmerservice.dto.CustomerRequestDTO;
import org.openlab.openlabcustmerservice.dto.CustomerResponseDTO;
import org.openlab.openlabcustmerservice.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping( path="/api")

public class CustomerRestAPI {

    private CustomerService customerService;

    public CustomerRestAPI(CustomerService customerService) {

        this.customerService = customerService;
    }
    @GetMapping(path="/customers")

    public List<CustomerResponseDTO> allCustomers() {

        return customerService.listCustomers();
    }
    @PostMapping(path="/customers")
        //methode qui retourn l'objet CustomerResponseDTO
    public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO) {
        return customerService.save(customerRequestDTO);
    }

    @GetMapping(path="/customers/{id}")
    public CustomerResponseDTO getCustomer(@PathVariable String id) {
        return customerService.getCustomer(id);
    }
}

package org.openlab.openlabcustmerservice.mappers;

import org.mapstruct.Mapper;
import org.openlab.openlabcustmerservice.dto.CustomerRequestDTO;
import org.openlab.openlabcustmerservice.dto.CustomerResponseDTO;
import org.openlab.openlabcustmerservice.entities.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    //declarer les methode
    // retouner un objet CustomerResponseDTO de type Customer via mapstruct
    CustomerResponseDTO customerToCustomerResponseDTO(Customer customer); // send data customer
    Customer customerRequestDTOtoCustomer(CustomerRequestDTO customerRequestDTO);  // get data customer
}

package org.openlab.openlabcustmerservice.mappers;

import org.mapstruct.Mapper;
import org.openlab.openlabcustmerservice.dto.CustomerRequestDTO;
import org.openlab.openlabcustmerservice.dto.CustomerResponseDTO;
import org.openlab.openlabcustmerservice.entities.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    //declarer les methodes
    CustomerResponseDTO customerToCustomerResponseDTO(Customer customer); // envoyer data customer
    Customer customerRequestDTOtoCustomer(CustomerRequestDTO customerRequestDTO);  // recevoir data customer
}

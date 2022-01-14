// notre interface
package org.openlab.openlabcustmerservice.services;

import org.openlab.openlabcustmerservice.dto.CustomerRequestDTO;
import org.openlab.openlabcustmerservice.dto.CustomerResponseDTO;
import java.util.List;

public interface CustomerService  {
    // methode save() recoit un objet CustomerRequestDTO depuis la partie web
     CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO);  // save methode, ajouter un customer
     CustomerResponseDTO getCustomer(String id);                       // getCustomer methode
     CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO); //update methode

     List<CustomerResponseDTO> listCustomers();                          //Afficher la liste des Customers
}

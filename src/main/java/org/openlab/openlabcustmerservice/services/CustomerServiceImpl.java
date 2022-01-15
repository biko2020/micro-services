package org.openlab.openlabcustmerservice.services;
import org.openlab.openlabcustmerservice.entities.Customer;
import org.openlab.openlabcustmerservice.mappers.CustomerMapper;
import org.openlab.openlabcustmerservice.repositories.CustomerRepository;
import org.springframework.stereotype.*;
import org.openlab.openlabcustmerservice.dto.CustomerRequestDTO;
import org.openlab.openlabcustmerservice.dto.CustomerResponseDTO;

import javax.transaction.*;
import java.util.List;
import java.util.stream.Collectors;

@Service //service utiliser pour l'implementation
@Transactional // notation pour que toutes les methode soit transactionnelle
public class CustomerServiceImpl implements CustomerService {


    private CustomerRepository customerRepository; // appeler l'interface CustomerRepository pour accéder database
    private CustomerMapper customerMapper; //importer l'interface

    // utlise ce constructeur pour l'injection des dépendences
    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    //Methode save pour ajouter un customer on utilisant Mapping (mapstruct)
    public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO) {

     Customer customer = customerMapper.customerRequestDTOtoCustomer(customerRequestDTO);
     Customer saveCustomer = customerRepository.save(customer);

     CustomerResponseDTO customerResponseDTO = customerMapper.customerToCustomerResponseDTO(saveCustomer);
     return customerResponseDTO;
    }

    @Override
    public CustomerResponseDTO getCustomer(String id) {
        Customer customer = customerRepository.findById(id).get();
        return customerMapper.customerToCustomerResponseDTO(customer);
    }

    @Override
    public CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO) {
        Customer customer = customerMapper.customerRequestDTOtoCustomer(customerRequestDTO);
        Customer updateCustomer = customerRepository.save(customer);
        return customerMapper.customerToCustomerResponseDTO(updateCustomer);
    }

    @Override
    public List<CustomerResponseDTO> listCustomers() {
        List<Customer> customers = customerRepository.findAll();
        List<CustomerResponseDTO> customerResponseDTOS =
                customers.stream()
                        .map(customer->customerMapper.customerToCustomerResponseDTO(customer))
                        .collect(Collectors.toList());
        return customerResponseDTOS;
    }
}

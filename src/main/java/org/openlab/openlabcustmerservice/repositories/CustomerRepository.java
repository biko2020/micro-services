// creer une interface springData qui hérite de JpaRepository
package org.openlab.openlabcustmerservice.repositories;

import org.openlab.openlabcustmerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {

}

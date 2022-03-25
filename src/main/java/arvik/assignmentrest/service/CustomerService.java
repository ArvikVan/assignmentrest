package arvik.assignmentrest.service;

import arvik.assignmentrest.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author ArvikV
 * @version 1.0
 * @since 25.03.2022
 */
public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);
}

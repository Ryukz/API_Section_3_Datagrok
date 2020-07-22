package restful.api.datagrokr.Contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restful.api.datagrokr.Model.Customers;
import restful.api.datagrokr.Repository.CustomerRepository;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

@RestController
public class CustomerController {
@Autowired
CustomerRepository customerRepository;

@PostMapping("/addCustomer/{id}")
public Customers addCustomer(@Valid @PathVariable String id,@RequestBody Customers customers) {
    char A[]=id.toCharArray();
    int sum=0;
    for(int i:A)
    {
        sum+=i;
    }
  customers.setCustomerID(sum);
    return customerRepository.save(customers);
}


@GetMapping("/get/{id}")
public Optional<Customers> getById( @Valid @PathVariable(required = true) String id )
{   char A[]=id.toCharArray();
    int sum=0;
    for(int i:A)
    {
        sum+=i;
    }
    return  customerRepository.findById(sum);
}

    @PutMapping("/updateCustomer/{id}")
    public Customers updateCustomer(@Valid @PathVariable String id,@RequestBody Customers customers) {
        char A[]=id.toCharArray();
        int sum=0;
        for(int i:A)
        {
            sum+=i;
        }
        customers.setCustomerID(sum);
        return customerRepository.save(customers);
    }
}

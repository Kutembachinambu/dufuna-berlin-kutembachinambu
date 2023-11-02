package com.dufuna.berlin.kutembachinambu.tax.Controller;
import java.util.List;

import com.dufuna.berlin.kutembachinambu.tax.exceptions.TaxBracketNotFoundException;
import com.dufuna.berlin.kutembachinambu.tax.model.TaxBracket;
import com.dufuna.berlin.kutembachinambu.tax.repository.TaxBracketRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController


class TaxController {
    private final TaxBracketRepository repository;

    TaxController(TaxBracketRepository repository) {
        this.repository = repository;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/taxBracket")
    List<TaxBracket> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/taxBracket")
    TaxBracket newTaxBracket(@RequestBody TaxBracket newBracket) {
        return repository.save(newBracket);
    }

    // Single item

    @GetMapping("/taxBracket/{id}")
    TaxBracket one(@PathVariable Integer id) {

        return repository.findById(id)
                .orElseThrow(() -> new TaxBracketNotFoundException(id));
    }

   /* @PutMapping("/employees/{id}")
    TaxBracket replaceEmployee(@RequestBody TaxBracket newEmployee, @PathVariable Long id) {

        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newEmployee.getName());
                    employee.setRole(newEmployee.getRole());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
    }*/

    @DeleteMapping("/taxBracket/{id}")
    void deleteTaxBracket(@PathVariable Integer id) {
        repository.deleteById(id);
    }

}

package arg.com.bbva.msvcusers.controllers;

import arg.com.bbva.msvcusers.exception.BankUserNotFoundException;
import arg.com.bbva.msvcusers.models.BankUser;
import arg.com.bbva.msvcusers.repositories.BankUserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BankUserController {

    private final BankUserRepository repository;

    public BankUserController(BankUserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/users")
    List<BankUser> all() {
        return repository.findAll();
    }

    @GetMapping("/users/{id}")
    BankUser one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new BankUserNotFoundException(id));
    }


}

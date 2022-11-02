package arg.com.bbva.msvcusers.repositories;

import arg.com.bbva.msvcusers.models.BankUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankUserRepository extends JpaRepository<BankUser, Long> {
}

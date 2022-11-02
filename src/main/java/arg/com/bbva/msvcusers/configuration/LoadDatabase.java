package arg.com.bbva.msvcusers.configuration;

import arg.com.bbva.msvcusers.models.BankUser;
import arg.com.bbva.msvcusers.repositories.BankUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(BankUserRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new BankUser("Julio", "Chacón")));
            log.info("Preloading " + repository.save(new BankUser("Diego", "Gallego")));
            log.info("Preloading " + repository.save(new BankUser("Oscar Alejandro", "Minue")));
        };
    }


}

package com.dufuna.berlin.kutembachinambu.tax.configuration;

import com.dufuna.berlin.kutembachinambu.tax.model.TaxBracket;
import com.dufuna.berlin.kutembachinambu.tax.repository.TaxBracketRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(TaxBracketRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new TaxBracket(1l,0f, 18200f, 0f,0f)));
            log.info("Preloading " + repository.save(new TaxBracket(2l, 18201f, 37000f, 0f,0.19f)));
            log.info("Preloading " + repository.save(new TaxBracket(3l, 37001f, 90000f, 3571.81f, 0.325f)));
            log.info("Preloading " + repository.save(new TaxBracket(4l, 90001f, 180000f, 20796.49f, 0.37f)));
            log.info("Preloading " + repository.save(new TaxBracket(5l, 180000f,999999999999999999.99f, 54096.12f, 0.45f)));
        };
    }
}

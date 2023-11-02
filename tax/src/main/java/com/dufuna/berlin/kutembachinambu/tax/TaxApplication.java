package com.dufuna.berlin.kutembachinambu.tax;

import com.dufuna.berlin.kutembachinambu.tax.model.TaxBracket;
import com.dufuna.berlin.kutembachinambu.tax.repository.TaxBracketRepository;
import com.dufuna.berlin.kutembachinambu.tax.service.TaxCalcImpl;
import com.dufuna.berlin.kutembachinambu.tax.service.TaxCalcuation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.dufuna.berlin.kutembachinambu.tax.repository")
public class TaxApplication implements CommandLineRunner{
    @Autowired
	private TaxCalcImpl service;


	public static void main(String[] args) {

		SpringApplication.run(TaxApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		service.calculateTax(120000f);

	}
}

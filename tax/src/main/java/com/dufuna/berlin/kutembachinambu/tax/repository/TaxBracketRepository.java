package com.dufuna.berlin.kutembachinambu.tax.repository;

import com.dufuna.berlin.kutembachinambu.tax.model.TaxBracket;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface TaxBracketRepository extends JpaRepository<TaxBracket, Integer> {
    List<TaxBracket> findAll();
}

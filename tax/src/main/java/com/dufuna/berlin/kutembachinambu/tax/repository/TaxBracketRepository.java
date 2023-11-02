package com.dufuna.berlin.kutembachinambu.tax.repository;

import com.dufuna.berlin.kutembachinambu.tax.model.TaxBracket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TaxBracketRepository extends JpaRepository<TaxBracket, Long> {
}

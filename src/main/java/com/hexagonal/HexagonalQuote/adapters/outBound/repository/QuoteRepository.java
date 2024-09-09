package com.hexagonal.HexagonalQuote.adapters.outBound.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hexagonal.HexagonalQuote.adapters.inBound.Entity.QuoteEntity;

@Repository
public interface QuoteRepository extends CrudRepository<QuoteEntity, Long> {

}

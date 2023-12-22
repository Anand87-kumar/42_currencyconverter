package com.anand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anand.entity.CurrencyConversion;

public interface CurrencyConversionRepository extends JpaRepository<CurrencyConversion, Long> {
}


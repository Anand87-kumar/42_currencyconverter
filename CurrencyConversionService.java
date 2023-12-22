package com.anand.service;

import java.util.List;

import com.anand.entity.CurrencyConversion;

public interface CurrencyConversionService {
    CurrencyConversion convertCurrency(CurrencyConversion conversion);
    List<CurrencyConversion> getAllConversions();
}







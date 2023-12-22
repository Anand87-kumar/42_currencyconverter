package com.anand.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anand.entity.CurrencyConversion;
import com.anand.repository.CurrencyConversionRepository;
import com.anand.service.CurrencyConversionService;

@Service
public class CurrencyConversionServiceImpl implements CurrencyConversionService {

	@Autowired
	private CurrencyConversionRepository conversionRepository;

	@Override
	public CurrencyConversion convertCurrency(CurrencyConversion conversion) {
		double conversionRate = 1.1;

		double convertedAmount = conversion.getAmount() * conversionRate;
		conversion.setAmount(convertedAmount);
		return conversion;
	}

	@Override
	public List<CurrencyConversion> getAllConversions() {
		return conversionRepository.findAll();
	}
}

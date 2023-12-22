package com.anand.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anand.entity.CurrencyConversion;
import com.anand.service.CurrencyConversionService;

@RestController
@RequestMapping("/api")
public class CurrencyConversionController {

 @Autowired
 private CurrencyConversionService conversionService;

 @PostMapping("/convert")
 public CurrencyConversion convertCurrency(@RequestBody CurrencyConversion conversion) {
     return conversionService.convertCurrency(conversion);
 }

 @GetMapping("/conversions")
 public List<CurrencyConversion> getAllConversions() {
     return conversionService.getAllConversions();
 }
}



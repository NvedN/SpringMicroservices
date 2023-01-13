package com.microservices.currencyexchangeservice.repository;

import com.microservices.currencyexchangeservice.pojo.CurrencyExchange;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long> {

  CurrencyExchange findByFromAndAndTo(String from,String to);
}

package com.microservices.currencyconversionservice.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CurrencyConversion {

  @Id
  private Long id;
  @Column(name = "currency_from")
  private String from;
  @Column(name = "currency_to")
  private String to;
  private BigDecimal quantity;
  private BigDecimal conversionMultiple;
  private BigDecimal totalCalculateAmount;
  private String environment;




}

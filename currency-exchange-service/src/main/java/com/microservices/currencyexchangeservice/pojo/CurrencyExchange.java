package com.microservices.currencyexchangeservice.pojo;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString.Exclude;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class CurrencyExchange {

  @Id
  private Long id;
  @Column(name = "currency_from")
  private String from;
  @Column(name = "currency_to")

  private String to;
  private BigDecimal conversionMultiple;
  private String  environment;

  public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiple) {
    this.id = id;
    this.from = from;
    this.to = to;
    this.conversionMultiple = conversionMultiple;
  }
}

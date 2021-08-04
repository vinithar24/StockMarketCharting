package com.stockmarketchart.importexcel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class StockPrice {
    @GeneratedValue
    @Id
    private int stockId;
    private int companyCode;
    private String stockExchangeName;
    private Float price;
    private String date;
    private String time;
}
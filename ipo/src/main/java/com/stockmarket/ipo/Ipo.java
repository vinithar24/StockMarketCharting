package com.stockmarket.ipo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Ipo {

    @Id
    private int id;
    private String companyName;
    private String stockExchange;
    private String totalShares;
    private String openDate;
    private String openTime;
    private String price;
    private String remarks;


}


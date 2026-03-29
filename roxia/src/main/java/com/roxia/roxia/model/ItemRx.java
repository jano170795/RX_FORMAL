package com.roxia.roxia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(ItemRxId.class)
public class ItemRx {
    @Id // 1
    @Column(name="idRoxia")
    private String idRoxia;

    @Id // 2
    @Column(name="idOem")
    private String idOem;

    @Id // 3
    @Column(name="yearReg")
    private int yearReg;

    @Id // 4
    @Column(name="roxiaDescription")
    private String roxiaDescription;

    @Column(name="oemDescription")
    private String oemDescription;

    @Column(name="price",columnDefinition = "DECIMAL(10,2)")
    private Double price;

    @Column(name="leadTime")
    private int leadTime;

    @Column(name="priority")
    private int priority;

    @Column(name="material")
    private String material;

    public void setPrice(Double price) {
        this.price = (price == null) ? null : Math.round(price * 100.0) / 100.0;
    }
}

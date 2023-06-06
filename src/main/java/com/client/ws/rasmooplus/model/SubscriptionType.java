package com.client.ws.rasmooplus.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Table(name = "subscriptions_type")
@Entity
public class SubscriptionType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subscriptions_type_id")
    private Long id;

    private String name;

    @Column(name = "acess_months")
    private Long acessMonth;

    private BigDecimal price;

    @Column(name ="product_key")
    private String productKey;

    public SubscriptionType(Long id, String name, Long acessMonth, BigDecimal price, String productKey) {
        this.id = id;
        this.name = name;
        this.acessMonth = acessMonth;
        this.price = price;
        this.productKey = productKey;
    }

    public SubscriptionType() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAcessMonth() {
        return acessMonth;
    }

    public void setAcessMonth(Long acessMonth) {
        this.acessMonth = acessMonth;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }
}

package com.challenge.clone.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "shopping")
public class ShoppingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Amount")
    private Integer amount;

    @Column(name = "CustomerName")
    private String customerName;

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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingEntity that = (ShoppingEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(amount, that.amount) && Objects.equals(customerName, that.customerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, amount, customerName);
    }

    @Override
    public String toString() {
        return "ShoppingEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}

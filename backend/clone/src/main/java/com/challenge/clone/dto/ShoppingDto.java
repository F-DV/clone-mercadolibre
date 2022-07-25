package com.challenge.clone.dto;

public class ShoppingDto {

    private Long id;
    private String name;
    private Integer amount;
    private String customerName;

    public ShoppingDto(Long id, String name, Integer amount, String customerName) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.customerName = customerName;
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

}

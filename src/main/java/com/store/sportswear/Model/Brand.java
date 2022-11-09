package com.store.sportswear.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
class Brand {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String brand_name;
    @JsonIgnore
    @OneToMany(mappedBy = "brand")
    private List<Product> listProduct;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }
}

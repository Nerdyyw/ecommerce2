package com.example.ecom.order.domain.order.aggregate;

import com.example.ecom.product.domain.aggregate.ProductCart;
import org.jilt.Builder;

import java.util.List;

@Builder
public class DetailCartResponse {

  List<ProductCart> products;

  public DetailCartResponse(List<ProductCart> products) {
    this.products = products;
  }

  public List<ProductCart> getProducts() {
    return products;
  }

  public void setProducts(List<ProductCart> products) {
    this.products = products;
  }
}

package com.example.ecom.product.infrastructure.primary.exceptions;

public class EntityCreationFailed extends RuntimeException {
  public EntityCreationFailed(String message) {
    super(message);
  }
}
package com.example.ecom.order.domain.user.vo;

import com.example.ecom.shared.error.domain.Assert;

public record UserFirstname(String value) {

  public UserFirstname {
    Assert.field("value", value).maxLength(255);
  }
}

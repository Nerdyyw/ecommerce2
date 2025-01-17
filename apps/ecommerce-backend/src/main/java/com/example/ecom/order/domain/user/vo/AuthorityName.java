package com.example.ecom.order.domain.user.vo;

import com.example.ecom.shared.error.domain.Assert;

public record AuthorityName(String name) {

  public AuthorityName {
    Assert.field("name", name).notNull();
  }
}

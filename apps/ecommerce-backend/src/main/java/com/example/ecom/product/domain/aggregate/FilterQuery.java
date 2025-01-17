package com.example.ecom.product.domain.aggregate;

import com.example.ecom.product.domain.vo.ProductSize;
import com.example.ecom.product.domain.vo.PublicId;
import org.jilt.Builder;

import java.util.List;

@Builder
public record FilterQuery(PublicId categoryId, List<ProductSize> sizes) {
}

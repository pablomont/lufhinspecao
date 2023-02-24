package com.uepb.lufh.avalia.core.gateway;

import com.uepb.lufh.avalia.core.domain.ProductDomain;

import java.util.Optional;

public interface ProductGateway {
    Optional<ProductDomain> findProductByProductId(Long productId);
}

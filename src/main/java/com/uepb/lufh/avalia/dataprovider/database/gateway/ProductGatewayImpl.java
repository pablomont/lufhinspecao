package com.uepb.lufh.avalia.dataprovider.database.gateway;

import com.uepb.lufh.avalia.core.domain.ProductDomain;
import com.uepb.lufh.avalia.core.gateway.ProductGateway;
import com.uepb.lufh.avalia.dataprovider.database.entity.ProductEntity;
import com.uepb.lufh.avalia.dataprovider.database.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductGatewayImpl implements ProductGateway {

    private final ProductRepository productRepository;

    @Override
    public Optional<ProductDomain> findProductByProductId(final Long productId) {
        log.info("Find product by {}", productId);
        return Optional.of(productRepository.getById(productId)).map(ProductEntity::toDomain);
    }

    @Override
    public Optional<ProductDomain> save(final ProductDomain productDomain) {
        log.info("Creating product with name: {}", productDomain.getProductName());
        return Optional.ofNullable(productRepository.save(new ProductEntity(productDomain)).toDomain());
    }

}

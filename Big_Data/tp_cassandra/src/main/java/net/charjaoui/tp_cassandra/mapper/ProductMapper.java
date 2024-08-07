package net.charjaoui.tp_cassandra.mapper;

import net.charjaoui.tp_cassandra.dto.ProductDTO;
import net.charjaoui.tp_cassandra.entity.Product;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ProductMapper implements Function<ProductDTO, Product> {
    @Override
    public Product apply(ProductDTO productDTO) {
        return new Product(productDTO.id(), productDTO.name(), productDTO.description(), productDTO.price());
    }
}
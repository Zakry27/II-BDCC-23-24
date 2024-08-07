package net.charjaoui.tp_cassandra.mapper;

import net.charjaoui.tp_cassandra.dto.ProductDTO;
import net.charjaoui.tp_cassandra.entity.Product;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ProductDTOMapper implements Function<Product, ProductDTO> {
    @Override
    public ProductDTO apply(Product product) {
        return new ProductDTO(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice()
        );
    }
}
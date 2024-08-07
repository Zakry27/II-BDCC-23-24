package net.charjaoui.tp_cassandra.service;

import net.charjaoui.tp_cassandra.dto.ProductDTO;
import net.charjaoui.tp_cassandra.exception.ProductNotFoundException;

import java.util.List;
import java.util.UUID;

public interface ProductService {
    List<ProductDTO> getAllProducts();
    ProductDTO getProductById(UUID id) throws ProductNotFoundException;
    ProductDTO saveProduct(ProductDTO productDTO);
    ProductDTO updateProduct(UUID id, ProductDTO productDTO) throws ProductNotFoundException;
    void deleteProduct(UUID id);
}
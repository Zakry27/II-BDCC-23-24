package net.charjaoui.tp_cassandra.repository;

import net.charjaoui.tp_cassandra.entity.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Product, UUID> {
}